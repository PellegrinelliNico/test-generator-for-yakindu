/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 07 16:14:48 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.LightSimplified;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LightSimplified_ESTest extends LightSimplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      // Undeclared exception!
      try { 
        lightSimplified0.isStateActive((LightSimplified.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.LightSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      LightSimplified.Pr_ova lightSimplified_Pr_ova0 = new LightSimplified.Pr_ova(lightSimplified0);
      lightSimplified0.enter();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Pr_ova0.raiseSt_rike();
      assertTrue(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Switch lightSimplified_Switch0 = new LightSimplified.Switch(lightSimplified0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.A lightSimplified_A0 = new LightSimplified.A(lightSimplified0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Lightning lightSimplified_Lightning0 = new LightSimplified.Lightning(lightSimplified0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Prova4 lightSimplified_Prova4_0 = new LightSimplified.Prova4(lightSimplified0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      LightSimplified.Lightning lightSimplified_Lightning0 = lightSimplified0.lightning();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Lightning0.raiseStrike();
      lightSimplified_Switch0.raiseToggle();
      assertTrue(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Lightning lightSimplified_Lightning0 = lightSimplified0.lightning();
      lightSimplified0.enter();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Lightning0.raiseStrike();
      lightSimplified0.raiseRepair();
      assertTrue(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified0.enter();
      lightSimplified_Switch0.raiseToggle();
      LightSimplified.A lightSimplified_A0 = lightSimplified0.a();
      lightSimplified_A0.raiseA();
      assertTrue(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      LightSimplified.Prova4 lightSimplified_Prova4_0 = lightSimplified0.prova4();
      lightSimplified_Prova4_0.raiseStrike3();
      assertTrue(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      LightSimplified.Lightning lightSimplified_Lightning0 = lightSimplified0.lightning();
      lightSimplified_Lightning0.raiseStrike();
      assertTrue(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      LightSimplified.Lightning lightSimplified_Lightning0 = lightSimplified0.lightning();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Lightning0.raiseStrike();
      assertTrue(lightSimplified0.isActive());
      
      lightSimplified0.exit();
      assertFalse(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      assertTrue(lightSimplified0.isActive());
      
      lightSimplified0.exit();
      assertFalse(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      LightSimplified.Lightning lightSimplified_Lightning0 = lightSimplified0.lightning();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Lightning0.raiseStrike();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.MAIN_REGION_BROKEN;
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertTrue(lightSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified0.enter();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.MAIN_REGION_ON;
      lightSimplified_Switch0.raiseToggle();
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertTrue(lightSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.MAIN_REGION_OFF;
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertTrue(lightSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.$NULLSTATE$;
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.MAIN_REGION_ON;
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.MAIN_REGION_BROKEN;
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.MAIN_REGION_OFF;
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      boolean boolean0 = lightSimplified0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      boolean boolean0 = lightSimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.exit();
      assertFalse(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.triggerWithoutEvent();
      assertFalse(lightSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      boolean boolean0 = lightSimplified0.isFinal();
      assertFalse(lightSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified0.enter();
      lightSimplified_Switch0.raiseToggle();
      assertTrue(lightSimplified0.isActive());
      
      lightSimplified0.exit();
      assertFalse(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      assertFalse(lightSimplified0.isActive());
      
      lightSimplified0.enter();
      LightSimplified.Lightning lightSimplified_Lightning0 = lightSimplified0.lightning();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified_Lightning0.raiseStrike();
      LightSimplified.Pr_ova lightSimplified_Pr_ova0 = lightSimplified0.pr_ova();
      lightSimplified_Pr_ova0.raiseSt_rike();
      assertTrue(lightSimplified0.isActive());
  }
}
