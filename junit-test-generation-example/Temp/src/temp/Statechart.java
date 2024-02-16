/** Generated by itemis CREATE code generator. */
package temp;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import java.util.LinkedList;
import java.util.Queue;

public class Statechart implements IEventDriven {
	public enum State {
		MAIN_REGION_OFF_,
		MAIN_REGION_IDLE,
		MAIN_REGION_ON,
		MAIN_REGION_ON_R_0_WORKING,
		MAIN_REGION_ON_R_0_INIT_ANALYSES,
		MAIN_REGION_ON_R_0_ANALYSES012,
		MAIN_REGION_ON_R_0_ANALYSES012_R___1_AN1,
		MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_A,
		MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_B,
		MAIN_REGION_ON_R_0_END_ANALYSES,
		MAIN_REGION_ON_R_0__FINAL_,
		MAIN_REGION__FINAL_,
		MAIN_REGION_CHILL,
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
	public Statechart() {
		for (int i = 0; i < 2; i++) {
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
		/* Default enter sequence for statechart Statechart */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart Statechart */
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
	* @see IStatemachine#isFinal()
	*/
	public boolean isFinal() {
		return (stateVector[0] == State.MAIN_REGION_ON_R_0__FINAL_ || stateVector[0] == State.MAIN_REGION__FINAL_) && (stateVector[1] == State.$NULLSTATE$);
	}
	private void clearInEvents() {
		power_on = false;
		work = false;
		analyze = false;
		start = false;
		a = false;
		b = false;
		end = false;
		end_all = false;
	}
	
	private void microStep() {
		long transitioned = -1l;
		stateConfVectorPosition = 0l;
		switch (stateVector[0]) {
		case MAIN_REGION_OFF_:
			transitioned = main_region_Off__react(transitioned);
			break;
		case MAIN_REGION_IDLE:
			transitioned = main_region_idle_react(transitioned);
			break;
		case MAIN_REGION_ON_R_0_WORKING:
			transitioned = main_region_On_r_0_working_react(transitioned);
			break;
		case MAIN_REGION_ON_R_0_INIT_ANALYSES:
			transitioned = main_region_On_r_0_Init_anAlyses_react(transitioned);
			break;
		case MAIN_REGION_ON_R_0_ANALYSES012_R___1_AN1:
			transitioned = main_region_On_r_0_analyses012_r___1_an1_react(transitioned);
			break;
		case MAIN_REGION_ON_R_0_END_ANALYSES:
			transitioned = main_region_On_r_0_end_analyses_react(transitioned);
			break;
		case MAIN_REGION_ON_R_0__FINAL_:
			transitioned = main_region_On_r_0__final__react(transitioned);
			break;
		case MAIN_REGION__FINAL_:
			transitioned = main_region__final__react(transitioned);
			break;
		case MAIN_REGION_CHILL:
			transitioned = main_region_chill_react(transitioned);
			break;
		default:
			break;
		}
		if (getStateConfVectorPosition()<1l) {
			switch (stateVector[1]) {
			case MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_A:
				main_region_On_r_0_analyses012_r_2_an2_a_react(transitioned);
				break;
			case MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_B:
				main_region_On_r_0_analyses012_r_2_an2_b_react(transitioned);
				break;
			default:
				break;
			}
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
		case MAIN_REGION_OFF_:
			return stateVector[0] == State.MAIN_REGION_OFF_;
		case MAIN_REGION_IDLE:
			return stateVector[0] == State.MAIN_REGION_IDLE;
		case MAIN_REGION_ON:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_ON.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_ON_R_0__FINAL_.ordinal();
		case MAIN_REGION_ON_R_0_WORKING:
			return stateVector[0] == State.MAIN_REGION_ON_R_0_WORKING;
		case MAIN_REGION_ON_R_0_INIT_ANALYSES:
			return stateVector[0] == State.MAIN_REGION_ON_R_0_INIT_ANALYSES;
		case MAIN_REGION_ON_R_0_ANALYSES012:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_ON_R_0_ANALYSES012.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_B.ordinal();
		case MAIN_REGION_ON_R_0_ANALYSES012_R___1_AN1:
			return stateVector[0] == State.MAIN_REGION_ON_R_0_ANALYSES012_R___1_AN1;
		case MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_A:
			return stateVector[1] == State.MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_A;
		case MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_B:
			return stateVector[1] == State.MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_B;
		case MAIN_REGION_ON_R_0_END_ANALYSES:
			return stateVector[0] == State.MAIN_REGION_ON_R_0_END_ANALYSES;
		case MAIN_REGION_ON_R_0__FINAL_:
			return stateVector[0] == State.MAIN_REGION_ON_R_0__FINAL_;
		case MAIN_REGION__FINAL_:
			return stateVector[0] == State.MAIN_REGION__FINAL_;
		case MAIN_REGION_CHILL:
			return stateVector[0] == State.MAIN_REGION_CHILL;
		default:
			return false;
		}
	}
	
	
	private boolean power_on;
	
	
	public void raisePower_on() {
		inEventQueue.add(() -> {
			power_on = true;
		});
		runCycle();
	}
	
	private boolean work;
	
	
	public void raiseWork() {
		inEventQueue.add(() -> {
			work = true;
		});
		runCycle();
	}
	
	private boolean analyze;
	
	
	public void raiseAnalyze() {
		inEventQueue.add(() -> {
			analyze = true;
		});
		runCycle();
	}
	
	private boolean start;
	
	
	public void raiseStart() {
		inEventQueue.add(() -> {
			start = true;
		});
		runCycle();
	}
	
	private boolean a;
	
	
	public void raiseA() {
		inEventQueue.add(() -> {
			a = true;
		});
		runCycle();
	}
	
	private boolean b;
	
	
	public void raiseB() {
		inEventQueue.add(() -> {
			b = true;
		});
		runCycle();
	}
	
	private boolean end;
	
	
	public void raiseEnd() {
		inEventQueue.add(() -> {
			end = true;
		});
		runCycle();
	}
	
	private boolean end_all;
	
	
	public void raiseEnd_all() {
		inEventQueue.add(() -> {
			end_all = true;
		});
		runCycle();
	}
	
	/* 'default' enter sequence for state Off# */
	private void enterSequence_main_region_Off__default() {
		/* 'default' enter sequence for state Off# */
		stateVector[0] = State.MAIN_REGION_OFF_;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state idle */
	private void enterSequence_main_region_idle_default() {
		/* 'default' enter sequence for state idle */
		stateVector[0] = State.MAIN_REGION_IDLE;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state working */
	private void enterSequence_main_region_On_r_0_working_default() {
		/* 'default' enter sequence for state working */
		stateVector[0] = State.MAIN_REGION_ON_R_0_WORKING;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state Init anAlyses */
	private void enterSequence_main_region_On_r_0_Init_anAlyses_default() {
		/* 'default' enter sequence for state Init anAlyses */
		stateVector[0] = State.MAIN_REGION_ON_R_0_INIT_ANALYSES;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state an1 */
	private void enterSequence_main_region_On_r_0_analyses012_r___1_an1_default() {
		/* 'default' enter sequence for state an1 */
		stateVector[0] = State.MAIN_REGION_ON_R_0_ANALYSES012_R___1_AN1;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state an2_a */
	private void enterSequence_main_region_On_r_0_analyses012_r_2_an2_a_default() {
		/* 'default' enter sequence for state an2_a */
		stateVector[1] = State.MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_A;
		stateConfVectorPosition = 1;
	}
	
	/* 'default' enter sequence for state an2_b */
	private void enterSequence_main_region_On_r_0_analyses012_r_2_an2_b_default() {
		/* 'default' enter sequence for state an2_b */
		stateVector[1] = State.MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_B;
		stateConfVectorPosition = 1;
	}
	
	/* 'default' enter sequence for state end.analyses */
	private void enterSequence_main_region_On_r_0_end_analyses_default() {
		/* 'default' enter sequence for state end.analyses */
		stateVector[0] = State.MAIN_REGION_ON_R_0_END_ANALYSES;
		stateConfVectorPosition = 0;
	}
	
	/* Default enter sequence for final state */
	private void enterSequence_main_region_On_r_0__final__default() {
		/* Default enter sequence for final state */
		stateVector[0] = State.MAIN_REGION_ON_R_0__FINAL_;
		stateConfVectorPosition = 0;
	}
	
	/* Default enter sequence for final state */
	private void enterSequence_main_region__final__default() {
		/* Default enter sequence for final state */
		stateVector[0] = State.MAIN_REGION__FINAL_;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state chill */
	private void enterSequence_main_region_chill_default() {
		/* 'default' enter sequence for state chill */
		stateVector[0] = State.MAIN_REGION_CHILL;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state Off# */
	private void exitSequence_main_region_Off_() {
		/* Default exit sequence for state Off# */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state idle */
	private void exitSequence_main_region_idle() {
		/* Default exit sequence for state idle */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state On */
	private void exitSequence_main_region_On() {
		/* Default exit sequence for state On */
		exitSequence_main_region_On_r_0();
	}
	
	/* Default exit sequence for state working */
	private void exitSequence_main_region_On_r_0_working() {
		/* Default exit sequence for state working */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state Init anAlyses */
	private void exitSequence_main_region_On_r_0_Init_anAlyses() {
		/* Default exit sequence for state Init anAlyses */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state analyses012 */
	private void exitSequence_main_region_On_r_0_analyses012() {
		/* Default exit sequence for state analyses012 */
		exitSequence_main_region_On_r_0_analyses012_r___1();
		exitSequence_main_region_On_r_0_analyses012_r_2();
	}
	
	/* Default exit sequence for state an1 */
	private void exitSequence_main_region_On_r_0_analyses012_r___1_an1() {
		/* Default exit sequence for state an1 */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state an2_a */
	private void exitSequence_main_region_On_r_0_analyses012_r_2_an2_a() {
		/* Default exit sequence for state an2_a */
		stateVector[1] = State.$NULLSTATE$;
		stateConfVectorPosition = 1;
	}
	
	/* Default exit sequence for state an2_b */
	private void exitSequence_main_region_On_r_0_analyses012_r_2_an2_b() {
		/* Default exit sequence for state an2_b */
		stateVector[1] = State.$NULLSTATE$;
		stateConfVectorPosition = 1;
	}
	
	/* Default exit sequence for state end.analyses */
	private void exitSequence_main_region_On_r_0_end_analyses() {
		/* Default exit sequence for state end.analyses */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for final state. */
	private void exitSequence_main_region_On_r_0__final_() {
		/* Default exit sequence for final state. */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for final state. */
	private void exitSequence_main_region__final_() {
		/* Default exit sequence for final state. */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state chill */
	private void exitSequence_main_region_chill() {
		/* Default exit sequence for state chill */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_OFF_:
			exitSequence_main_region_Off_();
			break;
		case MAIN_REGION_IDLE:
			exitSequence_main_region_idle();
			break;
		case MAIN_REGION_ON_R_0_WORKING:
			exitSequence_main_region_On_r_0_working();
			break;
		case MAIN_REGION_ON_R_0_INIT_ANALYSES:
			exitSequence_main_region_On_r_0_Init_anAlyses();
			break;
		case MAIN_REGION_ON_R_0_ANALYSES012_R___1_AN1:
			exitSequence_main_region_On_r_0_analyses012_r___1_an1();
			break;
		case MAIN_REGION_ON_R_0_END_ANALYSES:
			exitSequence_main_region_On_r_0_end_analyses();
			break;
		case MAIN_REGION_ON_R_0__FINAL_:
			exitSequence_main_region_On_r_0__final_();
			break;
		case MAIN_REGION__FINAL_:
			exitSequence_main_region__final_();
			break;
		case MAIN_REGION_CHILL:
			exitSequence_main_region_chill();
			break;
		default:
			break;
		}
		switch (stateVector[1]) {
		case MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_A:
			exitSequence_main_region_On_r_0_analyses012_r_2_an2_a();
			break;
		case MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_B:
			exitSequence_main_region_On_r_0_analyses012_r_2_an2_b();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r 0 */
	private void exitSequence_main_region_On_r_0() {
		/* Default exit sequence for region r 0 */
		switch (stateVector[0]) {
		case MAIN_REGION_ON_R_0_WORKING:
			exitSequence_main_region_On_r_0_working();
			break;
		case MAIN_REGION_ON_R_0_INIT_ANALYSES:
			exitSequence_main_region_On_r_0_Init_anAlyses();
			break;
		case MAIN_REGION_ON_R_0_ANALYSES012_R___1_AN1:
			exitSequence_main_region_On_r_0_analyses012_r___1_an1();
			break;
		case MAIN_REGION_ON_R_0_END_ANALYSES:
			exitSequence_main_region_On_r_0_end_analyses();
			break;
		case MAIN_REGION_ON_R_0__FINAL_:
			exitSequence_main_region_On_r_0__final_();
			break;
		default:
			break;
		}
		switch (stateVector[1]) {
		case MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_A:
			exitSequence_main_region_On_r_0_analyses012_r_2_an2_a();
			break;
		case MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_B:
			exitSequence_main_region_On_r_0_analyses012_r_2_an2_b();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r___1 */
	private void exitSequence_main_region_On_r_0_analyses012_r___1() {
		/* Default exit sequence for region r___1 */
		switch (stateVector[0]) {
		case MAIN_REGION_ON_R_0_ANALYSES012_R___1_AN1:
			exitSequence_main_region_On_r_0_analyses012_r___1_an1();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region r.2 */
	private void exitSequence_main_region_On_r_0_analyses012_r_2() {
		/* Default exit sequence for region r.2 */
		switch (stateVector[1]) {
		case MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_A:
			exitSequence_main_region_On_r_0_analyses012_r_2_an2_a();
			break;
		case MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_B:
			exitSequence_main_region_On_r_0_analyses012_r_2_an2_b();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_Off__default();
	}
	
	/* The reactions of state null. */
	private void react_main_region_On_r_0__sync0() {
		/* The reactions of state null. */
		enterSequence_main_region_On_r_0_analyses012_r___1_an1_default();
		enterSequence_main_region_On_r_0_analyses012_r_2_an2_a_default();
	}
	
	/* The reactions of state null. */
	private void react_main_region_On_r_0__sync1() {
		/* The reactions of state null. */
		enterSequence_main_region_On_r_0_end_analyses_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_Off__react(long transitioned_before) {
		/* The reactions of state Off#. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (power_on) {
				exitSequence_main_region_Off_();
				enterSequence_main_region_idle_default();
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
	
	private long main_region_idle_react(long transitioned_before) {
		/* The reactions of state idle. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (work) {
				exitSequence_main_region_idle();
				enterSequence_main_region_On_r_0_working_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (analyze) {
					exitSequence_main_region_idle();
					enterSequence_main_region_On_r_0_Init_anAlyses_default();
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
	
	private long main_region_On_react(long transitioned_before) {
		/* The reactions of state On. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (end_all) {
				exitSequence_main_region_On();
				enterSequence_main_region__final__default();
				transitioned_after = 1l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_On_r_0_working_react(long transitioned_before) {
		/* The reactions of state working. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (end) {
				exitSequence_main_region_On_r_0_working();
				enterSequence_main_region_On_r_0__final__default();
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_On_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_On_r_0_Init_anAlyses_react(long transitioned_before) {
		/* The reactions of state Init anAlyses. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (start) {
				exitSequence_main_region_On_r_0_Init_anAlyses();
				react_main_region_On_r_0__sync0();
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_On_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_On_r_0_analyses012_react(long transitioned_before) {
		/* The reactions of state analyses012. */
		long transitioned_after = transitioned_before;
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_On_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_On_r_0_analyses012_r___1_an1_react(long transitioned_before) {
		/* The reactions of state an1. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if ((a && isStateActive(State.MAIN_REGION_ON_R_0_ANALYSES012_R_2_AN2_B))) {
				exitSequence_main_region_On_r_0_analyses012();
				react_main_region_On_r_0__sync1();
				transitioned_after = 0l;
			}
		}
		return transitioned_after;
	}
	
	private long main_region_On_r_0_analyses012_r_2_an2_a_react(long transitioned_before) {
		/* The reactions of state an2_a. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<1l) {
			if (b) {
				exitSequence_main_region_On_r_0_analyses012_r_2_an2_a();
				enterSequence_main_region_On_r_0_analyses012_r_2_an2_b_default();
				main_region_On_r_0_analyses012_react(0l);
				transitioned_after = 1l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_On_r_0_analyses012_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_On_r_0_analyses012_r_2_an2_b_react(long transitioned_before) {
		/* The reactions of state an2_b. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<1l) {
			if ((isStateActive(State.MAIN_REGION_ON_R_0_ANALYSES012_R___1_AN1) && a)) {
				exitSequence_main_region_On_r_0_analyses012();
				react_main_region_On_r_0__sync1();
				transitioned_after = 1l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_On_r_0_analyses012_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_On_r_0_end_analyses_react(long transitioned_before) {
		/* The reactions of state end.analyses. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (end) {
				exitSequence_main_region_On();
				enterSequence_main_region_chill_default();
				react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_On_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_region_On_r_0__final__react(long transitioned_before) {
		/* The reactions of state null. */
		return main_region_On_react(transitioned_before);
	}
	
	private long main_region__final__react(long transitioned_before) {
		/* The reactions of state null. */
		return react(transitioned_before);
	}
	
	private long main_region_chill_react(long transitioned_before) {
		/* The reactions of state chill. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (end) {
				exitSequence_main_region_chill();
				enterSequence_main_region__final__default();
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
