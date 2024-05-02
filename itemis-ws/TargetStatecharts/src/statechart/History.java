/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.ICycleBased;
import com.yakindu.core.IStatemachine;

public class History implements ICycleBased {
	private static class EvBuf {
		private boolean next;
		private boolean start;
		private boolean pause;
		private boolean shallow_continue;
		private boolean deep_continue;
	}
	private static class HistoryEvBuf {
		private EvBuf iface = new EvBuf();
	}
	public enum State {
		MAIN_REGION_ANSWERING_QUESTIONS,
		MAIN_REGION_ANSWERING_QUESTIONS_R1_Q1,
		MAIN_REGION_ANSWERING_QUESTIONS_R1_Q3,
		MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2,
		MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2A,
		MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B,
		MAIN_REGION_INIT,
		MAIN_REGION__FINAL_,
		$NULLSTATE$
	};
	
	private State[] historyVector = new State[2];
	private final State[] stateVector = new State[1];
	
	private HistoryEvBuf current = new HistoryEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	private boolean stateConfVectorChanged;
	
	protected boolean getStateConfVectorChanged() {
		return stateConfVectorChanged;
	}
	
	protected void setStateConfVectorChanged(boolean value) {
		this.stateConfVectorChanged = value;
	}
	public History() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		for (int i = 0; i < 2; i++) {
			historyVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		
		isExecuting = false;
	}
	
	public void runCycle() {
		/* Performs a 'run to completion' step. */
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		swapInEvents();
		do { 
			stateConfVectorChanged = false;
			microStep();
		} while (getStateConfVectorChanged());
		isExecuting = false;
	}
	
	public void enter() {
		/* Activates the state machine. */
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default enter sequence for statechart History */
		enterSequence_main_region_default();
		do { 
			stateConfVectorChanged = false;
			microStep();
		} while (getStateConfVectorChanged());
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart History */
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
	private void swapInEvents() {
		current.iface.next = next;
		next = false;
		current.iface.start = start;
		start = false;
		current.iface.pause = pause;
		pause = false;
		current.iface.shallow_continue = shallow_continue;
		shallow_continue = false;
		current.iface.deep_continue = deep_continue;
		deep_continue = false;
	}
	
	private void clearInEvents() {
		next = false;
		start = false;
		pause = false;
		shallow_continue = false;
		deep_continue = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q1:
			main_region_Answering_Questions_r1_q1_react(-1l);
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q3:
			main_region_Answering_Questions_r1_q3_react(-1l);
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2A:
			main_region_Answering_Questions_r1_q2_r2_q2a_react(-1l);
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B:
			main_region_Answering_Questions_r1_q2_r2_q2b_react(-1l);
			break;
		case MAIN_REGION_INIT:
			main_region_init_react(-1l);
			break;
		case MAIN_REGION__FINAL_:
			main_region__final__react(-1l);
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
		case MAIN_REGION_ANSWERING_QUESTIONS:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_ANSWERING_QUESTIONS.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B.ordinal();
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q1:
			return stateVector[0] == State.MAIN_REGION_ANSWERING_QUESTIONS_R1_Q1;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q3:
			return stateVector[0] == State.MAIN_REGION_ANSWERING_QUESTIONS_R1_Q3;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B.ordinal();
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2A:
			return stateVector[0] == State.MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2A;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B:
			return stateVector[0] == State.MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B;
		case MAIN_REGION_INIT:
			return stateVector[0] == State.MAIN_REGION_INIT;
		case MAIN_REGION__FINAL_:
			return stateVector[0] == State.MAIN_REGION__FINAL_;
		default:
			return false;
		}
	}
	
	
	private boolean next;
	
	
	public void raiseNext() {
		next = true;
	}
	
	private boolean start;
	
	
	public void raiseStart() {
		start = true;
	}
	
	private boolean pause;
	
	
	public void raisePause() {
		pause = true;
	}
	
	private boolean shallow_continue;
	
	
	public void raiseShallow_continue() {
		shallow_continue = true;
	}
	
	private boolean deep_continue;
	
	
	public void raiseDeep_continue() {
		deep_continue = true;
	}
	
	/* 'default' enter sequence for state Answering Questions */
	private void enterSequence_main_region_Answering_Questions_default() {
		/* 'default' enter sequence for state Answering Questions */
		enterSequence_main_region_Answering_Questions_r1_default();
	}
	
