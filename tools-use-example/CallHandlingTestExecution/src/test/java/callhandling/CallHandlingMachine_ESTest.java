/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 22 15:11:55 GMT 2023
 */

package callhandling;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import callhandling.CallHandlingMachine;
import com.yakindu.core.ITimerService;
import com.yakindu.core.TimerService;
import com.yakindu.core.VirtualTimer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CallHandlingMachine_ESTest extends CallHandlingMachine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      TimerService timerService0 = new TimerService();
      callHandlingMachine0.setTimerService(timerService0);
      CallHandlingMachine.User callHandlingMachine_User0 = callHandlingMachine0.user();
      callHandlingMachine_User0.raiseDismiss_call();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      TimerService timerService0 = new TimerService();
      callHandlingMachine0.setTimerService(timerService0);
      CallHandlingMachine.User callHandlingMachine_User0 = callHandlingMachine0.user;
      callHandlingMachine_User0.raiseAccept_call();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      callHandlingMachine0.user = null;
      CallHandlingMachine.User callHandlingMachine_User0 = callHandlingMachine0.user();
      assertNull(callHandlingMachine_User0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      callHandlingMachine0.phone = null;
      CallHandlingMachine.Phone callHandlingMachine_Phone0 = callHandlingMachine0.phone();
      assertNull(callHandlingMachine_Phone0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      CallHandlingMachine.Phone callHandlingMachine_Phone0 = new CallHandlingMachine.Phone(callHandlingMachine0);
      callHandlingMachine0.phone = callHandlingMachine_Phone0;
      callHandlingMachine_Phone0.setDuration(955);
      assertEquals(955L, callHandlingMachine_Phone0.getDuration());
      
      CallHandlingMachine.Phone callHandlingMachine_Phone1 = callHandlingMachine0.phone();
      assertEquals(955L, callHandlingMachine_Phone1.getDuration());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer();
      CallHandlingMachine.Phone callHandlingMachine_Phone0 = callHandlingMachine0.phone;
      callHandlingMachine0.setTimerService(virtualTimer0);
      callHandlingMachine0.setIsExecuting(true);
      callHandlingMachine_Phone0.raiseIncoming_call();
      assertEquals(0L, callHandlingMachine_Phone0.getDuration());
      
      boolean boolean0 = callHandlingMachine0.nextEvent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      boolean boolean0 = callHandlingMachine0.nextEvent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer();
      callHandlingMachine0.setTimerService(virtualTimer0);
      ITimerService iTimerService0 = callHandlingMachine0.getTimerService();
      assertSame(iTimerService0, virtualTimer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      callHandlingMachine0.setIsExecuting(true);
      boolean boolean0 = callHandlingMachine0.getIsExecuting();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      boolean boolean0 = callHandlingMachine0.getIsExecuting();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer();
      callHandlingMachine0.setTimerService(virtualTimer0);
      callHandlingMachine0.phone = null;
      // Undeclared exception!
      try { 
        callHandlingMachine0.raiseTimeEvent(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("callhandling.CallHandlingMachine$Phone", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      TimerService timerService0 = new TimerService();
      callHandlingMachine0.setTimerService(timerService0);
      // Undeclared exception!
      try { 
        callHandlingMachine0.raiseTimeEvent((-503));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -503
         //
         verifyException("callhandling.CallHandlingMachine", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer();
      callHandlingMachine0.setTimerService(virtualTimer0);
      callHandlingMachine0.setIsExecuting(true);
      callHandlingMachine0.raiseTimeEvent(955);
      // Undeclared exception!
      try { 
        callHandlingMachine0.nextEvent();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 955
         //
         verifyException("callhandling.CallHandlingMachine", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      // Undeclared exception!
      try { 
        callHandlingMachine0.isStateActive((CallHandlingMachine.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("callhandling.CallHandlingMachine", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      CallHandlingMachine.User callHandlingMachine_User0 = new CallHandlingMachine.User(callHandlingMachine0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer();
      callHandlingMachine0.setTimerService(virtualTimer0);
      callHandlingMachine0.enter();
      callHandlingMachine0.raiseTimeEvent(0);
      assertTrue(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      callHandlingMachine0.exit();
      assertFalse(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer((-1L));
      callHandlingMachine0.setTimerService(virtualTimer0);
      assertFalse(callHandlingMachine0.isActive());
      
      CallHandlingMachine.Phone callHandlingMachine_Phone0 = callHandlingMachine0.phone;
      callHandlingMachine0.enter();
      callHandlingMachine_Phone0.raiseIncoming_call();
      CallHandlingMachine.State callHandlingMachine_State0 = CallHandlingMachine.State.MAIN_REGION_INCOMING_CALL;
      boolean boolean0 = callHandlingMachine0.isStateActive(callHandlingMachine_State0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer((-1L));
      callHandlingMachine0.setTimerService(virtualTimer0);
      assertFalse(callHandlingMachine0.isActive());
      
      callHandlingMachine0.enter();
      CallHandlingMachine.State callHandlingMachine_State0 = CallHandlingMachine.State.MAIN_REGION_IDLE;
      boolean boolean0 = callHandlingMachine0.isStateActive(callHandlingMachine_State0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      CallHandlingMachine.State callHandlingMachine_State0 = CallHandlingMachine.State.MAIN_REGION_DISMISS_CALL;
      boolean boolean0 = callHandlingMachine0.isStateActive(callHandlingMachine_State0);
      assertFalse(callHandlingMachine0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      CallHandlingMachine.State callHandlingMachine_State0 = CallHandlingMachine.State.MAIN_REGION_ACTIVE_CALL;
      boolean boolean0 = callHandlingMachine0.isStateActive(callHandlingMachine_State0);
      assertFalse(callHandlingMachine0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      CallHandlingMachine.State callHandlingMachine_State0 = CallHandlingMachine.State.MAIN_REGION_INCOMING_CALL;
      boolean boolean0 = callHandlingMachine0.isStateActive(callHandlingMachine_State0);
      assertFalse(boolean0);
      assertFalse(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      CallHandlingMachine.State callHandlingMachine_State0 = CallHandlingMachine.State.$NULLSTATE$;
      boolean boolean0 = callHandlingMachine0.isStateActive(callHandlingMachine_State0);
      assertFalse(boolean0);
      assertFalse(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      CallHandlingMachine.State callHandlingMachine_State0 = CallHandlingMachine.State.MAIN_REGION_IDLE;
      boolean boolean0 = callHandlingMachine0.isStateActive(callHandlingMachine_State0);
      assertFalse(boolean0);
      assertFalse(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer();
      callHandlingMachine0.setTimerService(virtualTimer0);
      callHandlingMachine0.setIsExecuting(true);
      callHandlingMachine0.triggerWithoutEvent();
      assertFalse(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer();
      callHandlingMachine0.setTimerService(virtualTimer0);
      assertFalse(callHandlingMachine0.isActive());
      
      callHandlingMachine0.enter();
      boolean boolean0 = callHandlingMachine0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      boolean boolean0 = callHandlingMachine0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer();
      callHandlingMachine0.setIsExecuting(true);
      callHandlingMachine0.setTimerService(virtualTimer0);
      callHandlingMachine0.enter();
      assertFalse(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      // Undeclared exception!
      try { 
        callHandlingMachine0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("callhandling.CallHandlingMachine", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      CallHandlingMachine.User callHandlingMachine_User0 = callHandlingMachine0.user();
      // Undeclared exception!
      try { 
        callHandlingMachine_User0.raiseAccept_call();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("callhandling.CallHandlingMachine", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      CallHandlingMachine.Phone callHandlingMachine_Phone0 = new CallHandlingMachine.Phone(callHandlingMachine0);
      callHandlingMachine_Phone0.getDuration();
      assertFalse(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      CallHandlingMachine.Phone callHandlingMachine_Phone0 = callHandlingMachine0.phone();
      callHandlingMachine_Phone0.setDuration((-210L));
      assertEquals((-210L), callHandlingMachine_Phone0.getDuration());
      
      callHandlingMachine0.phone();
      assertFalse(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      // Undeclared exception!
      try { 
        callHandlingMachine0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("callhandling.CallHandlingMachine", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer((-1L));
      callHandlingMachine0.setTimerService(virtualTimer0);
      assertFalse(callHandlingMachine0.isActive());
      
      CallHandlingMachine.Phone callHandlingMachine_Phone0 = callHandlingMachine0.phone;
      callHandlingMachine0.enter();
      callHandlingMachine_Phone0.raiseIncoming_call();
      callHandlingMachine0.raiseTimeEvent(0);
      assertTrue(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      boolean boolean0 = callHandlingMachine0.isFinal();
      assertFalse(callHandlingMachine0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      callHandlingMachine0.getTimerService();
      assertFalse(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      callHandlingMachine0.setIsExecuting(true);
      callHandlingMachine0.exit();
      assertFalse(callHandlingMachine0.isActive());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      // Undeclared exception!
      try { 
        callHandlingMachine0.raiseTimeEvent(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("callhandling.CallHandlingMachine", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CallHandlingMachine callHandlingMachine0 = new CallHandlingMachine();
      VirtualTimer virtualTimer0 = new VirtualTimer();
      callHandlingMachine0.setTimerService(virtualTimer0);
      callHandlingMachine0.enter();
      assertTrue(callHandlingMachine0.isActive());
      
      callHandlingMachine0.exit();
      assertFalse(callHandlingMachine0.isActive());
  }
}
