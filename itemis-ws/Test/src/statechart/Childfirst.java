/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.ICycleBased;
import com.yakindu.core.IStatemachine;

public class Childfirst implements ICycleBased {
	private static class EvBuf {
		private boolean e;
	}
	private static class ChildfirstEvBuf {
		private EvBuf iface = new EvBuf();
	}
	public enum State {
		MAIN_REGION_A,
		MAIN_REGION_A_R1_B,
		MAIN_REGION_A_R1_C,
		MAIN_REGION_D,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private ChildfirstEvBuf current = new ChildfirstEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public Childfirst() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart childfirst */
		setM(0l);
		setN(0l);
		setO(0l);
		
		isExecuting = false;
	}
	
	public void runCycle() {
		/* Performs a 'run to completion' step. */
		
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
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default enter sequence for statechart childfirst */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart childfirst */
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
	private void swapInEvents() {
		current.iface.e = e;
		e = false;
	}
	
	private void clearInEvents() {
		e = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_A_R1_B:
			main_region_A_r1_B_react(-1l);
			break;
		case MAIN_REGION_A_R1_C:
			main_region_A_r1_C_react(-1l);
			break;
		case MAIN_REGION_D:
			main_region_D_react(-1l);
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
		case MAIN_REGION_A:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_A.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_A_R1_C.ordinal();
		case MAIN_REGION_A_R1_B:
			return stateVector[0] == State.MAIN_REGION_A_R1_B;
		case MAIN_REGION_A_R1_C:
			return stateVector[0] == State.MAIN_REGION_A_R1_C;
		case MAIN_REGION_D:
			return stateVector[0] == State.MAIN_REGION_D;
		default:
			return false;
		}
	}
	
	
	private boolean e;
	
	
	public void raiseE() {
		e = true;
	}
	
	private long m;
	
	public long getM() {
		return m;
	}
	
	public void setM(long value) {
		this.m = value;
	}
	
	private long n;
	
	public long getN() {
		return n;
	}
	
	public void setN(long value) {
		this.n = value;
	}
	
	private long o;
	
	public long getO() {
		return o;
	}
	
	public void setO(long value) {
		this.o = value;
	}
	
	/* Entry action for state 'A'. */
	private void entryAction_main_region_A() {
		/* Entry action for state 'A'. */
		setM(1l);
	}
	
	/* Entry action for state 'B'. */
	private void entryAction_main_region_A_r1_B() {
		/* Entry action for state 'B'. */
		setM(2l);
	}
	
	/* Exit action for state 'A'. */
	private void exitAction_main_region_A() {
		/* Exit action for state 'A'. */
		setO(1l);
	}
	
	/* Exit action for state 'B'. */
	private void exitAction_main_region_A_r1_B() {
		/* Exit action for state 'B'. */
		setO(2l);
	}
	
	/* 'default' enter sequence for state A */
	private void enterSequence_main_region_A_default() {
		/* 'default' enter sequence for state A */
		entryAction_main_region_A();
		enterSequence_main_region_A_r1_default();
	}
	
	/* 'default' enter sequence for state B */
	private void enterSequence_main_region_A_r1_B_default() {
		/* 'default' enter sequence for state B */
		entryAction_main_region_A_r1_B();
		stateVector[0] = State.MAIN_REGION_A_R1_B;
	}
	
	/* 'default' enter sequence for state C */
	private void enterSequence_main_region_A_r1_C_default() {
		/* 'default' enter sequence for state C */
		stateVector[0] = State.MAIN_REGION_A_R1_C;
	}
	
	/* 'default' enter sequence for state D */
	private void enterSequence_main_region_D_default() {
		/* 'default' enter sequence for state D */
		stateVector[0] = State.MAIN_REGION_D;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region r1 */
	private void enterSequence_main_region_A_r1_default() {
		/* 'default' enter sequence for region r1 */
		react_main_region_A_r1__entry_Default();
	}
	
	/* Default exit sequence for state A */
	private void exitSequence_main_region_A() {
		/* Default exit sequence for state A */
		exitSequence_main_region_A_r1();
		exitAction_main_region_A();
	}
	
	/* Default exit sequence for state B */
	private void exitSequence_main_region_A_r1_B() {
		/* Default exit sequence for state B */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_A_r1_B();
	}
	
	/* Default exit sequence for state C */
	private void exitSequence_main_region_A_r1_C() {
		/* Default exit sequence for state C */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state D */
	private void exitSequence_main_region_D() {
		/* Default exit sequence for state D */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_A_R1_B:
			exitSequence_main_region_A_r1_B();
			exitAction_main_region_A();
			break;
		case MAIN_REGION_A_R1_C:
			exitSequence_main_region_A_r1_C();
			exitAction_main_region_A();
			break;
		case MAIN_REGION_D:
			exitSequence_main_region_D();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r1 */
	private void exitSequence_main_region_A_r1() {
		/* Default exit sequence for region r1 */
		switch (stateVector[0]) {
		case MAIN_REGION_A_R1_B:
			exitSequence_main_region_A_r1_B();
			break;
		case MAIN_REGION_A_R1_C:
			exitSequence_main_region_A_r1_C();
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
	private void react_main_region_A_r1__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_A_r1_B_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_A_react(long transitioned_before) {
		/* The reactions of state A. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.iface.e) {
				exitSequence_main_region_A();
				enterSequence_main_region_D_default();
				react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			if (current.iface.e) {
				setN(1l);
			}
			transitioned_after = react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_A_r1_B_react(long transitioned_before) {
		/* The reactions of state B. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.iface.e) {
				exitSequence_main_region_A_r1_B();
				enterSequence_main_region_A_r1_C_default();
				main_region_A_react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			if (current.iface.e) {
				setN(2l);
			}
			transitioned_after = main_region_A_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_A_r1_C_react(long transitioned_before) {
		/* The reactions of state C. */
		long transitioned_after = transitioned_before;
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_A_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_D_react(long transitioned_before) {
		/* The reactions of state D. */
		long transitioned_after = transitioned_before;
		/* Always execute local reactions. */
		transitioned_after = react(transitioned_before);
		return transitioned_after;
	}
	
}