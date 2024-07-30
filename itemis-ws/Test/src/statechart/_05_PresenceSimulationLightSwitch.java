/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import java.util.LinkedList;
import java.util.Queue;

public class _05_PresenceSimulationLightSwitch implements ITimed, IEventDriven {
	public static class Hmi {
		private _05_PresenceSimulationLightSwitch parent;
		
		public Hmi(_05_PresenceSimulationLightSwitch parent) {
			this.parent = parent;
		}
		private boolean switchEvent;
		
		
		public void raiseSwitch() {
			parent.inEventQueue.add(() -> {
				switchEvent = true;
			});
			parent.runCycle();
		}
		
		private boolean toggleMode;
		
		
		public void raiseToggleMode() {
			parent.inEventQueue.add(() -> {
				toggleMode = true;
			});
			parent.runCycle();
		}
		
		private boolean changeBrightness;
		
		
		public void raiseChangeBrightness() {
			parent.inEventQueue.add(() -> {
				changeBrightness = true;
			});
			parent.runCycle();
		}
		
	}
	
	public static class Simulation {
		private long wAIT_MIN;
		
		public long getWAIT_MIN() {
			return wAIT_MIN;
		}
		
		public void setWAIT_MIN(long value) {
			this.wAIT_MIN = value;
		}
		
		private long wAIT_MAX;
		
		public long getWAIT_MAX() {
			return wAIT_MAX;
		}
		
		public void setWAIT_MAX(long value) {
			this.wAIT_MAX = value;
		}
		
		private long uPDATE_PERIOD;
		
		public long getUPDATE_PERIOD() {
			return uPDATE_PERIOD;
		}
		
		public void setUPDATE_PERIOD(long value) {
			this.uPDATE_PERIOD = value;
		}
		
	}
	
	protected Hmi hmi;
	
	protected Simulation simulation;
	
	public enum State {
		MAIN_PRESENCE_SIMULATION,
		MAIN_PRESENCE_SIMULATION_MODE_IDLE,
		MAIN_PRESENCE_SIMULATION_MODE_ACTIVE,
		MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_SCHEDULE_WAITING,
		MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_PRESENT,
		MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_ABSENT,
		MAIN_MANUAL,
		MAIN_MANUAL_MODE_OFF,
		MAIN_MANUAL_MODE_ON,
		$NULLSTATE$
	};
	
	private State[] historyVector = new State[1];
	private final State[] stateVector = new State[2];
	
	private ITimerService timerService;
	
	private final boolean[] timeEvents = new boolean[2];
	
	private Queue<Runnable> internalEventQueue = new LinkedList<Runnable>();
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean changePresence;
	private boolean startSimulation;
	private boolean stopSimulation;
	private long wait_time;
	
	protected long getWait_time() {
		return wait_time;
	}
	
	protected void setWait_time(long value) {
		this.wait_time = value;
	}
	
	
	private long hour;
	
	protected long getHour() {
		return hour;
	}
	
