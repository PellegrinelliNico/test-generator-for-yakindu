/*
 * This file was automatically generated by EvoSuite
 * Tue May 14 20:52:17 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.Test_get_statechart_mappings31;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Test_get_statechart_mappings31_ESTest extends Test_get_statechart_mappings31_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.setIsExecuting(true);
      test_get_statechart_mappings31_0.raiseMyEvent();
      boolean boolean0 = test_get_statechart_mappings31_0.nextEvent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      boolean boolean0 = test_get_statechart_mappings31_0.nextEvent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.setIsExecuting(true);
      boolean boolean0 = test_get_statechart_mappings31_0.getIsExecuting();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      boolean boolean0 = test_get_statechart_mappings31_0.getIsExecuting();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      // Undeclared exception!
      try { 
        test_get_statechart_mappings31_0.isStateActive((Test_get_statechart_mappings31.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.Test_get_statechart_mappings31", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.enter();
      test_get_statechart_mappings31_0.raiseMyEvent();
      test_get_statechart_mappings31_0.raiseMyEvent();
      test_get_statechart_mappings31_0.triggerWithoutEvent();
      assertTrue(test_get_statechart_mappings31_0.isActive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.enter();
      test_get_statechart_mappings31_0.raiseMyEvent();
      test_get_statechart_mappings31_0.triggerWithoutEvent();
      assertTrue(test_get_statechart_mappings31_0.isActive());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.enter();
      test_get_statechart_mappings31_0.triggerWithoutEvent();
      assertTrue(test_get_statechart_mappings31_0.isActive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.enter();
      test_get_statechart_mappings31_0.raiseMyEvent();
      test_get_statechart_mappings31_0.raiseMyEvent();
      assertTrue(test_get_statechart_mappings31_0.isActive());
      
      test_get_statechart_mappings31_0.exit();
      assertFalse(test_get_statechart_mappings31_0.isActive());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.enter();
      test_get_statechart_mappings31_0.raiseMyEvent();
      assertTrue(test_get_statechart_mappings31_0.isActive());
      
      test_get_statechart_mappings31_0.exit();
      assertFalse(test_get_statechart_mappings31_0.isActive());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.enter();
      assertTrue(test_get_statechart_mappings31_0.isActive());
      
      test_get_statechart_mappings31_0.exit();
      assertFalse(test_get_statechart_mappings31_0.isActive());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.enter();
      Test_get_statechart_mappings31.State test_get_statechart_mappings31_State0 = Test_get_statechart_mappings31.State.MAIN_REGION_STATEC;
      test_get_statechart_mappings31_0.raiseMyEvent();
      test_get_statechart_mappings31_0.raiseMyEvent();
      boolean boolean0 = test_get_statechart_mappings31_0.isStateActive(test_get_statechart_mappings31_State0);
      assertTrue(test_get_statechart_mappings31_0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.enter();
      Test_get_statechart_mappings31.State test_get_statechart_mappings31_State0 = Test_get_statechart_mappings31.State.MAIN_REGION_STATEB;
      test_get_statechart_mappings31_0.raiseMyEvent();
      boolean boolean0 = test_get_statechart_mappings31_0.isStateActive(test_get_statechart_mappings31_State0);
      assertTrue(test_get_statechart_mappings31_0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.enter();
      Test_get_statechart_mappings31.State test_get_statechart_mappings31_State0 = Test_get_statechart_mappings31.State.MAIN_REGION_STATEA;
      boolean boolean0 = test_get_statechart_mappings31_0.isStateActive(test_get_statechart_mappings31_State0);
      assertTrue(test_get_statechart_mappings31_0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      Test_get_statechart_mappings31.State test_get_statechart_mappings31_State0 = Test_get_statechart_mappings31.State.$NULLSTATE$;
      boolean boolean0 = test_get_statechart_mappings31_0.isStateActive(test_get_statechart_mappings31_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      Test_get_statechart_mappings31.State test_get_statechart_mappings31_State0 = Test_get_statechart_mappings31.State.MAIN_REGION_STATEC;
      boolean boolean0 = test_get_statechart_mappings31_0.isStateActive(test_get_statechart_mappings31_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      Test_get_statechart_mappings31.State test_get_statechart_mappings31_State0 = Test_get_statechart_mappings31.State.MAIN_REGION_STATEB;
      boolean boolean0 = test_get_statechart_mappings31_0.isStateActive(test_get_statechart_mappings31_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      Test_get_statechart_mappings31.State test_get_statechart_mappings31_State0 = Test_get_statechart_mappings31.State.MAIN_REGION_STATEA;
      boolean boolean0 = test_get_statechart_mappings31_0.isStateActive(test_get_statechart_mappings31_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.setIsExecuting(true);
      test_get_statechart_mappings31_0.raiseMyEvent();
      test_get_statechart_mappings31_0.setIsExecuting(false);
      test_get_statechart_mappings31_0.raiseMyEvent();
      assertFalse(test_get_statechart_mappings31_0.isFinal());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.enter();
      boolean boolean0 = test_get_statechart_mappings31_0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      boolean boolean0 = test_get_statechart_mappings31_0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.setIsExecuting(true);
      test_get_statechart_mappings31_0.exit();
      assertFalse(test_get_statechart_mappings31_0.isFinal());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.exit();
      assertFalse(test_get_statechart_mappings31_0.isActive());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      boolean boolean0 = test_get_statechart_mappings31_0.isFinal();
      assertFalse(test_get_statechart_mappings31_0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      test_get_statechart_mappings31_0.setIsExecuting(true);
      test_get_statechart_mappings31_0.enter();
      assertFalse(test_get_statechart_mappings31_0.isActive());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Test_get_statechart_mappings31 test_get_statechart_mappings31_0 = new Test_get_statechart_mappings31();
      assertFalse(test_get_statechart_mappings31_0.isActive());
      
      test_get_statechart_mappings31_0.enter();
      test_get_statechart_mappings31_0.raiseMyEvent();
      test_get_statechart_mappings31_0.raiseMyEvent();
      test_get_statechart_mappings31_0.raiseMyEvent();
      assertTrue(test_get_statechart_mappings31_0.isActive());
  }
}
