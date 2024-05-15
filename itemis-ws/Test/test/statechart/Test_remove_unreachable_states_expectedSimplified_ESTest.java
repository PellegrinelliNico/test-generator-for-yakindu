/*
 * This file was automatically generated by EvoSuite
 * Tue May 14 21:08:58 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.Test_remove_unreachable_states_expectedSimplified;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Test_remove_unreachable_states_expectedSimplified_ESTest extends Test_remove_unreachable_states_expectedSimplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      Test_remove_unreachable_states_expectedSimplified.State test_remove_unreachable_states_expectedSimplified_State0 = Test_remove_unreachable_states_expectedSimplified.State.MAIN_REGION_B;
      test_remove_unreachable_states_expectedSimplified0.enter();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isStateActive(test_remove_unreachable_states_expectedSimplified_State0);
      assertTrue(test_remove_unreachable_states_expectedSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      // Undeclared exception!
      try { 
        test_remove_unreachable_states_expectedSimplified0.isStateActive((Test_remove_unreachable_states_expectedSimplified.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.Test_remove_unreachable_states_expectedSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      test_remove_unreachable_states_expectedSimplified0.enter();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      test_remove_unreachable_states_expectedSimplified0.triggerWithoutEvent();
      assertTrue(test_remove_unreachable_states_expectedSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      test_remove_unreachable_states_expectedSimplified0.enter();
      test_remove_unreachable_states_expectedSimplified0.triggerWithoutEvent();
      assertTrue(test_remove_unreachable_states_expectedSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      test_remove_unreachable_states_expectedSimplified0.enter();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      assertTrue(test_remove_unreachable_states_expectedSimplified0.isActive());
      
      test_remove_unreachable_states_expectedSimplified0.exit();
      assertFalse(test_remove_unreachable_states_expectedSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      test_remove_unreachable_states_expectedSimplified0.enter();
      assertTrue(test_remove_unreachable_states_expectedSimplified0.isActive());
      
      test_remove_unreachable_states_expectedSimplified0.exit();
      assertFalse(test_remove_unreachable_states_expectedSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      test_remove_unreachable_states_expectedSimplified0.enter();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      Test_remove_unreachable_states_expectedSimplified.State test_remove_unreachable_states_expectedSimplified_State0 = Test_remove_unreachable_states_expectedSimplified.State.MAIN_REGION_B_HELLO_K;
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isStateActive(test_remove_unreachable_states_expectedSimplified_State0);
      assertTrue(test_remove_unreachable_states_expectedSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      test_remove_unreachable_states_expectedSimplified0.enter();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      Test_remove_unreachable_states_expectedSimplified.State test_remove_unreachable_states_expectedSimplified_State0 = Test_remove_unreachable_states_expectedSimplified.State.MAIN_REGION_B_HELLO_J;
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isStateActive(test_remove_unreachable_states_expectedSimplified_State0);
      assertTrue(test_remove_unreachable_states_expectedSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      Test_remove_unreachable_states_expectedSimplified.State test_remove_unreachable_states_expectedSimplified_State0 = Test_remove_unreachable_states_expectedSimplified.State.MAIN_REGION_B;
      test_remove_unreachable_states_expectedSimplified0.enter();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isStateActive(test_remove_unreachable_states_expectedSimplified_State0);
      assertTrue(test_remove_unreachable_states_expectedSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      Test_remove_unreachable_states_expectedSimplified.State test_remove_unreachable_states_expectedSimplified_State0 = Test_remove_unreachable_states_expectedSimplified.State.MAIN_REGION_B;
      test_remove_unreachable_states_expectedSimplified0.enter();
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isStateActive(test_remove_unreachable_states_expectedSimplified_State0);
      assertTrue(test_remove_unreachable_states_expectedSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      test_remove_unreachable_states_expectedSimplified0.enter();
      Test_remove_unreachable_states_expectedSimplified.State test_remove_unreachable_states_expectedSimplified_State0 = Test_remove_unreachable_states_expectedSimplified.State.MAIN_REGION_A;
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isStateActive(test_remove_unreachable_states_expectedSimplified_State0);
      assertTrue(test_remove_unreachable_states_expectedSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      Test_remove_unreachable_states_expectedSimplified.State test_remove_unreachable_states_expectedSimplified_State0 = Test_remove_unreachable_states_expectedSimplified.State.$NULLSTATE$;
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isStateActive(test_remove_unreachable_states_expectedSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      Test_remove_unreachable_states_expectedSimplified.State test_remove_unreachable_states_expectedSimplified_State0 = Test_remove_unreachable_states_expectedSimplified.State.MAIN_REGION_B;
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isStateActive(test_remove_unreachable_states_expectedSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      Test_remove_unreachable_states_expectedSimplified.State test_remove_unreachable_states_expectedSimplified_State0 = Test_remove_unreachable_states_expectedSimplified.State.MAIN_REGION_B_HELLO_K;
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isStateActive(test_remove_unreachable_states_expectedSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      Test_remove_unreachable_states_expectedSimplified.State test_remove_unreachable_states_expectedSimplified_State0 = Test_remove_unreachable_states_expectedSimplified.State.MAIN_REGION_B_HELLO_J;
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isStateActive(test_remove_unreachable_states_expectedSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      Test_remove_unreachable_states_expectedSimplified.State test_remove_unreachable_states_expectedSimplified_State0 = Test_remove_unreachable_states_expectedSimplified.State.MAIN_REGION_A;
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isStateActive(test_remove_unreachable_states_expectedSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      test_remove_unreachable_states_expectedSimplified0.enter();
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      test_remove_unreachable_states_expectedSimplified0.exit();
      assertFalse(test_remove_unreachable_states_expectedSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      boolean boolean0 = test_remove_unreachable_states_expectedSimplified0.isFinal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      test_remove_unreachable_states_expectedSimplified0.triggerWithoutEvent();
      assertFalse(test_remove_unreachable_states_expectedSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Test_remove_unreachable_states_expectedSimplified test_remove_unreachable_states_expectedSimplified0 = new Test_remove_unreachable_states_expectedSimplified();
      test_remove_unreachable_states_expectedSimplified0.enter();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      test_remove_unreachable_states_expectedSimplified0.raiseOperate();
      assertTrue(test_remove_unreachable_states_expectedSimplified0.isActive());
      
      test_remove_unreachable_states_expectedSimplified0.exit();
      assertFalse(test_remove_unreachable_states_expectedSimplified0.isActive());
  }
}
