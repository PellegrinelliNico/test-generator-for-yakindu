/** Generated by itemis CREATE code generator. */
package machines;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleParallel implements IStatemachine, IEventDriven {
	public enum State {
		MAIN_REGION_BEGIN,
		MAIN_REGION_END,
		MAIN_REGION_ORTOGONALSTATE,
		MAIN_REGION_ORTOGONALSTATE_R1_STATEA1,
		MAIN_REGION_ORTOGONALSTATE_R1_STATEA2,
		MAIN_REGION_ORTOGONALSTATE_R2_STATEB1,
		MAIN_REGION_ORTOGONALSTATE_R2_STATEB2,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[2];
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	private long stateConfVectorPosition;
	
	protected long getStateConfVectorPosition() {
		return stateConfVectorPosition;
	}
	
	protected void setStateConfVectorPosition(long value) {
		this.stateConfVectorPosition = value;
	}
	public SimpleParallel() {
		for (int i = 0; i < 2; i++) {
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
		/* Default enter sequence for statechart SimpleParallel */
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
		/* Default exit sequence for statechart SimpleParallel */
		exitSequence_main_region();
		isExecuting = false;
	}
	
	/**
	 * @see IStatemachine#isActive()
	 */
	public boolean isActive() {
		return stateVector[0] != State.$NULLSTATE$||stateVector[1] != State.$NULLSTATE$;
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
		ev0 = false;
		eva = false;
		evb = false;
	}
	
	private void microStep() {
		long transitioned = -1l;
		stateConfVectorPosition = 0l;
		switch (stateVector[0]) {
		case MAIN_REGION_BEGIN:
			transitioned = main_region_Begin_react(transitioned);
			break;
		case MAIN_REGION_END:
			transitioned = main_region_End_react(transitioned);
			break;
		case MAIN_REGION_ORTOGONALSTATE_R1_STATEA1:
			transitioned = main_region_OrtogonalState_r1_StateA1_react(transitioned);
			break;
		case MAIN_REGION_ORTOGONALSTATE_R1_STATEA2:
			transitioned = main_region_OrtogonalState_r1_StateA2_react(transitioned);
			break;
		default:
			break;
		}
		if (getStateConfVectorPosition()<1l) {
			switch (stateVector[1]) {
			case MAIN_REGION_ORTOGONALSTATE_R2_STATEB1:
				main_region_OrtogonalState_r2_StateB1_react(transitioned);
				break;
			case MAIN_REGION_ORTOGONALSTATE_R2_STATEB2:
				main_region_OrtogonalState_r2_StateB2_react(transitioned);
				break;
			default:
				break;
			}
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
		case MAIN_REGION_BEGIN:
			return stateVector[0] == State.MAIN_REGION_BEGIN;
		case MAIN_REGION_END:
			return stateVector[0] == State.MAIN_REGION_END;
		case MAIN_REGION_ORTOGONALSTATE:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_ORTOGONALSTATE.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_ORTOGONALSTATE_R2_STATEB2.ordinal();
		case MAIN_REGION_ORTOGONALSTATE_R1_STATEA1:
			return stateVector[0] == State.MAIN_REGION_ORTOGONALSTATE_R1_STATEA1;
		case MAIN_REGION_ORTOGONALSTATE_R1_STATEA2:
			return stateVector[0] == State.MAIN_REGION_ORTOGONALSTATE_R1_STATEA2;
		case MAIN_REGION_ORTOGONALSTATE_R2_STATEB1:
			return stateVector[1] == State.MAIN_REGION_ORTOGONALSTATE_R2_STATEB1;
		case MAIN_REGION_ORTOGONALSTATE_R2_STATEB2:
			return stateVector[1] == State.MAIN_REGION_ORTOGONALSTATE_R2_STATEB2;
		default:
			return false;
		}
	}
	
	
	private boolean ev0;
	
	
	public void raiseEv0() {
		inEventQueue.add(() -> {
			ev0 = true;
		});
		runCycle();
	}
	
	private boolean eva;
	
	
	public void raiseEva() {
		inEventQueue.add(() -> {
			eva = true;
		});
		runCycle();
	}
	
	private boolean evb;
	
	
	public void raiseEvb() {
		inEventQueue.add(() -> {
			evb = true;
		});
		runCycle();
	}
	
	/* 'default' enter sequence for state Begin */
	private void enterSequence_main_region_Begin_default() {
		/* 'default' enter sequence for state Begin */
		stateVector[0] = State.MAIN_REGION_BEGIN;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state End */
	private void enterSequence_main_region_End_default() {
		/* 'default' enter sequence for state End */
		stateVector[0] = State.MAIN_REGION_END;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state StateA1 */
	private void enterSequence_main_region_OrtogonalState_r1_StateA1_default() {
		/* 'default' enter sequence for state StateA1 */
		stateVector[0] = State.MAIN_REGION_ORTOGONALSTATE_R1_STATEA1;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state StateA2 */
	private void enterSequence_main_region_OrtogonalState_r1_StateA2_default() {
		/* 'default' enter sequence for state StateA2 */
		stateVector[0] = State.MAIN_REGION_ORTOGONALSTATE_R1_STATEA2;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state StateB1 */
	private void enterSequence_main_region_OrtogonalState_r2_StateB1_default() {
		/* 'default' enter sequence for state StateB1 */
		stateVector[1] = State.MAIN_REGION_ORTOGONALSTATE_R2_STATEB1;
		stateConfVectorPosition = 1;
	}
	
	/* 'default' enter sequence for state StateB2 */
	private void enterSequence_main_region_OrtogonalState_r2_StateB2_default() {
		/* 'default' enter sequence for state StateB2 */
		stateVector[1] = State.MAIN_REGION_ORTOGONALSTATE_R2_STATEB2;
		stateConfVectorPosition = 1;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state Begin */
	private void exitSequence_main_region_Begin() {
		/* Default exit sequence for state Begin */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state End */
	private void exitSequence_main_region_End() {
		/* Default exit sequence for state End */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state OrtogonalState */
	private void exitSequence_main_region_OrtogonalState() {
		/* Default exit sequence for state OrtogonalState */
		exitSequence_main_region_OrtogonalState_r1();
		exitSequence_main_region_OrtogonalState_r2();
	}
	
	/* Default exit sequence for state StateA1 */
	private void exitSequence_main_region_OrtogonalState_r1_StateA1() {
		/* Default exit sequence for state StateA1 */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state StateA2 */
	private void exitSequence_main_region_OrtogonalState_r1_StateA2() {
		/* Default exit sequence for state StateA2 */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state StateB1 */
	private void exitSequence_main_region_OrtogonalState_r2_StateB1() {
		/* Default exit sequence for state StateB1 */
		stateVector[1] = State.$NULLSTATE$;
		stateConfVectorPosition = 1;
	}
	
	/* Default exit sequence for state StateB2 */
	private void exitSequence_main_region_OrtogonalState_r2_StateB2() {
		/* Default exit sequence for state StateB2 */
		stateVector[1] = State.$NULLSTATE$;
		stateConfVectorPosition = 1;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_BEGIN:
			exitSequence_main_region_Begin();
			break;
		case MAIN_REGION_END:
			exitSequence_main_region_End();
			break;
		case MAIN_REGION_ORTOGONALSTATE_R1_STATEA1:
			exitSequence_main_region_OrtogonalState_r1_StateA1();
			break;
		case MAIN_REGION_ORTOGONALSTATE_R1_STATEA2:
			exitSequence_main_region_OrtogonalState_r1_StateA2();
			break;
		default:
			break;
		}
		switch (stateVector[1]) {
		case MAIN_REGION_ORTOGONALSTATE_R2_STATEB1:
			exitSequence_main_region_OrtogonalState_r2_StateB1();
			break;
		case MAIN_REGION_ORTOGONALSTATE_R2_STATEB2:
			exitSequence_main_region_OrtogonalState_r2_StateB2();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_main_region_OrtogonalState_r1() {
		/* Default exit sequence for region r1 */
		switch (stateVector[0]) {
		case MAIN_REGION_ORTOGONALSTATE_R1_STATEA1:
			exitSequence_main_region_OrtogonalState_r1_StateA1();
			break;
		case MAIN_REGION_ORTOGONALSTATE_R1_STATEA2:
			exitSequence_main_region_OrtogonalState_r1_StateA2();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_main_region_OrtogonalState_r2() {
		/* Default exit sequence for region r2 */
		switch (stateVector[1]) {
		case MAIN_REGION_ORTOGONALSTATE_R2_STATEB1:
			exitSequence_main_region_OrtogonalState_r2_StateB1();
			break;
		case MAIN_REGION_ORTOGONALSTATE_R2_STATEB2:
			exitSequence_main_region_OrtogonalState_r2_StateB2();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_Begin_default();
	}
	
	/* The reactions of state null. */
	private void react_main_region__sync0() {
		/* The reactions of state null. */
		enterSequence_main_region_OrtogonalState_r1_StateA1_default();
		enterSequence_main_region_OrtogonalState_r2_StateB1_default();
	}
	
	/* The reactions of state null. */
	private void react_main_region__sync1() {
		/* The reactions of state null. */
		enterSequence_main_region_End_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before
		;
	}
	
	private long main_region_Begin_react(long transitioned_before) {
		/* The reactions of state Begin. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (ev0) {
				exitSequence_main_region_Begin();
				react_main_region__sync0();
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
	
	private long main_region_End_react(long transitioned_before) {
		/* The reactions of state End. */
		long transitioned_after = transitioned_before;
		/* If no transition was taken then execute local reactions */
		transitioned_after = react(transitioned_before);
		return transitioned_after
		;
	}
	
	private long main_region_OrtogonalState_react(long transitioned_before) {
		/* The reactions of state OrtogonalState. */
		long transitioned_after = transitioned_before;
		/* If no transition was taken then execute local reactions */
		transitioned_after = react(transitioned_before);
		return transitioned_after
		;
	}
	
	private long main_region_OrtogonalState_r1_StateA1_react(long transitioned_before) {
		/* The reactions of state StateA1. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (eva) {
				exitSequence_main_region_OrtogonalState_r1_StateA1();
				enterSequence_main_region_OrtogonalState_r1_StateA2_default();
				transitioned_after = 0l;
			}
		}
		return transitioned_after
		;
	}
	
	private long main_region_OrtogonalState_r1_StateA2_react(long transitioned_before) {
		/* The reactions of state StateA2. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if ((isStateActive(State.MAIN_REGION_ORTOGONALSTATE_R2_STATEB2) && evb)) {
				exitSequence_main_region_OrtogonalState();
				react_main_region__sync1();
				transitioned_after = 0l;
			}
		}
		return transitioned_after
		;
	}
	
	private long main_region_OrtogonalState_r2_StateB1_react(long transitioned_before) {
		/* The reactions of state StateB1. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<1l) {
			if (evb) {
				exitSequence_main_region_OrtogonalState_r2_StateB1();
				enterSequence_main_region_OrtogonalState_r2_StateB2_default();
				main_region_OrtogonalState_react(0l);
				transitioned_after = 1l;
			}
		}
		if (transitioned_after==transitioned_before) {
			/* If no transition was taken then execute local reactions */
			transitioned_after = main_region_OrtogonalState_react(transitioned_before);
		}
		return transitioned_after
		;
	}
	
	private long main_region_OrtogonalState_r2_StateB2_react(long transitioned_before) {
		/* The reactions of state StateB2. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<1l) {
			if ((evb && isStateActive(State.MAIN_REGION_ORTOGONALSTATE_R1_STATEA2))) {
				exitSequence_main_region_OrtogonalState();
				react_main_region__sync1();
				transitioned_after = 1l;
			}
		}
		if (transitioned_after==transitioned_before) {
			/* If no transition was taken then execute local reactions */
			transitioned_after = main_region_OrtogonalState_react(transitioned_before);
		}
		return transitioned_after
		;
	}
	
	/* Can be used by the client code to trigger a run to completion step without raising an event. */
	public void triggerWithoutEvent() {
		runCycle();
	}
}
