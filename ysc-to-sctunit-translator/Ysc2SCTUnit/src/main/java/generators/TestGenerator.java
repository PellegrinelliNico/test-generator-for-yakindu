package generators;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.cli.ParseException;
import org.xml.sax.SAXException;

import cli.CLIManager;
import cli.ParsedArgs;
import statechart.Statechart;
import support.CompilerManager;
import support.MySecurityManager;

/**
 * The Class TestGenerator.
 */
public class TestGenerator {
	/**
	 * The main method, generate a .sctunit file (test suite for a statechat)
	 * starting from a .ysc file (a statechart).
	 *
	 * @param args the arguments, the first one is the worksapce path,
	 * the second one is the name of the workspace where the .ysc file is located, 
	 * the third one is the name of the workspace were the generated java code will be placed,
	 * the fourth one is the name of the file containning the statechart (NOT the name of the statechart) without the extension,
	 * the fifth one is "time" and is present only if the statechart deals with time events
	 * @throws InterruptedException the interrupted exception
	 * @throws IOException Signals that an I/O exception has occurred
	 * @throws SAXException the SAX exception
	 * @throws ParserConfigurationException the parser configuration exception
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException, ParserConfigurationException, SAXException, ParseException {
		System.out.println("--------------------------------------------------------------");
		System.out.println("\t\t\tYsc2SCTUnit");
		System.out.println("--------------------------------------------------------------");
		
		// Parse the arguments
		ParsedArgs parsedArgs = CLIManager.parse(args);
		
		if (parsedArgs == null) {
			System.out.println("*******************************************");
			System.out.println("Finished with errors.");
			System.out.println("*******************************************");
			return;
		}
		
		// Collect all needed Strings 
		String workspacePath = parsedArgs.getWorkspacePath();
		String projectName = parsedArgs.getProjectName();
		String targetDir = parsedArgs.getTargetDir();
		String targetPackage = parsedArgs.getTargetPackage();
		String sourceDir = parsedArgs.getSourceDir();
		String sourceFile = parsedArgs.getSourceFile();
		
		System.out.println("workspacePath: " + workspacePath);
		System.out.println("projectName: " + projectName);
		System.out.println("targetDir: " + targetDir);
		System.out.println("targetPackage: " + targetPackage);
		System.out.println("sourceDir: " + sourceDir);
		System.out.println("sourceFile: " + sourceFile);
		
		boolean timeService = parsedArgs.hasT();
		
		String projectPath = workspacePath + "\\" + projectName;
		String sourceFilePath = projectPath + "\\" + sourceDir + "\\" + sourceFile;
		
		// Obtain the statechart name and the names of its states,
		// create a dictionary for the states names with the corresponding enum as key,
		// create a dictionary for the events names with the corresponding method as key
		System.out.println("*******************************************");
		System.out.println("Reading statechart file...");
		System.out.println("*******************************************");
		Statechart statechart = new Statechart(sourceFilePath);
		String statechartName = statechart.getStatechartName();
		Map<String, String> statesNames = new HashMap<String,String>();
		for(String name : statechart.getStatesNames()) {
			String enumName = name.toUpperCase().replace('.', '_');
			statesNames.put(enumName, name);
		}
		Map<String, String> eventsNames = new HashMap<String,String>();
		for(String name : statechart.getEventsNames()) {
			String methodName = "raise" + name.substring(0,1).toUpperCase() + name.substring(1);
			eventsNames.put(methodName, name);
		}
		
		// Collect all needed Strings
		String itemisScc = "C:\\Users\\lenovo\\Desktop\\itemis_CREATE\\scc.bat";
		
		String classPath = projectPath + "\\" + targetDir + "\\" + targetPackage + "\\" + statechartName + ".java";
		String simplifiedClassPath = projectPath + "\\" + targetDir + "\\" + targetPackage + "\\" + statechartName + "Simplified.java";		
		
		String compilerD = "-d " + projectPath + "\\bin";
		String compilerClasspath = "-classpath " + projectPath + "\\" + targetDir;
		
		String evoTarget = "-class " + targetPackage + "." + statechartName;
		String evoSimplifiedTarget = "-class " + targetPackage + "." + statechartName + "Simplified";
		String evoOptions = "-projectCP " + projectPath + "\\bin";
		String evoBaseDir = "-base_dir " + projectPath;
		
		String junitTestPath = projectPath + "\\evosuite-tests\\" + targetPackage + "\\" + statechartName + "_ESTest.java" ;
		String sctunitTestPath = projectPath + "\\" + sourceDir + "\\" + statechartName + "Test.sctunit" ;
		
		String simplifiedJunitTestPath = projectPath + "\\evosuite-tests\\" + targetPackage + "\\" + statechartName + "Simplified_ESTest.java" ;
		String simplifiedSctunitTestPath = projectPath + "\\" + sourceDir + "\\" + statechartName + "SimplifiedTest.sctunit" ;
		
		// Generate the .sgen file needed by Itemis Create to generate the java code
		Generators.generateSgenJava(projectPath, statechartName, targetPackage, projectName, targetDir, sourceDir, timeService);
		
		// Call the Itemis Create generators
		Generators.callICGenerators(projectPath, itemisScc);
		
		// Compile the generated classes
		CompilerManager.compile(compilerD, compilerClasspath, classPath);		
		
		// Modify the generated Java code to create a simplified version
		Generators.generateSimplifiedJava(classPath, simplifiedClassPath);
		
		// Compile the new simplified class
		CompilerManager.compile(compilerD, compilerClasspath, simplifiedClassPath);
		
		// Call the Evosuite test generator both on the original and the simplified versions
		// Change the security manager to avoid JVM stop running after Evosuite calls System.exit(0);
		SecurityManager default_sm = System.getSecurityManager();
		MySecurityManager my_sm = new MySecurityManager();
	    System.setSecurityManager(my_sm);
	    try {
	    	Generators.generateJunit(evoTarget, evoOptions, evoBaseDir);
	    } catch (SecurityException e) {
	    	Generators.generateSctunit(junitTestPath, sctunitTestPath,
	    			statechartName, statesNames, eventsNames);
	    }
	    try {
	    	Generators.generateJunit(evoSimplifiedTarget, evoOptions, evoBaseDir);
	    } catch (SecurityException e) { 
	    	Generators.generateSctunit(simplifiedJunitTestPath, simplifiedSctunitTestPath,
	    			statechartName, statesNames, eventsNames);
	    }
	    // Change the security manager back to the default one to let the execution ends
	    System.setSecurityManager(default_sm);
		System.out.println("*******************************************");
		System.out.println("Finished.");
		System.out.println("*******************************************");
	    System.exit(0);
	}

}
