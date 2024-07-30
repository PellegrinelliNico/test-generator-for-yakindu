/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import java.util.LinkedList;
import java.util.Queue;

public class Statechart4 implements IEventDriven {
	public enum State {
		MAIN_REGION_RIDE,
		MAIN_REGION_SECURED,
		MAIN_REGION_ALARM,
		MAIN_REGION_PASSWORDPROMPT,
		MAIN_REGION_PASSWORDPROMPT_R1_READY,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private long password;
	
	protected long getPassword() {
		return password;
	}
	
	protected void setPassword(long value) {
		this.password = value;
	}
	
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public Statechart4() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart Statechart4 */
		setPassword(1l);
		
		isExecuting = false;
	}
	
	public void enter() {
		/* Activates the state machine. */
		if (this.operationCallback == null) {
			throw new IllegalStateException("Operation callback must be set.");
		}
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default enter sequence for statechart Statechart4 */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart Statechart4 */
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
		left_button_clicked = false;
		right_button_clicked = false;
		double_button_clicked = false;
		motion_detected = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_RIDE:
			main_region_Ride_react(-1l);
			break;
		case MAIN_REGION_SECURED:
			main_region_Secured_react(-1l);
			break;
		case MAIN_REGION_ALARM:
			main_region_Alarm_react(-1l);
			break;
		case MAIN_REGION_PASSWORDPROMPT_R1_READY:
			main_region_PasswordPrompt_r1_Ready_react(-1l);
			break;
		default:
			break;
		}
	}
	
	private void runCycle() {
		/* Performs a 'run to completion' step. */
		if (this.operationCallback == null) {
			throw new IllegalStateException("Operation callback must be set.");
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
		case MAIN_REGION_RIDE:
			return stateVector[0] == State.MAIN_REGION_RIDE;
		case MAIN_REGION_SECURED:
			return stateVector[0] == State.MAIN_REGION_SECURED;
		case MAIN_REGION_ALARM:
			return stateVector[0] == State.MAIN_REGION_ALARM;
		case MAIN_REGION_PASSWORDPROMPT:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_PASSWORDPROMPT.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_PASSWORDPROMPT_R1_READY.ordinal();
		case MAIN_REGION_PASSWORDPROMPT_R1_READY:
			return stateVector[0] == State.MAIN_REGION_PASSWORDPROMPT_R1_READY;
		default:
			return false;
		}
	}
	
	
	public interface OperationCallback {
	
		public void disable_alarm_horn();
		
		public void disable_alarm_display();
		
		public void activate_alarm_horn();
		
		public void activate_alarm_display();
		
		public void display_unlocked();
		
		public void display_locked();
		
		public void new_password_input(long password);
		
		public boolean verify_password(long password);
		
	}
	
	private OperationCallback operationCallback;
	
	public void setOperationCallback(OperationCallback operationCallback) {
		this.operationCallback = operationCallback;
	}
	
	private boolean left_button_clicked;
	
	
	public void raiseLeft_button_clicked() {
		inEventQueue.add(() -> {
			left_button_clicked = true;
		});
		runCycle();
	}
	
	private boolean right_button_clicked;
	
	
	public void raiseRight_button_clicked() {
		inEventQueue.add(() -> {
			right_button_clicked = true;
		});
		runCycle();
	}
	
	private boolean double_button_clicked;
	
	
	public void raiseDouble_button_clicked() {
		inEventQueue.add(() -> {
			double_button_clicked = true;
		});
		runCycle();
	}
	
	private boolean motion_detected;
	
	
	public void raiseMotion_detected() {
		inEventQueue.add(() -> {
			motion_detected = true;
		});
		runCycle();
	}
	
	private void effect_main_region_PasswordPrompt_tr0() {
		exitSequence_main_region_PasswordPrompt();
		enterSequence_main_region_Ride_default();
		react(0l);
	}
	
	/* Entry action for state 'Ride'. */
	private void entryAction_main_region_Ride() {
		/* Entry action for state 'Ride'. */
		operationCallback.disable_alarm_horn();
		operationCallback.disable_alarm_display();
		operationCallback.display_unlocked();
	}
	
	/* Entry action for state 'Secured'. */
	private void entryAction_main_region_Secured() {
		/* Entry action for state 'Secured'. */
		operationCallback.display_locked();
	}
	
	/* Entry action for state 'Alarm'. */
	private void entryAction_main_region_Alarm() {
		/* Entry action for state 'Alarm'. */
		operationCallback.activate_alarm_horn();
		operationCallback.activate_alarm_display();
	}
	
	/* 'default' enter sequence for state Ride */
	private void enterSequence_main_region_Ride_default() {
		/* 'default' enter sequence for state Ride */
		entryAction_main_region_Ride();
		stateVector[0] = State.MAIN_REGION_RIDE;
	}
	
	/* 'default' enter sequence for state Secured */
	private void enterSequence_main_region_Secured_default() {
		/* 'default' enter sequence for state Secured */
		entryAction_main_region_Secured();
		stateVector[0] = State.MAIN_REGION_SECURED;
	}
	
	/* 'default' enter sequence for state Alarm */
	private void enterSequence_main_region_Alarm_default() {
		/* 'default' enter sequence for state Alarm */
		entryAction_main_region_Alarm();
		stateVector[0] = State.MAIN_REGION_ALARM;
	}
	
	/* 'default' enter sequence for state PasswordPrompt */
	private void enterSequence_main_region_PasswordPrompt_default() {
		/* 'default' enter sequence for state PasswordPrompt */
		enterSequence_main_region_PasswordPrompt_r1_default();
	}
	
	/* 'default' enter sequence for state Ready */
	private void enterSequence_main_region_PasswordPrompt_r1_Ready_default() {
		/* 'default' enter sequence for state Ready */
		stateVector[0] = State.MAIN_REGION_PASSWORDPROMPT_R1_READY;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_main_region_PasswordPrompt_r1_default() {
		/* 'default' enter sequence for region r1 */
		react_main_region_PasswordPrompt_r1__entry_Default();
	}
	
	/* Default exit sequence for state Ride */
	private void exitSequence_main_region_Ride() {
		/* Default exit sequence for state Ride */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state Secured */
	private void exitSequence_main_region_Secured() {
		/* Default exit sequence for state Secured */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state Alarm */
	private void exitSequence_main_region_Alarm() {
		/* Default exit sequence for state Alarm */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state PasswordPrompt */
	private void exitSequence_main_region_PasswordPrompt() {
		/* Default exit sequence for state PasswordPrompt */
		exitSequence_main_region_PasswordPrompt_r1();
	}
	
	/* Default exit sequence for state Ready */
	private void exitSequence_main_region_PasswordPrompt_r1_Ready() {
		/* Default exit sequence for state Ready */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_RIDE:
			exitSequence_main_region_Ride();
			break;
		case MAIN_REGION_SECURED:
			exitSequence_main_region_Secured();
			break;
		case MAIN_REGION_ALARM:
			exitSequence_main_region_Alarm();
			break;
		case MAIN_REGION_PASSWORDPROMPT_R1_READY:
			exitSequence_main_region_PasswordPrompt_r1_Ready();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_main_region_PasswordPrompt_r1() {
		/* Default exit sequence for region r1 */
		switch (stateVector[0]) {
		case MAIN_REGION_PASSWORDPROMPT_R1_READY:
			exitSequence_main_region_PasswordPrompt_r1_Ready();
			break;
		default:
			break;
		}
	}
	
	/* The reactions of state null. */
	private void react_main_region_PasswordPrompt_r1__choice_0() {
		/* The reactions of state null. */
		if (operationCallback.verify_password(getPassword())) {
			setPassword(1l);
			react_main_region_PasswordPrompt_r1__exit_Default();
		} else {
			setPassword(1l);
			enterSequence_main_region_PasswordPrompt_r1_Ready_default();
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_Ride_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_PasswordPrompt_r1__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_PasswordPrompt_r1_Ready_default();
	}
	
	/* The reactions of exit default. */
	private void react_main_region_PasswordPrompt_r1__exit_Default() {
		/* The reactions of exit default. */
		effect_main_region_PasswordPrompt_tr0();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_Ride_react(long transitioned_before) {
		/* The reactions of state Ride. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (left_button_clicked) {
				exitSequence_main_region_Ride();
				enterSequence_main_region_Secured_default();
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
	
	private long main_region_Secured_react(long transitioned_before) {
		/* The reactions of state Secured. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (motion_detected) {
				exitSequence_main_region_Secured();
				enterSequence_main_region_Alarm_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (left_button_clicked) {
					exitSequence_main_region_Secured();
					operationCallback.new_password_input(1l);
					enterSequence_main_region_PasswordPrompt_default();
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
	
	private long main_region_Alarm_react(long transitioned_before) {
		/* The reactions of state Alarm. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (left_button_clicked) {
				exitSequence_main_region_Alarm();
				operationCallback.disable_alarm_display();
				operationCallback.new_password_input(1l);
				enterSequence_main_region_PasswordPrompt_default();
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
	
	private long main_region_PasswordPrompt_react(long transitioned_before) {
		/* The reactions of state PasswordPrompt. */
		long transitioned_after = transitioned_before;
		/* Always execute local reactions. */
		transitioned_after = react(transitioned_before);
		return transitioned_after;
	}
	
	private long main_region_PasswordPrompt_r1_Ready_react(long transitioned_before) {
		/* The reactions of state Ready. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (double_button_clicked) {
				exitSequence_main_region_PasswordPrompt_r1_Ready();
				react_main_region_PasswordPrompt_r1__choice_0();
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			if (left_button_clicked) {
				setPassword(getPassword() << 1l);
			}
			if (left_button_clicked) {
				operationCallback.new_password_input(getPassword());
			}
			if (right_button_clicked) {
				setPassword((((password << 1l)) | 1l));
			}
			if (right_button_clicked) {
				operationCallback.new_password_input(getPassword());
			}
			transitioned_after = main_region_PasswordPrompt_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	/* Can be used by the client code to trigger a run to completion step without raising an event. */
	public void triggerWithoutEvent() {
		runCycle();
	}
}