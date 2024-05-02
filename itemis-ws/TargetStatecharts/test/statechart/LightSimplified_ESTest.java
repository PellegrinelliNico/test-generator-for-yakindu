/*
 * This file was automatically generated by EvoSuite
 * Thu May 02 07:13:14 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.LightSimplified;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LightSimplified_ESTest extends LightSimplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LightSimplified.Color lightSimplified_Color0 = new LightSimplified.Color();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LightSimplified.Lightning lightSimplified_Lightning0 = new LightSimplified.Lightning();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LightSimplified.Switch lightSimplified_Switch0 = new LightSimplified.Switch();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified0.enter();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified0.runCycle();
      lightSimplified0.runCycle();
      assertTrue(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      lightSimplified0.runCycle();
      assertTrue(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified0.runCycle();
      assertTrue(lightSimplified0.isActive());
      
      lightSimplified0.exit();
      assertFalse(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      assertTrue(lightSimplified0.isActive());
      
      lightSimplified0.exit();
      assertFalse(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.MAIN_REGION_OFF;
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertTrue(lightSimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.MAIN_REGION_BROKEN;
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.MAIN_REGION_ON;
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.$NULLSTATE$;
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.State lightSimplified_State0 = LightSimplified.State.MAIN_REGION_OFF;
      boolean boolean0 = lightSimplified0.isStateActive(lightSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.runCycle();
      assertFalse(lightSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.enter();
      boolean boolean0 = lightSimplified0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      boolean boolean0 = lightSimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.exit();
      assertFalse(lightSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified_Switch0.raiseIncreaseBrightness();
      assertFalse(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Color lightSimplified_Color0 = lightSimplified0.color();
      lightSimplified_Color0.raiseChange();
      assertFalse(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Lightning lightSimplified_Lightning0 = lightSimplified0.lightning();
      lightSimplified_Lightning0.raiseStrike();
      assertFalse(lightSimplified0.isActive());
      
      lightSimplified0.enter();
      lightSimplified0.runCycle();
      assertTrue(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      assertFalse(lightSimplified0.isActive());
      
      lightSimplified0.enter();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified0.runCycle();
      lightSimplified_Switch0.raiseReduceBrightness();
      lightSimplified0.runCycle();
      assertTrue(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      lightSimplified0.raiseRepair();
      assertFalse(lightSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      boolean boolean0 = lightSimplified0.isFinal();
      assertFalse(lightSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LightSimplified lightSimplified0 = new LightSimplified();
      assertFalse(lightSimplified0.isActive());
      
      lightSimplified0.enter();
      LightSimplified.Switch lightSimplified_Switch0 = lightSimplified0.switch_ID();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified0.runCycle();
      lightSimplified_Switch0.raiseToggle();
      lightSimplified0.runCycle();
      assertTrue(lightSimplified0.isActive());
  }
}