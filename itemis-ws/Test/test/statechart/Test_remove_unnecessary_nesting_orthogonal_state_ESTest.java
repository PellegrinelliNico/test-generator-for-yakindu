/*
 * This file was automatically generated by EvoSuite
 * Tue May 14 21:00:49 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.Test_remove_unnecessary_nesting_orthogonal_state;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Test_remove_unnecessary_nesting_orthogonal_state_ESTest extends Test_remove_unnecessary_nesting_orthogonal_state_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.setIsExecuting(true);
      test_remove_unnecessary_nesting_orthogonal_state0.raiseOperate();
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.nextEvent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.nextEvent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      long long0 = test_remove_unnecessary_nesting_orthogonal_state0.getStateConfVectorPosition();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.setStateConfVectorPosition(335L);
      long long0 = test_remove_unnecessary_nesting_orthogonal_state0.getStateConfVectorPosition();
      assertEquals(335L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.setStateConfVectorPosition((-3745L));
      long long0 = test_remove_unnecessary_nesting_orthogonal_state0.getStateConfVectorPosition();
      assertEquals((-3745L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.setIsExecuting(true);
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.getIsExecuting();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.getIsExecuting();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      // Undeclared exception!
      try { 
        test_remove_unnecessary_nesting_orthogonal_state0.isStateActive((Test_remove_unnecessary_nesting_orthogonal_state.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.Test_remove_unnecessary_nesting_orthogonal_state", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.enter();
      test_remove_unnecessary_nesting_orthogonal_state0.raiseOperate();
      test_remove_unnecessary_nesting_orthogonal_state0.raiseHello();
      assertTrue(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.enter();
      test_remove_unnecessary_nesting_orthogonal_state0.raiseOperate();
      assertTrue(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
      
      test_remove_unnecessary_nesting_orthogonal_state0.exit();
      assertFalse(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.enter();
      Test_remove_unnecessary_nesting_orthogonal_state.State test_remove_unnecessary_nesting_orthogonal_state_State0 = Test_remove_unnecessary_nesting_orthogonal_state.State.MAIN_REGION_A;
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isStateActive(test_remove_unnecessary_nesting_orthogonal_state_State0);
      assertTrue(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      Test_remove_unnecessary_nesting_orthogonal_state.State test_remove_unnecessary_nesting_orthogonal_state_State0 = Test_remove_unnecessary_nesting_orthogonal_state.State.MAIN_REGION_C_E_F;
      test_remove_unnecessary_nesting_orthogonal_state0.enter();
      test_remove_unnecessary_nesting_orthogonal_state0.raiseOperate();
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isStateActive(test_remove_unnecessary_nesting_orthogonal_state_State0);
      assertTrue(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.enter();
      test_remove_unnecessary_nesting_orthogonal_state0.raiseOperate();
      Test_remove_unnecessary_nesting_orthogonal_state.State test_remove_unnecessary_nesting_orthogonal_state_State0 = Test_remove_unnecessary_nesting_orthogonal_state.State.MAIN_REGION_C_D_B;
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isStateActive(test_remove_unnecessary_nesting_orthogonal_state_State0);
      assertTrue(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.enter();
      test_remove_unnecessary_nesting_orthogonal_state0.raiseOperate();
      Test_remove_unnecessary_nesting_orthogonal_state.State test_remove_unnecessary_nesting_orthogonal_state_State0 = Test_remove_unnecessary_nesting_orthogonal_state.State.MAIN_REGION_C;
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isStateActive(test_remove_unnecessary_nesting_orthogonal_state_State0);
      assertTrue(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      Test_remove_unnecessary_nesting_orthogonal_state.State test_remove_unnecessary_nesting_orthogonal_state_State0 = Test_remove_unnecessary_nesting_orthogonal_state.State.$NULLSTATE$;
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isStateActive(test_remove_unnecessary_nesting_orthogonal_state_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      Test_remove_unnecessary_nesting_orthogonal_state.State test_remove_unnecessary_nesting_orthogonal_state_State0 = Test_remove_unnecessary_nesting_orthogonal_state.State.MAIN_REGION_C_E_F;
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isStateActive(test_remove_unnecessary_nesting_orthogonal_state_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      Test_remove_unnecessary_nesting_orthogonal_state.State test_remove_unnecessary_nesting_orthogonal_state_State0 = Test_remove_unnecessary_nesting_orthogonal_state.State.MAIN_REGION_A;
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isStateActive(test_remove_unnecessary_nesting_orthogonal_state_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      Test_remove_unnecessary_nesting_orthogonal_state.State test_remove_unnecessary_nesting_orthogonal_state_State0 = Test_remove_unnecessary_nesting_orthogonal_state.State.MAIN_REGION_C;
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isStateActive(test_remove_unnecessary_nesting_orthogonal_state_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      Test_remove_unnecessary_nesting_orthogonal_state.State test_remove_unnecessary_nesting_orthogonal_state_State0 = Test_remove_unnecessary_nesting_orthogonal_state.State.MAIN_REGION_C_D_B;
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isStateActive(test_remove_unnecessary_nesting_orthogonal_state_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.setIsExecuting(true);
      test_remove_unnecessary_nesting_orthogonal_state0.raiseOperate();
      test_remove_unnecessary_nesting_orthogonal_state0.setIsExecuting(false);
      test_remove_unnecessary_nesting_orthogonal_state0.raiseHello();
      assertFalse(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.enter();
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.setIsExecuting(true);
      test_remove_unnecessary_nesting_orthogonal_state0.exit();
      assertFalse(test_remove_unnecessary_nesting_orthogonal_state0.isFinal());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.exit();
      assertFalse(test_remove_unnecessary_nesting_orthogonal_state0.isFinal());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      boolean boolean0 = test_remove_unnecessary_nesting_orthogonal_state0.isFinal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.triggerWithoutEvent();
      assertFalse(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.setIsExecuting(true);
      test_remove_unnecessary_nesting_orthogonal_state0.enter();
      assertFalse(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      test_remove_unnecessary_nesting_orthogonal_state0.enter();
      test_remove_unnecessary_nesting_orthogonal_state0.raiseOperate();
      test_remove_unnecessary_nesting_orthogonal_state0.raiseOperate();
      assertTrue(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
      
      test_remove_unnecessary_nesting_orthogonal_state0.exit();
      assertFalse(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Test_remove_unnecessary_nesting_orthogonal_state test_remove_unnecessary_nesting_orthogonal_state0 = new Test_remove_unnecessary_nesting_orthogonal_state();
      assertFalse(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
      
      test_remove_unnecessary_nesting_orthogonal_state0.enter();
      test_remove_unnecessary_nesting_orthogonal_state0.raiseHello();
      assertTrue(test_remove_unnecessary_nesting_orthogonal_state0.isActive());
  }
}
