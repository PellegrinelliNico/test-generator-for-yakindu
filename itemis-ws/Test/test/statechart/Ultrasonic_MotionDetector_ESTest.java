/*
 * This file was automatically generated by EvoSuite
 * Tue May 21 07:27:21 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.yakindu.core.ITimerService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.Actuator_Component;
import statechart.Controller_Component;
import statechart.Power_Component;
import statechart.Ultrasonic_MotionDetector;
import statechart.Ultrasonic_Sensor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Ultrasonic_MotionDetector_ESTest extends Ultrasonic_MotionDetector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Status ultrasonic_MotionDetector_Status0 = ultrasonic_MotionDetector0.status();
      ultrasonic_MotionDetector_Status0.setActivity(true);
      assertTrue(ultrasonic_MotionDetector_Status0.getActivity());
      
      Ultrasonic_MotionDetector.Status ultrasonic_MotionDetector_Status1 = ultrasonic_MotionDetector0.status();
      assertTrue(ultrasonic_MotionDetector_Status1.getActivity());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.setStateConfVectorPosition(691L);
      long long0 = ultrasonic_MotionDetector0.getStateConfVectorPosition();
      assertEquals(691L, long0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.setReading(true);
      boolean boolean0 = ultrasonic_MotionDetector0.getReading();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Frequency ultrasonic_MotionDetector_Frequency0 = ultrasonic_MotionDetector0.frequency();
      ultrasonic_MotionDetector_Frequency0.setDoppler((-3929L));
      assertEquals((-3929L), ultrasonic_MotionDetector_Frequency0.getDoppler());
      
      ultrasonic_MotionDetector0.frequency();
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      // Undeclared exception!
      try { 
        ultrasonic_MotionDetector0.isStateActive((Ultrasonic_MotionDetector.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.Ultrasonic_MotionDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Power ultrasonic_MotionDetector_Power0 = ultrasonic_MotionDetector0.power;
      ultrasonic_MotionDetector_Power0.setKWh((-2570L));
      assertEquals((-2570L), ultrasonic_MotionDetector_Power0.getKWh());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ultrasonic_MotionDetector.Frequency ultrasonic_MotionDetector_Frequency0 = new Ultrasonic_MotionDetector.Frequency();
      assertEquals(0L, ultrasonic_MotionDetector_Frequency0.getDoppler());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.setSensorData((-180L));
      assertEquals((-180L), ultrasonic_MotionDetector0.getSensorData());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_Sensor ultrasonic_Sensor0 = new Ultrasonic_Sensor();
      ultrasonic_MotionDetector0.setSensor(ultrasonic_Sensor0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ultrasonic_MotionDetector.Oscillator ultrasonic_MotionDetector_Oscillator0 = new Ultrasonic_MotionDetector.Oscillator();
      ultrasonic_MotionDetector_Oscillator0.setReceiving(false);
      assertFalse(ultrasonic_MotionDetector_Oscillator0.getReceiving());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Oscillator ultrasonic_MotionDetector_Oscillator0 = ultrasonic_MotionDetector0.oscillator;
      ultrasonic_MotionDetector_Oscillator0.setEcho_value(0L);
      assertFalse(ultrasonic_MotionDetector_Oscillator0.getReceiving());
      assertFalse(ultrasonic_MotionDetector_Oscillator0.getTransducing());
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ultrasonic_MotionDetector.Comparator ultrasonic_MotionDetector_Comparator0 = new Ultrasonic_MotionDetector.Comparator();
      assertFalse(ultrasonic_MotionDetector_Comparator0.getWorking());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Actuator_Component actuator_Component0 = new Actuator_Component();
      ultrasonic_MotionDetector0.setActuator(actuator_Component0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.setPowerSupply((Power_Component) null);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Controller_Component controller_Component0 = new Controller_Component();
      ultrasonic_MotionDetector0.setController(controller_Component0);
      ultrasonic_MotionDetector0.getController();
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ultrasonic_MotionDetector.Power ultrasonic_MotionDetector_Power0 = new Ultrasonic_MotionDetector.Power();
      assertEquals(0L, ultrasonic_MotionDetector_Power0.getKWh());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.setEnvironmentData((-3929L));
      assertEquals((-3929L), ultrasonic_MotionDetector0.getEnvironmentData());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Oscillator ultrasonic_MotionDetector_Oscillator0 = ultrasonic_MotionDetector0.oscillator;
      ultrasonic_MotionDetector_Oscillator0.setTransmit_value(1094L);
      assertEquals(1094L, ultrasonic_MotionDetector_Oscillator0.getTransmit_value());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.$NULLSTATE$;
      ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__DETECTING__POWER_POWERSUPPLYSTATUS;
      ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__DETECTING_;
      boolean boolean0 = ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(boolean0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__DETECTING__POWER_POWERSUPPLYSTATUS_STATUS_CIRCUITTRIGGER;
      ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__DETECTING__POWER_POWERSUPPLYSTATUS_STATUS_CONSUMINGMINIMUM;
      ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__DETECTING__ACTUATOR_ACTUATE_TRIGGER;
      ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__DETECTING__ACTUATOR_ONSTANDBY;
      ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__DETECTING__COMPARATOR_READING_SENSOR_DATA_PROCESSING_COMPARING;
      boolean boolean0 = ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(boolean0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__DETECTING__COMPARATOR_READING_SENSOR_DATA_PROCESSING_CIRCUIT_CHANGED;
      boolean boolean0 = ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(boolean0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__OFF_;
      ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__DETECTING__SENSOR_RECEIVING;
      boolean boolean0 = ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(boolean0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__DETECTING__COMPARATOR_READING_SENSOR_DATA;
      boolean boolean0 = ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(boolean0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.State ultrasonic_MotionDetector_State0 = Ultrasonic_MotionDetector.State.ULTRASONIC_MOTIONDETECTOR__DETECTING__SENSOR_TRANSMITTING;
      boolean boolean0 = ultrasonic_MotionDetector0.isStateActive(ultrasonic_MotionDetector_State0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      boolean boolean0 = ultrasonic_MotionDetector0.nextEvent();
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      boolean boolean0 = ultrasonic_MotionDetector0.isActive();
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.setIsExecuting(true);
      ultrasonic_MotionDetector0.exit();
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      assertFalse(ultrasonic_MotionDetector0.isActive());
      
      ultrasonic_MotionDetector0.exit();
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      // Undeclared exception!
      try { 
        ultrasonic_MotionDetector0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Ultrasonic_MotionDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.getController();
      assertFalse(ultrasonic_MotionDetector0.isActive());
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.getActuator();
      assertFalse(ultrasonic_MotionDetector0.isActive());
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.setTimerService((ITimerService) null);
      assertFalse(ultrasonic_MotionDetector0.isActive());
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.trigger();
      assertFalse(ultrasonic_MotionDetector0.isActive());
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      boolean boolean0 = ultrasonic_MotionDetector0.isFinal();
      assertFalse(ultrasonic_MotionDetector0.isActive());
      assertFalse(boolean0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      // Undeclared exception!
      try { 
        ultrasonic_MotionDetector0.raiseTimeEvent(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Ultrasonic_MotionDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Comparator ultrasonic_MotionDetector_Comparator0 = ultrasonic_MotionDetector0.comparator();
      ultrasonic_MotionDetector_Comparator0.setWorking(true);
      assertTrue(ultrasonic_MotionDetector_Comparator0.getWorking());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.getPowerSupply();
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(ultrasonic_MotionDetector0.isActive());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      // Undeclared exception!
      try { 
        ultrasonic_MotionDetector0.raiseOff();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Ultrasonic_MotionDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.getStateConfVectorPosition();
      assertFalse(ultrasonic_MotionDetector0.isActive());
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      boolean boolean0 = ultrasonic_MotionDetector0.getReading();
      assertFalse(boolean0);
      assertFalse(ultrasonic_MotionDetector0.isActive());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.getSensor();
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(ultrasonic_MotionDetector0.isActive());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      // Undeclared exception!
      try { 
        ultrasonic_MotionDetector0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Ultrasonic_MotionDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.getSensorData();
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(ultrasonic_MotionDetector0.isActive());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Oscillator ultrasonic_MotionDetector_Oscillator0 = ultrasonic_MotionDetector0.oscillator();
      ultrasonic_MotionDetector_Oscillator0.setTransducing(false);
      assertFalse(ultrasonic_MotionDetector_Oscillator0.getTransducing());
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(ultrasonic_MotionDetector_Oscillator0.getReceiving());
      assertFalse(ultrasonic_MotionDetector0.isActive());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.getIsExecuting();
      assertFalse(ultrasonic_MotionDetector0.isActive());
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.getEnvironmentData();
      assertFalse(ultrasonic_MotionDetector0.isActive());
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      // Undeclared exception!
      try { 
        ultrasonic_MotionDetector0.raiseOn();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Ultrasonic_MotionDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      ultrasonic_MotionDetector0.getTimerService();
      assertFalse(ultrasonic_MotionDetector0.isActive());
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Power ultrasonic_MotionDetector_Power0 = ultrasonic_MotionDetector0.power();
      ultrasonic_MotionDetector_Power0.getKWh();
      assertFalse(ultrasonic_MotionDetector0.isActive());
      assertFalse(ultrasonic_MotionDetector0.getReading());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Ultrasonic_MotionDetector.Oscillator ultrasonic_MotionDetector_Oscillator0 = new Ultrasonic_MotionDetector.Oscillator();
      boolean boolean0 = ultrasonic_MotionDetector_Oscillator0.getReceiving();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Oscillator ultrasonic_MotionDetector_Oscillator0 = ultrasonic_MotionDetector0.oscillator;
      ultrasonic_MotionDetector_Oscillator0.getEcho_value();
      assertFalse(ultrasonic_MotionDetector_Oscillator0.getReceiving());
      assertFalse(ultrasonic_MotionDetector_Oscillator0.getTransducing());
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(ultrasonic_MotionDetector0.isActive());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Ultrasonic_MotionDetector.Oscillator ultrasonic_MotionDetector_Oscillator0 = new Ultrasonic_MotionDetector.Oscillator();
      boolean boolean0 = ultrasonic_MotionDetector_Oscillator0.getTransducing();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Oscillator ultrasonic_MotionDetector_Oscillator0 = ultrasonic_MotionDetector0.oscillator;
      ultrasonic_MotionDetector_Oscillator0.getTransmit_value();
      assertFalse(ultrasonic_MotionDetector_Oscillator0.getTransducing());
      assertFalse(ultrasonic_MotionDetector0.isActive());
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(ultrasonic_MotionDetector_Oscillator0.getReceiving());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Status ultrasonic_MotionDetector_Status0 = ultrasonic_MotionDetector0.status();
      boolean boolean0 = ultrasonic_MotionDetector_Status0.getActivity();
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(boolean0);
      assertFalse(ultrasonic_MotionDetector0.isActive());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Status ultrasonic_MotionDetector_Status0 = ultrasonic_MotionDetector0.status;
      // Undeclared exception!
      try { 
        ultrasonic_MotionDetector_Status0.raiseActivitySensed();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Ultrasonic_MotionDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Status ultrasonic_MotionDetector_Status0 = new Ultrasonic_MotionDetector.Status(ultrasonic_MotionDetector0);
      // Undeclared exception!
      try { 
        ultrasonic_MotionDetector_Status0.raiseNoActivitySensed();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Ultrasonic_MotionDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Comparator ultrasonic_MotionDetector_Comparator0 = ultrasonic_MotionDetector0.comparator;
      boolean boolean0 = ultrasonic_MotionDetector_Comparator0.getWorking();
      assertFalse(boolean0);
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(ultrasonic_MotionDetector0.isActive());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Frequency ultrasonic_MotionDetector_Frequency0 = ultrasonic_MotionDetector0.frequency;
      ultrasonic_MotionDetector_Frequency0.getDoppler();
      assertFalse(ultrasonic_MotionDetector0.getReading());
      assertFalse(ultrasonic_MotionDetector0.isActive());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Trigger ultrasonic_MotionDetector_Trigger0 = new Ultrasonic_MotionDetector.Trigger(ultrasonic_MotionDetector0);
      // Undeclared exception!
      try { 
        ultrasonic_MotionDetector_Trigger0.raiseOff();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Ultrasonic_MotionDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Ultrasonic_MotionDetector ultrasonic_MotionDetector0 = new Ultrasonic_MotionDetector();
      Ultrasonic_MotionDetector.Trigger ultrasonic_MotionDetector_Trigger0 = new Ultrasonic_MotionDetector.Trigger(ultrasonic_MotionDetector0);
      // Undeclared exception!
      try { 
        ultrasonic_MotionDetector_Trigger0.raiseOn();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Ultrasonic_MotionDetector", e);
      }
  }
}
