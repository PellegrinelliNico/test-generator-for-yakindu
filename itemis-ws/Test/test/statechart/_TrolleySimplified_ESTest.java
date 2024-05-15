/*
 * This file was automatically generated by EvoSuite
 * Tue May 14 19:13:07 GMT 2024
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
import statechart._TrolleySimplified;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class _TrolleySimplified_ESTest extends _TrolleySimplified_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.enter();
      _TrolleySimplified0.raiseRequestStop((-587));
      assertTrue(_TrolleySimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.triggerWithoutEvent();
      assertFalse(_TrolleySimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.raiseTimeEvent(0);
      assertFalse(_TrolleySimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.raiseStopEmergency();
      assertFalse(_TrolleySimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.raiseApproachingStation(2L);
      assertFalse(_TrolleySimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      // Undeclared exception!
      try { 
        _TrolleySimplified0.raiseUnboard();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      // Undeclared exception!
      try { 
        _TrolleySimplified0.raiseTimeEvent((-587));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -587
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      // Undeclared exception!
      try { 
        _TrolleySimplified0.raiseStartEmergency();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      // Undeclared exception!
      try { 
        _TrolleySimplified0.raiseRequestStop(0L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      // Undeclared exception!
      try { 
        _TrolleySimplified0.raiseBoard();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      // Undeclared exception!
      try { 
        _TrolleySimplified0.isStateActive((_TrolleySimplified.State) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified0.exit();
      assertFalse(_TrolleySimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.enter();
      _TrolleySimplified0.raiseUnboard();
      assertTrue(_TrolleySimplified0.isActive());
      
      _TrolleySimplified0.exit();
      assertFalse(_TrolleySimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.enter();
      assertTrue(_TrolleySimplified0.isActive());
      
      _TrolleySimplified0.exit();
      assertFalse(_TrolleySimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.enter();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_REQUESTHANDLER_ACCEPTINGREQUESTS;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertTrue(_TrolleySimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.enter();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_EMERGENCYSTOP;
      _TrolleySimplified0.raiseStartEmergency();
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.enter();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_EMERGENCYSTOP;
      _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertTrue(_TrolleySimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.enter();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_DEPARTURE_TO_A_STATION_R1_CLOSINGDOORS;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.enter();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_DEPARTURE_TO_A_STATION;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.enter();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertTrue(_TrolleySimplified0.isActive());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.$NULLSTATE$;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_EMERGENCYSTOP;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_DEPARTURE_TO_A_STATION_R1_CLOSINGDOORS;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_DEPARTURE_TO_A_STATION;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_ARRIVAL_AT_A_STATION;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_BOARDINGMANAGER_DOORSOPEN;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_REQUESTHANDLER_ACCEPTINGREQUESTS;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_EMERGENCYSTOP_R1_DOORSOPENARRIVAL;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_EMERGENCYSTOP_R1_DOORSOPEN;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_EMERGENCYSTOP_R1_BREAKUNTILSTANDSTILL;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_EMERGENCYSTOP_R1_EMERGENCYSTARTED;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_DEPARTURE_TO_A_STATION_R1_STARTDEPARTURE;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_DEPARTURE_TO_A_STATION_R1_BREAKUNTILSTANDSTILL;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_DEPARTURE_TO_A_STATION_R1_RESPONDTOAPPROACHINGSTATION;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_DEPARTURE_TO_A_STATION_R1_DOORSCLOSED;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_DEPARTURE_TO_A_STATION_R1_CLOSINGDOORS_R1_DOORSOBSTRUCTED;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_DEPARTURE_TO_A_STATION_R1_CLOSINGDOORS_R1_DOORSFREE;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_ARRIVAL_AT_A_STATION_R1_DOORSOPENAWAITINGREQUEST;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_ARRIVAL_AT_A_STATION_R1_DOORSOPEN;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_DEPARTURE_ARRIVAL_ARRIVAL_AT_A_STATION_R1_JUST_ARRIVED;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_BOARDINGMANAGER_DOORSOPEN_R1_DOORSOBSTRUCTED;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_BOARDINGMANAGER_DOORSOPEN_R1_BOARDINGPOSSIBLE;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      _TrolleySimplified.State _TrolleySimplified_State0 = _TrolleySimplified.State.MAIN_REGION_TROLLEY_BOARDINGMANAGER_DOORSCLOSED;
      boolean boolean0 = _TrolleySimplified0.isStateActive(_TrolleySimplified_State0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.raiseAtTargetSpeed();
      assertFalse(_TrolleySimplified0.isFinal());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      boolean boolean0 = _TrolleySimplified0.isActive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      assertFalse(_TrolleySimplified0.isActive());
      
      _TrolleySimplified0.enter();
      boolean boolean0 = _TrolleySimplified0.isActive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      // Undeclared exception!
      try { 
        _TrolleySimplified0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      // Undeclared exception!
      try { 
        _TrolleySimplified0.raiseTimeEvent(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      boolean boolean0 = _TrolleySimplified0.isFinal();
      assertFalse(_TrolleySimplified0.isActive());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      // Undeclared exception!
      try { 
        _TrolleySimplified0.raiseAtTargetSpeed();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      // Undeclared exception!
      try { 
        _TrolleySimplified0.triggerWithoutEvent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      // Undeclared exception!
      try { 
        _TrolleySimplified0.raiseStopEmergency();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.enter();
      _TrolleySimplified0.raiseRequestStop(0L);
      assertTrue(_TrolleySimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      ITimerService iTimerService0 = mock(ITimerService.class, new ViolatedAssumptionAnswer());
      _TrolleySimplified0.setTimerService(iTimerService0);
      _TrolleySimplified0.enter();
      _TrolleySimplified0.raiseBoard();
      _TrolleySimplified0.exit();
      assertFalse(_TrolleySimplified0.isActive());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      _TrolleySimplified _TrolleySimplified0 = new _TrolleySimplified();
      // Undeclared exception!
      try { 
        _TrolleySimplified0.raiseApproachingStation(0L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Timer service must be set.
         //
         verifyException("statechart._TrolleySimplified", e);
      }
  }
}