	/* 'default' enter sequence for state q1 */
	private void enterSequence_main_region_Answering_Questions_r1_q1_default() {
		/* 'default' enter sequence for state q1 */
		stateVector[0] = State.MAIN_REGION_ANSWERING_QUESTIONS_R1_Q1;
		stateConfVectorChanged = true;
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state q3 */
	private void enterSequence_main_region_Answering_Questions_r1_q3_default() {
		/* 'default' enter sequence for state q3 */
		stateVector[0] = State.MAIN_REGION_ANSWERING_QUESTIONS_R1_Q3;
		stateConfVectorChanged = true;
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state q2 */
	private void enterSequence_main_region_Answering_Questions_r1_q2_default() {
		/* 'default' enter sequence for state q2 */
		enterSequence_main_region_Answering_Questions_r1_q2_r2_default();
		historyVector[0] = stateVector[0];
	}
	
	/* 'default' enter sequence for state q2a */
	private void enterSequence_main_region_Answering_Questions_r1_q2_r2_q2a_default() {
		/* 'default' enter sequence for state q2a */
		stateVector[0] = State.MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2A;
		stateConfVectorChanged = true;
		historyVector[1] = stateVector[0];
	}
	
	/* 'default' enter sequence for state q2b */
	private void enterSequence_main_region_Answering_Questions_r1_q2_r2_q2b_default() {
		/* 'default' enter sequence for state q2b */
		stateVector[0] = State.MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B;
		stateConfVectorChanged = true;
		historyVector[1] = stateVector[0];
	}
	
	/* 'default' enter sequence for state init */
	private void enterSequence_main_region_init_default() {
		/* 'default' enter sequence for state init */
		stateVector[0] = State.MAIN_REGION_INIT;
		stateConfVectorChanged = true;
	}
	
	/* Default enter sequence for final state */
	private void enterSequence_main_region__final__default() {
		/* Default enter sequence for final state */
		stateVector[0] = State.MAIN_REGION__FINAL_;
		stateConfVectorChanged = true;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_main_region_Answering_Questions_r1_default() {
		/* 'default' enter sequence for region r1 */
		react_main_region_Answering_Questions_r1__entry_Default();
	}
	
	/* deep enterSequence with history in child r1 */
	private void deepEnterSequence_main_region_Answering_Questions_r1() {
		/* deep enterSequence with history in child r1 */
		switch (historyVector[0]) {
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q1:
			/* enterSequence with history in child q1 for leaf q1 */
			enterSequence_main_region_Answering_Questions_r1_q1_default();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q3:
			/* enterSequence with history in child q3 for leaf q3 */
			enterSequence_main_region_Answering_Questions_r1_q3_default();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2A:
			/* enterSequence with history in child q2 for leaf q2a */
			deepEnterSequence_main_region_Answering_Questions_r1_q2_r2();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B:
			/* enterSequence with history in child q2 for leaf q2b */
			deepEnterSequence_main_region_Answering_Questions_r1_q2_r2();
			break;
		default:
			break;
		}
	}
	
	/* shallow enterSequence with history in child r1 */
	private void shallowEnterSequence_main_region_Answering_Questions_r1() {
		/* shallow enterSequence with history in child r1 */
		switch (historyVector[0]) {
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q1:
			enterSequence_main_region_Answering_Questions_r1_q1_default();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q3:
			enterSequence_main_region_Answering_Questions_r1_q3_default();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2A:
			enterSequence_main_region_Answering_Questions_r1_q2_default();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B:
			enterSequence_main_region_Answering_Questions_r1_q2_default();
			break;
		default:
			break;
		}
	}
	
	/* 'default' enter sequence for region r2 */
	private void enterSequence_main_region_Answering_Questions_r1_q2_r2_default() {
		/* 'default' enter sequence for region r2 */
		react_main_region_Answering_Questions_r1_q2_r2__entry_Default();
	}
	
	/* deep enterSequence with history in child r2 */
	private void deepEnterSequence_main_region_Answering_Questions_r1_q2_r2() {
		/* deep enterSequence with history in child r2 */
		switch (historyVector[1]) {
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2A:
			/* enterSequence with history in child q2a for leaf q2a */
			enterSequence_main_region_Answering_Questions_r1_q2_r2_q2a_default();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B:
			/* enterSequence with history in child q2b for leaf q2b */
			enterSequence_main_region_Answering_Questions_r1_q2_r2_q2b_default();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for state Answering Questions */
	private void exitSequence_main_region_Answering_Questions() {
		/* Default exit sequence for state Answering Questions */
		exitSequence_main_region_Answering_Questions_r1();
	}
	
	/* Default exit sequence for state q1 */
	private void exitSequence_main_region_Answering_Questions_r1_q1() {
		/* Default exit sequence for state q1 */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state q3 */
	private void exitSequence_main_region_Answering_Questions_r1_q3() {
		/* Default exit sequence for state q3 */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state q2 */
	private void exitSequence_main_region_Answering_Questions_r1_q2() {
		/* Default exit sequence for state q2 */
		exitSequence_main_region_Answering_Questions_r1_q2_r2();
	}
	
	/* Default exit sequence for state q2a */
	private void exitSequence_main_region_Answering_Questions_r1_q2_r2_q2a() {
		/* Default exit sequence for state q2a */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state q2b */
	private void exitSequence_main_region_Answering_Questions_r1_q2_r2_q2b() {
		/* Default exit sequence for state q2b */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state init */
	private void exitSequence_main_region_init() {
		/* Default exit sequence for state init */
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
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q1:
			exitSequence_main_region_Answering_Questions_r1_q1();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q3:
			exitSequence_main_region_Answering_Questions_r1_q3();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2A:
			exitSequence_main_region_Answering_Questions_r1_q2_r2_q2a();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B:
			exitSequence_main_region_Answering_Questions_r1_q2_r2_q2b();
			break;
		case MAIN_REGION_INIT:
			exitSequence_main_region_init();
			break;
		case MAIN_REGION__FINAL_:
			exitSequence_main_region__final_();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_main_region_Answering_Questions_r1() {
		/* Default exit sequence for region r1 */
		switch (stateVector[0]) {
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q1:
			exitSequence_main_region_Answering_Questions_r1_q1();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q3:
			exitSequence_main_region_Answering_Questions_r1_q3();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2A:
			exitSequence_main_region_Answering_Questions_r1_q2_r2_q2a();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B:
			exitSequence_main_region_Answering_Questions_r1_q2_r2_q2b();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r2 */
	private void exitSequence_main_region_Answering_Questions_r1_q2_r2() {
		/* Default exit sequence for region r2 */
		switch (stateVector[0]) {
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2A:
			exitSequence_main_region_Answering_Questions_r1_q2_r2_q2a();
			break;
		case MAIN_REGION_ANSWERING_QUESTIONS_R1_Q2_R2_Q2B:
			exitSequence_main_region_Answering_Questions_r1_q2_r2_q2b();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_init_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_Answering_Questions_r1_q2_r2__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_Answering_Questions_r1_q2_r2_q2a_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_Answering_Questions_r1__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_Answering_Questions_r1_q1_default();
	}
	
	/* Default react sequence for shallow history entry shallow */
	private void react_main_region_Answering_Questions_r1_shallow() {
		/* Default react sequence for shallow history entry shallow */
		/* Enter the region with shallow history */
		if (historyVector[0] != State.$NULLSTATE$) {
			shallowEnterSequence_main_region_Answering_Questions_r1();
		} else {
			enterSequence_main_region_Answering_Questions_r1_q1_default();
		}
	}
	
	/* Default react sequence for deep history entry deep */
	private void react_main_region_Answering_Questions_r1_deep() {
		/* Default react sequence for deep history entry deep */
		/* Enter the region with deep history */
		if (historyVector[0] != State.$NULLSTATE$) {
			deepEnterSequence_main_region_Answering_Questions_r1();
		} else {
			enterSequence_main_region_Answering_Questions_r1_q1_default();
		}
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_Answering_Questions_react(long transitioned_before) {
		/* The reactions of state Answering Questions. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.iface.pause) {
				exitSequence_main_region_Answering_Questions();
				enterSequence_main_region_init_default();
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
	
	private long main_region_Answering_Questions_r1_q1_react(long transitioned_before) {
		/* The reactions of state q1. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.iface.next) {
				exitSequence_main_region_Answering_Questions_r1_q1();
				enterSequence_main_region_Answering_Questions_r1_q2_default();
				main_region_Answering_Questions_react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_Answering_Questions_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_Answering_Questions_r1_q3_react(long transitioned_before) {
		/* The reactions of state q3. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.iface.next) {
				exitSequence_main_region_Answering_Questions();
				enterSequence_main_region__final__default();
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_Answering_Questions_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_Answering_Questions_r1_q2_react(long transitioned_before) {
		/* The reactions of state q2. */
		long transitioned_after = transitioned_before;
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_Answering_Questions_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_Answering_Questions_r1_q2_r2_q2a_react(long transitioned_before) {
		/* The reactions of state q2a. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.iface.next) {
				exitSequence_main_region_Answering_Questions_r1_q2_r2_q2a();
				enterSequence_main_region_Answering_Questions_r1_q2_r2_q2b_default();
				main_region_Answering_Questions_r1_q2_react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_Answering_Questions_r1_q2_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_Answering_Questions_r1_q2_r2_q2b_react(long transitioned_before) {
		/* The reactions of state q2b. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.iface.next) {
				exitSequence_main_region_Answering_Questions_r1_q2();
				enterSequence_main_region_Answering_Questions_r1_q3_default();
				main_region_Answering_Questions_react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_Answering_Questions_r1_q2_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_init_react(long transitioned_before) {
		/* The reactions of state init. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.iface.start) {
				exitSequence_main_region_init();
				enterSequence_main_region_Answering_Questions_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (current.iface.shallow_continue) {
					exitSequence_main_region_init();
					react_main_region_Answering_Questions_r1_shallow();
					react(0l);
					transitioned_after = 0l;
				} else {
					if (current.iface.deep_continue) {
						exitSequence_main_region_init();
						react_main_region_Answering_Questions_r1_deep();
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
	
	private long main_region__final__react(long transitioned_before) {
		/* The reactions of state null. */
		return react(transitioned_before);
	}
	
}
