/*
 * This file was automatically generated by EvoSuite
 * Tue May 21 08:01:31 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.yakindu.core.ITimerService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import statechart.SmartTrafficLightSystemSimplified;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartTrafficLightSystemSimplified_ESTest extends SmartTrafficLightSystemSimplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      smartTrafficLightSystemSimplified0.setTimerService(iTimerService0);
      SmartTrafficLightSystemSimplified.System smartTrafficLightSystemSimplified_System0 = new SmartTrafficLightSystemSimplified.System(smartTrafficLightSystemSimplified0);
      smartTrafficLightSystemSimplified_System0.raiseOn();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      smartTrafficLightSystemSimplified0.setTimerService(iTimerService0);
      smartTrafficLightSystemSimplified0.triggerWithoutEvent();
      assertFalse(smartTrafficLightSystemSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      smartTrafficLightSystemSimplified0.setTimerService(iTimerService0);
      smartTrafficLightSystemSimplified0.raiseTimeEvent(0);
      assertFalse(smartTrafficLightSystemSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      smartTrafficLightSystemSimplified0.setTimerService(iTimerService0);
      // Undeclared exception!
      try { 
        smartTrafficLightSystemSimplified0.raiseTimeEvent((-1775));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1775
         //
         verifyException("statechart.SmartTrafficLightSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      // Undeclared exception!
      try { 
        smartTrafficLightSystemSimplified0.isStateActive((SmartTrafficLightSystemSimplified.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.SmartTrafficLightSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartTrafficLightSystemSimplified.SensorOutput smartTrafficLightSystemSimplified_SensorOutput0 = new SmartTrafficLightSystemSimplified.SensorOutput();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartTrafficLightSystemSimplified.SensorInput smartTrafficLightSystemSimplified_SensorInput0 = new SmartTrafficLightSystemSimplified.SensorInput();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.$NULLSTATE$;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_TRACKINGDEVICETEMPERATURE__INITIALIZE_DEVICETEMP_COMPONENT_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_POWERCALCULATORCOMPONENT__INITIALIZE_POWER_COMPONENT_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_WIFIGATEWAY__INITIALIZE_WIFI_COMPONENT_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_SENSORCOMPONENT__INITIALIZE_SENSOR_COMPONENT_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_CONTROLLERCOMPONENT__INITIALIZE_CONTROLLER_COMPONENT_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_TRACKINGDEVICETEMPERATURE_OFF;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_TRACKINGDEVICETEMPERATURE__INITIALIZE_DEVICETEMP_COMPONENT__UPDATING__TEMPERATURE_UPDATES_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_POWERCALCULATORCOMPONENT_OFF;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_POWERCALCULATORCOMPONENT__INITIALIZE_POWER_COMPONENT__UPDATING__POWER_UPDATES_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_WIFIGATEWAY_OFF;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_WIFIGATEWAY__INITIALIZE_WIFI_COMPONENT__UPDATING__WIFI_UPDATES_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_SENSORCOMPONENT_OFF;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_SENSORCOMPONENT__INITIALIZE_SENSOR_COMPONENT__UPDATING__SENSOR_UPDATES_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_CONTROLLERCOMPONENT_OFF;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_CONTROLLERCOMPONENT__INITIALIZE_CONTROLLER_COMPONENT__UPDATING__CONTROLLER_UPDATES_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_ACTUATORCOMPONENT_OFF;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_ACTUATORCOMPONENT__ACTUATOR_UPDATES_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_SYSTEMSTATUS_ON;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_ACTUATORCOMPONENT__DEVICE_FUNCTIONING_;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.State smartTrafficLightSystemSimplified_State0 = SmartTrafficLightSystemSimplified.State.MAIN_REGION_SMARTTRAFFICLIGHTSYSTEM_SYSTEMSTATUS_OFF;
      boolean boolean0 = smartTrafficLightSystemSimplified0.isStateActive(smartTrafficLightSystemSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      boolean boolean0 = smartTrafficLightSystemSimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      smartTrafficLightSystemSimplified0.exit();
      assertFalse(smartTrafficLightSystemSimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      // Undeclared exception!
      try { 
        smartTrafficLightSystemSimplified0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartTrafficLightSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      // Undeclared exception!
      try { 
        smartTrafficLightSystemSimplified0.raiseTimeEvent(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartTrafficLightSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      // Undeclared exception!
      try { 
        smartTrafficLightSystemSimplified0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.SmartTrafficLightSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.SensorInput smartTrafficLightSystemSimplified_SensorInput0 = smartTrafficLightSystemSimplified0.sensorInput();
      assertNotNull(smartTrafficLightSystemSimplified_SensorInput0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      SmartTrafficLightSystemSimplified.System smartTrafficLightSystemSimplified_System0 = smartTrafficLightSystemSimplified0.system();
      assertNotNull(smartTrafficLightSystemSimplified_System0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      boolean boolean0 = smartTrafficLightSystemSimplified0.isFinal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      smartTrafficLightSystemSimplified0.setTimerService(iTimerService0);
      // Undeclared exception!
      try { 
        smartTrafficLightSystemSimplified0.enter();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.SmartTrafficLightSystemSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      smartTrafficLightSystemSimplified0.setTimerService(iTimerService0);
      SmartTrafficLightSystemSimplified.System smartTrafficLightSystemSimplified_System0 = new SmartTrafficLightSystemSimplified.System(smartTrafficLightSystemSimplified0);
      smartTrafficLightSystemSimplified_System0.raiseOff();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SmartTrafficLightSystemSimplified smartTrafficLightSystemSimplified0 = new SmartTrafficLightSystemSimplified();
      smartTrafficLightSystemSimplified0.sensorOutput();
      assertFalse(smartTrafficLightSystemSimplified0.isActive());
  }
}