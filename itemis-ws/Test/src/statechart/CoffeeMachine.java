/** Generated by itemis CREATE code generator. */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import java.util.LinkedList;
import java.util.Queue;

public class CoffeeMachine implements ITimed, IEventDriven {
	public enum State {
		MAIN_REGION_ENTERMONEY,
		MAIN_REGION_AMERICANO,
		MAIN_REGION_LATTE,
		MAIN_REGION_CAPPUCINO,
		MAIN_REGION_RETURN_CANCEL,
		MAIN_REGION_HEAT_AND_WATER,
		MAIN_REGION_CUPDISPENSER,
		$NULLSTATE$
	};
	
	private final State[] stateVector = new State[1];
	
	private ITimerService timerService;
	
	private final boolean[] timeEvents = new boolean[4];
	
	private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();
	private boolean isExecuting;
	
	protected boolean getIsExecuting() {
		return isExecuting;
	}
	
	protected void setIsExecuting(boolean value) {
		this.isExecuting = value;
	}
	public CoffeeMachine() {
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NULLSTATE$;
		}
		
		clearInEvents();
		
		/* Default init sequence for statechart coffeeMachine */
		setValue(0l);
		
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
		/* Default enter sequence for statechart coffeeMachine */
		enterSequence_main_region_default();
		isExecuting = false;
	}
	
	public void exit() {
		/* Deactivates the state machine. */
		if (getIsExecuting()) {
			return;
		}
		isExecuting = true;
		/* Default exit sequence for statechart coffeeMachine */
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
		myEvent = false;
		operate = false;
		returnCoffee = false;
		buttonA = false;
		buttonB = false;
		buttonC = false;
		buttonD = false;
		timeEvents[0] = false;
		timeEvents[1] = false;
		timeEvents[2] = false;
		timeEvents[3] = false;
	}
	
	private void microStep() {
		switch (stateVector[0]) {
		case MAIN_REGION_ENTERMONEY:
			main_region_enterMoney_react(-1l);
			break;
		case MAIN_REGION_AMERICANO:
			main_region_Americano_react(-1l);
			break;
		case MAIN_REGION_LATTE:
			main_region_Latte_react(-1l);
			break;
		case MAIN_REGION_CAPPUCINO:
			main_region_Cappucino_react(-1l);
			break;
		case MAIN_REGION_RETURN_CANCEL:
			main_region_Return_Cancel_react(-1l);
			break;
		case MAIN_REGION_HEAT_AND_WATER:
			main_region_heat_and_water_react(-1l);
			break;
		case MAIN_REGION_CUPDISPENSER:
			main_region_cupDispenser_react(-1l);
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
		case MAIN_REGION_ENTERMONEY:
			return stateVector[0] == State.MAIN_REGION_ENTERMONEY;
		case MAIN_REGION_AMERICANO:
			return stateVector[0] == State.MAIN_REGION_AMERICANO;
		case MAIN_REGION_LATTE:
			return stateVector[0] == State.MAIN_REGION_LATTE;
		case MAIN_REGION_CAPPUCINO:
			return stateVector[0] == State.MAIN_REGION_CAPPUCINO;
		case MAIN_REGION_RETURN_CANCEL:
			return stateVector[0] == State.MAIN_REGION_RETURN_CANCEL;
		case MAIN_REGION_HEAT_AND_WATER:
			return stateVector[0] == State.MAIN_REGION_HEAT_AND_WATER;
		case MAIN_REGION_CUPDISPENSER:
			return stateVector[0] == State.MAIN_REGION_CUPDISPENSER;
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
	
	
	private boolean myEvent;
	
	
	public void raiseMyEvent() {
		inEventQueue.add(() -> {
			myEvent = true;
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
	
	private boolean returnCoffee;
	
	
	public void raiseReturnCoffee() {
		inEventQueue.add(() -> {
			returnCoffee = true;
		});
		runCycle();
	}
	
	private boolean buttonA;
	
	
	public void raiseButtonA() {
		inEventQueue.add(() -> {
			buttonA = true;
		});
		runCycle();
	}
	
	private boolean buttonB;
	
	
	public void raiseButtonB() {
		inEventQueue.add(() -> {
			buttonB = true;
		});
		runCycle();
	}
	
	private boolean buttonC;
	
	
	public void raiseButtonC() {
		inEventQueue.add(() -> {
			buttonC = true;
		});
		runCycle();
	}
	
	private boolean buttonD;
	
	
	public void raiseButtonD() {
		inEventQueue.add(() -> {
			buttonD = true;
		});
		runCycle();
	}
	
	private long value;
	
	public long getValue() {
		return value;
	}
	
	public void setValue(long value) {
		this.value = value;
	}
	
	/* Entry action for state 'enterMoney'. */
	private void entryAction_main_region_enterMoney() {
		/* Entry action for state 'enterMoney'. */
		timerService.setTimer(this, 0, (10l * 1000l), false);
		setValue(0l);
	}
	
	/* Entry action for state 'Americano'. */
	private void entryAction_main_region_Americano() {
		/* Entry action for state 'Americano'. */
		timerService.setTimer(this, 1, (8l * 1000l), false);
	}
	
	/* Entry action for state 'Latte'. */
	private void entryAction_main_region_Latte() {
		/* Entry action for state 'Latte'. */
		timerService.setTimer(this, 2, (10l * 1000l), false);
	}
	
	/* Entry action for state 'Cappucino'. */
	private void entryAction_main_region_Cappucino() {
		/* Entry action for state 'Cappucino'. */
		timerService.setTimer(this, 3, (10l * 1000l), false);
	}
	
	/* Entry action for state 'heat and water'. */
	private void entryAction_main_region_heat_and_water() {
		/* Entry action for state 'heat and water'. */
		setValue(2l);
	}
	
	/* Exit action for state 'enterMoney'. */
	private void exitAction_main_region_enterMoney() {
		/* Exit action for state 'enterMoney'. */
		timerService.unsetTimer(this, 0);
	}
	
	/* Exit action for state 'Americano'. */
	private void exitAction_main_region_Americano() {
		/* Exit action for state 'Americano'. */
		timerService.unsetTimer(this, 1);
	}
	
	/* Exit action for state 'Latte'. */
	private void exitAction_main_region_Latte() {
		/* Exit action for state 'Latte'. */
		timerService.unsetTimer(this, 2);
	}
	
	/* Exit action for state 'Cappucino'. */
	private void exitAction_main_region_Cappucino() {
		/* Exit action for state 'Cappucino'. */
		timerService.unsetTimer(this, 3);
	}
	
	/* 'default' enter sequence for state enterMoney */
	private void enterSequence_main_region_enterMoney_default() {
		/* 'default' enter sequence for state enterMoney */
		entryAction_main_region_enterMoney();
		stateVector[0] = State.MAIN_REGION_ENTERMONEY;
	}
	
	/* 'default' enter sequence for state Americano */
	private void enterSequence_main_region_Americano_default() {
		/* 'default' enter sequence for state Americano */
		entryAction_main_region_Americano();
		stateVector[0] = State.MAIN_REGION_AMERICANO;
	}
	
	/* 'default' enter sequence for state Latte */
	private void enterSequence_main_region_Latte_default() {
		/* 'default' enter sequence for state Latte */
		entryAction_main_region_Latte();
		stateVector[0] = State.MAIN_REGION_LATTE;
	}
	
	/* 'default' enter sequence for state Cappucino */
	private void enterSequence_main_region_Cappucino_default() {
		/* 'default' enter sequence for state Cappucino */
		entryAction_main_region_Cappucino();
		stateVector[0] = State.MAIN_REGION_CAPPUCINO;
	}
	
	/* 'default' enter sequence for state Return/Cancel */
	private void enterSequence_main_region_Return_Cancel_default() {
		/* 'default' enter sequence for state Return/Cancel */
		stateVector[0] = State.MAIN_REGION_RETURN_CANCEL;
	}
	
	/* 'default' enter sequence for state heat and water */
	private void enterSequence_main_region_heat_and_water_default() {
		/* 'default' enter sequence for state heat and water */
		entryAction_main_region_heat_and_water();
		stateVector[0] = State.MAIN_REGION_HEAT_AND_WATER;
	}
	
	/* 'default' enter sequence for state cupDispenser */
	private void enterSequence_main_region_cupDispenser_default() {
		/* 'default' enter sequence for state cupDispenser */
		stateVector[0] = State.MAIN_REGION_CUPDISPENSER;
	}
	
	/* 'default' enter sequence for region main region */
	private void enterSequence_main_region_default() {
		/* 'default' enter sequence for region main region */
		react_main_region__entry_Default();
	}
	
	/* Default exit sequence for state enterMoney */
	private void exitSequence_main_region_enterMoney() {
		/* Default exit sequence for state enterMoney */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_enterMoney();
	}
	
	/* Default exit sequence for state Americano */
	private void exitSequence_main_region_Americano() {
		/* Default exit sequence for state Americano */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_Americano();
	}
	
	/* Default exit sequence for state Latte */
	private void exitSequence_main_region_Latte() {
		/* Default exit sequence for state Latte */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_Latte();
	}
	
	/* Default exit sequence for state Cappucino */
	private void exitSequence_main_region_Cappucino() {
		/* Default exit sequence for state Cappucino */
		stateVector[0] = State.$NULLSTATE$;
		exitAction_main_region_Cappucino();
	}
	
	/* Default exit sequence for state Return/Cancel */
	private void exitSequence_main_region_Return_Cancel() {
		/* Default exit sequence for state Return/Cancel */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state heat and water */
	private void exitSequence_main_region_heat_and_water() {
		/* Default exit sequence for state heat and water */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for state cupDispenser */
	private void exitSequence_main_region_cupDispenser() {
		/* Default exit sequence for state cupDispenser */
		stateVector[0] = State.$NULLSTATE$;
	}
	
	/* Default exit sequence for region main region */
	private void exitSequence_main_region() {
		/* Default exit sequence for region main region */
		switch (stateVector[0]) {
		case MAIN_REGION_ENTERMONEY:
			exitSequence_main_region_enterMoney();
			break;
		case MAIN_REGION_AMERICANO:
			exitSequence_main_region_Americano();
			break;
		case MAIN_REGION_LATTE:
			exitSequence_main_region_Latte();
			break;
		case MAIN_REGION_CAPPUCINO:
			exitSequence_main_region_Cappucino();
			break;
		case MAIN_REGION_RETURN_CANCEL:
			exitSequence_main_region_Return_Cancel();
			break;
		case MAIN_REGION_HEAT_AND_WATER:
			exitSequence_main_region_heat_and_water();
			break;
		case MAIN_REGION_CUPDISPENSER:
			exitSequence_main_region_cupDispenser();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_main_region__entry_Default() {
		/* Default react sequence for initial entry  */
		enterSequence_main_region_enterMoney_default();
	}
	
	private long react(long transitioned_before) {
		/* State machine reactions. */
		return transitioned_before;
	}
	
	private long main_region_enterMoney_react(long transitioned_before) {
		/* The reactions of state enterMoney. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[0]) {
				exitSequence_main_region_enterMoney();
				timeEvents[0] = false;
				enterSequence_main_region_heat_and_water_default();
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
	
	private long main_region_Americano_react(long transitioned_before) {
		/* The reactions of state Americano. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[1]) {
				exitSequence_main_region_Americano();
				timeEvents[1] = false;
				enterSequence_main_region_Americano_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (operate) {
					exitSequence_main_region_Americano();
					enterSequence_main_region_enterMoney_default();
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
	
	private long main_region_Latte_react(long transitioned_before) {
		/* The reactions of state Latte. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[2]) {
				exitSequence_main_region_Latte();
				timeEvents[2] = false;
				enterSequence_main_region_Latte_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (operate) {
					exitSequence_main_region_Latte();
					enterSequence_main_region_enterMoney_default();
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
	
	private long main_region_Cappucino_react(long transitioned_before) {
		/* The reactions of state Cappucino. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (timeEvents[3]) {
				exitSequence_main_region_Cappucino();
				timeEvents[3] = false;
				enterSequence_main_region_Cappucino_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (operate) {
					exitSequence_main_region_Cappucino();
					enterSequence_main_region_enterMoney_default();
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
	
	private long main_region_Return_Cancel_react(long transitioned_before) {
		/* The reactions of state Return/Cancel. */
		long transitioned_after = transitioned_before;
		/* Always execute local reactions. */
		transitioned_after = react(transitioned_before);
		return transitioned_after;
	}
	
	private long main_region_heat_and_water_react(long transitioned_before) {
		/* The reactions of state heat and water. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (buttonA) {
				exitSequence_main_region_heat_and_water();
				enterSequence_main_region_Return_Cancel_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (buttonB) {
					exitSequence_main_region_heat_and_water();
					enterSequence_main_region_cupDispenser_default();
					react(0l);
					transitioned_after = 0l;
				} else {
					if (buttonC) {
						exitSequence_main_region_heat_and_water();
						enterSequence_main_region_cupDispenser_default();
						react(0l);
						transitioned_after = 0l;
					} else {
						if (buttonD) {
							exitSequence_main_region_heat_and_water();
							enterSequence_main_region_cupDispenser_default();
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
	
	private long main_region_cupDispenser_react(long transitioned_before) {
		/* The reactions of state cupDispenser. */
		long transitioned_after = transitioned_before;
		if (transitioned_after<0l) {
			if (operate) {
				exitSequence_main_region_cupDispenser();
				enterSequence_main_region_Americano_default();
				react(0l);
				transitioned_after = 0l;
			} else {
				if (operate) {
					exitSequence_main_region_cupDispenser();
					enterSequence_main_region_Latte_default();
					react(0l);
					transitioned_after = 0l;
				} else {
					if (operate) {
						exitSequence_main_region_cupDispenser();
						enterSequence_main_region_Cappucino_default();
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