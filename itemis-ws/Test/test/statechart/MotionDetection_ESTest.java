/*
 * This file was automatically generated by EvoSuite
 * Tue May 14 19:53:36 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.yakindu.core.ITimerService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.MotionDetection;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MotionDetection_ESTest extends MotionDetection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.raiseTimeEvent(0);
      assertFalse(motionDetection0.isActive());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.user = null;
      MotionDetection.User motionDetection_User0 = motionDetection0.user();
      assertNull(motionDetection_User0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.sensor = null;
      MotionDetection.Sensor motionDetection_Sensor0 = motionDetection0.sensor();
      assertNull(motionDetection_Sensor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.lum_sensor = null;
      MotionDetection.Lum_sensor motionDetection_Lum_sensor0 = motionDetection0.lum_sensor();
      assertNull(motionDetection_Lum_sensor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.setIsExecuting(true);
      boolean boolean0 = motionDetection0.getIsExecuting();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      boolean boolean0 = motionDetection0.getIsExecuting();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.setBrightness(1843L);
      long long0 = motionDetection0.getBrightness();
      assertEquals(1843L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.setBrightness((-2566L));
      long long0 = motionDetection0.getBrightness();
      assertEquals((-2566L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      // Undeclared exception!
      try { 
        motionDetection0.isStateActive((MotionDetection.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.MotionDetection", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MotionDetection.Sensor motionDetection_Sensor0 = new MotionDetection.Sensor();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MotionDetection.User motionDetection_User0 = new MotionDetection.User();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.State motionDetection_State0 = MotionDetection.State.MAIN_REGION_AUTOMATICMODE_R1_MOTIONDETECTIONMODE;
      boolean boolean0 = motionDetection0.isStateActive(motionDetection_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.State motionDetection_State0 = MotionDetection.State.MAIN_REGION_AUTOMATICMODE_R1_TWILIGHTDETECTIONMODE;
      boolean boolean0 = motionDetection0.isStateActive(motionDetection_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.State motionDetection_State0 = MotionDetection.State.MAIN_REGION_AUTOMATICMODE;
      boolean boolean0 = motionDetection0.isStateActive(motionDetection_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.State motionDetection_State0 = MotionDetection.State.MAIN_REGION_AUTOMATICMODE_R1_MOTIONDETECTIONMODE_R1_MOTIONDETECTED;
      boolean boolean0 = motionDetection0.isStateActive(motionDetection_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.State motionDetection_State0 = MotionDetection.State.MAIN_REGION_AUTOMATICMODE_R1_MOTIONDETECTIONMODE_R1_IDLE;
      boolean boolean0 = motionDetection0.isStateActive(motionDetection_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.State motionDetection_State0 = MotionDetection.State.MAIN_REGION_AUTOMATICMODE_R1_TWILIGHTDETECTIONMODE_R1_TWILIGHTDETECTED;
      boolean boolean0 = motionDetection0.isStateActive(motionDetection_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.State motionDetection_State0 = MotionDetection.State.MAIN_REGION_AUTOMATICMODE_R1_TWILIGHTDETECTIONMODE_R1_IDLE;
      boolean boolean0 = motionDetection0.isStateActive(motionDetection_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.State motionDetection_State0 = MotionDetection.State.$NULLSTATE$;
      boolean boolean0 = motionDetection0.isStateActive(motionDetection_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.State motionDetection_State0 = MotionDetection.State.MAIN_REGION_MANUALMODE;
      boolean boolean0 = motionDetection0.isStateActive(motionDetection_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      boolean boolean0 = motionDetection0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.setIsExecuting(true);
      motionDetection0.exit();
      assertFalse(motionDetection0.isActive());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      // Undeclared exception!
      try { 
        motionDetection0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.MotionDetection", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      // Undeclared exception!
      try { 
        motionDetection0.runCycle();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.MotionDetection", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MotionDetection.Lum_sensor motionDetection_Lum_sensor0 = new MotionDetection.Lum_sensor();
      motionDetection_Lum_sensor0.raiseDark();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.Sensor motionDetection_Sensor0 = motionDetection0.sensor();
      assertNotNull(motionDetection_Sensor0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.Lum_sensor motionDetection_Lum_sensor0 = motionDetection0.lum_sensor();
      motionDetection_Lum_sensor0.raiseBright();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.setTimerService((ITimerService) null);
      assertFalse(motionDetection0.isFinal());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      long long0 = motionDetection0.getBrightness();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      ITimerService iTimerService0 = motionDetection0.getTimerService();
      assertNull(iTimerService0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.exit();
      assertFalse(motionDetection0.isFinal());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      boolean boolean0 = motionDetection0.isFinal();
      assertFalse(motionDetection0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.user();
      assertFalse(motionDetection0.isActive());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      // Undeclared exception!
      try { 
        motionDetection0.raiseTimeEvent((-699));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -699
         //
         verifyException("statechart.MotionDetection", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.User motionDetection_User0 = motionDetection0.user;
      motionDetection_User0.raiseOff_button();
      assertFalse(motionDetection0.isActive());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.User motionDetection_User0 = motionDetection0.user;
      motionDetection_User0.raiseMode_button();
      assertFalse(motionDetection0.isActive());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      motionDetection0.user.raiseOn_button();
      assertFalse(motionDetection0.isActive());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MotionDetection motionDetection0 = new MotionDetection();
      MotionDetection.Sensor motionDetection_Sensor0 = motionDetection0.sensor;
      motionDetection_Sensor0.raiseMotion();
      assertFalse(motionDetection0.isActive());
  }
}
