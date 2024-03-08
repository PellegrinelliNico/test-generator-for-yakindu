/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import java.util.LinkedList;
import java.util.Queue;

public class Light implements IEventDriven {
	public static class Lightning {
		private Light parent;
		
		public Lightning(Light parent) {
			this.parent = parent;
		}
		private boolean strike;
		
		
		public void raiseStrike() {
			parent.inEventQueue.add(() -> {
				strike = true;
			});
			parent.runCycle();
		}
		
	}
	
	public static class Switch {
		private Light parent;
		
		public Switch(Light parent) {
			this.parent = parent;
		}
		private boolean toggle;
		
		
		public void raiseToggle() {
			parent.inEventQueue.add(() -> {
				toggle = true;
			});
			parent.runCycle();
		}
		
		private boolean increaseBrightness;
		
		
		public void raiseIncreaseBrightness() {
			parent.inEventQueue.add(() -> {
				increaseBrightness = true;
			});
			parent.runCycle();
		}
		
		private boolean reduceBrightness;
		
		
		public void raiseReduceBrightness() {
			parent.inEventQueue.add(() -> {
				reduceBrightness = true;
			});
			parent.runCycle();
		}
		
	}
	
	public static class Color {
		private Light parent;
		
		public Color(Light parent) {
			this.parent = parent;
		}
		private boolean change;
		
		
		public void raiseChange() {
			parent.inEventQueue.add(() -> {
				change = true;
			});
			parent.runCycle();
		}
		
		private String value;
		
		public String getValue() {
			return value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
		
	}
	
	protected Lightning lightning;
	
	protected Switch switch_ID;
	
	protected Color color;
	
	public enum State {
		MAIN_REGION_OFF,
		MAIN_REGION_ON,
		MAIN_REGION_BROKEN,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private double x;
	
	protected double getX() {
		return x;
	}
	
	protected void setX(double value) {
		this.x = value;
	}
	
	
	public static final double y = 3.14;
	
	protected double getY() {
		return y;
	}
	
	
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public Light() {
		lightning = new Lightning(this);
		switch_ID = new Switch(this);
		color = new Color(this);
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart Light */
		setX(0.0);
		setBrigthness(minBrightness);
		color.setValue("LIGHT");
		
		isExecuting = false;
	}
	
	public void enter() {
		/* Activates the state machine. */
		
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default enter sequence for statechart Light */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart Light */
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
		repair = false;
		lightning.strike = false;
		switch_ID.toggle = false;
		switch_ID.increaseBrightness = false;
		switch_ID.reduceBrightness = false;
		color.change = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_OFF:
			main_region_Off_react(-1l);
			break;
		case MAIN_REGION_ON:
			main_region_On_react(-1l);
			break;
		case MAIN_REGION_BROKEN:
			main_region_broken_react(-1l);
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
		case MAIN_REGION_OFF:
			return stateVector[0] == State.MAIN_REGION_OFF;
		case MAIN_REGION_ON:
			return stateVector[0] == State.MAIN_REGION_ON;
		case MAIN_REGION_BROKEN:
			return stateVector[0] == State.MAIN_REGION_BROKEN;
		default:
			return false;
		}
	}
	
	public Lightning lightning() {
		return lightning;
	}
	
	public Switch switch_ID() {
		return switch_ID;
	}
	
	public Color color() {
		return color;
	}
	
	
	private boolean repair;
	
	
	public void raiseRepair() {
		inEventQueue.add(() -> {
			repair = true;
		});
		runCycle();
	}
	
	public static final long maxBrightness = 100l;
	
	public long getMaxBrightness() {
		return maxBrightness;
	}
	
	public static final long minBrightness = 0l;
	
	public long getMinBrightness() {
		return minBrightness;
	}
	
	private long brigthness;
	
	public long getBrigthness() {
		return brigthness;
	}
	
	public void setBrigthness(long value) {
		this.brigthness = value;
	}
	
	/* Entry action for state 'Off'. */
	private void entryAction_main_region_Off() {
		/* Entry action for state 'Off'. */
		setBrigthness(0l);
	}
	
	/* 'default' enter sequence for state Off */
	private void enterSequence_main_region_Off_default() {
		/* 'default' enter sequence for state Off */
		entryAction_main_region_Off();
		stateVector[0] = State.MAIN_REGION_OFF;
	}
	
	/* 'default' enter sequence for state On */
	private void enterSequence_main_region_On_default() {
		/* 'default' enter sequence for state On */
		stateVector[0] = State.MAIN_REGION_ON;
	}
	
	/* 'default' enter sequence for state broken */
	private void enterSequence_main_region_broken_default() {
		/* 'default' enter sequence for state broken */
		stateVector[0] = State.MAIN_REGION_BROKEN;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state Off */
	private void exitSequence_main_region_Off() {
		/* Default exit sequence for state Off */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state On */
	private void exitSequence_main_region_On() {
		/* Default exit sequence for state On */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state broken */
	private void exitSequence_main_region_broken() {
		/* Default exit sequence for state broken */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_OFF:
			exitSequence_main_region_Off();
			break;
		case MAIN_REGION_ON:
			exitSequence_main_region_On();
			break;
		case MAIN_REGION_BROKEN:
			exitSequence_main_region_broken();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_Off_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_Off_react(long transitioned_before) {
		/* The reactions of state Off. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (switch_ID.toggle) {
				exitSequence_main_region_Off();
				setBrigthness(minBrightness);
				enterSequence_main_region_On_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (lightning.strike) {
					exitSequence_main_region_Off();
					enterSequence_main_region_Off_default();
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
			if (switch_ID.toggle) {
				exitSequence_main_region_On();
				enterSequence_main_region_Off_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (lightning.strike) {
					exitSequence_main_region_On();
					setBrigthness(minBrightness);
					enterSequence_main_region_broken_default();
					react(0l);
					transitioned_after = 0l;
				} else {
					if (((switch_ID.increaseBrightness) && (getBrigthness()<getMaxBrightness()))) {
						exitSequence_main_region_On();
						setBrigthness(getBrigthness() + 10l);
						enterSequence_main_region_On_default();
						react(0l);
						transitioned_after = 0l;
					} else {
						if (((switch_ID.reduceBrightness) && (getBrigthness()>getMinBrightness()))) {
							exitSequence_main_region_On();
							setBrigthness(getBrigthness() - 10l);
							enterSequence_main_region_On_default();
							react(0l);
							transitioned_after = 0l;
						} else {
							if (color.change) {
								exitSequence_main_region_On();
								color.setValue("RED");
								enterSequence_main_region_On_default();
								react(0l);
								transitioned_after = 0l;
							}
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
	
	private long main_region_broken_react(long transitioned_before) {
		/* The reactions of state broken. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (repair) {
				exitSequence_main_region_broken();
				enterSequence_main_region_Off_default();
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
