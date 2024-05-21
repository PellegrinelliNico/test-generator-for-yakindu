/*
 * This file was automatically generated by EvoSuite
 * Tue May 21 07:50:25 GMT 2024
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
import statechart.DeviceTemp_Component;
import statechart.FireAlarm_Unit;
import statechart.Network_Component;
import statechart.Power_Component;
import statechart.Sensor_Component;
import statechart.SmartFireSystemSimplified;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartFireSystemSimplified_ESTest extends SmartFireSystemSimplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartFireSystemSimplified.CarbonSensorOutput smartFireSystemSimplified_CarbonSensorOutput0 = new SmartFireSystemSimplified.CarbonSensorOutput();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      Actuator_Component actuator_Component0 = new Actuator_Component();
      smartFireSystemSimplified0.setActuator(actuator_Component0);
      assertFalse(smartFireSystemSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartFireSystemSimplified.SmokeSensorOutput smartFireSystemSimplified_SmokeSensorOutput0 = new SmartFireSystemSimplified.SmokeSensorOutput();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      Sensor_Component sensor_Component0 = new Sensor_Component();
      smartFireSystemSimplified0.setCarbonSensor(sensor_Component0);
      assertFalse(sensor_Component0.getSignalSentToController());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartFireSystemSimplified.HeatSensorOutput smartFireSystemSimplified_HeatSensorOutput0 = new SmartFireSystemSimplified.HeatSensorOutput();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      smartFireSystemSimplified0.setFireAlarm((FireAlarm_Unit) null);
      assertFalse(smartFireSystemSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      Network_Component network_Component0 = new Network_Component();
      smartFireSystemSimplified0.setWiFi(network_Component0);
      assertFalse(smartFireSystemSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      Controller_Component controller_Component0 = new Controller_Component();
      smartFireSystemSimplified0.setController(controller_Component0);
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      smartFireSystemSimplified0.setPower((Power_Component) null);
      assertFalse(smartFireSystemSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartFireSystemSimplified.SensorOutput smartFireSystemSimplified_SensorOutput0 = new SmartFireSystemSimplified.SensorOutput();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      Sensor_Component sensor_Component0 = new Sensor_Component();
      smartFireSystemSimplified0.setHeatSensor(sensor_Component0);
      assertFalse(sensor_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      Sensor_Component sensor_Component0 = new Sensor_Component();
      smartFireSystemSimplified0.setSmokeSensor(sensor_Component0);
      assertFalse(smartFireSystemSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      DeviceTemp_Component deviceTemp_Component0 = new DeviceTemp_Component();
      smartFireSystemSimplified0.setTemp(deviceTemp_Component0);
      assertFalse(deviceTemp_Component0.getFully_rested());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State.$NULLSTATE$;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_DEVICETEMPERATURECOMPONENT__INITIALIZE_DEVICETEMP_COMPONENT_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_POWERCALCULATORCOMPONENT__INITIALIZE_POWER_COMPONENT_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_NETWORKCOMPONENT__INITIALIZE_NETWORK_COMPONENT_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_SENSORCOMPONENT__SENSOR_COMPONENT_ISON___SENSOR_MONITORING___SENSOR_COMPONENT_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_SENSORCOMPONENT__SENSOR_COMPONENT_ISON_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_CONTROLLERCOMPONENT__CONTROLLER_COMPONENT_ISON_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_DEVICETEMPERATURECOMPONENT_OFF;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_POWERCALCULATORCOMPONENT_OFF;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_POWERCALCULATORCOMPONENT__INITIALIZE_POWER_COMPONENT___RECEIVING_UPDATES_FROM_POWER_COMPONENT___POWER_CONSUMPTION_UPDATES_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_NETWORKCOMPONENT_OFF;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_NETWORKCOMPONENT__INITIALIZE_NETWORK_COMPONENT___RECEIVING_NETWORK_CONNECTION_UPDATES___NETWORK_CONNECTION_UPDATES_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_SENSORCOMPONENT_OFF;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_SENSORCOMPONENT__SENSOR_COMPONENT_ISON___SENSOR_MONITORING___SENSOR_COMPONENT___SENSOR_DETECTED_ACTIVITY___FINAL_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_SENSORCOMPONENT__SENSOR_COMPONENT_ISON___SENSOR_MONITORING___SENSOR_COMPONENT___SENSOR_DETECTED_ACTIVITY__HEATDETECTED;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_SENSORCOMPONENT__SENSOR_COMPONENT_ISON___SENSOR_MONITORING___SENSOR_COMPONENT___SENSOR_DETECTED_ACTIVITY__SMOKEDETECTED;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_SENSORCOMPONENT__SENSOR_COMPONENT_ISON___SENSOR_MONITORING___SENSOR_COMPONENT___SENSOR_DETECTED_ACTIVITY__CARBONDETECTED;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_CONTROLLERCOMPONENT_OFF;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_ACTUATORCOMPONENT__ACTUATOR_OFF_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_ACTUATORCOMPONENT__DEVICE_ACTUATED_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_ACTUATORCOMPONENT__ACTUATOR_ONSTANDBY_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.State smartFireSystemSimplified_State0 = SmartFireSystemSimplified.State._SMARTFIRESYSTEM__SMARTFIRESYSTEM_CONTROLLERCOMPONENT__CONTROLLER_COMPONENT_ISON___CONTROLLER_RECEIVING_AND_SENDING_UPDATES___CONTROLLER_COMPONENT_;
      boolean boolean0 = smartFireSystemSimplified0.isStateActive(smartFireSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      boolean boolean0 = smartFireSystemSimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      // Undeclared exception!
      try { 
        smartFireSystemSimplified0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartFireSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.HeatSensorOutput smartFireSystemSimplified_HeatSensorOutput0 = smartFireSystemSimplified0.heatSensorOutput();
      assertNotNull(smartFireSystemSimplified_HeatSensorOutput0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      // Undeclared exception!
      try { 
        smartFireSystemSimplified0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartFireSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      // Undeclared exception!
      try { 
        smartFireSystemSimplified0.raiseTimeEvent(2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartFireSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.SensorOutput smartFireSystemSimplified_SensorOutput0 = smartFireSystemSimplified0.sensorOutput();
      assertNotNull(smartFireSystemSimplified_SensorOutput0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.SmokeSensorOutput smartFireSystemSimplified_SmokeSensorOutput0 = smartFireSystemSimplified0.smokeSensorOutput();
      assertNotNull(smartFireSystemSimplified_SmokeSensorOutput0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.CarbonSensorOutput smartFireSystemSimplified_CarbonSensorOutput0 = smartFireSystemSimplified0.carbonSensorOutput();
      assertNotNull(smartFireSystemSimplified_CarbonSensorOutput0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      smartFireSystemSimplified0.setTimerService((ITimerService) null);
      assertFalse(smartFireSystemSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      boolean boolean0 = smartFireSystemSimplified0.isFinal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.SensorInput smartFireSystemSimplified_SensorInput0 = smartFireSystemSimplified0.sensorInput();
      assertNotNull(smartFireSystemSimplified_SensorInput0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      smartFireSystemSimplified0.exit();
      assertFalse(smartFireSystemSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.SensorInput smartFireSystemSimplified_SensorInput0 = new SmartFireSystemSimplified.SensorInput(smartFireSystemSimplified0);
      // Undeclared exception!
      try { 
        smartFireSystemSimplified_SensorInput0.raiseReset();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartFireSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.System smartFireSystemSimplified_System0 = smartFireSystemSimplified0.system();
      // Undeclared exception!
      try { 
        smartFireSystemSimplified_System0.raiseConnect_network();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartFireSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.System smartFireSystemSimplified_System0 = new SmartFireSystemSimplified.System(smartFireSystemSimplified0);
      // Undeclared exception!
      try { 
        smartFireSystemSimplified_System0.raiseDisconnect_network();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartFireSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.System smartFireSystemSimplified_System0 = new SmartFireSystemSimplified.System(smartFireSystemSimplified0);
      // Undeclared exception!
      try { 
        smartFireSystemSimplified_System0.raiseOff();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartFireSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SmartFireSystemSimplified smartFireSystemSimplified0 = new SmartFireSystemSimplified();
      SmartFireSystemSimplified.System smartFireSystemSimplified_System0 = smartFireSystemSimplified0.system();
      // Undeclared exception!
      try { 
        smartFireSystemSimplified_System0.raiseOn();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartFireSystemSimplified", e);
      }
  }
}
