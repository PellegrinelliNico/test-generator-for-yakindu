/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import com.yakindu.core.rx.Observable;
import java.util.LinkedList;
import java.util.Queue;

public class Statechart5 implements ITimed, IEventDriven {
	public static class Motor {
		private boolean oN;
		
		
		protected void raiseON() {
			oN = true;
			oNObservable.next(null);
		}
		
		private Observable<Void> oNObservable = new Observable<Void>();
		
		public Observable<Void> getON() {
			return oNObservable;
		}
		
		private boolean oFF;
		
		
		protected void raiseOFF() {
			oFF = true;
			oFFObservable.next(null);
		}
		
		private Observable<Void> oFFObservable = new Observable<Void>();
		
		public Observable<Void> getOFF() {
			return oFFObservable;
		}
		
	}
	
	public static class LedRed {
		private boolean oN;
		
		
		protected void raiseON() {
			oN = true;
			oNObservable.next(null);
		}
		
		private Observable<Void> oNObservable = new Observable<Void>();
		
		public Observable<Void> getON() {
			return oNObservable;
		}
		
		private boolean oFF;
		
		
		protected void raiseOFF() {
			oFF = true;
			oFFObservable.next(null);
		}
		
		private Observable<Void> oFFObservable = new Observable<Void>();
		
		public Observable<Void> getOFF() {
			return oFFObservable;
		}
		
	}
	
	public static class LedGreen {
		private boolean oN;
		
		
		protected void raiseON() {
			oN = true;
			oNObservable.next(null);
		}
		
		private Observable<Void> oNObservable = new Observable<Void>();
		
		public Observable<Void> getON() {
			return oNObservable;
		}
		
		private boolean oFF;
		
		
		protected void raiseOFF() {
			oFF = true;
			oFFObservable.next(null);
		}
		
		private Observable<Void> oFFObservable = new Observable<Void>();
		
		public Observable<Void> getOFF() {
			return oFFObservable;
		}
		
	}
	
	public static class ButtonActuation {
		private Statechart5 parent;
		
		public ButtonActuation(Statechart5 parent) {
			this.parent = parent;
		}
		private boolean oN;
		
		
		public void raiseON() {
			parent.inEventQueue.add(() -> {
				oN = true;
			});
			parent.runCycle();
		}
		
		private boolean oFF;
		
		
		public void raiseOFF() {
			parent.inEventQueue.add(() -> {
				oFF = true;
			});
			parent.runCycle();
		}
		
	}
	
	public static class ButtonCancel {
		private Statechart5 parent;
		
		public ButtonCancel(Statechart5 parent) {
			this.parent = parent;
		}
		private boolean oN;
		
		
		public void raiseON() {
			parent.inEventQueue.add(() -> {
				oN = true;
			});
			parent.runCycle();
		}
		
		private boolean oFF;
		
		
		public void raiseOFF() {
			parent.inEventQueue.add(() -> {
				oFF = true;
			});
			parent.runCycle();
		}
		
	}
	
	protected Motor motor;
	
	protected LedRed ledRed;
	
	protected LedGreen ledGreen;
	
	protected ButtonActuation buttonActuation;
	
	protected ButtonCancel buttonCancel;
	
	public enum State {
		MAIN_REGION_DECISIONACTIVATE,
		MAIN_REGION_STATE1PREPAREACTUATION,
		MAIN_REGION_STATEMOTORON,
		MAIN_REGION_STATECANCELACTUATION,
		MAIN_REGION_STATE2PREPAREACTUATION,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private ITimerService timerService;
	
