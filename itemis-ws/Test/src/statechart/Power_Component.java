/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import java.util.LinkedList;
import java.util.Queue;

public class Power_Component implements ITimed, IEventDriven {
	public static class Device {
		private boolean isOn;
		
		public boolean getIsOn() {
			return isOn;
		}
		
		public void setIsOn(boolean value) {
			this.isOn = value;
		}
		
	}
	
	protected Device device;
	
	public enum State {
		_POWER_COMPONENT__POWER_COMPONENT,
		_POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___NOPOWERCONSUMED_,
		_POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___CONSUMING_POWER_,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private ITimerService timerService;
	
	private final boolean[] timeEvents = new boolean[1];
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public Power_Component() {
		device = new Device();
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart Power_Component */
		setTime(3600l);
		setKWh(0l);
		setKilowatt(20l);
		setHour(1l);
		setTotalPower(0l);
		setTotalHour(0l);
		device.setIsOn(false);
		
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
		/* Default enter sequence for statechart Power_Component */
		enterSequence__Power_Component__default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart Power_Component */
		exitSequence__Power_Component_();
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
		on = false;
		off = false;
		timeEvents[0] = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case _POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___NOPOWERCONSUMED_:
			_Power_Component__Power_Component__Calculating_Power_Consumption___NoPowerConsumed__react(-1l);
			break;
		case _POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___CONSUMING_POWER_:
			_Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power__react(-1l);
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
		case _POWER_COMPONENT__POWER_COMPONENT:
			return stateVector[0].ordinal() >= State.
					_POWER_COMPONENT__POWER_COMPONENT.ordinal()&& stateVector[0].ordinal() <= State._POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___CONSUMING_POWER_.ordinal();
		case _POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___NOPOWERCONSUMED_:
			return stateVector[0] == State._POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___NOPOWERCONSUMED_;
		case _POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___CONSUMING_POWER_:
			return stateVector[0] == State._POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___CONSUMING_POWER_;
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
	
	public Device device() {
		return device;
	}
	
	
	private boolean on;
	
	
	public void raiseOn() {
		inEventQueue.add(() -> {
			on = true;
		});
		runCycle();
	}
	
	private boolean off;
	
	
	public void raiseOff() {
		inEventQueue.add(() -> {
			off = true;
		});
		runCycle();
	}
	
	private long time;
	
	public long getTime() {
		return time;
	}
	
	public void setTime(long value) {
		this.time = value;
	}
	
	private long kWh;
	
	public long getKWh() {
		return kWh;
	}
	
	public void setKWh(long value) {
		this.kWh = value;
	}
	
	private long kilowatt;
	
	public long getKilowatt() {
		return kilowatt;
	}
	
	public void setKilowatt(long value) {
		this.kilowatt = value;
	}
	
	private long hour;
	
	public long getHour() {
		return hour;
	}
	
	public void setHour(long value) {
		this.hour = value;
	}
	
	private long totalPower;
	
	public long getTotalPower() {
		return totalPower;
	}
	
	public void setTotalPower(long value) {
		this.totalPower = value;
	}
	
	private long totalHour;
	
	public long getTotalHour() {
		return totalHour;
	}
	
	public void setTotalHour(long value) {
		this.totalHour = value;
	}
	
	/* Entry action for state '<NoPowerConsumed>'. */
	private void entryAction__Power_Component__Power_Component__Calculating_Power_Consumption___NoPowerConsumed_() {
		/* Entry action for state '<NoPowerConsumed>'. */
		setHour(0l);
	}
	
	/* Entry action for state '<Consuming_Power>'. */
	private void entryAction__Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power_() {
		/* Entry action for state '<Consuming_Power>'. */
		timerService.setTimer(this, 0, (getTime() * 1000l), false);
		setKWh((kilowatt * hour));
		setTotalPower((kWh * totalHour));
	}
	
	/* Exit action for state '<Consuming_Power>'. */
	private void exitAction__Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power_() {
		/* Exit action for state '<Consuming_Power>'. */
		timerService.unsetTimer(this, 0);
	}
	
	/* 'default' enter sequence for state Power_Component */
	private void enterSequence__Power_Component__Power_Component_default() {
		/* 'default' enter sequence for state Power_Component */
		enterSequence__Power_Component__Power_Component__Calculating_Power_Consumption__default();
	}
	
	/* 'default' enter sequence for state <NoPowerConsumed> */
	private void enterSequence__Power_Component__Power_Component__Calculating_Power_Consumption___NoPowerConsumed__default() {
		/* 'default' enter sequence for state <NoPowerConsumed> */
		entryAction__Power_Component__Power_Component__Calculating_Power_Consumption___NoPowerConsumed_();
		stateVector[0] = State._POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___NOPOWERCONSUMED_;
	}
	
	/* 'default' enter sequence for state <Consuming_Power> */
	private void enterSequence__Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power__default() {
		/* 'default' enter sequence for state <Consuming_Power> */
		entryAction__Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power_();
		stateVector[0] = State._POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___CONSUMING_POWER_;
	}
	
	/* 'default' enter sequence for region <Power_Component> */
	private void enterSequence__Power_Component__default() {
		/* 'default' enter sequence for region <Power_Component> */
		react__Power_Component___entry_Default();
	}
	
	/* 'default' enter sequence for region <Calculating_Power_Consumption> */
	private void enterSequence__Power_Component__Power_Component__Calculating_Power_Consumption__default() {
		/* 'default' enter sequence for region <Calculating_Power_Consumption> */
		react__Power_Component__Power_Component__Calculating_Power_Consumption___entry_Default();
	}
	
	/* Default exit sequence for state <NoPowerConsumed> */
	private void exitSequence__Power_Component__Power_Component__Calculating_Power_Consumption___NoPowerConsumed_() {
		/* Default exit sequence for state <NoPowerConsumed> */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state <Consuming_Power> */
	private void exitSequence__Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power_() {
		/* Default exit sequence for state <Consuming_Power> */
		stateVector[0] = State.$NULLSTATE$;
		exitAction__Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power_();
	}
	
	/* Default exit sequence for region <Power_Component> */
	private void exitSequence__Power_Component_() {
		/* Default exit sequence for region <Power_Component> */
		switch (stateVector[0]) {
		case _POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___NOPOWERCONSUMED_:
			exitSequence__Power_Component__Power_Component__Calculating_Power_Consumption___NoPowerConsumed_();
			break;
		case _POWER_COMPONENT__POWER_COMPONENT__CALCULATING_POWER_CONSUMPTION___CONSUMING_POWER_:
			exitSequence__Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power_();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react__Power_Component___entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence__Power_Component__Power_Component_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react__Power_Component__Power_Component__Calculating_Power_Consumption___entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence__Power_Component__Power_Component__Calculating_Power_Consumption___NoPowerConsumed__default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long _Power_Component__Power_Component_react(long transitioned_before) {
		/* The reactions of state Power_Component. */
		long transitioned_after = transitioned_before;
		/* Always execute local reactions. */
		transitioned_after = react(transitioned_before);
		return transitioned_after;
	}
	
	private long _Power_Component__Power_Component__Calculating_Power_Consumption___NoPowerConsumed__react(long transitioned_before) {
		/* The reactions of state <NoPowerConsumed>. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (device.getIsOn()) {
				exitSequence__Power_Component__Power_Component__Calculating_Power_Consumption___NoPowerConsumed_();
				enterSequence__Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power__default();
				_Power_Component__Power_Component_react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = _Power_Component__Power_Component_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long _Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power__react(long transitioned_before) {
		/* The reactions of state <Consuming_Power>. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[0]) {
				exitSequence__Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power_();
				totalHour++;
				timeEvents[0] = false;
				enterSequence__Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power__default();
				_Power_Component__Power_Component_react(0l);
				transitioned_after = 0l;
			} else {
				if (!(device.getIsOn())) {
					exitSequence__Power_Component__Power_Component__Calculating_Power_Consumption___Consuming_Power_();
					enterSequence__Power_Component__Power_Component__Calculating_Power_Consumption___NoPowerConsumed__default();
					_Power_Component__Power_Component_react(0l);
					transitioned_after = 0l;
				}
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = _Power_Component__Power_Component_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	/* Can be used by the client code to trigger a run to completion step without raising an event. */
	public void triggerWithoutEvent() {
		runCycle();
	}
}