	protected void setHour(long value) {
		this.hour = value;
	}
	
	
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
	public _05_PresenceSimulationLightSwitch() {
		hmi = new Hmi(this);
		simulation = new Simulation();
		for (int i = 0; i < 2; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		for (int i = 0; i < 1; i++) {
			historyVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		clearInternalEvents();
		
		/* Default init sequence for statechart _05_PresenceSimulationLightSwitch */
		setBrightness(0l);
		simulation.setWAIT_MIN(5l);
		simulation.setWAIT_MAX(1200l);
		simulation.setUPDATE_PERIOD(2l);
		setWait_time(0l);
		setHour(0l);
		
		isExecuting = false;
	}
	
	public void enter() {
		/* Activates the state machine. */
		if (timerService == null) {
			throw new IllegalStateException("Timer service must be set.");
		}
		if (this.internalOperationCallback == null) {
			throw new IllegalStateException("Internal operation callback must be set.");	
		}
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default enter sequence for statechart _05_PresenceSimulationLightSwitch */
		enterSequence_main_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart _05_PresenceSimulationLightSwitch */
		exitSequence_main();
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
		hmi.switchEvent = false;
		hmi.toggleMode = false;
		hmi.changeBrightness = false;
		timeEvents[0] = false;
		timeEvents[1] = false;
	}
	
	private void clearInternalEvents() {
		changePresence = false;
		startSimulation = false;
		stopSimulation = false;
	}
	
	private void microStep() {
		long transitioned = -1l;
		stateConfVectorPosition = 0l;
		switch (stateVector[0]) {
		case MAIN_PRESENCE_SIMULATION_MODE_IDLE:
			transitioned = main_Presence_Simulation_mode_Idle_react(transitioned);
			break;
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_SCHEDULE_WAITING:
			transitioned = main_Presence_Simulation_mode_Active_schedule_Waiting_react(transitioned);
			break;
		case MAIN_MANUAL_MODE_OFF:
			transitioned = main_Manual_mode_Off_react(transitioned);
			break;
		case MAIN_MANUAL_MODE_ON:
			transitioned = main_Manual_mode_On_react(transitioned);
			break;
		default:
			break;
		}
		if (getStateConfVectorPosition()<1l) {
			switch (stateVector[1]) {
			case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_PRESENT:
				main_Presence_Simulation_mode_Active_presence_Present_react(transitioned);
				break;
			case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_ABSENT:
				main_Presence_Simulation_mode_Active_presence_Absent_react(transitioned);
				break;
			default:
				break;
			}
		}
	}
	
	private void runCycle() {
		/* Performs a 'run to completion' step. */
		if (timerService == null) {
			throw new IllegalStateException("Timer service must be set.");
		}
		if (this.internalOperationCallback == null) {
			throw new IllegalStateException("Internal operation callback must be set.");	
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
		case MAIN_PRESENCE_SIMULATION:
			return stateVector[0].ordinal() >= State.
					MAIN_PRESENCE_SIMULATION.ordinal()&& stateVector[0].ordinal() <= State.MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_ABSENT.ordinal();
		case MAIN_PRESENCE_SIMULATION_MODE_IDLE:
			return stateVector[0] == State.MAIN_PRESENCE_SIMULATION_MODE_IDLE;
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE:
			return stateVector[0].ordinal() >= State.
					MAIN_PRESENCE_SIMULATION_MODE_ACTIVE.ordinal()&& stateVector[0].ordinal() <= State.MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_ABSENT.ordinal();
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_SCHEDULE_WAITING:
			return stateVector[0] == State.MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_SCHEDULE_WAITING;
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_PRESENT:
			return stateVector[1] == State.MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_PRESENT;
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_ABSENT:
			return stateVector[1] == State.MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_ABSENT;
		case MAIN_MANUAL:
			return stateVector[0].ordinal() >= State.
					MAIN_MANUAL.ordinal()&& stateVector[0].ordinal() <= State.MAIN_MANUAL_MODE_ON.ordinal();
		case MAIN_MANUAL_MODE_OFF:
			return stateVector[0] == State.MAIN_MANUAL_MODE_OFF;
		case MAIN_MANUAL_MODE_ON:
			return stateVector[0] == State.MAIN_MANUAL_MODE_ON;
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
	
	public Hmi hmi() {
		return hmi;
	}
	
	public Simulation simulation() {
		return simulation;
	}
	
	
	protected void raiseChangePresence() {
		internalEventQueue.add(() -> {
			changePresence = true;
		});
	}
	
	protected void raiseStartSimulation() {
		internalEventQueue.add(() -> {
			startSimulation = true;
		});
	}
	
	protected void raiseStopSimulation() {
		internalEventQueue.add(() -> {
			stopSimulation = true;
		});
	}
	
	public interface InternalOperationCallback {
	
		public double get_rand();
		
		public long get_hour();
		
	}
	
	private InternalOperationCallback internalOperationCallback;
	
	public void setInternalOperationCallback(InternalOperationCallback internalOperationCallback) {
		this.internalOperationCallback = internalOperationCallback;
	}
	private long brightness;
	
	public long getBrightness() {
		return brightness;
	}
	
	public void setBrightness(long value) {
		this.brightness = value;
	}
	
	/* Entry action for state 'Presence Simulation'. */
	private void entryAction_main_Presence_Simulation() {
		/* Entry action for state 'Presence Simulation'. */
		timerService.setTimer(this, 0, (simulation.getUPDATE_PERIOD() * 1000l), true);
	}
	
	/* Entry action for state 'Idle'. */
	private void entryAction_main_Presence_Simulation_mode_Idle() {
		/* Entry action for state 'Idle'. */
		setBrightness(0l);
	}
	
	/* Entry action for state 'Waiting'. */
	private void entryAction_main_Presence_Simulation_mode_Active_schedule_Waiting() {
		/* Entry action for state 'Waiting'. */
		timerService.setTimer(this, 1, (getWait_time() * 1000l), false);
		setWait_time(((long) ((simulation.wAIT_MIN + (internalOperationCallback.get_rand() * ((simulation.wAIT_MAX - simulation.wAIT_MIN)))))));
	}
	
	/* Entry action for state 'Present'. */
	private void entryAction_main_Presence_Simulation_mode_Active_presence_Present() {
		/* Entry action for state 'Present'. */
		setBrightness(10l);
	}
	
	/* Entry action for state 'Absent'. */
	private void entryAction_main_Presence_Simulation_mode_Active_presence_Absent() {
		/* Entry action for state 'Absent'. */
		setBrightness(0l);
	}
	
	/* Entry action for state 'Off'. */
	private void entryAction_main_Manual_mode_Off() {
		/* Entry action for state 'Off'. */
		setBrightness(0l);
	}
	
	/* Exit action for state 'Presence Simulation'. */
	private void exitAction_main_Presence_Simulation() {
		/* Exit action for state 'Presence Simulation'. */
		timerService.unsetTimer(this, 0);
	}
	
	/* Exit action for state 'Waiting'. */
	private void exitAction_main_Presence_Simulation_mode_Active_schedule_Waiting() {
		/* Exit action for state 'Waiting'. */
		timerService.unsetTimer(this, 1);
	}
	
	/* 'default' enter sequence for state Presence Simulation */
	private void enterSequence_main_Presence_Simulation_default() {
		/* 'default' enter sequence for state Presence Simulation */
		entryAction_main_Presence_Simulation();
		enterSequence_main_Presence_Simulation_mode_default();
	}
	
	/* 'default' enter sequence for state Idle */
	private void enterSequence_main_Presence_Simulation_mode_Idle_default() {
		/* 'default' enter sequence for state Idle */
		entryAction_main_Presence_Simulation_mode_Idle();
		stateVector[0] = State.MAIN_PRESENCE_SIMULATION_MODE_IDLE;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state Active */
	private void enterSequence_main_Presence_Simulation_mode_Active_default() {
		/* 'default' enter sequence for state Active */
		enterSequence_main_Presence_Simulation_mode_Active_schedule_default();
		enterSequence_main_Presence_Simulation_mode_Active_presence_default();
	}
	
	/* 'default' enter sequence for state Waiting */
	private void enterSequence_main_Presence_Simulation_mode_Active_schedule_Waiting_default() {
		/* 'default' enter sequence for state Waiting */
		entryAction_main_Presence_Simulation_mode_Active_schedule_Waiting();
		stateVector[0] = State.MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_SCHEDULE_WAITING;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state Present */
	private void enterSequence_main_Presence_Simulation_mode_Active_presence_Present_default() {
		/* 'default' enter sequence for state Present */
		entryAction_main_Presence_Simulation_mode_Active_presence_Present();
		stateVector[1] = State.MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_PRESENT;
		stateConfVectorPosition = 1;
		historyVector[0] = stateVector[1];
	}
	
	/* 'default' enter sequence for state Absent */
	private void enterSequence_main_Presence_Simulation_mode_Active_presence_Absent_default() {
		/* 'default' enter sequence for state Absent */
		entryAction_main_Presence_Simulation_mode_Active_presence_Absent();
		stateVector[1] = State.MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_ABSENT;
		stateConfVectorPosition = 1;
		historyVector[0] = stateVector[1];
	}
	
	/* 'default' enter sequence for state Manual */
	private void enterSequence_main_Manual_default() {
		/* 'default' enter sequence for state Manual */
		enterSequence_main_Manual_mode_default();
	}
	
	/* 'default' enter sequence for state Off */
	private void enterSequence_main_Manual_mode_Off_default() {
		/* 'default' enter sequence for state Off */
		entryAction_main_Manual_mode_Off();
		stateVector[0] = State.MAIN_MANUAL_MODE_OFF;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for state On */
	private void enterSequence_main_Manual_mode_On_default() {
		/* 'default' enter sequence for state On */
		stateVector[0] = State.MAIN_MANUAL_MODE_ON;
		stateConfVectorPosition = 0;
	}
	
	/* 'default' enter sequence for region main */
	private void enterSequence_main_default() {
		/* 'default' enter sequence for region main */
		react_main__entry_Default();
	}
	
	/* 'default' enter sequence for region mode */
	private void enterSequence_main_Presence_Simulation_mode_default() {
		/* 'default' enter sequence for region mode */
		react_main_Presence_Simulation_mode__entry_Default();
	}
	
	/* 'default' enter sequence for region schedule */
	private void enterSequence_main_Presence_Simulation_mode_Active_schedule_default() {
		/* 'default' enter sequence for region schedule */
		react_main_Presence_Simulation_mode_Active_schedule__entry_Default();
	}
	
	/* 'default' enter sequence for region presence */
	private void enterSequence_main_Presence_Simulation_mode_Active_presence_default() {
		/* 'default' enter sequence for region presence */
		react_main_Presence_Simulation_mode_Active_presence__entry_Default();
	}
	
	/* shallow enterSequence with history in child presence */
	private void shallowEnterSequence_main_Presence_Simulation_mode_Active_presence() {
		/* shallow enterSequence with history in child presence */
		switch (historyVector[0]) {
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_PRESENT:
			enterSequence_main_Presence_Simulation_mode_Active_presence_Present_default();
			break;
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_ABSENT:
			enterSequence_main_Presence_Simulation_mode_Active_presence_Absent_default();
			break;
		default:
			break;
		}
	}
	
	/* 'default' enter sequence for region mode */
	private void enterSequence_main_Manual_mode_default() {
		/* 'default' enter sequence for region mode */
		react_main_Manual_mode__entry_Default();
	}
	
	/* Default exit sequence for state Presence Simulation */
	private void exitSequence_main_Presence_Simulation() {
		/* Default exit sequence for state Presence Simulation */
		exitSequence_main_Presence_Simulation_mode();
		exitAction_main_Presence_Simulation();
	}
	
	/* Default exit sequence for state Idle */
	private void exitSequence_main_Presence_Simulation_mode_Idle() {
		/* Default exit sequence for state Idle */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state Active */
	private void exitSequence_main_Presence_Simulation_mode_Active() {
		/* Default exit sequence for state Active */
		exitSequence_main_Presence_Simulation_mode_Active_schedule();
		exitSequence_main_Presence_Simulation_mode_Active_presence();
	}
	
	/* Default exit sequence for state Waiting */
	private void exitSequence_main_Presence_Simulation_mode_Active_schedule_Waiting() {
		/* Default exit sequence for state Waiting */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
		exitAction_main_Presence_Simulation_mode_Active_schedule_Waiting();
	}
	
	/* Default exit sequence for state Present */
	private void exitSequence_main_Presence_Simulation_mode_Active_presence_Present() {
		/* Default exit sequence for state Present */
		stateVector[1] = State.$NULLSTATE$;
		stateConfVectorPosition = 1;
	}
	
	/* Default exit sequence for state Absent */
	private void exitSequence_main_Presence_Simulation_mode_Active_presence_Absent() {
		/* Default exit sequence for state Absent */
		stateVector[1] = State.$NULLSTATE$;
		stateConfVectorPosition = 1;
	}
	
	/* Default exit sequence for state Manual */
	private void exitSequence_main_Manual() {
		/* Default exit sequence for state Manual */
		exitSequence_main_Manual_mode();
	}
	
	/* Default exit sequence for state Off */
	private void exitSequence_main_Manual_mode_Off() {
		/* Default exit sequence for state Off */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for state On */
	private void exitSequence_main_Manual_mode_On() {
		/* Default exit sequence for state On */
		stateVector[0] = State.$NULLSTATE$;
		stateConfVectorPosition = 0;
	}
	
	/* Default exit sequence for region main */
	private void exitSequence_main() {
		/* Default exit sequence for region main */
		switch (stateVector[0]) {
		case MAIN_PRESENCE_SIMULATION_MODE_IDLE:
			exitSequence_main_Presence_Simulation_mode_Idle();
			exitAction_main_Presence_Simulation();
			break;
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_SCHEDULE_WAITING:
			exitSequence_main_Presence_Simulation_mode_Active_schedule_Waiting();
			break;
		case MAIN_MANUAL_MODE_OFF:
			exitSequence_main_Manual_mode_Off();
			break;
		case MAIN_MANUAL_MODE_ON:
			exitSequence_main_Manual_mode_On();
			break;
		default:
			break;
		}
		switch (stateVector[1]) {
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_PRESENT:
			exitSequence_main_Presence_Simulation_mode_Active_presence_Present();
			exitAction_main_Presence_Simulation();
			break;
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_ABSENT:
			exitSequence_main_Presence_Simulation_mode_Active_presence_Absent();
			exitAction_main_Presence_Simulation();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region mode */
	private void exitSequence_main_Presence_Simulation_mode() {
		/* Default exit sequence for region mode */
		switch (stateVector[0]) {
		case MAIN_PRESENCE_SIMULATION_MODE_IDLE:
			exitSequence_main_Presence_Simulation_mode_Idle();
			break;
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_SCHEDULE_WAITING:
			exitSequence_main_Presence_Simulation_mode_Active_schedule_Waiting();
			break;
		default:
			break;
		}
		switch (stateVector[1]) {
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_PRESENT:
			exitSequence_main_Presence_Simulation_mode_Active_presence_Present();
			break;
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_ABSENT:
			exitSequence_main_Presence_Simulation_mode_Active_presence_Absent();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region schedule */
	private void exitSequence_main_Presence_Simulation_mode_Active_schedule() {
		/* Default exit sequence for region schedule */
		switch (stateVector[0]) {
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_SCHEDULE_WAITING:
			exitSequence_main_Presence_Simulation_mode_Active_schedule_Waiting();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region presence */
	private void exitSequence_main_Presence_Simulation_mode_Active_presence() {
		/* Default exit sequence for region presence */
		switch (stateVector[1]) {
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_PRESENT:
			exitSequence_main_Presence_Simulation_mode_Active_presence_Present();
			break;
		case MAIN_PRESENCE_SIMULATION_MODE_ACTIVE_PRESENCE_ABSENT:
			exitSequence_main_Presence_Simulation_mode_Active_presence_Absent();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region mode */
	private void exitSequence_main_Manual_mode() {
		/* Default exit sequence for region mode */
		switch (stateVector[0]) {
		case MAIN_MANUAL_MODE_OFF:
			exitSequence_main_Manual_mode_Off();
			break;
		case MAIN_MANUAL_MODE_ON:
			exitSequence_main_Manual_mode_On();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_Manual_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_Presence_Simulation_mode__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_Presence_Simulation_mode_Idle_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_Presence_Simulation_mode_Active_schedule__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_Presence_Simulation_mode_Active_schedule_Waiting_default();
	}
	
	/* Default react sequence for shallow history entry  */
	private void react_main_Presence_Simulation_mode_Active_presence__entry_Default() {
		/* Default react sequence for shallow history entry  */
		/* Enter the region with shallow history */
		if (historyVector[0] != State.$NULLSTATE$) {
			shallowEnterSequence_main_Presence_Simulation_mode_Active_presence();
		} else {
			enterSequence_main_Presence_Simulation_mode_Active_presence_Absent_default();
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_Manual_mode__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_Manual_mode_Off_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_Presence_Simulation_react(long transitioned_before) {
		/* The reactions of state Presence Simulation. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (hmi.toggleMode) {
				exitSequence_main_Presence_Simulation();
				enterSequence_main_Manual_default();
				react(0l);
				transitioned_after = 1l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			if (timeEvents[0]) {
				setHour(internalOperationCallback.get_hour());
			}
			transitioned_after = react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_Presence_Simulation_mode_Idle_react(long transitioned_before) {
		/* The reactions of state Idle. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (startSimulation) {
				exitSequence_main_Presence_Simulation_mode_Idle();
				enterSequence_main_Presence_Simulation_mode_Active_default();
				main_Presence_Simulation_react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			if ((getHour()>17l || ((getHour()>7l && getHour()<10l)))) {
				raiseStartSimulation();
			}
			transitioned_after = main_Presence_Simulation_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_Presence_Simulation_mode_Active_react(long transitioned_before) {
		/* The reactions of state Active. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (stopSimulation) {
				exitSequence_main_Presence_Simulation_mode_Active();
				enterSequence_main_Presence_Simulation_mode_Idle_default();
				main_Presence_Simulation_react(0l);
				transitioned_after = 1l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_Presence_Simulation_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_Presence_Simulation_mode_Active_schedule_Waiting_react(long transitioned_before) {
		/* The reactions of state Waiting. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (changePresence) {
				exitSequence_main_Presence_Simulation_mode_Active_schedule_Waiting();
				enterSequence_main_Presence_Simulation_mode_Active_schedule_Waiting_default();
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			if (!(((getHour()>17l || ((getHour()>7l && getHour()<10l)))))) {
				raiseStopSimulation();
			}
			if (timeEvents[1]) {
				raiseChangePresence();
			}
		}
		return transitioned_after;
	}
	
	private long main_Presence_Simulation_mode_Active_presence_Present_react(long transitioned_before) {
		/* The reactions of state Present. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<1l) {
			if (changePresence) {
				exitSequence_main_Presence_Simulation_mode_Active_presence_Present();
				enterSequence_main_Presence_Simulation_mode_Active_presence_Absent_default();
				main_Presence_Simulation_mode_Active_react(0l);
				transitioned_after = 1l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_Presence_Simulation_mode_Active_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_Presence_Simulation_mode_Active_presence_Absent_react(long transitioned_before) {
		/* The reactions of state Absent. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<1l) {
			if (changePresence) {
				exitSequence_main_Presence_Simulation_mode_Active_presence_Absent();
				enterSequence_main_Presence_Simulation_mode_Active_presence_Present_default();
				main_Presence_Simulation_mode_Active_react(0l);
				transitioned_after = 1l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_Presence_Simulation_mode_Active_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_Manual_react(long transitioned_before) {
		/* The reactions of state Manual. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (hmi.toggleMode) {
				exitSequence_main_Manual();
				enterSequence_main_Presence_Simulation_default();
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
	
	private long main_Manual_mode_Off_react(long transitioned_before) {
		/* The reactions of state Off. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (hmi.switchEvent) {
				exitSequence_main_Manual_mode_Off();
				setBrightness(10l);
				enterSequence_main_Manual_mode_On_default();
				main_Manual_react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_Manual_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long main_Manual_mode_On_react(long transitioned_before) {
		/* The reactions of state On. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (hmi.switchEvent) {
				exitSequence_main_Manual_mode_On();
				enterSequence_main_Manual_mode_Off_default();
				main_Manual_react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			if (((hmi.changeBrightness) && (getBrightness()>1l))) {
				setBrightness(getBrightness() - 1l);
			}
			if (((hmi.changeBrightness) && (getBrightness()<=1l))) {
				setBrightness(10l);
			}
			transitioned_after = main_Manual_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	/* Can be used by the client code to trigger a run to completion step without raising an event. */
	public void triggerWithoutEvent() {
		runCycle();
	}
}