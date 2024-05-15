/*
 * This file was automatically generated by EvoSuite
 * Tue May 14 19:30:58 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.yakindu.core.ITimerService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.C;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class C_ESTest extends C_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      C c0 = new C();
      c0.setX(1000L);
      long long0 = c0.getX();
      assertEquals(1000L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      C c0 = new C();
      assertEquals(0L, c0.getX());
      
      c0.setX((-1L));
      long long0 = c0.getX();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      C c0 = new C();
      c0.setIsExecuting(true);
      boolean boolean0 = c0.getIsExecuting();
      assertTrue(boolean0);
      assertEquals(0L, c0.getX());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      C c0 = new C();
      boolean boolean0 = c0.getIsExecuting();
      assertFalse(boolean0);
      assertEquals(0L, c0.getX());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      C c0 = new C();
      // Undeclared exception!
      try { 
        c0.isStateActive((C.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.C", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      C c0 = new C();
      C.State c_State0 = C.State.$NULLSTATE$;
      boolean boolean0 = c0.isStateActive(c_State0);
      assertEquals(0L, c0.getX());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      C c0 = new C();
      C.State c_State0 = C.State.MAIN_REGION_INITIAL;
      boolean boolean0 = c0.isStateActive(c_State0);
      assertEquals(0L, c0.getX());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      C c0 = new C();
      C.State c_State0 = C.State.MAIN_REGION_ONE;
      boolean boolean0 = c0.isStateActive(c_State0);
      assertEquals(0L, c0.getX());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      C c0 = new C();
      C.State c_State0 = C.State.MAIN_REGION_ZERO;
      boolean boolean0 = c0.isStateActive(c_State0);
      assertFalse(boolean0);
      assertEquals(0L, c0.getX());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      C c0 = new C();
      boolean boolean0 = c0.nextEvent();
      assertEquals(0L, c0.getX());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      C c0 = new C();
      boolean boolean0 = c0.isActive();
      assertFalse(boolean0);
      assertEquals(0L, c0.getX());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      C c0 = new C();
      // Undeclared exception!
      try { 
        c0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.C", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      C c0 = new C();
      boolean boolean0 = c0.isFinal();
      assertEquals(0L, c0.getX());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      C c0 = new C();
      c0.setIsExecuting(true);
      c0.exit();
      assertEquals(0L, c0.getX());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      C c0 = new C();
      long long0 = c0.getX();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      C c0 = new C();
      assertFalse(c0.isActive());
      
      c0.exit();
      assertEquals(0L, c0.getX());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      C c0 = new C();
      // Undeclared exception!
      try { 
        c0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.C", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      C c0 = new C();
      c0.getTimerService();
      assertFalse(c0.isActive());
      assertEquals(0L, c0.getX());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      C c0 = new C();
      c0.setTimerService((ITimerService) null);
      assertEquals(0L, c0.getX());
      assertFalse(c0.isActive());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      C c0 = new C();
      // Undeclared exception!
      try { 
        c0.raiseTimeEvent(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.C", e);
      }
  }
}
