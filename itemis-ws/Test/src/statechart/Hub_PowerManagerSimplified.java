/**
 * Generated by itemis CREATE code generator.
 */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import java.util.LinkedList;
import java.util.Queue;

public class Hub_PowerManagerSimplified implements ITimed, IEventDriven {

    public enum State {

        _HUB_POWERMANAGER__MONITORING_POWER_CONSUMPTION, _HUB_POWERMANAGER__THRESHOLD_REACHED, _HUB_POWERMANAGER__THRESHOLD_REACHED__RETURN_DEVICEINDEX_TO_BE_TURNEDOFF__INITIALIZE_LAST_VALUE, _HUB_POWERMANAGER__DOUBLE_CHECK, $NULLSTATE$
    }

    private final State[] stateVector = new State[1];

    private ITimerService timerService;

    private final boolean[] timeEvents = new boolean[4];

    private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();

    private boolean isExecuting;

    private boolean getIsExecuting() {
        return isExecuting;
    }

    private void setIsExecuting(boolean value) {
        this.isExecuting = value;
    }

    public Hub_PowerManagerSimplified() {
        for (int i = 0; i < 1; i++) {
            stateVector[i] = State.$NULLSTATE$;
        }
        clearInEvents();
        /* Default init sequence for statechart Hub_PowerManager */
        setTotal(0l);
        setThreshold(0l);
        setPrev_last_value(0l);
        setLast_value(0l);
        setPrevious_device_index(0l);
        setDevice_index(0l);
        setSystem_index_to_turnoff(0l);
        setOver_threshold(false);
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
        /* Default enter sequence for statechart Hub_PowerManager */
        enterSequence__HUB_PowerManager__default();
        isExecuting = false;
    }

    public void exit() {
        /* Deactivates the state machine. */
        if (getIsExecuting()) {
            return;
        }
        isExecuting = true;
        /* Default exit sequence for statechart Hub_PowerManager */
        exitSequence__HUB_PowerManager_();
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
        threshold_reached = false;
        timeEvents[0] = false;
        timeEvents[1] = false;
        timeEvents[2] = false;
        timeEvents[3] = false;
    }

