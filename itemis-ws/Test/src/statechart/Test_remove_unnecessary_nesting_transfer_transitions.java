/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import java.util.LinkedList;
import java.util.Queue;

public class Test_remove_unnecessary_nesting_transfer_transitions implements IEventDriven {
	public enum State {
		MAIN_REGION_C,
		MAIN_REGION_C_D_B,
		MAIN_REGION_A,
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
	public Test_remove_unnecessary_nesting_transfer_transitions() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		
		isExecuting = false;
	}
	
	public void enter() {
		/* Activates the state machine. */
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default enter sequence for statechart test_remove_unnecessary_nesting_transfer_transitions */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart test_remove_unnecessary_nesting_transfer_transitions */
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
		operate = false;
		hello = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_C_D_B:
			main_region_C_D_B_react(-1l);
			break;
		case MAIN_REGION_A:
			main_region_A_react(-1l);
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
		case MAIN_REGION_C:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_C.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_C_D_B.ordinal();
		case MAIN_REGION_C_D_B:
			return stateVector[0] == State.MAIN_REGION_C_D_B;
		case MAIN_REGION_A:
			return stateVector[0] == State.MAIN_REGION_A;
		default:
			return false;
		}
	}
	
	
	private boolean operate;
	
	
	public void raiseOperate() {
		inEventQueue.add(() -> {
			operate = true;
		});
		runCycle();
	}
	
	private boolean hello;
	
	
	public void raiseHello() {
		inEventQueue.add(() -> {
			hello = true;
		});
		runCycle();
	}
	
	/* Entry action for state 'C'. */
	private void entryAction_main_region_C() {
		/* Entry action for state 'C'. */
		raiseHello();
	}
	
	/* Exit action for state 'B'. */
	private void exitAction_main_region_C_D_B() {
		/* Exit action for state 'B'. */
		raiseOperate();
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_main_region_C_default() {
		/* 'default' enter sequence for state C */
		entryAction_main_region_C();
		enterSequence_main_region_C_D_default();
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_main_region_C_D_B_default() {
		/* 'default' enter sequence for state B */
		stateVector[0] = State.MAIN_REGION_C_D_B;
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_A_default() {
		/* 'default' enter sequence for state A */
		stateVector[0] = State.MAIN_REGION_A;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region D */
	private void enterSequence_main_region_C_D_default() {
		/* 'default' enter sequence for region D */
		react_main_region_C_D__entry_Default();
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_main_region_C() {
		/* Default exit sequence for state C */
		exitSequence_main_region_C_D();
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_main_region_C_D_B() {
		/* Default exit sequence for state B */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_C_D_B();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_A() {
		/* Default exit sequence for state A */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_C_D_B:
			exitSequence_main_region_C_D_B();
			break;
		case MAIN_REGION_A:
			exitSequence_main_region_A();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region D */
	private void exitSequence_main_region_C_D() {
		/* Default exit sequence for region D */
		switch (stateVector[0]) {
		case MAIN_REGION_C_D_B:
			exitSequence_main_region_C_D_B();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_A_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_C_D__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_C_D_B_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_C_react(long transitioned_before) {
		/* The reactions of state C. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (operate) {
				exitSequence_main_region_C();
				enterSequence_main_region_A_default();
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
	
	private long main_region_C_D_B_react(long transitioned_before) {
		/* The reactions of state B. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (hello) {
				exitSequence_main_region_C();
				enterSequence_main_region_A_default();
				react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_C_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_A_react(long transitioned_before) {
		/* The reactions of state A. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (operate) {
				exitSequence_main_region_A();
				enterSequence_main_region_C_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (hello) {
					exitSequence_main_region_A();
					entryAction_main_region_C();
					enterSequence_main_region_C_D_B_default();
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
	
	/* Can be used by the client code to trigger a run to completion step without raising an event. */
	public void triggerWithoutEvent() {
		runCycle();
	}
}
