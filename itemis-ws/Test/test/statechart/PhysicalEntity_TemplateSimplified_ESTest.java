/*
 * This file was automatically generated by EvoSuite
 * Tue May 21 07:25:27 GMT 2024
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
import statechart.PhysicalEntity_TemplateSimplified;
import statechart.Power_Component;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PhysicalEntity_TemplateSimplified_ESTest extends PhysicalEntity_TemplateSimplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      // Undeclared exception!
      try { 
        physicalEntity_TemplateSimplified0.isStateActive((PhysicalEntity_TemplateSimplified.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.PhysicalEntity_TemplateSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PhysicalEntity_TemplateSimplified.Oscillator physicalEntity_TemplateSimplified_Oscillator0 = new PhysicalEntity_TemplateSimplified.Oscillator();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      Power_Component power_Component0 = new Power_Component();
      physicalEntity_TemplateSimplified0.setPowerSupply(power_Component0);
      assertEquals(3600L, power_Component0.getTime());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      Controller_Component controller_Component0 = new Controller_Component();
      physicalEntity_TemplateSimplified0.setController(controller_Component0);
      assertFalse(controller_Component0.isFinal());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.Status physicalEntity_TemplateSimplified_Status0 = new PhysicalEntity_TemplateSimplified.Status(physicalEntity_TemplateSimplified0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PhysicalEntity_TemplateSimplified.Comparator physicalEntity_TemplateSimplified_Comparator0 = new PhysicalEntity_TemplateSimplified.Comparator();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PhysicalEntity_TemplateSimplified.Frequency physicalEntity_TemplateSimplified_Frequency0 = new PhysicalEntity_TemplateSimplified.Frequency();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      Actuator_Component actuator_Component0 = new Actuator_Component();
      physicalEntity_TemplateSimplified0.setActuator(actuator_Component0);
      assertFalse(actuator_Component0.getIsTriggered());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PhysicalEntity_TemplateSimplified.Power physicalEntity_TemplateSimplified_Power0 = new PhysicalEntity_TemplateSimplified.Power();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.$NULLSTATE$;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__DETECTING__POWER_POWERSUPPLYSTATUS;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__DETECTING__CONTROLLER_READING_SENSOR_DATA;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__DETECTING_;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__DETECTING__POWER_POWERSUPPLYSTATUS_STATUS_CIRCUITTRIGGER;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__DETECTING__POWER_POWERSUPPLYSTATUS_STATUS_CONSUMINGMINIMUM;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__DETECTING__ACTUATOR_ACTUATE_TRIGGER;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__DETECTING__ACTUATOR_ONSTANDBY;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__DETECTING__CONTROLLER_READING_SENSOR_DATA_PROCESSING_COMPARING;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__DETECTING__CONTROLLER_READING_SENSOR_DATA_PROCESSING_TRIGGER_CHANGED;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__DETECTING__SENSOR_RECEIVING;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__OFF_;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.State physicalEntity_TemplateSimplified_State0 = PhysicalEntity_TemplateSimplified.State.PHYSICALENTITY_TEMPLATE__DETECTING__SENSOR_TRANSMITTING;
      boolean boolean0 = physicalEntity_TemplateSimplified0.isStateActive(physicalEntity_TemplateSimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      boolean boolean0 = physicalEntity_TemplateSimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      // Undeclared exception!
      try { 
        physicalEntity_TemplateSimplified0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.PhysicalEntity_TemplateSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.Trigger physicalEntity_TemplateSimplified_Trigger0 = new PhysicalEntity_TemplateSimplified.Trigger(physicalEntity_TemplateSimplified0);
      // Undeclared exception!
      try { 
        physicalEntity_TemplateSimplified_Trigger0.raiseOff();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.PhysicalEntity_TemplateSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.Status physicalEntity_TemplateSimplified_Status0 = physicalEntity_TemplateSimplified0.status();
      // Undeclared exception!
      try { 
        physicalEntity_TemplateSimplified_Status0.raiseNoActivitySensed();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.PhysicalEntity_TemplateSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      physicalEntity_TemplateSimplified0.exit();
      assertFalse(physicalEntity_TemplateSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      boolean boolean0 = physicalEntity_TemplateSimplified0.isFinal();
      assertFalse(physicalEntity_TemplateSimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      physicalEntity_TemplateSimplified0.frequency();
      assertFalse(physicalEntity_TemplateSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      physicalEntity_TemplateSimplified0.setTimerService((ITimerService) null);
      assertFalse(physicalEntity_TemplateSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      // Undeclared exception!
      try { 
        physicalEntity_TemplateSimplified0.raiseOff();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.PhysicalEntity_TemplateSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.Trigger physicalEntity_TemplateSimplified_Trigger0 = physicalEntity_TemplateSimplified0.trigger();
      // Undeclared exception!
      try { 
        physicalEntity_TemplateSimplified_Trigger0.raiseOn();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.PhysicalEntity_TemplateSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      // Undeclared exception!
      try { 
        physicalEntity_TemplateSimplified0.raiseOn();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.PhysicalEntity_TemplateSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      // Undeclared exception!
      try { 
        physicalEntity_TemplateSimplified0.raiseTimeEvent(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.PhysicalEntity_TemplateSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      PhysicalEntity_TemplateSimplified.Status physicalEntity_TemplateSimplified_Status0 = physicalEntity_TemplateSimplified0.status();
      // Undeclared exception!
      try { 
        physicalEntity_TemplateSimplified_Status0.raiseActivitySensed();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.PhysicalEntity_TemplateSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      physicalEntity_TemplateSimplified0.power();
      assertFalse(physicalEntity_TemplateSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      physicalEntity_TemplateSimplified0.oscillator();
      assertFalse(physicalEntity_TemplateSimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      // Undeclared exception!
      try { 
        physicalEntity_TemplateSimplified0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.PhysicalEntity_TemplateSimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PhysicalEntity_TemplateSimplified physicalEntity_TemplateSimplified0 = new PhysicalEntity_TemplateSimplified();
      physicalEntity_TemplateSimplified0.comparator();
      assertFalse(physicalEntity_TemplateSimplified0.isActive());
  }
}
