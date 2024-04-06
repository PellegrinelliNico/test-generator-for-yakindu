package ysc2sctunit;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import ysc2sctunit.cli.ICliManager;
import ysc2sctunit.cli.CliManager;
import ysc2sctunit.cli.InputValues;
import ysc2sctunit.java.reading.IJavaReader;
import ysc2sctunit.java.reading.JavaReader;
import ysc2sctunit.java.reading.ProceedTime;
import ysc2sctunit.java.writing.IJavaWriter;
import ysc2sctunit.java.writing.JavaWriter;
import ysc2sctunit.junit.reading.IJunitReader;
import ysc2sctunit.junit.reading.JunitReader;
import ysc2sctunit.junit.reading.TestCase;
import ysc2sctunit.junit.writing.IJunitWriter;
import ysc2sctunit.junit.writing.JunitWriter;
import ysc2sctunit.sctunit.writing.ISctunitWriter;
import ysc2sctunit.sctunit.writing.SctunitWriter;
import ysc2sctunit.sgen.writing.ISgenWriter;
import ysc2sctunit.sgen.writing.SgenWriter;
import ysc2sctunit.ysc.reading.IYscReader;
import ysc2sctunit.ysc.reading.YscReader;

/**
 * The Class Ysc2Sctunit, contains the main method.
 */
