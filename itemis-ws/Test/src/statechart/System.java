/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.rx.Observer;
import java.util.LinkedList;
import java.util.Queue;
import statechart._MotorControl;
import statechart._Physics;
import statechart._Trolley;

public class System implements IEventDriven {
	public enum State {
		MAIN_REGION_SYSTEM,
		MAIN_REGION_SYSTEM_REGION_DEFAULT,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean trolley_setTargetSpeed;
	
	private double trolley_setTargetSpeedValue;
	private boolean physics_update;
	private boolean motorControl_setAcceleration;
	
	private double motorControl_setAccelerationValue;
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public System() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart System */
		setPhysics(null);
		setMotorControl(null);
		setTrolley(null);
		
		isExecuting = false;
	}
	
	public void enter() {
		/* Activates the state machine. */
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default enter sequence for statechart System */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart System */
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
		trolley_setTargetSpeed = false;
		physics_update = false;
		motorControl_setAcceleration = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_SYSTEM_REGION_DEFAULT:
			main_region_System_region_Default_react(-1l);
			break;
		default:
			break;
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
		case MAIN_REGION_SYSTEM:
			return stateVector[0].ordinal() >= State.
					MAIN_REGION_SYSTEM.ordinal()&& stateVector[0].ordinal() <= State.MAIN_REGION_SYSTEM_REGION_DEFAULT.ordinal();
		case MAIN_REGION_SYSTEM_REGION_DEFAULT:
			return stateVector[0] == State.MAIN_REGION_SYSTEM_REGION_DEFAULT;
		default:
			return false;
		}
	}
	
	
	protected void raiseTrolley_setTargetSpeed(final double value) {
		inEventQueue.add(() -> {
			trolley_setTargetSpeedValue = value;
			trolley_setTargetSpeed = true;
		});
		runCycle();
	}
	protected double getTrolley_setTargetSpeedValue() {
		if (! trolley_setTargetSpeed ) 
			throw new IllegalStateException("Illegal event value access. Event Trolley_setTargetSpeed is not raised!");
		return trolley_setTargetSpeedValue;
	}
	
	protected void raisePhysics_update() {
		inEventQueue.add(() -> {
			physics_update = true;
		});
		runCycle();
	}
	
	protected void raiseMotorControl_setAcceleration(final double value) {
		inEventQueue.add(() -> {
			motorControl_setAccelerationValue = value;
			motorControl_setAcceleration = true;
		});
		runCycle();
	}
	protected double getMotorControl_setAccelerationValue() {
		if (! motorControl_setAcceleration ) 
			throw new IllegalStateException("Illegal event value access. Event MotorControl_setAcceleration is not raised!");
		return motorControl_setAccelerationValue;
	}
	
	private _Physics physics;
	
	private Observer<Void> physics_update_observer = new Observer<Void>() {
		@Override
		public void next(Void value) {
			raisePhysics_update();
		}
	};
	
	
	public _Physics getPhysics() {
		return physics;
	}
	
	public void setPhysics(_Physics value) {
		if (this.physics != null) {
			this.physics.getUpdate().unsubscribe(physics_update_observer);
		}
		
		this.physics = value;
		
		if (this.physics != null) {
			this.physics.getUpdate().subscribe(physics_update_observer);
		}
	}
	
	private _MotorControl motorControl;
	
	private Observer<Double> motorControl_setAcceleration_observer = new Observer<Double>() {
		@Override
		public void next(Double value) {
			raiseMotorControl_setAcceleration(value);
		}
	};
	
	
	public _MotorControl getMotorControl() {
		return motorControl;
	}
	
	public void setMotorControl(_MotorControl value) {
		if (this.motorControl != null) {
			this.motorControl.getSetAcceleration().unsubscribe(motorControl_setAcceleration_observer);
		}
		
		this.motorControl = value;
		
		if (this.motorControl != null) {
			this.motorControl.getSetAcceleration().subscribe(motorControl_setAcceleration_observer);
		}
	}
	
	private _Trolley trolley;
	
	private Observer<Double> trolley_setTargetSpeed_observer = new Observer<Double>() {
		@Override
		public void next(Double value) {
			raiseTrolley_setTargetSpeed(value);
		}
	};
	
	
	public _Trolley getTrolley() {
		return trolley;
	}
	
	public void setTrolley(_Trolley value) {
		if (this.trolley != null) {
			this.trolley.getSetTargetSpeed().unsubscribe(trolley_setTargetSpeed_observer);
		}
		
		this.trolley = value;
		
		if (this.trolley != null) {
			this.trolley.getSetTargetSpeed().subscribe(trolley_setTargetSpeed_observer);
		}
	}
	
	/* Entry action for state 'System'. */
	private void entryAction_main_region_System() {
		/* Entry action for state 'System'. */
		getPhysics().enter();
		getMotorControl().enter();
		getTrolley().enter();
	}
	
	/* Exit action for state 'System'. */
	private void exitAction_main_region_System() {
		/* Exit action for state 'System'. */
		getTrolley().exit();
		getMotorControl().exit();
		getPhysics().exit();
	}
	
	/* 'default' enter sequence for state System */
	private void enterSequence_main_region_System_default() {
		/* 'default' enter sequence for state System */
		entryAction_main_region_System();
		enterSequence_main_region_System_region_default();
	}
	
	/* 'default' enter sequence for state Default */
	private void enterSequence_main_region_System_region_Default_default() {
		/* 'default' enter sequence for state Default */
		stateVector[0] = State.MAIN_REGION_SYSTEM_REGION_DEFAULT;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* 'default' enter sequence for region region */
	private void enterSequence_main_region_System_region_default() {
		/* 'default' enter sequence for region region */
		react_main_region_System_region__entry_Default();
	}
	
	/* Default exit sequence for state Default */
	private void exitSequence_main_region_System_region_Default() {
		/* Default exit sequence for state Default */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_SYSTEM_REGION_DEFAULT:
			exitSequence_main_region_System_region_Default();
			exitAction_main_region_System();
			break;
		default:
			break;
		}
	}
	
	/* The reactions of state null. */
	private void react_main_region_System_region__choice_0() {
		/* The reactions of state null. */
		if (getMotorControl_setAccelerationValue()==0l) {
			getTrolley().raiseAtTargetSpeed();
			enterSequence_main_region_System_region_Default_default();
		} else {
			enterSequence_main_region_System_region_Default_default();
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region_System_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_System_region_Default_default();
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_System_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_System_react(long transitioned_before) {
		/* The reactions of state System. */
		long transitioned_after = transitioned_before;
		/* Always execute local reactions. */
		transitioned_after = react(transitioned_before);
		return transitioned_after;
	}
	
	private long main_region_System_region_Default_react(long transitioned_before) {
		/* The reactions of state Default. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (trolley_setTargetSpeed) {
				exitSequence_main_region_System_region_Default();
				getMotorControl().raiseSetTargetSpeed(getTrolley_setTargetSpeedValue());
				enterSequence_main_region_System_region_Default_default();
				main_region_System_react(0l);
				transitioned_after = 0l;
			} else {
				if (physics_update) {
					exitSequence_main_region_System_region_Default();
					getMotorControl().raiseSetActualSpeed(getPhysics().getV());
					enterSequence_main_region_System_region_Default_default();
					main_region_System_react(0l);
					transitioned_after = 0l;
				} else {
					if (motorControl_setAcceleration) {
						exitSequence_main_region_System_region_Default();
						getPhysics().raiseSetAcceleration(getMotorControl_setAccelerationValue());
						react_main_region_System_region__choice_0();
						transitioned_after = 0l;
					}
				}
			}
		}
		/* If no transition was taken */
		if (transitioned_after==transitioned_before) {
			/* then execute local reactions. */
			transitioned_after = main_region_System_react(transitioned_before);
		}
		return transitioned_after;
	}
	
	/* Can be used by the client code to trigger a run to completion step without raising an event. */
	public void triggerWithoutEvent() {
		runCycle();
	}
}