/*
 * This file was automatically generated by EvoSuite
 * Tue May 21 07:33:03 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.yakindu.core.ITimerService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import statechart.EnvironmentSimplified;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnvironmentSimplified_ESTest extends EnvironmentSimplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      EnvironmentSimplified.Simulator environmentSimplified_Simulator0 = environmentSimplified0.simulator();
      environmentSimplified_Simulator0.raiseTerminate();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      EnvironmentSimplified.Simulator environmentSimplified_Simulator0 = new EnvironmentSimplified.Simulator(environmentSimplified0);
      environmentSimplified_Simulator0.raiseStart();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      EnvironmentSimplified.Simulator environmentSimplified_Simulator0 = new EnvironmentSimplified.Simulator(environmentSimplified0);
      environmentSimplified_Simulator0.raiseLaunch();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      EnvironmentSimplified.Simulator environmentSimplified_Simulator0 = new EnvironmentSimplified.Simulator(environmentSimplified0);
      environmentSimplified_Simulator0.raiseCycle();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      EnvironmentSimplified.Clock environmentSimplified_Clock0 = environmentSimplified0.clock();
      environmentSimplified_Clock0.raiseRun();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      EnvironmentSimplified.Clock environmentSimplified_Clock0 = environmentSimplified0.clock();
      environmentSimplified_Clock0.raiseReset();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      environmentSimplified0.triggerWithoutEvent();
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      environmentSimplified0.raiseTimeEvent(0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      environmentSimplified0.raiseStop();
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      // Undeclared exception!
      try { 
        environmentSimplified0.raiseTimeEvent(798);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 798
         //
         verifyException("statechart.EnvironmentSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      // Undeclared exception!
      try { 
        environmentSimplified0.raiseStart();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.EnvironmentSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EnvironmentSimplified.Sensor environmentSimplified_Sensor0 = new EnvironmentSimplified.Sensor();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EnvironmentSimplified.Generator environmentSimplified_Generator0 = new EnvironmentSimplified.Generator();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EnvironmentSimplified.Time environmentSimplified_Time0 = new EnvironmentSimplified.Time();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      environmentSimplified0.enter();
      environmentSimplified0.raiseRun();
      assertTrue(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      environmentSimplified0.exit();
      assertFalse(environmentSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      environmentSimplified0.enter();
      assertTrue(environmentSimplified0.isActive());
      
      environmentSimplified0.exit();
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SENSORS_LAUNCHSENSORS;
      environmentSimplified0.setTimerService(iTimerService0);
      environmentSimplified0.enter();
      environmentSimplified0.raiseStart();
      boolean boolean0 = environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.$NULLSTATE$;
      boolean boolean0 = environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SMARTFIRE_EVALUATOR_ENVIRONMENTEVALUATOR_R1_SIMULATING_F_MONITORING;
      boolean boolean0 = environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SMARTFIRE_EVALUATOR_ENVIRONMENTEVALUATOR_R1_SIMULATING;
      boolean boolean0 = environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SMARTFIRE_EVALUATOR_ENVIRONMENTEVALUATOR;
      boolean boolean0 = environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_CLOCK_RUN_CLOCK;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_INITIALIZATION_RUN;
      boolean boolean0 = environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION;
      boolean boolean0 = environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SMARTFIRE_EVALUATOR_ENVIRONMENTEVALUATOR_R1_SIMULATING_F_TERMINATE;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SMARTFIRE_EVALUATOR_ENVIRONMENTEVALUATOR_R1_SIMULATING_F_MONITORING_R1_GENERATE_RANDOM_NUMBERS;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SMARTFIRE_EVALUATOR_ENVIRONMENTEVALUATOR_R1_SIMULATING_F_READING;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SMARTFIRE_EVALUATOR_ENVIRONMENTEVALUATOR_R1_SIMULATING_F_LAUNCH;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SMARTFIRE_EVALUATOR_ENVIRONMENTEVALUATOR_R1_ONWAIT;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SENSORS_SENDINGSIGNALTOSENSORS;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SENSORS_LAUNCHSENSORS;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_CLOCK_RUN_CLOCK_RUNNING_RUNNING;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_CLOCK_STOP_CLOCK;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_INITIALIZATION_RUN_R1_EVALUATORTERMINATED;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_INITIALIZATION_RUN_R1_LAUNCHSIMULATION;
      boolean boolean0 = environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(boolean0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_INITIALIZATION_RUN_R1_LAUNCHGLOBALCLOCK;
      boolean boolean0 = environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_INITIALIZATION_INITIALIZE_SIMULATION;
      boolean boolean0 = environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_START_SIMULATION_SMARTFIRE_EVALUATOR_ENVIRONMENTEVALUATOR_R1_SIMULATING_F_MONITORING_R1_FEED_VALUES_;
      environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      EnvironmentSimplified.State environmentSimplified_State0 = EnvironmentSimplified.State.SIMENVIRONMENT_STOP_SIMULATION;
      boolean boolean0 = environmentSimplified0.isStateActive(environmentSimplified_State0);
      assertFalse(environmentSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      assertFalse(environmentSimplified0.isActive());
      
      environmentSimplified0.enter();
      environmentSimplified0.raiseStart();
      EnvironmentSimplified.Clock environmentSimplified_Clock0 = new EnvironmentSimplified.Clock(environmentSimplified0);
      environmentSimplified_Clock0.raiseStop();
      assertTrue(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      boolean boolean0 = environmentSimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      assertFalse(environmentSimplified0.isActive());
      
      environmentSimplified0.enter();
      boolean boolean0 = environmentSimplified0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      // Undeclared exception!
      try { 
        environmentSimplified0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.EnvironmentSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      boolean boolean0 = environmentSimplified0.isFinal();
      assertFalse(boolean0);
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      // Undeclared exception!
      try { 
        environmentSimplified0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.EnvironmentSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      // Undeclared exception!
      try { 
        environmentSimplified0.raiseStop();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.EnvironmentSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      // Undeclared exception!
      try { 
        environmentSimplified0.raiseTimeEvent(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.EnvironmentSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      environmentSimplified0.time();
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      environmentSimplified0.generator();
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      environmentSimplified0.sensor();
      assertFalse(environmentSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      // Undeclared exception!
      try { 
        environmentSimplified0.raiseRun();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.EnvironmentSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EnvironmentSimplified environmentSimplified0 = new EnvironmentSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      environmentSimplified0.setTimerService(iTimerService0);
      environmentSimplified0.enter();
      environmentSimplified0.raiseStart();
      environmentSimplified0.exit();
      assertFalse(environmentSimplified0.isActive());
  }
}
