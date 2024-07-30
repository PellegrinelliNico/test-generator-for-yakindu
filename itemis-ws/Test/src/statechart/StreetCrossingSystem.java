/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.ICycleBased;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import statechart._TwoWayTrafficControl2;

public class StreetCrossingSystem implements ITimed, ICycleBased {
	private static class EvBuf {
		private boolean startAll;
		private boolean outageA;
		private boolean outageB;
	}
	private static class TimeEventsEvBuf {
		private boolean streetCrossingSystem_system_Temporary_Outage_A_time_event_0;
		private boolean streetCrossingSystem_system_Temporary_Outage_B_time_event_0;
	}
	private static class StreetCrossingSystemEvBuf {
		private EvBuf iface = new EvBuf();
		private TimeEventsEvBuf timeEvents = new TimeEventsEvBuf();
	}
	public enum State {
		SYSTEM_ON,
		SYSTEM_OFF,
		SYSTEM_TEMPORARY_OUTAGE_A,
		SYSTEM_TEMPORARY_OUTAGE_B,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private ITimerService timerService;
	
	private final boolean[] timeEvents = new boolean[2];
	
	private StreetCrossingSystemEvBuf current = new StreetCrossingSystemEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public StreetCrossingSystem() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart StreetCrossingSystem */
		setController(null);
		
		isExecuting = false;
	}
	
	public void runCycle() {
		/* Performs a 'run to completion' step. */
		if (timerService == null) {
			throw new IllegalStateException("Timer service must be set.");
		}
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		swapInEvents();
		microStep();
		isExecuting = false;
	}
	
	public void enter() {
		/* Activates the state machine. */
		if (timerService == null) {
			throw new IllegalStateException("Timer service must be set.");
		}
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default enter sequence for statechart StreetCrossingSystem */
		enterSequence_system_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart StreetCrossingSystem */
		exitSequence_system();
		isExecuting = false;
	}
	
	/**
	 * @see IStatemachine#isActive()
	 */
	public boolean isActive() {
		return stateVector[0] != State.$NULLSTATE$;
	}
	
	/** 
	* Always returns 'false' since this state machine can never become final.
	*
	* @see IStatemachine#isFinal()
	*/
	public boolean isFinal() {
		return false;
	}
	private void swapInEvents() {
		current.iface.startAll = startAll;
		startAll = false;
		current.iface.outageA = outageA;
		outageA = false;
		current.iface.outageB = outageB;
		outageB = false;
		current.timeEvents.streetCrossingSystem_system_Temporary_Outage_A_time_event_0 = timeEvents[0];
		timeEvents[0] = false;
		current.timeEvents.streetCrossingSystem_system_Temporary_Outage_B_time_event_0 = timeEvents[1];
		timeEvents[1] = false;
	}
	
