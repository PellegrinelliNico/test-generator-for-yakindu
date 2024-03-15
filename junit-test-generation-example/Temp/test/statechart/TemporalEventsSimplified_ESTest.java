/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 15 12:45:02 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.yakindu.core.TimerService;
import com.yakindu.core.VirtualTimer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import statechart.TemporalEventsSimplified;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TemporalEventsSimplified_ESTest extends TemporalEventsSimplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.enter();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback1 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      doReturn(10L).when(temporalEventsSimplified_OperationCallback1).setTime(anyLong());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback1);
      temporalEventsSimplified0.raiseTimeEvent(0);
      temporalEventsSimplified0.raiseCheck();
      assertTrue(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      VirtualTimer virtualTimer0 = new VirtualTimer((-926L));
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      temporalEventsSimplified0.triggerWithoutEvent();
      assertFalse(temporalEventsSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      VirtualTimer virtualTimer0 = new VirtualTimer((-926L));
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      // Undeclared exception!
      try { 
        temporalEventsSimplified0.raiseTimeEvent(68);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 68
         //
         verifyException("statechart.TemporalEventsSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      // Undeclared exception!
      try { 
        temporalEventsSimplified0.raiseStop();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.TemporalEventsSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      // Undeclared exception!
      try { 
        temporalEventsSimplified0.isStateActive((TemporalEventsSimplified.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.TemporalEventsSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TimerService timerService0 = new TimerService();
      timerService0.cancel();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      temporalEventsSimplified0.setTimerService(timerService0);
      // Undeclared exception!
      try { 
        temporalEventsSimplified0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer already cancelled.
         //
         verifyException("java.util.Timer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.enter();
      temporalEventsSimplified0.raiseCheck();
      assertTrue(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(temporalEventsSimplified_OperationCallback0).setTime(anyLong());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.enter();
      temporalEventsSimplified0.raiseTimeEvent(0);
      temporalEventsSimplified0.raiseCheck();
      assertTrue(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.enter();
      temporalEventsSimplified0.raiseStop();
      assertTrue(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      temporalEventsSimplified0.exit();
      assertFalse(temporalEventsSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      doReturn(1000L).when(temporalEventsSimplified_OperationCallback0).setTime(anyLong());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.enter();
      temporalEventsSimplified0.raiseTimeEvent(0);
      assertTrue(temporalEventsSimplified0.isActive());
      
      temporalEventsSimplified0.exit();
      assertFalse(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer();
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.enter();
      assertTrue(temporalEventsSimplified0.isActive());
      
      temporalEventsSimplified0.exit();
      assertFalse(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      doReturn(1000L).when(temporalEventsSimplified_OperationCallback0).setTime(anyLong());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      assertFalse(temporalEventsSimplified0.isActive());
      
      temporalEventsSimplified0.enter();
      TemporalEventsSimplified.State temporalEventsSimplified_State0 = TemporalEventsSimplified.State.MAIN_REGION_ERR;
      temporalEventsSimplified0.raiseTimeEvent(0);
      temporalEventsSimplified0.raiseNext();
      boolean boolean0 = temporalEventsSimplified0.isStateActive(temporalEventsSimplified_State0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      doReturn(1000L).when(temporalEventsSimplified_OperationCallback0).setTime(anyLong());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      assertFalse(temporalEventsSimplified0.isActive());
      
      temporalEventsSimplified0.enter();
      temporalEventsSimplified0.raiseTimeEvent(0);
      TemporalEventsSimplified.State temporalEventsSimplified_State0 = TemporalEventsSimplified.State.MAIN_REGION_STATEB;
      boolean boolean0 = temporalEventsSimplified0.isStateActive(temporalEventsSimplified_State0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      assertFalse(temporalEventsSimplified0.isActive());
      
      temporalEventsSimplified0.enter();
      TemporalEventsSimplified.State temporalEventsSimplified_State0 = TemporalEventsSimplified.State.MAIN_REGION_STATEA;
      boolean boolean0 = temporalEventsSimplified0.isStateActive(temporalEventsSimplified_State0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.State temporalEventsSimplified_State0 = TemporalEventsSimplified.State.$NULLSTATE$;
      boolean boolean0 = temporalEventsSimplified0.isStateActive(temporalEventsSimplified_State0);
      assertFalse(boolean0);
      assertFalse(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.State temporalEventsSimplified_State0 = TemporalEventsSimplified.State.MAIN_REGION__FINAL_;
      boolean boolean0 = temporalEventsSimplified0.isStateActive(temporalEventsSimplified_State0);
      assertFalse(boolean0);
      assertFalse(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.State temporalEventsSimplified_State0 = TemporalEventsSimplified.State.MAIN_REGION_STATEB;
      boolean boolean0 = temporalEventsSimplified0.isStateActive(temporalEventsSimplified_State0);
      assertFalse(boolean0);
      assertFalse(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.State temporalEventsSimplified_State0 = TemporalEventsSimplified.State.MAIN_REGION_ERR;
      boolean boolean0 = temporalEventsSimplified0.isStateActive(temporalEventsSimplified_State0);
      assertFalse(boolean0);
      assertFalse(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.State temporalEventsSimplified_State0 = TemporalEventsSimplified.State.MAIN_REGION_STATEA;
      boolean boolean0 = temporalEventsSimplified0.isStateActive(temporalEventsSimplified_State0);
      assertFalse(boolean0);
      assertFalse(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TimerService timerService0 = new TimerService();
      temporalEventsSimplified0.setTimerService(timerService0);
      // Undeclared exception!
      try { 
        temporalEventsSimplified0.raiseTimeEvent(2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Operation callback must be set.
         //
         verifyException("statechart.TemporalEventsSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      doReturn(1000L).when(temporalEventsSimplified_OperationCallback0).setTime(anyLong());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      assertFalse(temporalEventsSimplified0.isActive());
      
      temporalEventsSimplified0.enter();
      temporalEventsSimplified0.raiseTimeEvent(0);
      temporalEventsSimplified0.raiseNext();
      temporalEventsSimplified0.raiseStop();
      assertTrue(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(temporalEventsSimplified_OperationCallback0).setTime(anyLong());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.enter();
      temporalEventsSimplified0.raiseTimeEvent(0);
      temporalEventsSimplified0.raiseStop();
      boolean boolean0 = temporalEventsSimplified0.isFinal();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      boolean boolean0 = temporalEventsSimplified0.isFinal();
      assertFalse(boolean0);
      assertFalse(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      assertFalse(temporalEventsSimplified0.isActive());
      
      temporalEventsSimplified0.enter();
      boolean boolean0 = temporalEventsSimplified0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      boolean boolean0 = temporalEventsSimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      VirtualTimer virtualTimer0 = new VirtualTimer();
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      // Undeclared exception!
      try { 
        temporalEventsSimplified0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Operation callback must be set.
         //
         verifyException("statechart.TemporalEventsSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      // Undeclared exception!
      try { 
        temporalEventsSimplified0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.TemporalEventsSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      doReturn(1000L).when(temporalEventsSimplified_OperationCallback0).setTime(anyLong());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.enter();
      temporalEventsSimplified0.raiseTimeEvent(0);
      temporalEventsSimplified0.raiseStop();
      temporalEventsSimplified0.raiseCheck();
      assertTrue(temporalEventsSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      // Undeclared exception!
      try { 
        temporalEventsSimplified0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.TemporalEventsSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(temporalEventsSimplified_OperationCallback0).setTime(anyLong());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.enter();
      temporalEventsSimplified0.raiseTimeEvent(0);
      temporalEventsSimplified0.raiseNext();
      assertTrue(temporalEventsSimplified0.isActive());
      
      temporalEventsSimplified0.exit();
      assertFalse(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      doReturn(1000L).when(temporalEventsSimplified_OperationCallback0).setTime(anyLong());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      assertFalse(temporalEventsSimplified0.isActive());
      
      temporalEventsSimplified0.enter();
      temporalEventsSimplified0.raiseTimeEvent(0);
      temporalEventsSimplified0.raiseCheck();
      assertTrue(temporalEventsSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      // Undeclared exception!
      try { 
        temporalEventsSimplified0.raiseNext();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.TemporalEventsSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      // Undeclared exception!
      try { 
        temporalEventsSimplified0.raiseCheck();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.TemporalEventsSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TemporalEventsSimplified temporalEventsSimplified0 = new TemporalEventsSimplified();
      TemporalEventsSimplified.OperationCallback temporalEventsSimplified_OperationCallback0 = mock(TemporalEventsSimplified.OperationCallback.class, new ViolatedAssumptionAnswer());
      doReturn(1000L).when(temporalEventsSimplified_OperationCallback0).setTime(anyLong());
      temporalEventsSimplified0.setOperationCallback(temporalEventsSimplified_OperationCallback0);
      VirtualTimer virtualTimer0 = new VirtualTimer(1000L);
      temporalEventsSimplified0.setTimerService(virtualTimer0);
      temporalEventsSimplified0.enter();
      temporalEventsSimplified0.raiseTimeEvent(0);
      temporalEventsSimplified0.raiseStop();
      assertTrue(temporalEventsSimplified0.isActive());
      
      temporalEventsSimplified0.exit();
      assertFalse(temporalEventsSimplified0.isActive());
  }
}
