/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import java.util.LinkedList;
import java.util.Queue;

public class Controller_Component implements ITimed, IEventDriven {
	public static class Sensors {
		private boolean triggered;
		
		public boolean getTriggered() {
			return triggered;
		}
		
		public void setTriggered(boolean value) {
			this.triggered = value;
		}
		
	}
	
	public static class Actuator {
		private Controller_Component parent;
		
		public Actuator(Controller_Component parent) {
			this.parent = parent;
		}
		private boolean trigger;
		
		
		public void raiseTrigger() {
			parent.inEventQueue.add(() -> {
				trigger = true;
			});
			parent.runCycle();
		}
		
		private boolean triggered;
		
		public boolean getTriggered() {
			return triggered;
		}
		
		public void setTriggered(boolean value) {
			this.triggered = value;
		}
		
	}
	
	protected Sensors sensors;
	
	protected Actuator actuator;
	
	public enum State {
		_CONTROLLER_COMPONENT___CONTROLLER_ISON_,
		_CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___READING_SENSOR_DATA_,
		_CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___CONTROLLER_PROCESSING_,
		_CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___TRIGGER_ACTUATOR_,
		_CONTROLLER_COMPONENT___OFF_,
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
	public Controller_Component() {
		sensors = new Sensors();
		actuator = new Actuator(this);
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart Controller_Component */
		setActivity(false);
		sensors.setTriggered(false);
		actuator.setTriggered(false);
		
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
		/* Default enter sequence for statechart Controller_Component */
		enterSequence__Controller_Component__default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart Controller_Component */
		exitSequence__Controller_Component_();
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
		off = false;
		on = false;
		actuator.trigger = false;
		timeEvents[0] = false;
		timeEvents[1] = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___READING_SENSOR_DATA_:
			_Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data__react(-1l);
			break;
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___CONTROLLER_PROCESSING_:
			_Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Controller_Processing__react(-1l);
			break;
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___TRIGGER_ACTUATOR_:
			_Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator__react(-1l);
			break;
		case _CONTROLLER_COMPONENT___OFF_:
			_Controller_Component___off__react(-1l);
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
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON_:
			return stateVector[0].ordinal() >= State.
					_CONTROLLER_COMPONENT___CONTROLLER_ISON_.ordinal()&& stateVector[0].ordinal() <= State._CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___TRIGGER_ACTUATOR_.ordinal();
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___READING_SENSOR_DATA_:
			return stateVector[0] == State._CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___READING_SENSOR_DATA_;
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___CONTROLLER_PROCESSING_:
			return stateVector[0] == State._CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___CONTROLLER_PROCESSING_;
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___TRIGGER_ACTUATOR_:
			return stateVector[0] == State._CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___TRIGGER_ACTUATOR_;
		case _CONTROLLER_COMPONENT___OFF_:
			return stateVector[0] == State._CONTROLLER_COMPONENT___OFF_;
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
	
	public Sensors sensors() {
		return sensors;
	}
	
	public Actuator actuator() {
		return actuator;
	}
	
	
	private boolean off;
	
	
	public void raiseOff() {
		inEventQueue.add(() -> {
			off = true;
		});
		runCycle();
	}
	
	private boolean on;
	
	
	public void raiseOn() {
		inEventQueue.add(() -> {
			on = true;
		});
		runCycle();
	}
	
	private boolean activity;
	
	public boolean getActivity() {
		return activity;
	}
	
	public void setActivity(boolean value) {
		this.activity = value;
	}
	
	/* Entry action for state '<Reading_Sensor_Data>'. */
	private void entryAction__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data_() {
		/* Entry action for state '<Reading_Sensor_Data>'. */
		timerService.setTimer(this, 0, 100l, true);
		setActivity(false);
	}
	
	/* Entry action for state '<Controller_Processing>'. */
	private void entryAction__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Controller_Processing_() {
		/* Entry action for state '<Controller_Processing>'. */
		setActivity(true);
		actuator.raiseTrigger();
	}
	
	/* Entry action for state '<Trigger_Actuator>'. */
	private void entryAction__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator_() {
		/* Entry action for state '<Trigger_Actuator>'. */
		timerService.setTimer(this, 1, 200l, true);
		actuator.setTriggered(true);
	}
	
	/* Exit action for state '<Reading_Sensor_Data>'. */
	private void exitAction__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data_() {
		/* Exit action for state '<Reading_Sensor_Data>'. */
		timerService.unsetTimer(this, 0);
	}
	
	/* Exit action for state '<Trigger_Actuator>'. */
	private void exitAction__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator_() {
		/* Exit action for state '<Trigger_Actuator>'. */
		timerService.unsetTimer(this, 1);
		actuator.setTriggered(false);
	}
	
	/* 'default' enter sequence for state <Controller_isON> */
	private void enterSequence__Controller_Component___Controller_isON__default() {
		/* 'default' enter sequence for state <Controller_isON> */
		enterSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals__default();
	}
	
	/* 'default' enter sequence for state <Reading_Sensor_Data> */
	private void enterSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data__default() {
		/* 'default' enter sequence for state <Reading_Sensor_Data> */
		entryAction__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data_();
		stateVector[0] = State._CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___READING_SENSOR_DATA_;
	}
	
	/* 'default' enter sequence for state <Controller_Processing> */
	private void enterSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Controller_Processing__default() {
		/* 'default' enter sequence for state <Controller_Processing> */
		entryAction__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Controller_Processing_();
		stateVector[0] = State._CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___CONTROLLER_PROCESSING_;
	}
	
	/* 'default' enter sequence for state <Trigger_Actuator> */
	private void enterSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator__default() {
		/* 'default' enter sequence for state <Trigger_Actuator> */
		entryAction__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator_();
		stateVector[0] = State._CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___TRIGGER_ACTUATOR_;
	}
	
	/* 'default' enter sequence for state <off> */
	private void enterSequence__Controller_Component___off__default() {
		/* 'default' enter sequence for state <off> */
		stateVector[0] = State._CONTROLLER_COMPONENT___OFF_;
	}
	
	/* 'default' enter sequence for region <Controller_Component> */
	private void enterSequence__Controller_Component__default() {
		/* 'default' enter sequence for region <Controller_Component> */
		react__Controller_Component___entry_Default();
	}
	
	/* 'default' enter sequence for region <Controller_Receiving_and_Sending_Signals> */
	private void enterSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals__default() {
		/* 'default' enter sequence for region <Controller_Receiving_and_Sending_Signals> */
		react__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___entry_Default();
	}
	
	/* Default exit sequence for state <Controller_isON> */
	private void exitSequence__Controller_Component___Controller_isON_() {
		/* Default exit sequence for state <Controller_isON> */
		exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals_();
	}
	
	/* Default exit sequence for state <Reading_Sensor_Data> */
	private void exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data_() {
		/* Default exit sequence for state <Reading_Sensor_Data> */
		stateVector[0] = State.$NULLSTATE$;
		exitAction__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data_();
	}
	
	/* Default exit sequence for state <Controller_Processing> */
	private void exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Controller_Processing_() {
		/* Default exit sequence for state <Controller_Processing> */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state <Trigger_Actuator> */
	private void exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator_() {
		/* Default exit sequence for state <Trigger_Actuator> */
		stateVector[0] = State.$NULLSTATE$;
		exitAction__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator_();
	}
	
	/* Default exit sequence for state <off> */
	private void exitSequence__Controller_Component___off_() {
		/* Default exit sequence for state <off> */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region <Controller_Component> */
	private void exitSequence__Controller_Component_() {
		/* Default exit sequence for region <Controller_Component> */
		switch (stateVector[0]) {
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___READING_SENSOR_DATA_:
			exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data_();
			break;
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___CONTROLLER_PROCESSING_:
			exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Controller_Processing_();
			break;
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___TRIGGER_ACTUATOR_:
			exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator_();
			break;
		case _CONTROLLER_COMPONENT___OFF_:
			exitSequence__Controller_Component___off_();
			break;
		default:
			break;
		}
	}
	
	/* Default exit sequence for region <Controller_Receiving_and_Sending_Signals> */
	private void exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals_() {
		/* Default exit sequence for region <Controller_Receiving_and_Sending_Signals> */
		switch (stateVector[0]) {
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___READING_SENSOR_DATA_:
			exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data_();
			break;
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___CONTROLLER_PROCESSING_:
			exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Controller_Processing_();
			break;
		case _CONTROLLER_COMPONENT___CONTROLLER_ISON___CONTROLLER_RECEIVING_AND_SENDING_SIGNALS___TRIGGER_ACTUATOR_:
			exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator_();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react__Controller_Component___entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence__Controller_Component___Controller_isON__default();
	}
	
	/* Default react sequence for initial entry  */
	private void react__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data__default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long _Controller_Component___Controller_isON__react(long transitioned_before) {
		/* The reactions of state <Controller_isON>. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (off) {
				exitSequence__Controller_Component___Controller_isON_();
				enterSequence__Controller_Component___off__default();
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
	
	private long _Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data__react(long transitioned_before) {
		/* The reactions of state <Reading_Sensor_Data>. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (sensors.getTriggered()) {
				exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data_();
				enterSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Controller_Processing__default();
				_Controller_Component___Controller_isON__react(0l);
				transitioned_after = 0l;
			} else {
				if (timeEvents[0]) {
					exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data_();
					timeEvents[0] = false;
					enterSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data__default();
					_Controller_Component___Controller_isON__react(0l);
					transitioned_after = 0l;
				}
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = _Controller_Component___Controller_isON__react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long _Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Controller_Processing__react(long transitioned_before) {
		/* The reactions of state <Controller_Processing>. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (actuator.trigger) {
				exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Controller_Processing_();
				enterSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator__default();
				_Controller_Component___Controller_isON__react(0l);
				transitioned_after = 0l;
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = _Controller_Component___Controller_isON__react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long _Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator__react(long transitioned_before) {
		/* The reactions of state <Trigger_Actuator>. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (!(sensors.getTriggered())) {
				exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator_();
				enterSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Reading_Sensor_Data__default();
				_Controller_Component___Controller_isON__react(0l);
				transitioned_after = 0l;
			} else {
				if (timeEvents[1]) {
					exitSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator_();
					timeEvents[1] = false;
					enterSequence__Controller_Component___Controller_isON___Controller_Receiving_and_Sending_Signals___Trigger_Actuator__default();
					_Controller_Component___Controller_isON__react(0l);
					transitioned_after = 0l;
				}
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = _Controller_Component___Controller_isON__react(transitioned_before);
		}
		return transitioned_after;
	}
	
	private long _Controller_Component___off__react(long transitioned_before) {
		/* The reactions of state <off>. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (on) {
				exitSequence__Controller_Component___off_();
				enterSequence__Controller_Component___Controller_isON__default();
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
