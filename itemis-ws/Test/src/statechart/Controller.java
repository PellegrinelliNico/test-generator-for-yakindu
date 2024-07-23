/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import java.util.LinkedList;
import java.util.Queue;
import statechart._led;

public class Controller implements ITimed, IEventDriven {
	public enum State {
		MAIN_REGION_RED_ON,
		MAIN_REGION_GREEN_ON,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private ITimerService timerService;
	
	private final boolean[] timeEvents = new boolean[2];
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public Controller() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart controller */
		setGreen(null);
		setRed(null);
		
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
		/* Default enter sequence for statechart controller */
		/* Entry action for statechart 'controller'. */
		getGreen().enter();
		getRed().enter();
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart controller */
		exitSequence_main_region();
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
	private void clearInEvents() {
		timeEvents[0] = false;
		timeEvents[1] = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_RED_ON:
			main_region_Red_on_react(-1l);
			break;
		case MAIN_REGION_GREEN_ON:
			main_region_Green_On_react(-1l);
			break;
		default:
			break;
		}
	}
	
	private void runCycle() {
		/* Performs a 'run to completion' step. */
		if (timerService == null) {
			throw new IllegalStateException("Timer service must be set.");
		}
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		nextEvent();
		do { 
			microStep();
			clearInEvents();
		} while (nextEvent());
		isExecuting = false;
	}
	
	protected boolean nextEvent() {
		if(!inEventQueue.isEmpty()) {
			inEventQueue.poll().run();
			return true;
		}
		return false;
	}
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case MAIN_REGION_RED_ON:
			return stateVector[0] == State.MAIN_REGION_RED_ON;
		case MAIN_REGION_GREEN_ON:
			return stateVector[0] == State.MAIN_REGION_GREEN_ON;
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
		inEventQueue.add(() -> {
			timeEvents[eventID] = true;
		});
		runCycle();
	}
	
	
	private _led green;
	
	public _led getGreen() {
		return green;
	}
	
	public void setGreen(_led value) {
		this.green = value;
	}
	
	private _led red;
	
	public _led getRed() {
		return red;
	}
	
	public void setRed(_led value) {
		this.red = value;
	}
	
	/* Entry action for state 'Red on'. */
	private void entryAction_main_region_Red_on() {
		/* Entry action for state 'Red on'. */
		timerService.setTimer(this, 0, (1l * 1000l), false);
		getGreen().raiseOff();
		getRed().raiseOn();
	}
	
	/* Entry action for state 'Green On'. */
	private void entryAction_main_region_Green_On() {
		/* Entry action for state 'Green On'. */
		timerService.setTimer(this, 1, (1l * 1000l), false);
		getGreen().raiseOn();
		getRed().raiseOff();
	}
	
	/* Exit action for state 'Red on'. */
	private void exitAction_main_region_Red_on() {
		/* Exit action for state 'Red on'. */
		timerService.unsetTimer(this, 0);
	}
	
	/* Exit action for state 'Green On'. */
	private void exitAction_main_region_Green_On() {
		/* Exit action for state 'Green On'. */
		timerService.unsetTimer(this, 1);
	}
	
	/* 'default' enter sequence for state Red on */
	private void enterSequence_main_region_Red_on_default() {
		/* 'default' enter sequence for state Red on */
		entryAction_main_region_Red_on();
		stateVector[0] = State.MAIN_REGION_RED_ON;
	}
	
	/* 'default' enter sequence for state Green On */
	private void enterSequence_main_region_Green_On_default() {
		/* 'default' enter sequence for state Green On */
		entryAction_main_region_Green_On();
		stateVector[0] = State.MAIN_REGION_GREEN_ON;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state Red on */
	private void exitSequence_main_region_Red_on() {
		/* Default exit sequence for state Red on */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_Red_on();
	}
	
	/* Default exit sequence for state Green On */
	private void exitSequence_main_region_Green_On() {
		/* Default exit sequence for state Green On */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_Green_On();
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_RED_ON:
			exitSequence_main_region_Red_on();
			break;
		case MAIN_REGION_GREEN_ON:
			exitSequence_main_region_Green_On();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_Red_on_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_Red_on_react(long transitioned_before) {
		/* The reactions of state Red on. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[0]) {
				exitSequence_main_region_Red_on();
				timeEvents[0] = false;
				enterSequence_main_region_Green_On_default();
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
	
	private long main_region_Green_On_react(long transitioned_before) {
		/* The reactions of state Green On. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[1]) {
				exitSequence_main_region_Green_On();
				timeEvents[1] = false;
				enterSequence_main_region_Red_on_default();
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
	
	/* Can be used by the client code to trigger a run to completion step without raising an event. */
	public void triggerWithoutEvent() {
		runCycle();
	}
}
