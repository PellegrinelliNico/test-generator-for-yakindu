/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.ICycleBased;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;

public class _01_no_hierarchy implements ITimed, ICycleBased {
	public static class User {
		private boolean on_button;
		
		
		public void raiseOn_button() {
			on_button = true;
		}
		
		private boolean off_button;
		
		
		public void raiseOff_button() {
			off_button = true;
		}
		
		private boolean mode_button;
		
		
		public void raiseMode_button() {
			mode_button = true;
		}
		
	}
	
	public static class Sensor {
		private boolean motion;
		
		
		public void raiseMotion() {
			motion = true;
		}
		
	}
	
	public static class Lum_sensor {
		private boolean bright;
		
		
		public void raiseBright() {
			bright = true;
		}
		
		private boolean dark;
		
		
		public void raiseDark() {
			dark = true;
		}
		
	}
	
	private static class UserEvBuf {
		private boolean on_button;
		private boolean off_button;
		private boolean mode_button;
	}
	private static class SensorEvBuf {
		private boolean motion;
	}
	private static class Lum_sensorEvBuf {
		private boolean bright;
		private boolean dark;
	}
	private static class TimeEventsEvBuf {
		private boolean _01_no_hierarchy_main_region_MotionDetected_time_event_0;
	}
	private static class _01_no_hierarchyEvBuf {
		private UserEvBuf ifaceUser = new UserEvBuf();
		private SensorEvBuf ifaceSensor = new SensorEvBuf();
		private Lum_sensorEvBuf ifaceLum_sensor = new Lum_sensorEvBuf();
		private TimeEventsEvBuf timeEvents = new TimeEventsEvBuf();
	}
	protected User user;
	
	protected Sensor sensor;
	
	protected Lum_sensor lum_sensor;
	
	public enum State {
		MAIN_REGION_MANUALMODE,
		MAIN_REGION_MOTIONDETECTED,
		MAIN_REGION_MOTIONDETECTIONMODE,
		MAIN_REGION_TWILIGHTDETECTIONMODE,
		MAIN_REGION_TWILIGHTDETECTED,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private ITimerService timerService;
	
	private final boolean[] timeEvents = new boolean[1];
	
	private long brightness;
	
	protected long getBrightness() {
		return brightness;
	}
	
	protected void setBrightness(long value) {
		this.brightness = value;
	}
	
	
	private _01_no_hierarchyEvBuf current = new _01_no_hierarchyEvBuf();
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public _01_no_hierarchy() {
		user = new User();
		sensor = new Sensor();
		lum_sensor = new Lum_sensor();
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart _01_no_hierarchy */
		setBrightness(0l);
		
		isExecuting = false;
	}
	
	public void runCycle() {
		/* Performs a 'run to completion' step. */
		if (timerService == null) {
			throw new IllegalStateException("Timer service must be set.");
		}
		
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
		if (timerService == null) {
			throw new IllegalStateException("Timer service must be set.");
		}
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default enter sequence for statechart _01_no_hierarchy */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart _01_no_hierarchy */
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
		current.ifaceUser.on_button = user.on_button;
		user.on_button = false;
		current.ifaceUser.off_button = user.off_button;
		user.off_button = false;
		current.ifaceUser.mode_button = user.mode_button;
		user.mode_button = false;
		current.ifaceSensor.motion = sensor.motion;
		sensor.motion = false;
		current.ifaceLum_sensor.bright = lum_sensor.bright;
		lum_sensor.bright = false;
		current.ifaceLum_sensor.dark = lum_sensor.dark;
		lum_sensor.dark = false;
		current.timeEvents._01_no_hierarchy_main_region_MotionDetected_time_event_0 = timeEvents[0];
		timeEvents[0] = false;
	}
	
