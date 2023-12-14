/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 10:37:23 GMT 2023
 */

package temp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import temp.Statechart;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Statechart_ESTest extends Statechart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      long long0 = statechart0.getStateConfVectorPosition();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.setStateConfVectorPosition(1255L);
      long long0 = statechart0.getStateConfVectorPosition();
      assertEquals(1255L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.setStateConfVectorPosition((-1L));
      long long0 = statechart0.getStateConfVectorPosition();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.setIsExecuting(true);
      boolean boolean0 = statechart0.getIsExecuting();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      boolean boolean0 = statechart0.getIsExecuting();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      // Undeclared exception!
      try { 
        statechart0.isStateActive((Statechart.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("temp.Statechart", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.raisePower_on();
      statechart0.enter();
      statechart0.runCycle();
      statechart0.runCycle();
      assertTrue(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      statechart0.runCycle();
      assertTrue(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.exit();
      assertFalse(statechart0.isFinal());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.raisePower_on();
      statechart0.enter();
      statechart0.runCycle();
      assertTrue(statechart0.isActive());
      
      statechart0.exit();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      assertTrue(statechart0.isActive());
      
      statechart0.exit();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON_R1_ANALYSES;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertTrue(statechart0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.raisePower_on();
      statechart0.enter();
      statechart0.runCycle();
      statechart0.raiseAnalize();
      statechart0.runCycle();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON_R1_INITANALYSES;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertTrue(statechart0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.raisePower_on();
      statechart0.enter();
      statechart0.runCycle();
      statechart0.raiseAnalize();
      statechart0.runCycle();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertTrue(statechart0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertTrue(statechart0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.raisePower_on();
      statechart0.enter();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_IDLE;
      statechart0.runCycle();
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertTrue(statechart0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_OFF;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertTrue(statechart0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.$NULLSTATE$;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON_R1_ANALYSES;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON_R1_ANALYSES_R2_AN2B;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON_R1_ANALYSES_R2_AN2A;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_CHILL;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION__FINAL_;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON_R1_ENDANALYSES;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON_R1_ANALYSES_R1_AN1;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON_R1_INITANALYSES;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_ON_R1_WORKING;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_IDLE;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAINREGION_OFF;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.runCycle();
      assertFalse(statechart0.isFinal());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      boolean boolean0 = statechart0.isFinal();
      assertFalse(statechart0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      boolean boolean0 = statechart0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      assertFalse(statechart0.isActive());
      
      statechart0.enter();
      boolean boolean0 = statechart0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.setIsExecuting(true);
      statechart0.exit();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.setIsExecuting(true);
      statechart0.enter();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.setIsExecuting(true);
      statechart0.runCycle();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.raiseA();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.raisePower_on();
      assertFalse(statechart0.isActive());
      
      statechart0.enter();
      statechart0.runCycle();
      statechart0.raiseWork();
      statechart0.runCycle();
      statechart0.runCycle();
      assertTrue(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.raiseB();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.raisePower_on();
      statechart0.enter();
      statechart0.runCycle();
      statechart0.raiseAnalize();
      statechart0.runCycle();
      statechart0.raiseEnd_all();
      statechart0.runCycle();
      boolean boolean0 = statechart0.isFinal();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.raiseStart();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      statechart0.raisePower_on();
      statechart0.runCycle();
      statechart0.raiseWork();
      statechart0.runCycle();
      assertTrue(statechart0.isActive());
      
      statechart0.exit();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.raiseEnd();
      assertFalse(statechart0.isActive());
  }
}