	private final boolean[] timeEvents = new boolean[3];
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public Statechart5() {
		motor = new Motor();
		ledRed = new LedRed();
		ledGreen = new LedGreen();
		buttonActuation = new ButtonActuation(this);
		buttonCancel = new ButtonCancel(this);
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		
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
		/* Default enter sequence for statechart Statechart5 */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart Statechart5 */
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
		buttonActuation.oN = false;
		buttonActuation.oFF = false;
		buttonCancel.oN = false;
		buttonCancel.oFF = false;
		timeEvents[0] = false;
		timeEvents[1] = false;
		timeEvents[2] = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_DECISIONACTIVATE:
			main_region_DecisionActivate_react(-1l);
			break;
		case MAIN_REGION_STATE1PREPAREACTUATION:
			main_region_State1PrepareActuation_react(-1l);
			break;
		case MAIN_REGION_STATEMOTORON:
			main_region_StateMotorOn_react(-1l);
			break;
		case MAIN_REGION_STATECANCELACTUATION:
			main_region_StateCancelActuation_react(-1l);
			break;
		case MAIN_REGION_STATE2PREPAREACTUATION:
			main_region_State2PrepareActuation_react(-1l);
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
		case MAIN_REGION_DECISIONACTIVATE:
			return stateVector[0] == State.MAIN_REGION_DECISIONACTIVATE;
		case MAIN_REGION_STATE1PREPAREACTUATION:
			return stateVector[0] == State.MAIN_REGION_STATE1PREPAREACTUATION;
		case MAIN_REGION_STATEMOTORON:
			return stateVector[0] == State.MAIN_REGION_STATEMOTORON;
		case MAIN_REGION_STATECANCELACTUATION:
			return stateVector[0] == State.MAIN_REGION_STATECANCELACTUATION;
		case MAIN_REGION_STATE2PREPAREACTUATION:
			return stateVector[0] == State.MAIN_REGION_STATE2PREPAREACTUATION;
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
	
	public Motor motor() {
		return motor;
	}
	
	public LedRed ledRed() {
		return ledRed;
	}
	
	public LedGreen ledGreen() {
		return ledGreen;
	}
	
	public ButtonActuation buttonActuation() {
		return buttonActuation;
	}
	
	public ButtonCancel buttonCancel() {
		return buttonCancel;
	}
	
	
	/* Entry action for state 'DecisionActivate'. */
	private void entryAction_main_region_DecisionActivate() {
		/* Entry action for state 'DecisionActivate'. */
		motor.raiseOFF();
		ledRed.raiseOFF();
		ledGreen.raiseOFF();
	}
	
	/* Entry action for state 'State1PrepareActuation'. */
	private void entryAction_main_region_State1PrepareActuation() {
		/* Entry action for state 'State1PrepareActuation'. */
		timerService.setTimer(this, 0, (5l * 1000l), false);
		ledRed.raiseON();
	}
	
	/* Entry action for state 'StateMotorOn'. */
	private void entryAction_main_region_StateMotorOn() {
		/* Entry action for state 'StateMotorOn'. */
		timerService.setTimer(this, 1, 200l, false);
		motor.raiseON();
		ledRed.raiseOFF();
	}
	
	/* Entry action for state 'State2PrepareActuation'. */
	private void entryAction_main_region_State2PrepareActuation() {
		/* Entry action for state 'State2PrepareActuation'. */
		timerService.setTimer(this, 2, (2l * 1000l), false);
		ledGreen.raiseON();
	}
	
	/* Exit action for state 'State1PrepareActuation'. */
	private void exitAction_main_region_State1PrepareActuation() {
		/* Exit action for state 'State1PrepareActuation'. */
		timerService.unsetTimer(this, 0);
	}
	
	/* Exit action for state 'StateMotorOn'. */
	private void exitAction_main_region_StateMotorOn() {
		/* Exit action for state 'StateMotorOn'. */
		timerService.unsetTimer(this, 1);
	}
	
	/* Exit action for state 'State2PrepareActuation'. */
	private void exitAction_main_region_State2PrepareActuation() {
		/* Exit action for state 'State2PrepareActuation'. */
		timerService.unsetTimer(this, 2);
	}
	
	/* 'default' enter sequence for state DecisionActivate */
	private void enterSequence_main_region_DecisionActivate_default() {
		/* 'default' enter sequence for state DecisionActivate */
		entryAction_main_region_DecisionActivate();
		stateVector[0] = State.MAIN_REGION_DECISIONACTIVATE;
	}
	
	/* 'default' enter sequence for state State1PrepareActuation */
	private void enterSequence_main_region_State1PrepareActuation_default() {
		/* 'default' enter sequence for state State1PrepareActuation */
		entryAction_main_region_State1PrepareActuation();
		stateVector[0] = State.MAIN_REGION_STATE1PREPAREACTUATION;
	}
	
	/* 'default' enter sequence for state StateMotorOn */
	private void enterSequence_main_region_StateMotorOn_default() {
		/* 'default' enter sequence for state StateMotorOn */
		entryAction_main_region_StateMotorOn();
		stateVector[0] = State.MAIN_REGION_STATEMOTORON;
	}
	
	/* 'default' enter sequence for state StateCancelActuation */
	private void enterSequence_main_region_StateCancelActuation_default() {
		/* 'default' enter sequence for state StateCancelActuation */
		stateVector[0] = State.MAIN_REGION_STATECANCELACTUATION;
	}
	
	/* 'default' enter sequence for state State2PrepareActuation */
	private void enterSequence_main_region_State2PrepareActuation_default() {
		/* 'default' enter sequence for state State2PrepareActuation */
		entryAction_main_region_State2PrepareActuation();
		stateVector[0] = State.MAIN_REGION_STATE2PREPAREACTUATION;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state DecisionActivate */
	private void exitSequence_main_region_DecisionActivate() {
		/* Default exit sequence for state DecisionActivate */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state State1PrepareActuation */
	private void exitSequence_main_region_State1PrepareActuation() {
		/* Default exit sequence for state State1PrepareActuation */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_State1PrepareActuation();
	}
	
	/* Default exit sequence for state StateMotorOn */
	private void exitSequence_main_region_StateMotorOn() {
		/* Default exit sequence for state StateMotorOn */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_StateMotorOn();
	}
	
	/* Default exit sequence for state StateCancelActuation */
	private void exitSequence_main_region_StateCancelActuation() {
		/* Default exit sequence for state StateCancelActuation */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state State2PrepareActuation */
	private void exitSequence_main_region_State2PrepareActuation() {
		/* Default exit sequence for state State2PrepareActuation */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_State2PrepareActuation();
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_DECISIONACTIVATE:
			exitSequence_main_region_DecisionActivate();
			break;
		case MAIN_REGION_STATE1PREPAREACTUATION:
			exitSequence_main_region_State1PrepareActuation();
			break;
		case MAIN_REGION_STATEMOTORON:
			exitSequence_main_region_StateMotorOn();
			break;
		case MAIN_REGION_STATECANCELACTUATION:
			exitSequence_main_region_StateCancelActuation();
			break;
		case MAIN_REGION_STATE2PREPAREACTUATION:
			exitSequence_main_region_State2PrepareActuation();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_DecisionActivate_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_DecisionActivate_react(long transitioned_before) {
		/* The reactions of state DecisionActivate. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (buttonActuation.oN) {
				exitSequence_main_region_DecisionActivate();
				enterSequence_main_region_State1PrepareActuation_default();
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
	
	private long main_region_State1PrepareActuation_react(long transitioned_before) {
		/* The reactions of state State1PrepareActuation. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[0]) {
				exitSequence_main_region_State1PrepareActuation();
				timeEvents[0] = false;
				enterSequence_main_region_State2PrepareActuation_default();
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
	
	private long main_region_StateMotorOn_react(long transitioned_before) {
		/* The reactions of state StateMotorOn. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[1]) {
				exitSequence_main_region_StateMotorOn();
				timeEvents[1] = false;
				enterSequence_main_region_DecisionActivate_default();
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
	
	private long main_region_StateCancelActuation_react(long transitioned_before) {
		/* The reactions of state StateCancelActuation. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (buttonCancel.oN) {
				exitSequence_main_region_StateCancelActuation();
				enterSequence_main_region_DecisionActivate_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (buttonCancel.oFF) {
					exitSequence_main_region_StateCancelActuation();
					enterSequence_main_region_StateMotorOn_default();
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
	
	private long main_region_State2PrepareActuation_react(long transitioned_before) {
		/* The reactions of state State2PrepareActuation. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[2]) {
				exitSequence_main_region_State2PrepareActuation();
				timeEvents[2] = false;
				enterSequence_main_region_StateCancelActuation_default();
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