    private void microStep() {
        switch(stateVector[0]) {
            case _HUB_POWERMANAGER__MONITORING_POWER_CONSUMPTION:
                _HUB_PowerManager__monitoring_power_consumption_react(-1l);
                break;
            case _HUB_POWERMANAGER__THRESHOLD_REACHED__RETURN_DEVICEINDEX_TO_BE_TURNEDOFF__INITIALIZE_LAST_VALUE:
                _HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF__initialize_last_value_react(-1l);
                break;
            case _HUB_POWERMANAGER__DOUBLE_CHECK:
                _HUB_PowerManager__double_check_react(-1l);
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

    private boolean nextEvent() {
        if (!inEventQueue.isEmpty()) {
            inEventQueue.poll().run();
            return true;
        }
        return false;
    }

    /**
     * Returns true if the given state is currently active otherwise false.
     */
    public boolean isStateActive(State state) {
        switch(state) {
            case _HUB_POWERMANAGER__MONITORING_POWER_CONSUMPTION:
                return stateVector[0] == State._HUB_POWERMANAGER__MONITORING_POWER_CONSUMPTION;
            case _HUB_POWERMANAGER__THRESHOLD_REACHED:
                return stateVector[0].ordinal() >= State._HUB_POWERMANAGER__THRESHOLD_REACHED.ordinal() && stateVector[0].ordinal() <= State._HUB_POWERMANAGER__THRESHOLD_REACHED__RETURN_DEVICEINDEX_TO_BE_TURNEDOFF__INITIALIZE_LAST_VALUE.ordinal();
            case _HUB_POWERMANAGER__THRESHOLD_REACHED__RETURN_DEVICEINDEX_TO_BE_TURNEDOFF__INITIALIZE_LAST_VALUE:
                return stateVector[0] == State._HUB_POWERMANAGER__THRESHOLD_REACHED__RETURN_DEVICEINDEX_TO_BE_TURNEDOFF__INITIALIZE_LAST_VALUE;
            case _HUB_POWERMANAGER__DOUBLE_CHECK:
                return stateVector[0] == State._HUB_POWERMANAGER__DOUBLE_CHECK;
            default:
                return false;
        }
    }

    public void setTimerService(ITimerService timerService) {
        this.timerService = timerService;
    }

    private ITimerService getTimerService() {
        return timerService;
    }

    public void raiseTimeEvent(int eventID) {
        inEventQueue.add(() -> {
            timeEvents[eventID] = true;
        });
        runCycle();
    }

    private boolean threshold_reached;

    public void raiseThreshold_reached() {
        inEventQueue.add(() -> {
            threshold_reached = true;
        });
        runCycle();
    }

    private long total;

    private long getTotal() {
        return total;
    }

    private void setTotal(long value) {
        this.total = value;
    }

    private long threshold;

    private long getThreshold() {
        return threshold;
    }

    private void setThreshold(long value) {
        this.threshold = value;
    }

    private long prev_last_value;

    private long getPrev_last_value() {
        return prev_last_value;
    }

    private void setPrev_last_value(long value) {
        this.prev_last_value = value;
    }

    private long last_value;

    private long getLast_value() {
        return last_value;
    }

    private void setLast_value(long value) {
        this.last_value = value;
    }

    private long previous_device_index;

    private long getPrevious_device_index() {
        return previous_device_index;
    }

    private void setPrevious_device_index(long value) {
        this.previous_device_index = value;
    }

    private long device_index;

    private long getDevice_index() {
        return device_index;
    }

    private void setDevice_index(long value) {
        this.device_index = value;
    }

    private long system_index_to_turnoff;

    private long getSystem_index_to_turnoff() {
        return system_index_to_turnoff;
    }

    private void setSystem_index_to_turnoff(long value) {
        this.system_index_to_turnoff = value;
    }

    private boolean over_threshold;

    private boolean getOver_threshold() {
        return over_threshold;
    }

    private void setOver_threshold(boolean value) {
        this.over_threshold = value;
    }

    /* Entry action for state 'monitoring_power_consumption'. */
    private void entryAction__HUB_PowerManager__monitoring_power_consumption() {
        /* Entry action for state 'monitoring_power_consumption'. */
        timerService.setTimer(this, 0, 500l, true);
        setOver_threshold(false);
        setPrevious_device_index(device_index);
        setPrev_last_value(last_value);
    }

    /* Entry action for state 'threshold_reached'. */
    private void entryAction__HUB_PowerManager__threshold_reached() {
        /* Entry action for state 'threshold_reached'. */
        timerService.setTimer(this, 1, 500l, false);
        setOver_threshold(true);
    }

    /* Entry action for state 'initialize_last_value'. */
    private void entryAction__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF__initialize_last_value() {
        /* Entry action for state 'initialize_last_value'. */
        setSystem_index_to_turnoff(device_index);
    }

    /* Entry action for state 'double_check'. */
    private void entryAction__HUB_PowerManager__double_check() {
        /* Entry action for state 'double_check'. */
        timerService.setTimer(this, 2, (1l * 1000l), false);
        timerService.setTimer(this, 3, (1l * 1000l), false);
        setTotal(getTotal() - last_value);
        setOver_threshold(false);
    }

    /* Exit action for state 'monitoring_power_consumption'. */
    private void exitAction__HUB_PowerManager__monitoring_power_consumption() {
        /* Exit action for state 'monitoring_power_consumption'. */
        timerService.unsetTimer(this, 0);
    }

    /* Exit action for state 'threshold_reached'. */
    private void exitAction__HUB_PowerManager__threshold_reached() {
        /* Exit action for state 'threshold_reached'. */
        timerService.unsetTimer(this, 1);
    }

    /* Exit action for state 'double_check'. */
    private void exitAction__HUB_PowerManager__double_check() {
        /* Exit action for state 'double_check'. */
        timerService.unsetTimer(this, 2);
        timerService.unsetTimer(this, 3);
    }

    /* 'default' enter sequence for state monitoring_power_consumption */
    private void enterSequence__HUB_PowerManager__monitoring_power_consumption_default() {
        /* 'default' enter sequence for state monitoring_power_consumption */
        entryAction__HUB_PowerManager__monitoring_power_consumption();
        stateVector[0] = State._HUB_POWERMANAGER__MONITORING_POWER_CONSUMPTION;
    }

    /* 'default' enter sequence for state threshold_reached */
    private void enterSequence__HUB_PowerManager__threshold_reached_default() {
        /* 'default' enter sequence for state threshold_reached */
        entryAction__HUB_PowerManager__threshold_reached();
        enterSequence__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF__default();
    }

    /* 'default' enter sequence for state initialize_last_value */
    private void enterSequence__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF__initialize_last_value_default() {
        /* 'default' enter sequence for state initialize_last_value */
        entryAction__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF__initialize_last_value();
        stateVector[0] = State._HUB_POWERMANAGER__THRESHOLD_REACHED__RETURN_DEVICEINDEX_TO_BE_TURNEDOFF__INITIALIZE_LAST_VALUE;
    }

    /* 'default' enter sequence for state double_check */
    private void enterSequence__HUB_PowerManager__double_check_default() {
        /* 'default' enter sequence for state double_check */
        entryAction__HUB_PowerManager__double_check();
        stateVector[0] = State._HUB_POWERMANAGER__DOUBLE_CHECK;
    }

    /* 'default' enter sequence for region <HUB_PowerManager> */
    private void enterSequence__HUB_PowerManager__default() {
        /* 'default' enter sequence for region <HUB_PowerManager> */
        react__HUB_PowerManager___entry_Default();
    }

    /* 'default' enter sequence for region <Return_DeviceIndex_To_Be_TurnedOFF> */
    private void enterSequence__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF__default() {
        /* 'default' enter sequence for region <Return_DeviceIndex_To_Be_TurnedOFF> */
        react__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF___entry_Default();
    }

    /* Default exit sequence for state monitoring_power_consumption */
    private void exitSequence__HUB_PowerManager__monitoring_power_consumption() {
        /* Default exit sequence for state monitoring_power_consumption */
        stateVector[0] = State.$NULLSTATE$;
        exitAction__HUB_PowerManager__monitoring_power_consumption();
    }

    /* Default exit sequence for state threshold_reached */
    private void exitSequence__HUB_PowerManager__threshold_reached() {
        /* Default exit sequence for state threshold_reached */
        exitSequence__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF_();
        exitAction__HUB_PowerManager__threshold_reached();
    }

    /* Default exit sequence for state initialize_last_value */
    private void exitSequence__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF__initialize_last_value() {
        /* Default exit sequence for state initialize_last_value */
        stateVector[0] = State.$NULLSTATE$;
    }

    /* Default exit sequence for state double_check */
    private void exitSequence__HUB_PowerManager__double_check() {
        /* Default exit sequence for state double_check */
        stateVector[0] = State.$NULLSTATE$;
        exitAction__HUB_PowerManager__double_check();
    }

    /* Default exit sequence for region <HUB_PowerManager> */
    private void exitSequence__HUB_PowerManager_() {
        /* Default exit sequence for region <HUB_PowerManager> */
        switch(stateVector[0]) {
            case _HUB_POWERMANAGER__MONITORING_POWER_CONSUMPTION:
                exitSequence__HUB_PowerManager__monitoring_power_consumption();
                break;
            case _HUB_POWERMANAGER__THRESHOLD_REACHED__RETURN_DEVICEINDEX_TO_BE_TURNEDOFF__INITIALIZE_LAST_VALUE:
                exitSequence__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF__initialize_last_value();
                exitAction__HUB_PowerManager__threshold_reached();
                break;
            case _HUB_POWERMANAGER__DOUBLE_CHECK:
                exitSequence__HUB_PowerManager__double_check();
                break;
            default:
                break;
        }
    }

    /* Default exit sequence for region <Return_DeviceIndex_To_Be_TurnedOFF> */
    private void exitSequence__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF_() {
        /* Default exit sequence for region <Return_DeviceIndex_To_Be_TurnedOFF> */
        switch(stateVector[0]) {
            case _HUB_POWERMANAGER__THRESHOLD_REACHED__RETURN_DEVICEINDEX_TO_BE_TURNEDOFF__INITIALIZE_LAST_VALUE:
                exitSequence__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF__initialize_last_value();
                break;
            default:
                break;
        }
    }

    /* Default react sequence for initial entry  */
    private void react__HUB_PowerManager___entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence__HUB_PowerManager__monitoring_power_consumption_default();
    }

    /* Default react sequence for initial entry  */
    private void react__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF___entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence__HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF__initialize_last_value_default();
    }