	private void clearInEvents() {
		user.on_button = false;
		user.off_button = false;
		user.mode_button = false;
		sensor.motion = false;
		lum_sensor.bright = false;
		lum_sensor.dark = false;
		timeEvents[0] = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_MANUALMODE:
			main_region_ManualMode_react(-1l);
			break;
		case MAIN_REGION_MOTIONDETECTED:
			main_region_MotionDetected_react(-1l);
			break;
		case MAIN_REGION_MOTIONDETECTIONMODE:
			main_region_MotionDetectionMode_react(-1l);
			break;
		case MAIN_REGION_TWILIGHTDETECTIONMODE:
			main_region_TwilightDetectionMode_react(-1l);
			break;
		case MAIN_REGION_TWILIGHTDETECTED:
			main_region_TwilightDetected_react(-1l);
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
		case MAIN_REGION_MANUALMODE:
			return stateVector[0] == State.MAIN_REGION_MANUALMODE;
		case MAIN_REGION_MOTIONDETECTED:
			return stateVector[0] == State.MAIN_REGION_MOTIONDETECTED;
		case MAIN_REGION_MOTIONDETECTIONMODE:
			return stateVector[0] == State.MAIN_REGION_MOTIONDETECTIONMODE;
		case MAIN_REGION_TWILIGHTDETECTIONMODE:
			return stateVector[0] == State.MAIN_REGION_TWILIGHTDETECTIONMODE;
		case MAIN_REGION_TWILIGHTDETECTED:
			return stateVector[0] == State.MAIN_REGION_TWILIGHTDETECTED;
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
		timeEvents[eventID] = true;
	}
	
	public User user() {
		return user;
	}
	
	public Sensor sensor() {
		return sensor;
	}
	
	public Lum_sensor lum_sensor() {
		return lum_sensor;
	}
	
	
	/* Entry action for state 'ManualMode'. */
	private void entryAction_main_region_ManualMode() {
		/* Entry action for state 'ManualMode'. */
		setBrightness(getBrightness() + 1l);
	}
	
	/* Entry action for state 'MotionDetected'. */
	private void entryAction_main_region_MotionDetected() {
		/* Entry action for state 'MotionDetected'. */
		timerService.setTimer(this, 0, (30l * 1000l), false);
		setBrightness(1l);
	}
	
	/* Entry action for state 'MotionDetectionMode'. */
	private void entryAction_main_region_MotionDetectionMode() {
		/* Entry action for state 'MotionDetectionMode'. */
		setBrightness(0l);
	}
	
	/* Entry action for state 'TwilightDetectionMode'. */
	private void entryAction_main_region_TwilightDetectionMode() {
		/* Entry action for state 'TwilightDetectionMode'. */
		setBrightness(0l);
	}
	
	/* Entry action for state 'TwilightDetected'. */
	private void entryAction_main_region_TwilightDetected() {
		/* Entry action for state 'TwilightDetected'. */
		setBrightness(1l);
	}
	
	/* Exit action for state 'MotionDetected'. */
	private void exitAction_main_region_MotionDetected() {
		/* Exit action for state 'MotionDetected'. */
		timerService.unsetTimer(this, 0);
	}
	
	/* 'default' enter sequence for state ManualMode */
	private void enterSequence_main_region_ManualMode_default() {
		/* 'default' enter sequence for state ManualMode */
		entryAction_main_region_ManualMode();
		stateVector[0] = State.MAIN_REGION_MANUALMODE;
	}
	
	/* 'default' enter sequence for state MotionDetected */
	private void enterSequence_main_region_MotionDetected_default() {
		/* 'default' enter sequence for state MotionDetected */
		entryAction_main_region_MotionDetected();
		stateVector[0] = State.MAIN_REGION_MOTIONDETECTED;
	}
	
	/* 'default' enter sequence for state MotionDetectionMode */
	private void enterSequence_main_region_MotionDetectionMode_default() {
		/* 'default' enter sequence for state MotionDetectionMode */
		entryAction_main_region_MotionDetectionMode();
		stateVector[0] = State.MAIN_REGION_MOTIONDETECTIONMODE;
	}
	
	/* 'default' enter sequence for state TwilightDetectionMode */
	private void enterSequence_main_region_TwilightDetectionMode_default() {
		/* 'default' enter sequence for state TwilightDetectionMode */
		entryAction_main_region_TwilightDetectionMode();
		stateVector[0] = State.MAIN_REGION_TWILIGHTDETECTIONMODE;
	}
	
