/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import com.yakindu.core.rx.Observable;
import java.util.LinkedList;
import java.util.Queue;

public class Base implements ITimed, IEventDriven {
	public enum State {
		MAIN_REGION_RED,
		MAIN_REGION_GREEN,
		MAIN_REGION_YELLOW,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private ITimerService timerService;
	
	private final boolean[] timeEvents = new boolean[4];
	
	private Queue<Runnable> internalEventQueue = new LinkedList<Runnable>();
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean local_setLED;
	
	private boolean local_setLEDValue;
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public Base() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		clearInternalEvents();
		
		
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
		/* Default enter sequence for statechart base */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart base */
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
		buttonPressed = false;
		buttonReleased = false;
		carDetected = false;
		timeEvents[0] = false;
		timeEvents[1] = false;
		timeEvents[2] = false;
		timeEvents[3] = false;
	}
	
	private void clearInternalEvents() {
		local_setLED = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_RED:
			main_region_red_react(-1l);
			break;
		case MAIN_REGION_GREEN:
			main_region_green_react(-1l);
			break;
		case MAIN_REGION_YELLOW:
			main_region_yellow_react(-1l);
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
			clearInternalEvents();
		} while (nextEvent());
		isExecuting = false;
	}
	
	protected boolean nextEvent() {
		if(!internalEventQueue.isEmpty()) {
			internalEventQueue.poll().run();
			return true;
		}
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
		case MAIN_REGION_RED:
			return stateVector[0] == State.MAIN_REGION_RED;
		case MAIN_REGION_GREEN:
			return stateVector[0] == State.MAIN_REGION_GREEN;
		case MAIN_REGION_YELLOW:
			return stateVector[0] == State.MAIN_REGION_YELLOW;
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
	
	
	protected void raiseLocal_setLED(final boolean value) {
		internalEventQueue.add(() -> {
			local_setLEDValue = value;
			local_setLED = true;
		});
	}
	protected boolean getLocal_setLEDValue() {
		if (! local_setLED ) 
			throw new IllegalStateException("Illegal event value access. Event Local_setLED is not raised!");
		return local_setLEDValue;
	}
	
	private boolean buttonPressed;
	
	
	public void raiseButtonPressed() {
		inEventQueue.add(() -> {
			buttonPressed = true;
		});
		runCycle();
	}
	
	private boolean buttonReleased;
	
	
	public void raiseButtonReleased() {
		inEventQueue.add(() -> {
			buttonReleased = true;
		});
		runCycle();
	}
	
	private boolean carDetected;
	
	
	public void raiseCarDetected() {
		inEventQueue.add(() -> {
			carDetected = true;
		});
		runCycle();
	}
	
	private boolean setLED;
	
	private boolean setLEDValue;
	
	
	protected void raiseSetLED(boolean value) {
		setLEDValue = value;
		setLED = true;
		setLEDObservable.next(value);
		raiseLocal_setLED(value);
	}
	
	private Observable<Boolean> setLEDObservable = new Observable<Boolean>();
	
	public Observable<Boolean> getSetLED() {
		return setLEDObservable;
	}
	
	private boolean setRed;
	
	private boolean setRedValue;
	
	
	protected void raiseSetRed(boolean value) {
		setRedValue = value;
		setRed = true;
		setRedObservable.next(value);
	}
	
	private Observable<Boolean> setRedObservable = new Observable<Boolean>();
	
	public Observable<Boolean> getSetRed() {
		return setRedObservable;
	}
	
	private boolean setGreen;
	
	private boolean setGreenValue;
	
	
	protected void raiseSetGreen(boolean value) {
		setGreenValue = value;
		setGreen = true;
		setGreenObservable.next(value);
	}
	
	private Observable<Boolean> setGreenObservable = new Observable<Boolean>();
	
	public Observable<Boolean> getSetGreen() {
		return setGreenObservable;
	}
	
	private boolean setYellow;
	
	private boolean setYellowValue;
	
	
	protected void raiseSetYellow(boolean value) {
		setYellowValue = value;
		setYellow = true;
		setYellowObservable.next(value);
	}
	
	private Observable<Boolean> setYellowObservable = new Observable<Boolean>();
	
	public Observable<Boolean> getSetYellow() {
		return setYellowObservable;
	}
	
	/* Entry action for state 'red'. */
	private void entryAction_main_region_red() {
		/* Entry action for state 'red'. */
		timerService.setTimer(this, 0, (2l * 1000l), false);
		timerService.setTimer(this, 1, (1l * 1000l), false);
		raiseSetRed(true);
	}
	
	/* Entry action for state 'green'. */
	private void entryAction_main_region_green() {
		/* Entry action for state 'green'. */
		timerService.setTimer(this, 2, (2l * 1000l), false);
		raiseSetGreen(true);
		raiseSetLED(true);
	}
	
	/* Entry action for state 'yellow'. */
	private void entryAction_main_region_yellow() {
		/* Entry action for state 'yellow'. */
		timerService.setTimer(this, 3, (1l * 1000l), false);
		raiseSetYellow(true);
	}
	
	/* Exit action for state 'red'. */
	private void exitAction_main_region_red() {
		/* Exit action for state 'red'. */
		timerService.unsetTimer(this, 0);
		timerService.unsetTimer(this, 1);
	}
	
	/* Exit action for state 'green'. */
	private void exitAction_main_region_green() {
		/* Exit action for state 'green'. */
		timerService.unsetTimer(this, 2);
	}
	
	/* Exit action for state 'yellow'. */
	private void exitAction_main_region_yellow() {
		/* Exit action for state 'yellow'. */
		timerService.unsetTimer(this, 3);
	}
	
	/* 'default' enter sequence for state red */
	private void enterSequence_main_region_red_default() {
		/* 'default' enter sequence for state red */
		entryAction_main_region_red();
		stateVector[0] = State.MAIN_REGION_RED;
	}
	
	/* 'default' enter sequence for state green */
	private void enterSequence_main_region_green_default() {
		/* 'default' enter sequence for state green */
		entryAction_main_region_green();
		stateVector[0] = State.MAIN_REGION_GREEN;
	}
	
	/* 'default' enter sequence for state yellow */
	private void enterSequence_main_region_yellow_default() {
		/* 'default' enter sequence for state yellow */
		entryAction_main_region_yellow();
		stateVector[0] = State.MAIN_REGION_YELLOW;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state red */
	private void exitSequence_main_region_red() {
		/* Default exit sequence for state red */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_red();
	}
	
	/* Default exit sequence for state green */
	private void exitSequence_main_region_green() {
		/* Default exit sequence for state green */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_green();
	}
	
	/* Default exit sequence for state yellow */
	private void exitSequence_main_region_yellow() {
		/* Default exit sequence for state yellow */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_yellow();
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_RED:
			exitSequence_main_region_red();
			break;
		case MAIN_REGION_GREEN:
			exitSequence_main_region_green();
			break;
		case MAIN_REGION_YELLOW:
			exitSequence_main_region_yellow();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_red_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_red_react(long transitioned_before) {
		/* The reactions of state red. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[0]) {
				exitSequence_main_region_red();
				timeEvents[0] = false;
				enterSequence_main_region_green_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (((timeEvents[1]) && (getLocal_setLEDValue()==true))) {
					exitSequence_main_region_red();
					timeEvents[1] = false;
					enterSequence_main_region_red_default();
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
	
	private long main_region_green_react(long transitioned_before) {
		/* The reactions of state green. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[2]) {
				exitSequence_main_region_green();
				timeEvents[2] = false;
				enterSequence_main_region_yellow_default();
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
	
	private long main_region_yellow_react(long transitioned_before) {
		/* The reactions of state yellow. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[3]) {
				exitSequence_main_region_yellow();
				timeEvents[3] = false;
				enterSequence_main_region_red_default();
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
