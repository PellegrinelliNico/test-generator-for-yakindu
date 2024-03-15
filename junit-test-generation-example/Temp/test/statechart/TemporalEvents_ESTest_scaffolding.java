/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Mar 15 12:43:22 GMT 2024
 */

package statechart;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class TemporalEvents_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "statechart.TemporalEvents"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.dir", "C:\\Users\\lenovo\\Desktop\\ProgettiGit\\test-generator-for-yakindu\\ysc-to-sctunit-translator\\Ysc2SCTUnit"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\lenovo"); 
    java.lang.System.setProperty("user.language", "it"); 
    java.lang.System.setProperty("user.name", "lenovo"); 
    java.lang.System.setProperty("user.timezone", "Europe/Berlin"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TemporalEvents_ESTest_scaffolding.class.getClassLoader() ,
      "statechart.TemporalEvents",
      "com.yakindu.core.IStatemachine",
      "com.yakindu.core.VirtualTimer",
      "statechart.TemporalEvents$OperationCallback",
      "com.yakindu.core.VirtualTimer$VirtualTimeTask",
      "com.yakindu.core.VirtualTimer$VirtualTimeEventTask",
      "statechart.TemporalEventsSimplified$OperationCallback",
      "com.yakindu.core.VirtualTimer$CycleTimeEventTask",
      "com.yakindu.core.IEventDriven",
      "com.yakindu.core.ITimed",
      "com.yakindu.core.TimerService$TimeEventTask",
      "com.yakindu.core.TimerService",
      "statechart.TemporalEventsSimplified$1",
      "com.yakindu.core.rx.Observer",
      "statechart.TemporalEvents$State",
      "statechart.TemporalEvents$1",
      "com.yakindu.core.ITimerService",
      "statechart.TemporalEventsSimplified$State",
      "com.yakindu.core.rx.Observable",
      "statechart.TemporalEventsSimplified"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("statechart.TemporalEvents$OperationCallback", false, TemporalEvents_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TemporalEvents_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "statechart.TemporalEvents",
      "statechart.TemporalEvents$State",
      "statechart.TemporalEvents$1",
      "com.yakindu.core.rx.Observable",
      "com.yakindu.core.VirtualTimer",
      "com.yakindu.core.TimerService",
      "com.yakindu.core.TimerService$TimeEventTask",
      "statechart.TemporalEventsSimplified",
      "statechart.TemporalEventsSimplified$State",
      "com.yakindu.core.VirtualTimer$VirtualTimeTask",
      "com.yakindu.core.VirtualTimer$VirtualTimeEventTask",
      "com.yakindu.core.VirtualTimer$CycleTimeEventTask",
      "statechart.TemporalEventsSimplified$1"
    );
  }
}
