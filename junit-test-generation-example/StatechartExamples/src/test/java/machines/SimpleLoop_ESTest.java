/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 01 09:10:58 GMT 2023
 */

package machines;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import machines.SimpleLoop;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleLoop_ESTest extends SimpleLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      simpleLoop0.setIsExecuting(true);
      SimpleLoop.Light simpleLoop_Light0 = new SimpleLoop.Light(simpleLoop0);
      simpleLoop_Light0.raiseToggle();
      boolean boolean0 = simpleLoop0.nextEvent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      boolean boolean0 = simpleLoop0.nextEvent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      simpleLoop0.light = null;
      SimpleLoop.Light simpleLoop_Light0 = simpleLoop0.light();
      assertNull(simpleLoop_Light0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      simpleLoop0.setIsExecuting(true);
      boolean boolean0 = simpleLoop0.getIsExecuting();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      boolean boolean0 = simpleLoop0.getIsExecuting();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      simpleLoop0.light = null;
      // Undeclared exception!
      try { 
        simpleLoop0.triggerWithoutEvent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("machines.SimpleLoop$Light", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      // Undeclared exception!
      try { 
        simpleLoop0.isStateActive((SimpleLoop.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("machines.SimpleLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      SimpleLoop.Light simpleLoop_Light0 = simpleLoop0.light;
      simpleLoop0.enter();
      simpleLoop_Light0.raiseToggle();
      simpleLoop0.triggerWithoutEvent();
      assertTrue(simpleLoop0.isActive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      simpleLoop0.enter();
      simpleLoop0.triggerWithoutEvent();
      assertTrue(simpleLoop0.isActive());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      simpleLoop0.exit();
      assertFalse(simpleLoop0.isFinal());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      simpleLoop0.enter();
      assertTrue(simpleLoop0.isActive());
      
      simpleLoop0.exit();
      assertFalse(simpleLoop0.isActive());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      SimpleLoop.State simpleLoop_State0 = SimpleLoop.State.MAIN_REGION_ON;
      SimpleLoop.Light simpleLoop_Light0 = simpleLoop0.light;
      simpleLoop0.enter();
      simpleLoop_Light0.raiseToggle();
      boolean boolean0 = simpleLoop0.isStateActive(simpleLoop_State0);
      assertTrue(simpleLoop0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      simpleLoop0.enter();
      SimpleLoop.State simpleLoop_State0 = SimpleLoop.State.MAIN_REGION_OFF;
      boolean boolean0 = simpleLoop0.isStateActive(simpleLoop_State0);
      assertTrue(simpleLoop0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      SimpleLoop.State simpleLoop_State0 = SimpleLoop.State.$NULLSTATE$;
      boolean boolean0 = simpleLoop0.isStateActive(simpleLoop_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      SimpleLoop.State simpleLoop_State0 = SimpleLoop.State.MAIN_REGION_ON;
      boolean boolean0 = simpleLoop0.isStateActive(simpleLoop_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      SimpleLoop.State simpleLoop_State0 = SimpleLoop.State.MAIN_REGION_OFF;
      boolean boolean0 = simpleLoop0.isStateActive(simpleLoop_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      SimpleLoop.Light simpleLoop_Light0 = simpleLoop0.light();
      simpleLoop0.setIsExecuting(true);
      simpleLoop_Light0.raiseToggle();
      simpleLoop0.setIsExecuting(false);
      simpleLoop_Light0.raiseToggle();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      assertFalse(simpleLoop0.isActive());
      
      SimpleLoop.Light simpleLoop_Light0 = simpleLoop0.light;
      simpleLoop0.enter();
      simpleLoop_Light0.raiseToggle();
      simpleLoop_Light0.raiseToggle();
      assertTrue(simpleLoop0.isActive());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      assertFalse(simpleLoop0.isActive());
      
      simpleLoop0.enter();
      boolean boolean0 = simpleLoop0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      boolean boolean0 = simpleLoop0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      simpleLoop0.setIsExecuting(true);
      simpleLoop0.exit();
      assertFalse(simpleLoop0.isActive());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      simpleLoop0.setIsExecuting(true);
      simpleLoop0.enter();
      assertFalse(simpleLoop0.isActive());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      boolean boolean0 = simpleLoop0.isFinal();
      assertFalse(boolean0);
      assertFalse(simpleLoop0.isActive());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleLoop simpleLoop0 = new SimpleLoop();
      SimpleLoop.Light simpleLoop_Light0 = simpleLoop0.light;
      simpleLoop0.enter();
      simpleLoop_Light0.raiseToggle();
      assertTrue(simpleLoop0.isActive());
      
      simpleLoop0.exit();
      assertFalse(simpleLoop0.isActive());
  }
}
