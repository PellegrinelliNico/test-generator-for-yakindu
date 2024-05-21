/*
 * This file was automatically generated by EvoSuite
 * Tue May 21 07:39:12 GMT 2024
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
import statechart.Network_Component;
import statechart.Power_Component;
import statechart.Sensor_Component;
import statechart.SmartTemplate;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartTemplate_ESTest extends SmartTemplate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.System smartTemplate_System0 = new SmartTemplate.System(smartTemplate0);
      smartTemplate0.system = smartTemplate_System0;
      smartTemplate_System0.setIsOn(true);
      assertTrue(smartTemplate_System0.getIsOn());
      
      smartTemplate0.system();
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.setTemp_value((-596L));
      long long0 = smartTemplate0.getTemp_value();
      assertEquals((-596L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.setStateConfVectorPosition(169L);
      long long0 = smartTemplate0.getStateConfVectorPosition();
      assertEquals(169L, long0);
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.setMessage("2nE)F-AcQ3Oo8yE");
      smartTemplate0.getMessage();
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.setIsExecuting(true);
      boolean boolean0 = smartTemplate0.getIsExecuting();
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertTrue(boolean0);
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.getIsExecuting();
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      // Undeclared exception!
      try { 
        smartTemplate0.isStateActive((SmartTemplate.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.SmartTemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      Network_Component network_Component0 = new Network_Component();
      smartTemplate0.setWiFi(network_Component0);
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.SensorInput smartTemplate_SensorInput0 = smartTemplate0.sensorInput();
      smartTemplate_SensorInput0.setDetection_time(1916L);
      assertEquals(1916L, smartTemplate_SensorInput0.getDetection_time());
      
      smartTemplate0.sensorInput();
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      Sensor_Component sensor_Component0 = new Sensor_Component();
      smartTemplate0.setSensor(sensor_Component0);
      smartTemplate0.getSensor();
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.setTemp((DeviceTemp_Component) null);
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      assertFalse(smartTemplate0.getWiFi_connection());
      
      smartTemplate0.setWiFi_connection(true);
      boolean boolean0 = smartTemplate0.getWiFi_connection();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.setPower_total((-3364L));
      assertEquals((-3364L), smartTemplate0.getPower_total());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.setPower((Power_Component) null);
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.setPower_input(22);
      assertEquals(22L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartTemplate.SensorInput smartTemplate_SensorInput0 = new SmartTemplate.SensorInput();
      assertEquals(0L, smartTemplate_SensorInput0.getTimeout_time());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.SensorOutput smartTemplate_SensorOutput0 = smartTemplate0.sensorOutput;
      smartTemplate_SensorOutput0.setCounter((-903L));
      assertEquals((-903L), smartTemplate_SensorOutput0.getCounter());
      
      smartTemplate0.sensorOutput();
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.setPower_required((-3299L));
      assertEquals((-3299L), smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      Controller_Component controller_Component0 = new Controller_Component();
      smartTemplate0.setController(controller_Component0);
      smartTemplate0.getController();
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.SensorOutput smartTemplate_SensorOutput0 = smartTemplate0.sensorOutput;
      smartTemplate_SensorOutput0.setActivity(true);
      assertTrue(smartTemplate_SensorOutput0.getActivity());
      
      smartTemplate0.sensorOutput();
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SmartTemplate.SensorOutput smartTemplate_SensorOutput0 = new SmartTemplate.SensorOutput();
      assertEquals(0L, smartTemplate_SensorOutput0.getCounter());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      Actuator_Component actuator_Component0 = new Actuator_Component();
      smartTemplate0.setActuator(actuator_Component0);
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State.$NULLSTATE$;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_TRACKINGDEVICETEMPERATURE__INITIALIZE_DEVICETEMP_COMPONENT_;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_POWERCALCULATORCOMPONENT__INITIALIZE_POWER_COMPONENT_;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_NETWORKCOMPONENT__INITIALIZE_NETWORK_COMPONENT_;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_SENSORCOMPONENT__SENSOR_COMPONENT_ISON_;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      assertFalse(smartTemplate0.isActive());
      
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_CONTROLLERCOMPONENT__CONTROLLER_COMPONENT_ISON_;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_TRACKINGDEVICETEMPERATURE_OFF;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.isActive());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_TRACKINGDEVICETEMPERATURE__INITIALIZE_DEVICETEMP_COMPONENT___RECEIVING_UPDATES_FROM_DEVICETEMP_COMPONENT___TEMPERATURE_UPDATES_;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(50L, smartTemplate0.getTemp_value());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_POWERCALCULATORCOMPONENT__INITIALIZE_POWER_COMPONENT___RECEIVING_UPDATES_FROM_POWER_COMPONENT___POWER_CONSUMPTION_UPDATES_;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.isActive());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_NETWORKCOMPONENT_OFF;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.isActive());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_NETWORKCOMPONENT__INITIALIZE_NETWORK_COMPONENT___RECEIVING_NETWORK_CONNECTION_UPDATES___NETWORK_COMPONENT_;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_SENSORCOMPONENT_OFF;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.isActive());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_SENSORCOMPONENT__SENSOR_COMPONENT_ISON___SENSOR_MONITORING___SENSOR_COMPONENT_;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.isActive());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_CONTROLLERCOMPONENT__CONTROLLER_COMPONENT_ISON___CONTROLLER_RECEIVING_AND_SENDING_UPDATES___CONTROLLER_COMPONENT_;
      smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(50L, smartTemplate0.getTemp_value());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_ACTUATORCOMPONENT_OFF;
      boolean boolean0 = smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
      assertFalse(boolean0);
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_ACTUATORCOMPONENT__DEVICE_ACTUATED_;
      boolean boolean0 = smartTemplate0.isStateActive(smartTemplate_State0);
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(boolean0);
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.isActive());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_DEVICESWITCHSTATUS_ON;
      boolean boolean0 = smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertFalse(boolean0);
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_ACTUATORCOMPONENT__ACTUATOR_ONSTANDBY_;
      boolean boolean0 = smartTemplate0.isStateActive(smartTemplate_State0);
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.State smartTemplate_State0 = SmartTemplate.State._IOT_TEMPLATE__IOT_TEMPLATE_DEVICESWITCHSTATUS_OFF;
      boolean boolean0 = smartTemplate0.isStateActive(smartTemplate_State0);
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(boolean0);
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      boolean boolean0 = smartTemplate0.nextEvent();
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(boolean0);
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      boolean boolean0 = smartTemplate0.isActive();
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      // Undeclared exception!
      try { 
        smartTemplate0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartTemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.SensorInput smartTemplate_SensorInput0 = smartTemplate0.sensorInput;
      smartTemplate_SensorInput0.getDetection_time();
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.SensorInput smartTemplate_SensorInput0 = smartTemplate0.sensorInput;
      smartTemplate_SensorInput0.getTimeout_time();
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.System smartTemplate_System0 = new SmartTemplate.System(smartTemplate0);
      smartTemplate_System0.getIsOn();
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.System smartTemplate_System0 = smartTemplate0.system;
      // Undeclared exception!
      try { 
        smartTemplate_System0.raiseOff();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartTemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.System smartTemplate_System0 = new SmartTemplate.System(smartTemplate0);
      // Undeclared exception!
      try { 
        smartTemplate_System0.raiseOn();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartTemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.SensorOutput smartTemplate_SensorOutput0 = smartTemplate0.sensorOutput;
      boolean boolean0 = smartTemplate_SensorOutput0.getActivity();
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.getPower_total();
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.getActuator();
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.getController();
      assertFalse(smartTemplate0.isActive());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.setIsExecuting(true);
      smartTemplate0.exit();
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.getMessage();
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.getPower();
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.isActive());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_input());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.SensorInput smartTemplate_SensorInput0 = smartTemplate0.sensorInput();
      smartTemplate_SensorInput0.setTimeout_time((-3299L));
      assertEquals((-3299L), smartTemplate_SensorInput0.getTimeout_time());
      
      smartTemplate0.sensorInput();
      assertEquals(50L, smartTemplate0.getTemp_value());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.getTemp();
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.isActive());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.getStateConfVectorPosition();
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertFalse(smartTemplate0.isActive());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      assertFalse(smartTemplate0.isActive());
      
      smartTemplate0.exit();
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      // Undeclared exception!
      try { 
        smartTemplate0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartTemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      long long0 = smartTemplate0.getPower_required();
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, long0);
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.getWiFi_connection());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      // Undeclared exception!
      try { 
        smartTemplate0.raiseTimeEvent(2056);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartTemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      long long0 = smartTemplate0.getTemp_value();
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
      assertEquals(50L, long0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.System smartTemplate_System0 = smartTemplate0.system();
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertFalse(smartTemplate_System0.getIsOn());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.getWiFi();
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertFalse(smartTemplate0.isActive());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      SmartTemplate.SensorOutput smartTemplate_SensorOutput0 = smartTemplate0.sensorOutput();
      smartTemplate_SensorOutput0.getCounter();
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertFalse(smartTemplate0.isActive());
      assertFalse(smartTemplate_SensorOutput0.getActivity());
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      boolean boolean0 = smartTemplate0.isFinal();
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(boolean0);
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      long long0 = smartTemplate0.getPower_input();
      assertEquals(10L, long0);
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertFalse(smartTemplate0.isActive());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      boolean boolean0 = smartTemplate0.getWiFi_connection();
      assertFalse(boolean0);
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(50L, smartTemplate0.getTemp_value());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.getSensor();
      assertEquals(10L, smartTemplate0.getPower_required());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertFalse(smartTemplate0.isActive());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.setTimerService((ITimerService) null);
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertFalse(smartTemplate0.isActive());
      assertEquals(10L, smartTemplate0.getPower_input());
      assertEquals(10L, smartTemplate0.getPower_required());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      SmartTemplate smartTemplate0 = new SmartTemplate();
      smartTemplate0.getTimerService();
      assertEquals(10L, smartTemplate0.getPower_input());
      assertFalse(smartTemplate0.isActive());
      assertEquals(50L, smartTemplate0.getTemp_value());
      assertFalse(smartTemplate0.getWiFi_connection());
      assertEquals(10L, smartTemplate0.getPower_required());
  }
}