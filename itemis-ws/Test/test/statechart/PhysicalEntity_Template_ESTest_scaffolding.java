/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue May 21 07:24:03 GMT 2024
 */

package statechart;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PhysicalEntity_Template_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "statechart.PhysicalEntity_Template"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\lenovo\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "IT"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\lenovo\\Desktop"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\lenovo"); 
    java.lang.System.setProperty("user.language", "it"); 
    java.lang.System.setProperty("user.name", "lenovo"); 
    java.lang.System.setProperty("user.timezone", "Europe/Berlin"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PhysicalEntity_Template_ESTest_scaffolding.class.getClassLoader() ,
      "com.yakindu.core.IStatemachine",
      "statechart.Power_Component",
      "statechart.Actuator_Component$State",
      "statechart.PhysicalEntity_Template$Power",
      "statechart.PhysicalEntity_Template$Frequency",
      "statechart.Controller_Component",
      "statechart.Controller_Component$Sensors",
      "com.yakindu.core.IEventDriven",
      "com.yakindu.core.ITimed",
      "statechart.PhysicalEntity_Template$Trigger",
      "statechart.PhysicalEntity_Template$1",
      "statechart.Controller_Component$State",
      "statechart.Actuator_Component$Device",
      "statechart.Actuator_Component$1",
      "statechart.PhysicalEntity_Template",
      "statechart.Power_Component$Device",
      "statechart.Actuator_Component",
      "statechart.Power_Component$1",
      "statechart.PhysicalEntity_Template$Comparator",
      "statechart.Controller_Component$1",
      "statechart.PhysicalEntity_Template$State",
      "statechart.Actuator_Component$Power",
      "statechart.PhysicalEntity_Template$Status",
      "statechart.PhysicalEntity_Template$Oscillator",
      "statechart.Power_Component$State",
      "statechart.Controller_Component$Actuator",
      "com.yakindu.core.ITimerService"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PhysicalEntity_Template_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "statechart.PhysicalEntity_Template",
      "statechart.PhysicalEntity_Template$Status",
      "statechart.PhysicalEntity_Template$Oscillator",
      "statechart.PhysicalEntity_Template$Frequency",
      "statechart.PhysicalEntity_Template$Comparator",
      "statechart.PhysicalEntity_Template$Trigger",
      "statechart.PhysicalEntity_Template$Power",
      "statechart.PhysicalEntity_Template$State",
      "statechart.PhysicalEntity_Template$1",
      "statechart.Power_Component",
      "statechart.Power_Component$Device",
      "statechart.Actuator_Component",
      "statechart.Actuator_Component$Power",
      "statechart.Actuator_Component$Device",
      "statechart.Actuator_Component$1",
      "statechart.Power_Component$1",
      "statechart.Controller_Component",
      "statechart.Controller_Component$Sensors",
      "statechart.Controller_Component$Actuator",
      "statechart.Controller_Component$1",
      "statechart.Controller_Component$State",
      "statechart.Actuator_Component$State",
      "statechart.Power_Component$State"
    );
  }
}
