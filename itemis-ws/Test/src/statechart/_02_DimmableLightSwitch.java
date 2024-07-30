/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import java.util.LinkedList;
import java.util.Queue;

public class _02_DimmableLightSwitch implements IEventDriven {
	public enum State {
		MAIN_OFF,
		MAIN_ON,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public _02_DimmableLightSwitch() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart _02_DimmableLightSwitch */
		setBrightness(0l);
		
		isExecuting = false;
	}
	
	public void enter() {
		/* Activates the state machine. */
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default enter sequence for statechart _02_DimmableLightSwitch */
		enterSequence_main_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart _02_DimmableLightSwitch */
		exitSequence_main();
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
		switchEvent = false;
		changeBrightness = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_OFF:
			main_Off_react(-1l);
			break;
		case MAIN_ON:
			main_On_react(-1l);
			break;
		default:
			break;
		}
	}
	
	private void runCycle() {
		/* Performs a 'run to completion' step. */
		
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
		case MAIN_OFF:
			return stateVector[0] == State.MAIN_OFF;
		case MAIN_ON:
			return stateVector[0] == State.MAIN_ON;
		default:
			return false;
		}
	}
	
	
	private boolean switchEvent;
	
	
	public void raiseSwitch() {
		inEventQueue.add(() -> {
			switchEvent = true;
		});
		runCycle();
	}
	
	private boolean changeBrightness;
	
	
	public void raiseChangeBrightness() {
		inEventQueue.add(() -> {
			changeBrightness = true;
		});
		runCycle();
	}
	
	private long brightness;
	
	public long getBrightness() {
		return brightness;
	}
	
	public void setBrightness(long value) {
		this.brightness = value;
	}
	
	/* Entry action for state 'Off'. */
	private void entryAction_main_Off() {
		/* Entry action for state 'Off'. */
		setBrightness(0l);
	}
	
	/* 'default' enter sequence for state Off */
	private void enterSequence_main_Off_default() {
		/* 'default' enter sequence for state Off */
		entryAction_main_Off();
		stateVector[0] = State.MAIN_OFF;
	}
	
	/* 'default' enter sequence for state On */
	private void enterSequence_main_On_default() {
		/* 'default' enter sequence for state On */
		stateVector[0] = State.MAIN_ON;
	}
	
	/* 'default' enter sequence for region main */
	private void enterSequence_main_default() {
		/* 'default' enter sequence for region main */
		react_main__entry_Default();
	}
	
	/* Default exit sequence for state Off */
	private void exitSequence_main_Off() {
		/* Default exit sequence for state Off */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state On */
	private void exitSequence_main_On() {
		/* Default exit sequence for state On */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main */
	private void exitSequence_main() {
		/* Default exit sequence for region main */
		switch (stateVector[0]) {
		case MAIN_OFF:
			exitSequence_main_Off();
			break;
		case MAIN_ON:
			exitSequence_main_On();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_Off_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_Off_react(long transitioned_before) {
		/* The reactions of state Off. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (switchEvent) {
				exitSequence_main_Off();
				setBrightness(10l);
				enterSequence_main_On_default();
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
	
	private long main_On_react(long transitioned_before) {
		/* The reactions of state On. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (switchEvent) {
				exitSequence_main_On();
				enterSequence_main_Off_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (((changeBrightness) && (getBrightness()>1l))) {
					exitSequence_main_On();
					setBrightness(getBrightness() - 1l);
					enterSequence_main_On_default();
					react(0l);
					transitioned_after = 0l;
				} else {
					if (((changeBrightness) && (getBrightness()<=1l))) {
						exitSequence_main_On();
						setBrightness(10l);
						enterSequence_main_On_default();
						react(0l);
						transitioned_after = 0l;
					}
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
	
	/* Can be used by the client code to trigger a run to completion step without raising an event. */
	public void triggerWithoutEvent() {
		runCycle();
	}
}