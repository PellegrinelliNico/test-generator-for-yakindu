/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 05 17:27:17 GMT 2023
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
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      statechartSimplified0.raiseB();
      statechartSimplified0.raiseA();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raiseB();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES_R1_AN1;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES_R1_AN1;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.raiseWork();
      assertFalse(statechartSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseWork();
      statechartSimplified0.triggerWithoutEvent();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      statechartSimplified0.raiseB();
      statechartSimplified0.raiseA();
      statechartSimplified0.raiseStart();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      statechartSimplified0.raiseA();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseB();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      statechartSimplified0.raiseB();
      statechartSimplified0.raiseEnd_all();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      statechartSimplified0.enter();
      statechartSimplified0.raiseEnd_all();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      statechartSimplified0.raiseB();
      assertTrue(statechartSimplified0.isActive());
      
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      statechartSimplified0.raiseB();
      statechartSimplified0.raiseA();
      assertTrue(statechartSimplified0.isActive());
      
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      assertTrue(statechartSimplified0.isActive());
      
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseWork();
      assertTrue(statechartSimplified0.isActive());
      
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      assertTrue(statechartSimplified0.isActive());
      
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      assertTrue(statechartSimplified0.isActive());
      
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseWork();
      statechartSimplified0.raiseEnd_all();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION__FINAL_;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      statechartSimplified0.raiseB();
      statechartSimplified0.raiseA();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ENDANALYSES;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES_R2_AN2B;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES_R2_AN2A;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      statechartSimplified0.raiseB();
      statechartSimplified0.enter();
      statechartSimplified0.raiseEnd();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES;
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_INITANALYSES;
      statechartSimplified0.raiseAnalize();
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_IDLE;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_OFF;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertTrue(statechartSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.$NULLSTATE$;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_CHILL;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION__FINAL_;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ENDANALYSES;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES_R2_AN2A;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_ANALYSES;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_INITANALYSES;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON_R1_WORKING;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      assertFalse(statechartSimplified0.isActive());
      
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_ON;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_IDLE;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(boolean0);
      assertFalse(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      StatechartSimplified.State statechartSimplified_State0 = StatechartSimplified.State.MAINREGION_OFF;
      boolean boolean0 = statechartSimplified0.isStateActive(statechartSimplified_State0);
      assertFalse(statechartSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      boolean boolean0 = statechartSimplified0.isFinal();
      assertFalse(statechartSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      boolean boolean0 = statechartSimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      assertFalse(statechartSimplified0.isActive());
      
      statechartSimplified0.enter();
      boolean boolean0 = statechartSimplified0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseEnd_all();
      statechartSimplified0.raiseEnd_all();
      assertTrue(statechartSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      assertFalse(statechartSimplified0.isActive());
      
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseStart();
      statechartSimplified0.raiseB();
      statechartSimplified0.raiseA();
      statechartSimplified0.raiseEnd();
      statechartSimplified0.raisePower_on();
      assertTrue(statechartSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseWork();
      statechartSimplified0.raiseEnd_all();
      boolean boolean0 = statechartSimplified0.isFinal();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StatechartSimplified statechartSimplified0 = new StatechartSimplified();
      statechartSimplified0.enter();
      statechartSimplified0.raisePower_on();
      statechartSimplified0.raiseAnalize();
      statechartSimplified0.raiseEnd_all();
      assertTrue(statechartSimplified0.isFinal());
      
      statechartSimplified0.exit();
      assertFalse(statechartSimplified0.isActive());
  }
}