    private long react(long transitioned_before) {
        /* State machine reactions. */
        return transitioned_before;
    }

    private long _HUB_PowerManager__monitoring_power_consumption_react(long transitioned_before) {
        /* The reactions of state monitoring_power_consumption. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (threshold_reached) {
                exitSequence__HUB_PowerManager__monitoring_power_consumption();
                enterSequence__HUB_PowerManager__threshold_reached_default();
                react(0l);
                transitioned_after = 0l;
            } else {
                if (((timeEvents[0]) && (getTotal() > getThreshold()))) {
                    exitSequence__HUB_PowerManager__monitoring_power_consumption();
                    raiseThreshold_reached();
                    timeEvents[0] = false;
                    enterSequence__HUB_PowerManager__monitoring_power_consumption_default();
                    react(0l);
                    transitioned_after = 0l;
                }
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            transitioned_after = react(transitioned_before);
        }
        return transitioned_after;
    }

    private long _HUB_PowerManager__threshold_reached_react(long transitioned_before) {
        /* The reactions of state threshold_reached. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (timeEvents[1]) {
                exitSequence__HUB_PowerManager__threshold_reached();
                timeEvents[1] = false;
                enterSequence__HUB_PowerManager__double_check_default();
                react(0l);
                transitioned_after = 0l;
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            transitioned_after = react(transitioned_before);
        }
        return transitioned_after;
    }

    private long _HUB_PowerManager__threshold_reached__Return_DeviceIndex_To_Be_TurnedOFF__initialize_last_value_react(long transitioned_before) {
        /* The reactions of state initialize_last_value. */
        long transitioned_after = transitioned_before;
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            transitioned_after = _HUB_PowerManager__threshold_reached_react(transitioned_before);
        }
        return transitioned_after;
    }

    private long _HUB_PowerManager__double_check_react(long transitioned_before) {
        /* The reactions of state double_check. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (((timeEvents[2]) && (getTotal() >= getThreshold()))) {
                exitSequence__HUB_PowerManager__double_check();
                setDevice_index(previous_device_index);
                setLast_value(prev_last_value);
                timeEvents[2] = false;
                enterSequence__HUB_PowerManager__threshold_reached_default();
                react(0l);
                transitioned_after = 0l;
            } else {
                if (((timeEvents[3]) && (getTotal() < getThreshold()))) {
                    exitSequence__HUB_PowerManager__double_check();
                    timeEvents[3] = false;
                    enterSequence__HUB_PowerManager__monitoring_power_consumption_default();
                    react(0l);
                    transitioned_after = 0l;
                }
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
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
