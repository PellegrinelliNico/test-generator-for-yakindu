/*
 * This file was automatically generated by EvoSuite
 * Tue May 14 20:05:01 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.yakindu.core.ITimerService;
import com.yakindu.core.rx.Observable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.Onoff;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Onoff_ESTest extends Onoff_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setTemperaturePenalty(679L);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setMaxEnergy(28L);
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setLowEnergy(3937L);
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setHotTempThreshold(1L);
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setHealthPoints(100L);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setEnergyReq(0L);
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.getIsExecuting();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setEnergyReqBaseline(0L);
      onoff0.getEnergyReqBaseline();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setCurrentEnergy((-3758L));
      long long0 = onoff0.getCurrentEnergy();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
      assertEquals((-3758L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setColdTempThreshold(0L);
      onoff0.getColdTempThreshold();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setColdTempThreshold((-1L));
      long long0 = onoff0.getColdTempThreshold();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertEquals((-1L), long0);
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setBatteryPenalty(679L);
      long long0 = onoff0.getBatteryPenalty();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
      assertEquals(679L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.battery = null;
      onoff0.battery();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setCurrentTemp(0L);
      assertFalse(onoff0.isFinal());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Onoff.Legs onoff_Legs0 = new Onoff.Legs();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.$NULLSTATE$;
      onoff0.isStateActive(onoff_State0);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_BATTERY_DEFAULT;
      onoff0.isStateActive(onoff_State0);
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      assertFalse(onoff0.isActive());
      
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON;
      boolean boolean0 = onoff0.isStateActive(onoff_State0);
      assertFalse(boolean0);
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_HEALTH_BAD;
      onoff0.isStateActive(onoff_State0);
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_BATTERY_DEFAULT_ENERGY_CHARGE;
      onoff0.isStateActive(onoff_State0);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_BATTERY_DEFAULT_STATUS_DRAINED;
      onoff0.isStateActive(onoff_State0);
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_TEMPERATURE_SENSOR_OPTIMAL;
      onoff0.isStateActive(onoff_State0);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_EMOTION_NORMAL;
      onoff0.isStateActive(onoff_State0);
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_TAIL_WAGGING;
      onoff0.isStateActive(onoff_State0);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_TAIL_IDLE;
      onoff0.isStateActive(onoff_State0);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_VOICE_BARK;
      boolean boolean0 = onoff0.isStateActive(onoff_State0);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_VOICE_SILENT;
      boolean boolean0 = onoff0.isStateActive(onoff_State0);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_LEGS_RUN;
      boolean boolean0 = onoff0.isStateActive(onoff_State0);
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(boolean0);
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_ON_HEALTH_DEGRADED;
      onoff0.isStateActive(onoff_State0);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.State onoff_State0 = Onoff.State.MAIN_REGION_OFF;
      boolean boolean0 = onoff0.isStateActive(onoff_State0);
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(boolean0);
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      boolean boolean0 = onoff0.nextEvent();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      boolean boolean0 = onoff0.isActive();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setIsExecuting(true);
      onoff0.exit();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      // Undeclared exception!
      try { 
        onoff0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Onoff", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Onoff.Tail onoff_Tail0 = new Onoff.Tail();
      Observable<Void> observable0 = onoff_Tail0.getIdle();
      assertNotNull(observable0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Onoff.Tail onoff_Tail0 = new Onoff.Tail();
      onoff_Tail0.raiseWagging();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Onoff.Tail onoff_Tail0 = new Onoff.Tail();
      onoff_Tail0.raiseIdle();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Onoff.Tail onoff_Tail0 = new Onoff.Tail();
      Observable<Void> observable0 = onoff_Tail0.getWagging();
      assertNotNull(observable0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Onoff.Emotion onoff_Emotion0 = new Onoff.Emotion();
      onoff_Emotion0.raiseLove();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Emotion onoff_Emotion0 = onoff0.emotion;
      onoff_Emotion0.raiseNormal();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Onoff.Emotion onoff_Emotion0 = new Onoff.Emotion();
      Observable<Void> observable0 = onoff_Emotion0.getLove();
      assertNotNull(observable0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Voice onoff_Voice0 = onoff0.voice;
      onoff_Voice0.getHowl();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.voice.raiseHowl();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Onoff.Voice onoff_Voice0 = new Onoff.Voice();
      Observable<Void> observable0 = onoff_Voice0.getSilent();
      assertNotNull(observable0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.voice.getBark();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Onoff.Voice onoff_Voice0 = new Onoff.Voice();
      onoff_Voice0.raiseBark();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Legs onoff_Legs0 = onoff0.legs();
      onoff_Legs0.getRun();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Legs onoff_Legs0 = onoff0.legs;
      onoff_Legs0.raiseStand();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Legs onoff_Legs0 = onoff0.legs;
      onoff_Legs0.getWalk();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Legs onoff_Legs0 = onoff0.legs();
      onoff_Legs0.raiseWalk();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Legs onoff_Legs0 = onoff0.legs;
      onoff_Legs0.raiseRun();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      long long0 = onoff0.getLowEnergy();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
      assertEquals(375L, long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      long long0 = onoff0.getEnergyReq();
      assertEquals(10L, long0);
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      long long0 = onoff0.getCurrentEnergy();
      assertEquals(1500L, long0);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.getTemperaturePenalty();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      // Undeclared exception!
      try { 
        onoff0.raiseChargerConnected();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Onoff", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      // Undeclared exception!
      try { 
        onoff0.raiseTurnOn();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Onoff", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      // Undeclared exception!
      try { 
        onoff0.raiseTurnOff();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Onoff", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      boolean boolean0 = onoff0.isFinal();
      assertFalse(onoff0.isActive());
      assertFalse(boolean0);
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setTimerService((ITimerService) null);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      long long0 = onoff0.getColdTempThreshold();
      assertEquals(10L, long0);
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      // Undeclared exception!
      try { 
        onoff0.raiseBarkCommand();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Onoff", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Emotion onoff_Emotion0 = onoff0.emotion();
      onoff_Emotion0.getNormal();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.raiseAttentionNeeded();
      boolean boolean0 = onoff0.nextEvent();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      // Undeclared exception!
      try { 
        onoff0.raiseComeCommand();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Onoff", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      assertFalse(onoff0.isActive());
      
      onoff0.exit();
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      long long0 = onoff0.getHealthPoints();
      assertEquals(3L, long0);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Voice onoff_Voice0 = onoff0.voice();
      onoff_Voice0.raiseSilent();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.getBatteryPenalty();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      long long0 = onoff0.getEnergyReqBaseline();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertEquals(10L, long0);
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      // Undeclared exception!
      try { 
        onoff0.raiseFetchCommand();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Onoff", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      // Undeclared exception!
      try { 
        onoff0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Onoff", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      // Undeclared exception!
      try { 
        onoff0.raisePet();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Onoff", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.getTimerService();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      long long0 = onoff0.getCurrentTemp();
      assertEquals(28L, long0);
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Legs onoff_Legs0 = onoff0.legs();
      onoff_Legs0.getStand();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      long long0 = onoff0.getHotTempThreshold();
      assertEquals(38L, long0);
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      long long0 = onoff0.getMaxEnergy();
      assertEquals(1500L, long0);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      // Undeclared exception!
      try { 
        onoff0.raiseTimeEvent(2085);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Onoff", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      // Undeclared exception!
      try { 
        onoff0.raiseChargerDisconnected();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Onoff", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.tail();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.setStateConfVectorPosition(0L);
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      onoff0.getStateConfVectorPosition();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Battery onoff_Battery0 = onoff0.battery();
      onoff_Battery0.raiseDrained();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Battery onoff_Battery0 = onoff0.battery;
      onoff_Battery0.getLow();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Battery onoff_Battery0 = onoff0.battery();
      onoff_Battery0.raiseNormal();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Battery onoff_Battery0 = onoff0.battery();
      onoff_Battery0.raiseLow();
      assertEquals(28L, onoff0.getCurrentTemp());
      assertFalse(onoff0.isActive());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Onoff onoff0 = new Onoff();
      Onoff.Battery onoff_Battery0 = onoff0.battery();
      onoff_Battery0.getDrained();
      assertFalse(onoff0.isActive());
      assertEquals(28L, onoff0.getCurrentTemp());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Onoff.Battery onoff_Battery0 = new Onoff.Battery();
      Observable<Void> observable0 = onoff_Battery0.getNormal();
      assertNotNull(observable0);
  }
}
