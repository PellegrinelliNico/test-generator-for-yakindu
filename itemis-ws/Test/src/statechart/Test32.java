/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import com.yakindu.core.rx.Observable;
import java.util.LinkedList;
import java.util.Queue;

public class Test32 implements ITimed, IEventDriven {
	public static class Panel {
		private Test32 parent;
		
		public Panel(Test32 parent) {
			this.parent = parent;
		}
		private boolean btn_pressed;
		
		
		public void raiseBtn_pressed() {
			parent.inEventQueue.add(() -> {
				btn_pressed = true;
			});
			parent.runCycle();
		}
		
	}
	
	public static class Error {
		private boolean motor_error;
		
		
		protected void raiseMotor_error() {
			motor_error = true;
			motor_errorObservable.next(null);
		}
		
		private Observable<Void> motor_errorObservable = new Observable<Void>();
		
		public Observable<Void> getMotor_error() {
			return motor_errorObservable;
		}
		
	}
	
	protected Panel panel;
	
	protected Error error;
	
	public enum State {
		MAIN_REGION_STANDARD,
		MAIN_REGION_PAUSE,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private ITimerService timerService;
	
	private final boolean[] timeEvents = new boolean[1];
	
	private Queue<Runnable> internalEventQueue = new LinkedList<Runnable>();
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean vier;
	private long z;
	
	protected long getZ() {
		return z;
	}
	
	protected void setZ(long value) {
		this.z = value;
	}
	
	
	private long pau;
	
	protected long getPau() {
		return pau;
	}
	
	protected void setPau(long value) {
		this.pau = value;
	}
	
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public Test32() {
		panel = new Panel(this);
		error = new Error();
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		clearInternalEvents();
		
		/* Default init sequence for statechart test32 */
		setZ(0l);
		setPau(0l);
		
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
		/* Default enter sequence for statechart test32 */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart test32 */
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
		panel.btn_pressed = false;
		timeEvents[0] = false;
	}
	
	private void clearInternalEvents() {
		vier = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_STANDARD:
			main_region_Standard_react(-1l);
			break;
		case MAIN_REGION_PAUSE:
			main_region_Pause_react(-1l);
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
		case MAIN_REGION_STANDARD:
			return stateVector[0] == State.MAIN_REGION_STANDARD;
		case MAIN_REGION_PAUSE:
			return stateVector[0] == State.MAIN_REGION_PAUSE;
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
	
	public Panel panel() {
		return panel;
	}
	
	public Error error() {
		return error;
	}
	
	
	protected void raiseVier() {
		internalEventQueue.add(() -> {
			vier = true;
		});
	}
	
	/* Entry action for state 'Pause'. */
	private void entryAction_main_region_Pause() {
		/* Entry action for state 'Pause'. */
		timerService.setTimer(this, 0, (1000000l / 1000000l), false);
	}
	
	/* Exit action for state 'Pause'. */
	private void exitAction_main_region_Pause() {
		/* Exit action for state 'Pause'. */
		timerService.unsetTimer(this, 0);
	}
	
	/* 'default' enter sequence for state Standard */
	private void enterSequence_main_region_Standard_default() {
		/* 'default' enter sequence for state Standard */
		stateVector[0] = State.MAIN_REGION_STANDARD;
	}
	
	/* 'default' enter sequence for state Pause */
	private void enterSequence_main_region_Pause_default() {
		/* 'default' enter sequence for state Pause */
		entryAction_main_region_Pause();
		stateVector[0] = State.MAIN_REGION_PAUSE;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state Standard */
	private void exitSequence_main_region_Standard() {
		/* Default exit sequence for state Standard */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state Pause */
	private void exitSequence_main_region_Pause() {
		/* Default exit sequence for state Pause */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_Pause();
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_STANDARD:
			exitSequence_main_region_Standard();
			break;
		case MAIN_REGION_PAUSE:
			exitSequence_main_region_Pause();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_Standard_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_Standard_react(long transitioned_before) {
		/* The reactions of state Standard. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (panel.btn_pressed) {
				exitSequence_main_region_Standard();
				setZ(0l);
				enterSequence_main_region_Pause_default();
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
	
	private long main_region_Pause_react(long transitioned_before) {
		/* The reactions of state Pause. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (panel.btn_pressed) {
				exitSequence_main_region_Pause();
				setZ(0l);
				enterSequence_main_region_Pause_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (timeEvents[0]) {
					exitSequence_main_region_Pause();
					setPau(2l);
					raiseVier();
					timeEvents[0] = false;
					enterSequence_main_region_Pause_default();
					react(0l);
					transitioned_after = 0l;
				} else {
					if (vier) {
						exitSequence_main_region_Pause();
						enterSequence_main_region_Standard_default();
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