/*
 * This file was automatically generated by EvoSuite
 * Fri May 17 07:26:28 GMT 2024
 */

package statechart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.yakindu.core.ITimerService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import statechart.Controller_Component;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_Component_ESTest extends Controller_Component_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      controller_Component0.setIsExecuting(true);
      boolean boolean0 = controller_Component0.getIsExecuting();
      assertFalse(controller_Component0.getActivity());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      boolean boolean0 = controller_Component0.getIsExecuting();
      assertFalse(boolean0);
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      assertFalse(controller_Component0.getActivity());
      
      controller_Component0.setActivity(true);
      boolean boolean0 = controller_Component0.getActivity();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      controller_Component0.actuator = null;
      controller_Component0.actuator();
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.Actuator controller_Component_Actuator0 = controller_Component0.actuator;
      assertFalse(controller_Component_Actuator0.getTriggered());
      
      controller_Component_Actuator0.setTriggered(true);
      Controller_Component.Actuator controller_Component_Actuator1 = controller_Component0.actuator();
      assertTrue(controller_Component_Actuator1.getTriggered());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      // Undeclared exception!
      try { 
        controller_Component0.isStateActive((Controller_Component.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.Controller_Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Controller_Component.Sensors controller_Component_Sensors0 = new Controller_Component.Sensors();
      controller_Component_Sensors0.setTriggered(true);
      assertTrue(controller_Component_Sensors0.getTriggered());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.Actuator controller_Component_Actuator0 = new Controller_Component.Actuator(controller_Component0);
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.State controller_Component_State0 = Controller_Component.State.$NULLSTATE$;
      boolean boolean0 = controller_Component0.isStateActive(controller_Component_State0);
      assertFalse(boolean0);
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.State controller_Component_State0 = Controller_Component.State._CONTROLLER_COMPONENT___CONTROLLER_ISON_;
      boolean boolean0 = controller_Component0.isStateActive(controller_Component_State0);
      assertFalse(controller_Component0.getActivity());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.State controller_Component_State0 = Controller_Component.State._CONTROLLER_COMPONENT___OFF_;
      boolean boolean0 = controller_Component0.isStateActive(controller_Component_State0);
      assertFalse(controller_Component0.getActivity());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.State controller_Component_State0 = Controller_Component.State._CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___TRIGGER_ACTUATOR_;
      boolean boolean0 = controller_Component0.isStateActive(controller_Component_State0);
      assertFalse(boolean0);
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.State controller_Component_State0 = Controller_Component.State._CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___CONTROLLER_PROCESSING_;
      boolean boolean0 = controller_Component0.isStateActive(controller_Component_State0);
      assertFalse(boolean0);
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.State controller_Component_State0 = Controller_Component.State._CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___READING_SENSOR_DATA_;
      boolean boolean0 = controller_Component0.isStateActive(controller_Component_State0);
      assertFalse(boolean0);
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      boolean boolean0 = controller_Component0.nextEvent();
      assertFalse(boolean0);
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      boolean boolean0 = controller_Component0.isActive();
      assertFalse(boolean0);
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      controller_Component0.setIsExecuting(true);
      controller_Component0.exit();
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      // Undeclared exception!
      try { 
        controller_Component0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Controller_Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Controller_Component.Sensors controller_Component_Sensors0 = new Controller_Component.Sensors();
      boolean boolean0 = controller_Component_Sensors0.getTriggered();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      controller_Component0.setTimerService((ITimerService) null);
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.Sensors controller_Component_Sensors0 = controller_Component0.sensors();
      assertFalse(controller_Component_Sensors0.getTriggered());
      
      controller_Component_Sensors0.setTriggered(true);
      Controller_Component.Sensors controller_Component_Sensors1 = controller_Component0.sensors();
      assertTrue(controller_Component_Sensors1.getTriggered());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      // Undeclared exception!
      try { 
        controller_Component0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Controller_Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      // Undeclared exception!
      try { 
        controller_Component0.raiseOff();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Controller_Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      // Undeclared exception!
      try { 
        controller_Component0.raiseTimeEvent((-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Controller_Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      boolean boolean0 = controller_Component0.isFinal();
      assertFalse(controller_Component0.getActivity());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      assertFalse(controller_Component0.isActive());
      
      controller_Component0.exit();
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      // Undeclared exception!
      try { 
        controller_Component0.raiseOn();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Controller_Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      boolean boolean0 = controller_Component0.getActivity();
      assertFalse(controller_Component0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.Actuator controller_Component_Actuator0 = controller_Component0.actuator();
      assertFalse(controller_Component_Actuator0.getTriggered());
      assertFalse(controller_Component0.isActive());
      assertFalse(controller_Component0.getActivity());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      controller_Component0.getTimerService();
      assertFalse(controller_Component0.getActivity());
      assertFalse(controller_Component0.isActive());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.Actuator controller_Component_Actuator0 = controller_Component0.actuator;
      // Undeclared exception!
      try { 
        controller_Component_Actuator0.raiseTrigger();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Controller_Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Controller_Component controller_Component0 = new Controller_Component();
      Controller_Component.Actuator controller_Component_Actuator0 = controller_Component0.actuator;
      boolean boolean0 = controller_Component_Actuator0.getTriggered();
      assertFalse(boolean0);
      assertFalse(controller_Component0.isActive());
      assertFalse(controller_Component0.getActivity());
  }
}
