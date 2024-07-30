/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import java.util.LinkedList;
import java.util.Queue;

public class Alarm2 implements ITimed, IEventDriven {
	public enum State {
		MAIN_REGION_DISARMED,
		MAIN_REGION_ARMED,
		MAIN_REGION_LIGHTON,
		MAIN_REGION_PARTIALLYARMED,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private ITimerService timerService;
	
	private final boolean[] timeEvents = new boolean[2];
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public Alarm2() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart alarm2 */
		setPass(false);
		
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
		/* Default enter sequence for statechart alarm2 */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart alarm2 */
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
		button = false;
		button2 = false;
		button1 = false;
		timeEvents[0] = false;
		timeEvents[1] = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_DISARMED:
			main_region_disarmed_react(-1l);
			break;
		case MAIN_REGION_ARMED:
			main_region_armed_react(-1l);
			break;
		case MAIN_REGION_LIGHTON:
			main_region_lightON_react(-1l);
			break;
		case MAIN_REGION_PARTIALLYARMED:
			main_region_partiallyArmed_react(-1l);
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
		case MAIN_REGION_DISARMED:
			return stateVector[0] == State.MAIN_REGION_DISARMED;
		case MAIN_REGION_ARMED:
			return stateVector[0] == State.MAIN_REGION_ARMED;
		case MAIN_REGION_LIGHTON:
			return stateVector[0] == State.MAIN_REGION_LIGHTON;
		case MAIN_REGION_PARTIALLYARMED:
			return stateVector[0] == State.MAIN_REGION_PARTIALLYARMED;
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
	
	
	private boolean operate;
	
	
	public void raiseOperate() {
		inEventQueue.add(() -> {
			operate = true;
		});
		runCycle();
	}
	
	private boolean button;
	
	
	public void raiseButton() {
		inEventQueue.add(() -> {
			button = true;
		});
		runCycle();
	}
	
	private boolean button2;
	
	
	public void raiseButton2() {
		inEventQueue.add(() -> {
			button2 = true;
		});
		runCycle();
	}
	
	private boolean button1;
	
	
	public void raiseButton1() {
		inEventQueue.add(() -> {
			button1 = true;
		});
		runCycle();
	}
	
	private boolean pass;
	
	public boolean getPass() {
		return pass;
	}
	
	public void setPass(boolean value) {
		this.pass = value;
	}
	
	/* Entry action for state 'disarmed'. */
	private void entryAction_main_region_disarmed() {
		/* Entry action for state 'disarmed'. */
		setPass(false);
	}
	
	/* Entry action for state 'armed'. */
	private void entryAction_main_region_armed() {
		/* Entry action for state 'armed'. */
		timerService.setTimer(this, 0, (20l * 1000l), false);
		setPass(true);
	}
	
	/* Entry action for state 'partiallyArmed'. */
	private void entryAction_main_region_partiallyArmed() {
		/* Entry action for state 'partiallyArmed'. */
		timerService.setTimer(this, 1, (40l * 1000l), false);
	}
	
	/* Exit action for state 'armed'. */
	private void exitAction_main_region_armed() {
		/* Exit action for state 'armed'. */
		timerService.unsetTimer(this, 0);
	}
	
	/* Exit action for state 'partiallyArmed'. */
	private void exitAction_main_region_partiallyArmed() {
		/* Exit action for state 'partiallyArmed'. */
		timerService.unsetTimer(this, 1);
	}
	
	/* 'default' enter sequence for state disarmed */
	private void enterSequence_main_region_disarmed_default() {
		/* 'default' enter sequence for state disarmed */
		entryAction_main_region_disarmed();
		stateVector[0] = State.MAIN_REGION_DISARMED;
	}
	
	/* 'default' enter sequence for state armed */
	private void enterSequence_main_region_armed_default() {
		/* 'default' enter sequence for state armed */
		entryAction_main_region_armed();
		stateVector[0] = State.MAIN_REGION_ARMED;
	}
	
	/* 'default' enter sequence for state lightON */
	private void enterSequence_main_region_lightON_default() {
		/* 'default' enter sequence for state lightON */
		stateVector[0] = State.MAIN_REGION_LIGHTON;
	}
	
	/* 'default' enter sequence for state partiallyArmed */
	private void enterSequence_main_region_partiallyArmed_default() {
		/* 'default' enter sequence for state partiallyArmed */
		entryAction_main_region_partiallyArmed();
		stateVector[0] = State.MAIN_REGION_PARTIALLYARMED;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state disarmed */
	private void exitSequence_main_region_disarmed() {
		/* Default exit sequence for state disarmed */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state armed */
	private void exitSequence_main_region_armed() {
		/* Default exit sequence for state armed */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_armed();
	}
	
	/* Default exit sequence for state lightON */
	private void exitSequence_main_region_lightON() {
		/* Default exit sequence for state lightON */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state partiallyArmed */
	private void exitSequence_main_region_partiallyArmed() {
		/* Default exit sequence for state partiallyArmed */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_partiallyArmed();
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_DISARMED:
			exitSequence_main_region_disarmed();
			break;
		case MAIN_REGION_ARMED:
			exitSequence_main_region_armed();
			break;
		case MAIN_REGION_LIGHTON:
			exitSequence_main_region_lightON();
			break;
		case MAIN_REGION_PARTIALLYARMED:
			exitSequence_main_region_partiallyArmed();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_disarmed_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_disarmed_react(long transitioned_before) {
		/* The reactions of state disarmed. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (operate) {
				exitSequence_main_region_disarmed();
				enterSequence_main_region_armed_default();
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
	
	private long main_region_armed_react(long transitioned_before) {
		/* The reactions of state armed. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (operate) {
				exitSequence_main_region_armed();
				enterSequence_main_region_disarmed_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (timeEvents[0]) {
					exitSequence_main_region_armed();
					timeEvents[0] = false;
					enterSequence_main_region_lightON_default();
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
	
	private long main_region_lightON_react(long transitioned_before) {
		/* The reactions of state lightON. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (button2) {
				exitSequence_main_region_lightON();
				enterSequence_main_region_disarmed_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (button1) {
					exitSequence_main_region_lightON();
					enterSequence_main_region_armed_default();
					react(0l);
					transitioned_after = 0l;
				} else {
					if (operate) {
						exitSequence_main_region_lightON();
						enterSequence_main_region_partiallyArmed_default();
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
	
	private long main_region_partiallyArmed_react(long transitioned_before) {
		/* The reactions of state partiallyArmed. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[1]) {
				exitSequence_main_region_partiallyArmed();
				timeEvents[1] = false;
				enterSequence_main_region_disarmed_default();
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