	/* 'default' enter sequence for state TwilightDetected */
	private void enterSequence_main_region_TwilightDetected_default() {
		/* 'default' enter sequence for state TwilightDetected */
		entryAction_main_region_TwilightDetected();
		stateVector[0] = State.MAIN_REGION_TWILIGHTDETECTED;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state ManualMode */
	private void exitSequence_main_region_ManualMode() {
		/* Default exit sequence for state ManualMode */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state MotionDetected */
	private void exitSequence_main_region_MotionDetected() {
		/* Default exit sequence for state MotionDetected */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_MotionDetected();
	}
	
	/* Default exit sequence for state MotionDetectionMode */
	private void exitSequence_main_region_MotionDetectionMode() {
		/* Default exit sequence for state MotionDetectionMode */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state TwilightDetectionMode */
	private void exitSequence_main_region_TwilightDetectionMode() {
		/* Default exit sequence for state TwilightDetectionMode */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state TwilightDetected */
	private void exitSequence_main_region_TwilightDetected() {
		/* Default exit sequence for state TwilightDetected */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_MANUALMODE:
			exitSequence_main_region_ManualMode();
			break;
		case MAIN_REGION_MOTIONDETECTED:
			exitSequence_main_region_MotionDetected();
			break;
		case MAIN_REGION_MOTIONDETECTIONMODE:
			exitSequence_main_region_MotionDetectionMode();
			break;
		case MAIN_REGION_TWILIGHTDETECTIONMODE:
			exitSequence_main_region_TwilightDetectionMode();
			break;
		case MAIN_REGION_TWILIGHTDETECTED:
			exitSequence_main_region_TwilightDetected();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_MotionDetectionMode_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_ManualMode_react(long transitioned_before) {
		/* The reactions of state ManualMode. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.ifaceUser.off_button) {
				exitSequence_main_region_ManualMode();
				enterSequence_main_region_MotionDetectionMode_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (((current.ifaceUser.on_button) && (getBrightness()<10l))) {
					exitSequence_main_region_ManualMode();
					enterSequence_main_region_ManualMode_default();
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
	
	private long main_region_MotionDetected_react(long transitioned_before) {
		/* The reactions of state MotionDetected. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.timeEvents._01_no_hierarchy_main_region_MotionDetected_time_event_0) {
				exitSequence_main_region_MotionDetected();
				current.timeEvents._01_no_hierarchy_main_region_MotionDetected_time_event_0 = false;
				enterSequence_main_region_MotionDetectionMode_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (current.ifaceUser.on_button) {
					exitSequence_main_region_MotionDetected();
					enterSequence_main_region_ManualMode_default();
					react(0l);
					transitioned_after = 0l;
				} else {
					if (current.ifaceSensor.motion) {
						exitSequence_main_region_MotionDetected();
						enterSequence_main_region_MotionDetected_default();
						react(0l);
						transitioned_after = 0l;
					} else {
						if (current.ifaceUser.mode_button) {
							exitSequence_main_region_MotionDetected();
							enterSequence_main_region_TwilightDetectionMode_default();
							react(0l);
							transitioned_after = 0l;
						}
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
	
	private long main_region_MotionDetectionMode_react(long transitioned_before) {
		/* The reactions of state MotionDetectionMode. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.ifaceSensor.motion) {
				exitSequence_main_region_MotionDetectionMode();
				enterSequence_main_region_MotionDetected_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (current.ifaceUser.on_button) {
					exitSequence_main_region_MotionDetectionMode();
					enterSequence_main_region_ManualMode_default();
					react(0l);
					transitioned_after = 0l;
				} else {
					if (current.ifaceUser.mode_button) {
						exitSequence_main_region_MotionDetectionMode();
						enterSequence_main_region_TwilightDetectionMode_default();
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
	
	private long main_region_TwilightDetectionMode_react(long transitioned_before) {
		/* The reactions of state TwilightDetectionMode. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.ifaceLum_sensor.dark) {
				exitSequence_main_region_TwilightDetectionMode();
				enterSequence_main_region_TwilightDetected_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (current.ifaceUser.mode_button) {
					exitSequence_main_region_TwilightDetectionMode();
					enterSequence_main_region_MotionDetectionMode_default();
					react(0l);
					transitioned_after = 0l;
				} else {
					if (current.ifaceUser.on_button) {
						exitSequence_main_region_TwilightDetectionMode();
						enterSequence_main_region_ManualMode_default();
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
	
	private long main_region_TwilightDetected_react(long transitioned_before) {
		/* The reactions of state TwilightDetected. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (current.ifaceLum_sensor.bright) {
				exitSequence_main_region_TwilightDetected();
				enterSequence_main_region_TwilightDetectionMode_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (current.ifaceUser.mode_button) {
					exitSequence_main_region_TwilightDetected();
					enterSequence_main_region_MotionDetectionMode_default();
					react(0l);
					transitioned_after = 0l;
				} else {
					if (current.ifaceUser.on_button) {
						exitSequence_main_region_TwilightDetected();
						enterSequence_main_region_ManualMode_default();
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
	
}
