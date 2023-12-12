/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 12 13:48:46 GMT 2023
 */

package temp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import temp.StatechartSimplified;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatechartSimplified_ESTest extends StatechartSimplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      // Undeclared exception!
      try { 
        statechartSimplified0.isStateActive((StatechartSimplified.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("temp.StatechartSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.enter();
      statechartSimplified0.runCycle();
      statechartSimplified0.runCycle();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.runCycle();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.runCycle();
      statechartSimplified0.raiseWork();
      statechartSimplified0.runCycle();
      assertTrue(statechartSimplified0.isActive());
      
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      assertTrue(statechartSimplified0.isActive());
      
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.runCycle();
      statechartSimplified0.raiseWork();
      statechartSimplified0.runCycle();
      statechartSimplified0.raiseEnd_all();
      statechartSimplified0.runCycle();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION__FINAL_;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_IDLE;
      statechartSimplified0.raisePower_on();
      statechartSimplified0.runCycle();
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_OFF;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.$NULLSTATE$;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES_R2_AN2B;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES_R2_AN2A;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_CHILL;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION__FINAL_;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ENDANALYSES;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_INITANALYSES;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_WORKING;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_IDLE;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES_R1_AN1;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_OFF;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.runCycle();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.runCycle();
      statechartSimplified0.runCycle();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.runCycle();
      statechartSimplified0.raiseWork();
      statechartSimplified0.runCycle();
      statechartSimplified0.raiseEnd_all();
      statechartSimplified0.runCycle();
      boolean boolean0 = statechartSimplified0.isFinal();
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      boolean boolean0 = statechartSimplified0.isFinal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      boolean boolean0 = statechartSimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      boolean boolean0 = statechartSimplified0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.runCycle();
      statechartSimplified0.raiseWork();
      statechartSimplified0.runCycle();
      statechartSimplified0.raiseEnd_all();
      statechartSimplified0.runCycle();
      statechartSimplified0.runCycle();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.raiseA();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.raiseB();
      assertFalse(statechartSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.raiseStart();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.runCycle();
      statechartSimplified0.raiseWork();
      statechartSimplified0.runCycle();
      statechartSimplified0.raiseEnd_all();
      statechartSimplified0.runCycle();
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.raiseEnd();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.runCycle();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.runCycle();
      assertTrue(statechartSimplified0.isActive());
      
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.enter();
      statechartSimplified0.runCycle();
      assertTrue(statechartSimplified0.isActive());
      
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.runCycle();
      assertFalse(statechartSimplified0.isFinal());
  }
}
