/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 07 10:43:03 GMT 2023
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
      statechart0.setIsExecuting(true);
      statechart0.raiseMyEvent();
      boolean boolean0 = statechart0.nextEvent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      boolean boolean0 = statechart0.nextEvent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.setIsExecuting(true);
      boolean boolean0 = statechart0.getIsExecuting();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      boolean boolean0 = statechart0.getIsExecuting();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      statechart0.raiseMyEvent();
      statechart0.raiseMyEvent();
      assertTrue(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      statechart0.triggerWithoutEvent();
      assertTrue(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.exit();
      assertFalse(statechart0.isFinal());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      assertTrue(statechart0.isActive());
      
      statechart0.exit();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      Statechart.State statechart_State0 = Statechart.State.MAIN_REGION_STATEB;
      statechart0.raiseMyEvent();
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertTrue(statechart0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      Statechart.State statechart_State0 = Statechart.State.MAIN_REGION_STATEA;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertTrue(statechart0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.$NULLSTATE$;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAIN_REGION_STATEB;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      Statechart.State statechart_State0 = Statechart.State.MAIN_REGION_STATEA;
      boolean boolean0 = statechart0.isStateActive(statechart_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.setIsExecuting(true);
      statechart0.raiseMyEvent();
      statechart0.raiseMyEvent();
      statechart0.setIsExecuting(false);
      statechart0.triggerWithoutEvent();
      assertFalse(statechart0.isFinal());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      assertFalse(statechart0.isActive());
      
      statechart0.enter();
      statechart0.raiseMyEvent();
      statechart0.triggerWithoutEvent();
      assertTrue(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      assertFalse(statechart0.isActive());
      
      statechart0.enter();
      boolean boolean0 = statechart0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      boolean boolean0 = statechart0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.setIsExecuting(true);
      statechart0.exit();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      boolean boolean0 = statechart0.isFinal();
      assertFalse(statechart0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.setIsExecuting(true);
      statechart0.enter();
      assertFalse(statechart0.isActive());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Statechart statechart0 = new Statechart();
      statechart0.enter();
      statechart0.raiseMyEvent();
      assertTrue(statechart0.isActive());
      
      statechart0.exit();
      assertFalse(statechart0.isActive());
  }
}
