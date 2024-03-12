/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 12 15:36:58 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.EntryExitSimplified;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EntryExitSimplified_ESTest extends EntryExitSimplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseC();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_MULTIPLE_ALTERNATIVES;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertTrue(entryExitSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      // Undeclared exception!
      try { 
        entryExitSimplified0.isStateActive((EntryExitSimplified.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.EntryExitSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseC();
      entryExitSimplified0.raiseNext();
      entryExitSimplified0.raiseC();
      assertTrue(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseC();
      entryExitSimplified0.raiseNext();
      entryExitSimplified0.raiseNext();
      entryExitSimplified0.raiseC();
      assertTrue(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseB();
      entryExitSimplified0.raiseA();
      assertTrue(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseC();
      entryExitSimplified0.raiseNext();
      entryExitSimplified0.triggerWithoutEvent();
      assertTrue(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseA();
      entryExitSimplified0.raiseA();
      assertTrue(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.triggerWithoutEvent();
      assertTrue(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.exit();
      assertFalse(entryExitSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseC();
      entryExitSimplified0.raiseNext();
      assertTrue(entryExitSimplified0.isActive());
      
      entryExitSimplified0.exit();
      assertFalse(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseB();
      entryExitSimplified0.raiseNext();
      assertTrue(entryExitSimplified0.isActive());
      
      entryExitSimplified0.exit();
      assertFalse(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseC();
      assertTrue(entryExitSimplified0.isActive());
      
      entryExitSimplified0.exit();
      assertFalse(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseB();
      assertTrue(entryExitSimplified0.isActive());
      
      entryExitSimplified0.exit();
      assertFalse(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseA();
      assertTrue(entryExitSimplified0.isActive());
      
      entryExitSimplified0.exit();
      assertFalse(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      assertTrue(entryExitSimplified0.isActive());
      
      entryExitSimplified0.exit();
      assertFalse(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_D;
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseC();
      entryExitSimplified0.raiseNext();
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertTrue(entryExitSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseA();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION__FINAL_;
      entryExitSimplified0.raiseNext();
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertTrue(entryExitSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_MULTIPLE_ALTERNATIVES_R1_C;
      entryExitSimplified0.raiseC();
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertTrue(entryExitSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseB();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_MULTIPLE_ALTERNATIVES_R1_B;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertTrue(entryExitSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_MULTIPLE_ALTERNATIVES_R1_A;
      entryExitSimplified0.raiseA();
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertTrue(entryExitSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseA();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_MULTIPLE_ALTERNATIVES;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertTrue(entryExitSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_MULTIPLE_ALTERNATIVES;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertTrue(entryExitSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_INIT;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertTrue(entryExitSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.$NULLSTATE$;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_MULTIPLE_ALTERNATIVES;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_D;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_E;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_MULTIPLE_ALTERNATIVES_R1_C;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_MULTIPLE_ALTERNATIVES_R1_B;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_MULTIPLE_ALTERNATIVES_R1_A;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION__FINAL_;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_INIT;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseA();
      entryExitSimplified0.raiseNext();
      boolean boolean0 = entryExitSimplified0.isFinal();
      assertTrue(entryExitSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      boolean boolean0 = entryExitSimplified0.isFinal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      boolean boolean0 = entryExitSimplified0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      boolean boolean0 = entryExitSimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.triggerWithoutEvent();
      assertFalse(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseC();
      entryExitSimplified0.raiseNext();
      entryExitSimplified0.raiseNext();
      entryExitSimplified0.raiseNext();
      assertTrue(entryExitSimplified0.isActive());
      
      entryExitSimplified0.exit();
      assertFalse(entryExitSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      assertFalse(entryExitSimplified0.isActive());
      
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseB();
      entryExitSimplified0.raiseNext();
      EntryExitSimplified.State entryExitSimplified_State0 = EntryExitSimplified.State.MAIN_REGION_E;
      boolean boolean0 = entryExitSimplified0.isStateActive(entryExitSimplified_State0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseA();
      entryExitSimplified0.raiseNext();
      entryExitSimplified0.raiseA();
      assertTrue(entryExitSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EntryExitSimplified entryExitSimplified0 = new EntryExitSimplified();
      assertFalse(entryExitSimplified0.isActive());
      
      entryExitSimplified0.enter();
      entryExitSimplified0.raiseC();
      entryExitSimplified0.raiseB();
      assertTrue(entryExitSimplified0.isActive());
  }
}
