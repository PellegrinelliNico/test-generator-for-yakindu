/*
 * This file was automatically generated by EvoSuite
 * Tue May 14 20:41:15 GMT 2024
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
import statechart.Statechart6Simplified;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Statechart6Simplified_ESTest extends Statechart6Simplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      // Undeclared exception!
      try { 
        statechart6Simplified0.raiseTimeEvent(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Statechart6Simplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      // Undeclared exception!
      try { 
        statechart6Simplified0.raiseTimeEvent((-1876));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1876
         //
         verifyException("statechart.Statechart6Simplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      // Undeclared exception!
      try { 
        statechart6Simplified0.isStateActive((Statechart6Simplified.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart.Statechart6Simplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      statechart6Simplified0.enter();
      Statechart6Simplified.Ultrasonic statechart6Simplified_Ultrasonic0 = statechart6Simplified0.ultrasonic();
      statechart6Simplified_Ultrasonic0.raise_30toLarger();
      statechart6Simplified_Ultrasonic0.raise_30toLarger();
      assertTrue(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Statechart6Simplified.Light statechart6Simplified_Light0 = new Statechart6Simplified.Light();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      Statechart6Simplified.Ultrasonic statechart6Simplified_Ultrasonic0 = new Statechart6Simplified.Ultrasonic(statechart6Simplified0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      statechart6Simplified0.enter();
      statechart6Simplified0.triggerWithoutEvent();
      assertTrue(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      statechart6Simplified0.enter();
      Statechart6Simplified.Ultrasonic statechart6Simplified_Ultrasonic0 = statechart6Simplified0.ultrasonic();
      statechart6Simplified_Ultrasonic0.raise_30toLarger();
      statechart6Simplified_Ultrasonic0.raise_0to30();
      assertTrue(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      statechart6Simplified0.enter();
      Statechart6Simplified.Ultrasonic statechart6Simplified_Ultrasonic0 = statechart6Simplified0.ultrasonic();
      statechart6Simplified_Ultrasonic0.raise_0to30();
      statechart6Simplified0.raiseTimeEvent(0);
      assertTrue(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      statechart6Simplified0.enter();
      assertTrue(statechart6Simplified0.isActive());
      
      statechart6Simplified0.exit();
      assertFalse(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      statechart6Simplified0.enter();
      Statechart6Simplified.Ultrasonic statechart6Simplified_Ultrasonic0 = statechart6Simplified0.ultrasonic();
      statechart6Simplified_Ultrasonic0.raise_30toLarger();
      assertTrue(statechart6Simplified0.isActive());
      
      statechart6Simplified0.exit();
      assertFalse(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      statechart6Simplified0.exit();
      assertFalse(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      statechart6Simplified0.enter();
      Statechart6Simplified.State statechart6Simplified_State0 = Statechart6Simplified.State.MAIN_REGION_DECISION;
      boolean boolean0 = statechart6Simplified0.isStateActive(statechart6Simplified_State0);
      assertTrue(statechart6Simplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      statechart6Simplified0.enter();
      Statechart6Simplified.Ultrasonic statechart6Simplified_Ultrasonic0 = statechart6Simplified0.ultrasonic();
      statechart6Simplified_Ultrasonic0.raise_0to30();
      Statechart6Simplified.State statechart6Simplified_State0 = Statechart6Simplified.State.MAIN_REGION_STATELIGHTOFF;
      boolean boolean0 = statechart6Simplified0.isStateActive(statechart6Simplified_State0);
      assertTrue(statechart6Simplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      Statechart6Simplified.State statechart6Simplified_State0 = Statechart6Simplified.State.$NULLSTATE$;
      boolean boolean0 = statechart6Simplified0.isStateActive(statechart6Simplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      Statechart6Simplified.State statechart6Simplified_State0 = Statechart6Simplified.State.MAIN_REGION_STATELIGHTON;
      boolean boolean0 = statechart6Simplified0.isStateActive(statechart6Simplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      Statechart6Simplified.State statechart6Simplified_State0 = Statechart6Simplified.State.MAIN_REGION_DECISION;
      boolean boolean0 = statechart6Simplified0.isStateActive(statechart6Simplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      Statechart6Simplified.State statechart6Simplified_State0 = Statechart6Simplified.State.MAIN_REGION_STATELIGHTOFF;
      boolean boolean0 = statechart6Simplified0.isStateActive(statechart6Simplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      statechart6Simplified0.triggerWithoutEvent();
      assertFalse(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      assertFalse(statechart6Simplified0.isActive());
      
      statechart6Simplified0.enter();
      boolean boolean0 = statechart6Simplified0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      boolean boolean0 = statechart6Simplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      // Undeclared exception!
      try { 
        statechart6Simplified0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Statechart6Simplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      statechart6Simplified0.light();
      assertFalse(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      // Undeclared exception!
      try { 
        statechart6Simplified0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart.Statechart6Simplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      boolean boolean0 = statechart6Simplified0.isFinal();
      assertFalse(statechart6Simplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      statechart6Simplified0.enter();
      Statechart6Simplified.Ultrasonic statechart6Simplified_Ultrasonic0 = statechart6Simplified0.ultrasonic();
      statechart6Simplified_Ultrasonic0.raise_0to30();
      assertTrue(statechart6Simplified0.isActive());
      
      statechart6Simplified0.exit();
      assertFalse(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      assertFalse(statechart6Simplified0.isActive());
      
      statechart6Simplified0.enter();
      Statechart6Simplified.Ultrasonic statechart6Simplified_Ultrasonic0 = statechart6Simplified0.ultrasonic();
      statechart6Simplified_Ultrasonic0.raise_30toLarger();
      statechart6Simplified0.raiseTimeEvent(1);
      assertTrue(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      assertFalse(statechart6Simplified0.isActive());
      
      statechart6Simplified0.enter();
      Statechart6Simplified.Ultrasonic statechart6Simplified_Ultrasonic0 = statechart6Simplified0.ultrasonic();
      statechart6Simplified_Ultrasonic0.raise_0to30();
      statechart6Simplified_Ultrasonic0.raise_30toLarger();
      assertTrue(statechart6Simplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Statechart6Simplified statechart6Simplified0 = new Statechart6Simplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      statechart6Simplified0.setTimerService(iTimerService0);
      assertFalse(statechart6Simplified0.isActive());
      
      statechart6Simplified0.enter();
      Statechart6Simplified.Ultrasonic statechart6Simplified_Ultrasonic0 = statechart6Simplified0.ultrasonic();
      statechart6Simplified_Ultrasonic0.raise_30toLarger();
      Statechart6Simplified.State statechart6Simplified_State0 = Statechart6Simplified.State.MAIN_REGION_STATELIGHTON;
      boolean boolean0 = statechart6Simplified0.isStateActive(statechart6Simplified_State0);
      assertTrue(statechart6Simplified0.isActive());
      assertTrue(boolean0);
  }
}