public class Ysc2Sctunit {
	/**
	 * The main method, generate a .sctunit file (test suite for a statechat)
	 * starting from a .ysc file (a statechart).
	 *
	 * @param args the command line arguments.
	 * @throws ParserConfigurationException if a DocumentBuildercannot while
	 *                                      instantiating a Statechart object.
	 * @throws SAXException                 if there are any problems encountered
	 *                                      while parsing the xml file representing
	 *                                      the statechart.
	 * @throws IOException                  if any IO errors occur.
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		System.out.println("--------------------------------------------------------------");
		System.out.println("\t\t\tYsc2SCTUnit");
		System.out.println("--------------------------------------------------------------");

		// Parse the arguments
		ICliManager cli = new CliManager();
		InputValues input = cli.parse(args);
		if (input == null) {
			System.out.println("--------------------------------------------------------------");
			return;
		}
		String itemisScc = input.getSccPath();
		String workspacePath = input.getWorkspacePath();
		String projectName = input.getProjectName();
		String targetDir = input.getTargetDir();
		String targetPackage = input.getTargetPackage();
		String dottedTargetPackage = targetPackage.replace("\\", ".");
		String sourceDir = input.getSourceDir();
		String sourceFile = input.getSourceFile();
		String binaryDir = input.getBinaryDir();
		String evoTestDir = input.getEvoTestDir();
		boolean hasSearchBudget = input.hasSearchBudget();
		int evoSearchBudget = input.getEvoSearchBudget();

		// Obtain the needed Strings
		String projectPath = workspacePath + "\\" + projectName;
		String sourceFilePath = projectPath + "\\" + sourceDir + "\\" + sourceFile;

		// Read the statechart
		IYscReader yscReader = new YscReader(sourceFilePath);
		String statechartName = yscReader.getStatechartName();
		Map<String, String> statesNames = yscReader.getStatesNames();
		Map<String, String> eventsNames = yscReader.getEventsNames();
		Map<String, String> interfacesNames = yscReader.getInterfacesNames();

		// Obtain the needed Strings
		String firstUpperStatechartName = statechartName.substring(0, 1).toUpperCase() + statechartName.substring(1);

		String sgenPath = projectPath + "\\" + sourceDir + "\\" + firstUpperStatechartName + ".sgen";

		String javaPath = projectPath + "\\" + targetDir + "\\" + targetPackage + "\\" + firstUpperStatechartName
				+ ".java";
		String simplifiedJavaPath = projectPath + "\\" + targetDir + "\\" + targetPackage + "\\"
				+ firstUpperStatechartName + "Simplified.java";

		String compilerD = "-d " + projectPath + "\\" + binaryDir;
		String compilerClasspath = "-classpath " + projectPath + "\\" + targetDir;

//		String evoClass = "-class " + dottedTargetPackage + "." + firstUpperStatechartName;
		String evoSimplifiedClass = "-class " + dottedTargetPackage + "." + firstUpperStatechartName + "Simplified";
		String evoProjectCP = "-projectCP " + projectPath + "\\" + binaryDir;
		String evoDTestDir = "-Dtest_dir=" + projectPath + "\\" + evoTestDir;
		String evoDReportDir = "-Dreport_dir=" + projectPath + "\\evosuite-report";

//		String junitPath = projectPath + "\\" + evoTestDir + "\\" + targetPackage + "\\" + firstUpperStatechartName
//				+ "_ESTest.java";
//		String sctunitPath = projectPath + "\\" + sourceDir + "\\" + firstUpperStatechartName + "Test.sctunit";

		String simplifiedJunitPath = projectPath + "\\" + evoTestDir + "\\" + targetPackage + "\\"
				+ firstUpperStatechartName + "Simplified_ESTest.java";
		String simplifiedSctunitPath = projectPath + "\\" + sourceDir + "\\" + firstUpperStatechartName
				+ "SimplifiedTest.sctunit";

		// Generate the .sgen file needed by Itemis Create to generate the java code
		System.out.println("*******************************************");
		System.out.println("Generating .sgen file...");
		System.out.println("*******************************************");
		ISgenWriter sgenWriter = new SgenWriter();
		sgenWriter.writeSgen(projectName, statechartName, sgenPath, targetDir, dottedTargetPackage);

		// Call the Itemis Create generators
		System.out.println("*******************************************");
		System.out.println("Calling Itemis Create code generator...");
		System.out.println("*******************************************");
		IJavaWriter javaWriter = new JavaWriter();
		javaWriter.callICGenerator(projectPath, itemisScc, sourceDir, sourceFile, statechartName);
		
		// Read the java file
		IJavaReader javaReader = new JavaReader();
		Map<Integer, ProceedTime> proceedTimes = javaReader.getProceedTimes(javaPath);

		// Compile the generated classes
		compile(compilerD, compilerClasspath, javaPath);

		// Modify the generated Java code to create a simplified version
		System.out.println("*******************************************");
		System.out.println("Generating simplified java class...");
		System.out.println("*******************************************");
		javaWriter.writeSimplifiedVersion(javaPath, simplifiedJavaPath);

		// Compile the new simplified class
		compile(compilerD, compilerClasspath, simplifiedJavaPath);

		// Delete the VirtualTimer.class file to hide it to Evosuite
		String virtualTimerPath = projectPath + "//" + binaryDir + "//com//yakindu//core//VirtualTimer.class";
		if (Files.exists(Paths.get(virtualTimerPath))) {
			new File(virtualTimerPath).delete();
		}

		// Call the Evosuite test generator
		System.out.println("*******************************************");
		System.out.println("Calling Evosuite test generator...");
		System.out.println("*******************************************");
		IJunitWriter junitWriter = new JunitWriter();
		junitWriter.callEvosuite(evoSimplifiedClass, evoProjectCP, evoDTestDir, evoDReportDir, hasSearchBudget,
				evoSearchBudget);

		// Read the junit file
		System.out.println("*******************************************");
		System.out.println("Generating .sctunit file...");
		System.out.println("*******************************************");
		IJunitReader junitReader = new JunitReader();
		List<TestCase> testCaseList = junitReader.getTestCases(simplifiedJunitPath, statechartName, statesNames,
				eventsNames, interfacesNames, proceedTimes);
		
		// Generate the .sctunit file
		ISctunitWriter sctunitWriter = new SctunitWriter();
		sctunitWriter.writeSctunit(simplifiedSctunitPath, statechartName, testCaseList);

		// End the execution
		System.out.println("*******************************************");
		System.out.println("Finished.");
		System.out.println("*******************************************");
		System.out.println("--------------------------------------------------------------");
		System.exit(0);
	}

	/**
	 * Compile.
	 *
	 * @param compilerD         the string "-d ProjectPath", where ProjectPath is
	 *                          the path of the directory where the .class files
	 *                          will be put
	 * @param compilerClasspath the string "-classpath ClassPath", where ClassPath
	 *                          is the classpath of the compilation
	 * @param javaPath          the path of the .java file to compile
	 */
	private static void compile(String compilerD, String compilerClasspath, String javaPath) {
		System.out.println("*******************************************");
		System.out.println("Compiling...");
		System.out.println("*******************************************");
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		List<String> compilationArgs = new ArrayList<String>();
		compilationArgs.addAll(Arrays.asList(compilerD.split(" ")));
		compilationArgs.addAll(Arrays.asList(compilerClasspath.split(" ")));
		compilationArgs.add("-implicit:class");
		StandardJavaFileManager stdFileManager = compiler.getStandardFileManager(null, null, null);
		File f = new File(javaPath);
		Iterable<? extends JavaFileObject> compilationUnits = stdFileManager
				.getJavaFileObjectsFromFiles(Arrays.asList(f));
		compiler.getTask(null, null, null, compilationArgs, null, compilationUnits).call();
	}

}