	private void clearInEvents() {
		startAll = false;
		outageA = false;
		outageB = false;
		timeEvents[0] = false;
		timeEvents[1] = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case SYSTEM_ON:
			system_On_react(-1l);
			break;
		case SYSTEM_OFF:
			system_Off_react(-1l);
			break;
		case SYSTEM_TEMPORARY_OUTAGE_A:
			system_Temporary_Outage_A_react(-1l);
			break;
		case SYSTEM_TEMPORARY_OUTAGE_B:
			system_Temporary_Outage_B_react(-1l);
			break;
		default:
			break;
		}
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case SYSTEM_ON:
			return stateVector[0] == State.SYSTEM_ON;
		case SYSTEM_OFF:
			return stateVector[0] == State.SYSTEM_OFF;
		case SYSTEM_TEMPORARY_OUTAGE_A:
			return stateVector[0] == State.SYSTEM_TEMPORARY_OUTAGE_A;
		case SYSTEM_TEMPORARY_OUTAGE_B:
			return stateVector[0] == State.SYSTEM_TEMPORARY_OUTAGE_B;
		default:
			return false;
		}
	}
	
	public void setTimerService(ITimerService timerService) {
		this.timerService = timerService;
	}
	
	public ITimerService getTimerService() {
		return timerService;
	}
	
	public void raiseTimeEvent(int eventID) {
		timeEvents[eventID] = true;
	}
	
	
	private boolean startAll;
	
	
	public void raiseStartAll() {
		startAll = true;
	}
	
	private boolean outageA;
	
	
	public void raiseOutageA() {
		outageA = true;
	}
	
	private boolean outageB;
	
	
	public void raiseOutageB() {
		outageB = true;
	}
	
	private _TwoWayTrafficControl2 controller;
	
	public _TwoWayTrafficControl2 getController() {
		return controller;
	}
	
	public void setController(_TwoWayTrafficControl2 value) {
		this.controller = value;
	}
	
	/* Entry action for state 'On'. */
	private void entryAction_system_On() {
		/* Entry action for state 'On'. */
		getController().enter();
		getController().getTrafficLightA().enter();
		getController().getTrafficLightB().enter();
	}
	
	/* Entry action for state 'Temporary Outage A'. */
	private void entryAction_system_Temporary_Outage_A() {
		/* Entry action for state 'Temporary Outage A'. */
		timerService.setTimer(this, 0, (60l * 1000l), false);
		getController().getTrafficLightA().exit();
	}
	
	/* Entry action for state 'Temporary Outage B'. */
	private void entryAction_system_Temporary_Outage_B() {
		/* Entry action for state 'Temporary Outage B'. */
		timerService.setTimer(this, 1, (60l * 1000l), false);
		getController().getTrafficLightB().exit();
	}
	
	/* Exit action for state 'Temporary Outage A'. */
	private void exitAction_system_Temporary_Outage_A() {
		/* Exit action for state 'Temporary Outage A'. */
		timerService.unsetTimer(this, 0);
		getController().getTrafficLightA().enter();
	}
	
	/* Exit action for state 'Temporary Outage B'. */
	private void exitAction_system_Temporary_Outage_B() {
		/* Exit action for state 'Temporary Outage B'. */
		timerService.unsetTimer(this, 1);
		getController().getTrafficLightB().enter();
	}
	
	/* 'default' enter sequence for state On */
	private void enterSequence_system_On_default() {
		/* 'default' enter sequence for state On */
		entryAction_system_On();
		stateVector[0] = State.SYSTEM_ON;
	}
	
	/* 'default' enter sequence for state Off */
	private void enterSequence_system_Off_default() {
		/* 'default' enter sequence for state Off */
		stateVector[0] = State.SYSTEM_OFF;
	}
	
	/* 'default' enter sequence for state Temporary Outage A */
	private void enterSequence_system_Temporary_Outage_A_default() {
		/* 'default' enter sequence for state Temporary Outage A */
		entryAction_system_Temporary_Outage_A();
		stateVector[0] = State.SYSTEM_TEMPORARY_OUTAGE_A;
	}
	
	/* 'default' enter sequence for state Temporary Outage B */
	private void enterSequence_system_Temporary_Outage_B_default() {
		/* 'default' enter sequence for state Temporary Outage B */
		entryAction_system_Temporary_Outage_B();
		stateVector[0] = State.SYSTEM_TEMPORARY_OUTAGE_B;
	}
	
	/* 'default' enter sequence for region system */
	private void enterSequence_system_default() {
		/* 'default' enter sequence for region system */
		react_system__entry_Default();
	}
	
	/* Default exit sequence for state On */
	private void exitSequence_system_On() {
		/* Default exit sequence for state On */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state Off */
	private void exitSequence_system_Off() {
		/* Default exit sequence for state Off */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state Temporary Outage A */
	private void exitSequence_system_Temporary_Outage_A() {
		/* Default exit sequence for state Temporary Outage A */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_system_Temporary_Outage_A();
	}
	
	/* Default exit sequence for state Temporary Outage B */
	private void exitSequence_system_Temporary_Outage_B() {
		/* Default exit sequence for state Temporary Outage B */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_system_Temporary_Outage_B();
	}
	
	/* Default exit sequence for region system */
	private void exitSequence_system() {
		/* Default exit sequence for region system */
		switch (stateVector[0]) {
		case SYSTEM_ON:
			exitSequence_system_On();
			break;
		case SYSTEM_OFF:
			exitSequence_system_Off();
			break;
		case SYSTEM_TEMPORARY_OUTAGE_A:
			exitSequence_system_Temporary_Outage_A();
			break;
		case SYSTEM_TEMPORARY_OUTAGE_B:
			exitSequence_system_Temporary_Outage_B();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_system__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_system_Off_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		getController().runCycle();
		getController().getTrafficLightA().runCycle();
		getController().getTrafficLightB().runCycle();
		return transitioned_before;
	}
	
	private long system_On_react(long transitioned_before) {
		/* The reactions of state On. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.iface.outageA) {
				exitSequence_system_On();
				enterSequence_system_Temporary_Outage_A_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (current.iface.outageB) {
					exitSequence_system_On();
					enterSequence_system_Temporary_Outage_B_default();
					react(0l);
					transitioned_after = 0l;
				}
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long system_Off_react(long transitioned_before) {
		/* The reactions of state Off. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.iface.startAll) {
				exitSequence_system_Off();
				enterSequence_system_On_default();
				react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long system_Temporary_Outage_A_react(long transitioned_before) {
		/* The reactions of state Temporary Outage A. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.timeEvents.streetCrossingSystem_system_Temporary_Outage_A_time_event_0) {
				exitSequence_system_Temporary_Outage_A();
				current.timeEvents.streetCrossingSystem_system_Temporary_Outage_A_time_event_0 = false;
				enterSequence_system_On_default();
				react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long system_Temporary_Outage_B_react(long transitioned_before) {
		/* The reactions of state Temporary Outage B. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.timeEvents.streetCrossingSystem_system_Temporary_Outage_B_time_event_0) {
				exitSequence_system_Temporary_Outage_B();
				current.timeEvents.streetCrossingSystem_system_Temporary_Outage_B_time_event_0 = false;
				enterSequence_system_On_default();
				react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = react(transitioned_before);
		}
		return transitioned_after;
	}
	
}