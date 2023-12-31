/** Generated by itemis CREATE code generator. */
package machines;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleCompositeState implements IStatemachine, IEventDriven {
	public enum State {
		MAIN_REGION_STATEB,
		MAIN_REGION_STATEB_R1_STATEB1,
		MAIN_REGION_STATEB_R1_STATEB2,
		MAIN_REGION_STATEA,
		MAIN_REGION_STATEC,
		MAIN_REGION__FINAL_,
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
	public SimpleCompositeState() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		
		isExecuting = false;
	}
	
	public void enter() {
		/* Activates the state machine. */
		
		if (getIsExecuting()) {
			return
			;
		}
		isExecuting = true;
		/* Default enter sequence for statechart SimpleCompositeState */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return
			;
		}
		isExecuting = true;
		/* Default exit sequence for statechart SimpleCompositeState */
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
	* @see IStatemachine#isFinal()
	*/
	public boolean isFinal() {
		return (stateVector[0] == State.MAIN_REGION__FINAL_);
	}
	private void clearInEvents() {
		ev1 = false;
		ev2 = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_STATEB_R1_STATEB1:
			main_region_StateB_r1_StateB1_react(-1l);
			break;
		case MAIN_REGION_STATEB_R1_STATEB2:
			main_region_StateB_r1_StateB2_react(-1l);
			break;
		case MAIN_REGION_STATEA:
			main_region_StateA_react(-1l);
			break;
		case MAIN_REGION_STATEC:
			main_region_StateC_react(-1l);
			break;
		case MAIN_REGION__FINAL_:
			main_region__final__react(-1l);
			break;
		default:
			break;
		}
	}
	
	private void runCycle() {
		/* Performs a 'run to completion' step. */
		
		if (getIsExecuting()) {
			return
			;
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
		case MAIN_REGION_STATEB:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_STATEB.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_STATEB_R1_STATEB2.ordinal();
		case MAIN_REGION_STATEB_R1_STATEB1:
			return stateVector[0] == State.MAIN_REGION_STATEB_R1_STATEB1;
		case MAIN_REGION_STATEB_R1_STATEB2:
			return stateVector[0] == State.MAIN_REGION_STATEB_R1_STATEB2;
		case MAIN_REGION_STATEA:
			return stateVector[0] == State.MAIN_REGION_STATEA;
		case MAIN_REGION_STATEC:
			return stateVector[0] == State.MAIN_REGION_STATEC;
		case MAIN_REGION__FINAL_:
			return stateVector[0] == State.MAIN_REGION__FINAL_;
		default:
			return false;
		}
	}
	
	
	private boolean ev1;
	
	
	public void raiseEv1() {
		inEventQueue.add(() -> {
			ev1 = true;
		});
		runCycle();
	}
	
	private boolean ev2;
	
	
	public void raiseEv2() {
		inEventQueue.add(() -> {
			ev2 = true;
		});
		runCycle();
	}
	
	private void effect_main_region_StateB_tr0() {
		exitSequence_main_region_StateB();
		enterSequence_main_region__final__default();
	}
	
	/* 'alt_entry' enter sequence for state StateB */
	private void enterSequence_main_region_StateB_alt_entry() {
		/* 'alt_entry' enter sequence for state StateB */
		enterSequence_main_region_StateB_r1_alt_entry();
	}
	
	/* 'default' enter sequence for state StateB */
	private void enterSequence_main_region_StateB_default() {
		/* 'default' enter sequence for state StateB */
		enterSequence_main_region_StateB_r1_default();
	}
	
	/* 'default' enter sequence for state StateB1 */
	private void enterSequence_main_region_StateB_r1_StateB1_default() {
		/* 'default' enter sequence for state StateB1 */
		stateVector[0] = State.MAIN_REGION_STATEB_R1_STATEB1;
	}
	
	/* 'default' enter sequence for state StateB2 */
	private void enterSequence_main_region_StateB_r1_StateB2_default() {
		/* 'default' enter sequence for state StateB2 */
		stateVector[0] = State.MAIN_REGION_STATEB_R1_STATEB2;
	}
	
	/* 'default' enter sequence for state StateA */
	private void enterSequence_main_region_StateA_default() {
		/* 'default' enter sequence for state StateA */
		stateVector[0] = State.MAIN_REGION_STATEA;
	}
	
	/* 'default' enter sequence for state StateC */
	private void enterSequence_main_region_StateC_default() {
		/* 'default' enter sequence for state StateC */
		stateVector[0] = State.MAIN_REGION_STATEC;
	}
	
	/* Default enter sequence for final state */
	private void enterSequence_main_region__final__default() {
		/* Default enter sequence for final state */
		stateVector[0] = State.MAIN_REGION__FINAL_;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_main_region_StateB_r1_default() {
		/* 'default' enter sequence for region r1 */
		react_main_region_StateB_r1__entry_Default();
	}
	
	/* 'alt_entry' enter sequence for region r1 */
	private void enterSequence_main_region_StateB_r1_alt_entry() {
		/* 'alt_entry' enter sequence for region r1 */
		react_main_region_StateB_r1_alt_entry();
	}
	
	/* Default exit sequence for state StateB */
	private void exitSequence_main_region_StateB() {
		/* Default exit sequence for state StateB */
		exitSequence_main_region_StateB_r1();
	}
	
	/* Default exit sequence for state StateB1 */
	private void exitSequence_main_region_StateB_r1_StateB1() {
		/* Default exit sequence for state StateB1 */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state StateB2 */
	private void exitSequence_main_region_StateB_r1_StateB2() {
		/* Default exit sequence for state StateB2 */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state StateA */
	private void exitSequence_main_region_StateA() {
		/* Default exit sequence for state StateA */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state StateC */
	private void exitSequence_main_region_StateC() {
		/* Default exit sequence for state StateC */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for final state. */
	private void exitSequence_main_region__final_() {
		/* Default exit sequence for final state. */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_STATEB_R1_STATEB1:
			exitSequence_main_region_StateB_r1_StateB1();
			break;
		case MAIN_REGION_STATEB_R1_STATEB2:
			exitSequence_main_region_StateB_r1_StateB2();
			break;
		case MAIN_REGION_STATEA:
			exitSequence_main_region_StateA();
			break;
		case MAIN_REGION_STATEC:
			exitSequence_main_region_StateC();
			break;
		case MAIN_REGION__FINAL_:
			exitSequence_main_region__final_();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_main_region_StateB_r1() {
		/* Default exit sequence for region r1 */
		switch (stateVector[0]) {
		case MAIN_REGION_STATEB_R1_STATEB1:
			exitSequence_main_region_StateB_r1_StateB1();
			break;
		case MAIN_REGION_STATEB_R1_STATEB2:
			exitSequence_main_region_StateB_r1_StateB2();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_StateA_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_StateB_r1__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_StateB_r1_StateB1_default();
	}
	
	/* Default react sequence for initial entry alt_entry */
	private void react_main_region_StateB_r1_alt_entry() {
		/* Default react sequence for initial entry alt_entry */
		enterSequence_main_region_StateB_r1_StateB2_default();
	}
	
	/* The reactions of exit default. */
	private void react_main_region_StateB_r1__exit_Default() {
		/* The reactions of exit default. */
		effect_main_region_StateB_tr0();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before
		;
	}
	
	private long main_region_StateB_react(long transitioned_before) {
		/* The reactions of state StateB. */
		long transitioned_after = transitioned_before;
		/* If no transition was taken then execute local reactions */
		transitioned_after = react(transitioned_before);
		return transitioned_after
		;
	}
	
	private long main_region_StateB_r1_StateB1_react(long transitioned_before) {
		/* The reactions of state StateB1. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (ev1) {
				exitSequence_main_region_StateB_r1_StateB1();
				react_main_region_StateB_r1__exit_Default();
				transitioned_after = 0l;
			}
		}
		if (transitioned_after==transitioned_before) {
			/* If no transition was taken then execute local reactions */
			transitioned_after = main_region_StateB_react(transitioned_before);
		}
		return transitioned_after
		;
	}
	
	private long main_region_StateB_r1_StateB2_react(long transitioned_before) {
		/* The reactions of state StateB2. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (ev2) {
				exitSequence_main_region_StateB();
				enterSequence_main_region_StateC_default();
				react(0l);
				transitioned_after = 0l;
			}
		}
		if (transitioned_after==transitioned_before) {
			/* If no transition was taken then execute local reactions */
			transitioned_after = main_region_StateB_react(transitioned_before);
		}
		return transitioned_after
		;
	}
	
	private long main_region_StateA_react(long transitioned_before) {
		/* The reactions of state StateA. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (ev1) {
				exitSequence_main_region_StateA();
				enterSequence_main_region_StateB_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (ev2) {
					exitSequence_main_region_StateA();
					enterSequence_main_region_StateB_alt_entry();
					react(0l);
					transitioned_after = 0l;
				}
			}
		}
		if (transitioned_after==transitioned_before) {
			/* If no transition was taken then execute local reactions */
			transitioned_after = react(transitioned_before);
		}
		return transitioned_after
		;
	}
	
	private long main_region_StateC_react(long transitioned_before) {
		/* The reactions of state StateC. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (ev2) {
				exitSequence_main_region_StateC();
				enterSequence_main_region__final__default();
				transitioned_after = 0l;
			}
		}
		if (transitioned_after==transitioned_before) {
			/* If no transition was taken then execute local reactions */
			transitioned_after = react(transitioned_before);
		}
		return transitioned_after
		;
	}
	
	private long main_region__final__react(long transitioned_before) {
		/* The reactions of state null. */
		return react(transitioned_before)
		;
	}
	
	/* Can be used by the client code to trigger a run to completion step without raising an event. */
	public void triggerWithoutEvent() {
		runCycle();
	}
}
