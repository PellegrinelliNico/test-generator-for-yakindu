/*
 * This file was automatically generated by EvoSuite
 * Tue May 21 07:44:41 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.yakindu.core.ITimerService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.Sample;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sample_ESTest extends Sample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.setTimer(0L);
      long long0 = sample0.getTimer();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.setTimer((-9L));
      long long0 = sample0.getTimer();
      assertEquals((-9L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.setStateConfVectorPosition(3707L);
      long long0 = sample0.getStateConfVectorPosition();
      assertEquals(3707L, long0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.setStateConfVectorPosition((-1L));
      long long0 = sample0.getStateConfVectorPosition();
      assertEquals((-1L), long0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.setIsExecuting(true);
      boolean boolean0 = sample0.getIsExecuting();
      assertEquals(15L, sample0.getTimer());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sample sample0 = new Sample();
      boolean boolean0 = sample0.getIsExecuting();
      assertFalse(boolean0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sample sample0 = new Sample();
      // Undeclared exception!
      try { 
        sample0.isStateActive((Sample.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.Sample", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sample sample0 = new Sample();
      Sample.State sample_State0 = Sample.State.SAMPLE_LIGHT_LIGHTS_ON_TIMER_TIMER_WORKING;
      boolean boolean0 = sample0.isStateActive(sample_State0);
      assertEquals(15L, sample0.getTimer());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sample sample0 = new Sample();
      Sample.State sample_State0 = Sample.State.SAMPLE_LIGHT_LIGHTS_ON;
      boolean boolean0 = sample0.isStateActive(sample_State0);
      assertEquals(15L, sample0.getTimer());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sample sample0 = new Sample();
      Sample.State sample_State0 = Sample.State.SAMPLE_LIGHT_LIGHTS_ON_TIMER_TIMER_WORKING_TIMER_STATUS_TRIGGER_OFF;
      sample0.isStateActive(sample_State0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sample sample0 = new Sample();
      Sample.State sample_State0 = Sample.State.SAMPLE_LIGHT_LIGHTS_ON_TIMER_TIMER_WORKING_TIMER_STATUS_COUNTING_DOWN;
      sample0.isStateActive(sample_State0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sample sample0 = new Sample();
      Sample.State sample_State0 = Sample.State.SAMPLE_LIGHT_LIGHTS_ON_BRIGHTNESS_LEVEL_HIGH;
      boolean boolean0 = sample0.isStateActive(sample_State0);
      assertFalse(boolean0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sample sample0 = new Sample();
      Sample.State sample_State0 = Sample.State.SAMPLE_LIGHT_LIGHTS_ON_BRIGHTNESS_LEVEL_MED;
      boolean boolean0 = sample0.isStateActive(sample_State0);
      assertFalse(boolean0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Sample sample0 = new Sample();
      Sample.State sample_State0 = Sample.State.SAMPLE_LIGHT_LIGHTS_ON_BRIGHTNESS_LEVEL_LOW;
      boolean boolean0 = sample0.isStateActive(sample_State0);
      assertEquals(15L, sample0.getTimer());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Sample sample0 = new Sample();
      Sample.State sample_State0 = Sample.State.$NULLSTATE$;
      sample0.isStateActive(sample_State0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Sample sample0 = new Sample();
      Sample.State sample_State0 = Sample.State.SAMPLE_LIGHT_LIGHTS__OFF;
      boolean boolean0 = sample0.isStateActive(sample_State0);
      assertFalse(boolean0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sample sample0 = new Sample();
      boolean boolean0 = sample0.nextEvent();
      assertFalse(boolean0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sample sample0 = new Sample();
      boolean boolean0 = sample0.isActive();
      assertFalse(boolean0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sample sample0 = new Sample();
      // Undeclared exception!
      try { 
        sample0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Sample", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sample sample0 = new Sample();
      boolean boolean0 = sample0.isFinal();
      assertFalse(boolean0);
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.getOff();
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.getTimerService();
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.raiseOn();
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.raiseOff();
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.getOn();
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Sample sample0 = new Sample();
      long long0 = sample0.getTimer();
      assertEquals(15L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Sample sample0 = new Sample();
      assertFalse(sample0.isActive());
      
      sample0.exit();
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Sample sample0 = new Sample();
      // Undeclared exception!
      try { 
        sample0.raiseToggle();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Sample", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Sample sample0 = new Sample();
      // Undeclared exception!
      try { 
        sample0.raiseToggle_brightness();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Sample", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Sample sample0 = new Sample();
      // Undeclared exception!
      try { 
        sample0.raiseTimeEvent(19);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Sample", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.getStateConfVectorPosition();
      assertEquals(15L, sample0.getTimer());
      assertFalse(sample0.isActive());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.setIsExecuting(true);
      sample0.exit();
      assertFalse(sample0.isActive());
      assertEquals(15L, sample0.getTimer());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Sample sample0 = new Sample();
      sample0.setTimerService((ITimerService) null);
      assertEquals(15L, sample0.getTimer());
      assertFalse(sample0.isActive());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Sample sample0 = new Sample();
      // Undeclared exception!
      try { 
        sample0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Sample", e);
      }
  }
}