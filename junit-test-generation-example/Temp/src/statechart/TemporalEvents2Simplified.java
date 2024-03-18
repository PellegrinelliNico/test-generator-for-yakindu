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

public class TemporalEvents2Simplified implements ITimed, IEventDriven {

    public enum State {

        MAIN_REGION_STATEA,
        MAIN_REGION_STATEB,
        MAIN_REGION_STATEC,
        MAIN_REGION_STATEO,
        MAIN_REGION_STATED,
        $NULLSTATE$
    }

    private final State[] stateVector = new State[1];

    private ITimerService timerService;

    private final boolean[] timeEvents = new boolean[7];

    private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();

    private boolean isExecuting;

    private boolean getIsExecuting() {
        return isExecuting;
    }

    private void setIsExecuting(boolean value) {
        this.isExecuting = value;
    }

    public TemporalEvents2Simplified() {
        for (int i = 0; i < 1; i++) {
            stateVector[i] = State.$NULLSTATE$;
        }
        clearInEvents();
        /* Default init sequence for statechart TemporalEvents2 */
        setT(0l);
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
        /* Default enter sequence for statechart TemporalEvents2 */
        enterSequence_main_region_default();
        isExecuting = false;
    }

    public void exit() {
        /* Deactivates the state machine. */
        if (getIsExecuting()) {
            return;
        }
        isExecuting = true;
        /* Default exit sequence for statechart TemporalEvents2 */
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
        timeEvents[0] = false;
        timeEvents[1] = false;
        timeEvents[2] = false;
        timeEvents[3] = false;
        timeEvents[4] = false;
        timeEvents[5] = false;
        timeEvents[6] = false;
    }

    private void microStep() {
        switch(stateVector[0]) {
            case MAIN_REGION_STATEA:
                main_region_StateA_react(-1l);
                break;
            case MAIN_REGION_STATEB:
                main_region_StateB_react(-1l);
                break;
            case MAIN_REGION_STATEC:
                main_region_StateC_react(-1l);
                break;
            case MAIN_REGION_STATEO:
                main_region_StateO_react(-1l);
                break;
            case MAIN_REGION_STATED:
                main_region_StateD_react(-1l);
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
            case MAIN_REGION_STATEA:
                return stateVector[0] == State.MAIN_REGION_STATEA;
            case MAIN_REGION_STATEB:
                return stateVector[0] == State.MAIN_REGION_STATEB;
            case MAIN_REGION_STATEC:
                return stateVector[0] == State.MAIN_REGION_STATEC;
            case MAIN_REGION_STATEO:
                return stateVector[0] == State.MAIN_REGION_STATEO;
            case MAIN_REGION_STATED:
                return stateVector[0] == State.MAIN_REGION_STATED;
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

    private long t;

    private long getT() {
        return t;
    }

    private void setT(long value) {
        this.t = value;
    }

    /* Entry action for state 'StateA'. */
    private void entryAction_main_region_StateA() {
        /* Entry action for state 'StateA'. */
        timerService.setTimer(this, 0, (1l * 1000l), false);
        timerService.setTimer(this, 1, 500l, true);
        setT(0l);
    }

    /* Entry action for state 'StateB'. */
    private void entryAction_main_region_StateB() {
        /* Entry action for state 'StateB'. */
        timerService.setTimer(this, 2, 1l, false);
        timerService.setTimer(this, 3, (500l / 1000l), true);
    }

    /* Entry action for state 'StateC'. */
    private void entryAction_main_region_StateC() {
        /* Entry action for state 'StateC'. */
        timerService.setTimer(this, 4, (1l / 1000l), false);
        timerService.setTimer(this, 5, (500l / 1000000l), true);
    }

    /* Entry action for state 'StateO'. */
    private void entryAction_main_region_StateO() {
        /* Entry action for state 'StateO'. */
        timerService.setTimer(this, 6, (10l * 1000l), false);
    }

    /* Exit action for state 'StateA'. */
    private void exitAction_main_region_StateA() {
        /* Exit action for state 'StateA'. */
        timerService.unsetTimer(this, 0);
        timerService.unsetTimer(this, 1);
    }

    /* Exit action for state 'StateB'. */
    private void exitAction_main_region_StateB() {
        /* Exit action for state 'StateB'. */
        timerService.unsetTimer(this, 2);
        timerService.unsetTimer(this, 3);
    }

    /* Exit action for state 'StateC'. */
    private void exitAction_main_region_StateC() {
        /* Exit action for state 'StateC'. */
        timerService.unsetTimer(this, 4);
        timerService.unsetTimer(this, 5);
    }

    /* Exit action for state 'StateO'. */
    private void exitAction_main_region_StateO() {
        /* Exit action for state 'StateO'. */
        timerService.unsetTimer(this, 6);
    }

    /* 'default' enter sequence for state StateA */
    private void enterSequence_main_region_StateA_default() {
        /* 'default' enter sequence for state StateA */
        entryAction_main_region_StateA();
        stateVector[0] = State.MAIN_REGION_STATEA;
    }

    /* 'default' enter sequence for state StateB */
    private void enterSequence_main_region_StateB_default() {
        /* 'default' enter sequence for state StateB */
        entryAction_main_region_StateB();
        stateVector[0] = State.MAIN_REGION_STATEB;
    }

    /* 'default' enter sequence for state StateC */
    private void enterSequence_main_region_StateC_default() {
        /* 'default' enter sequence for state StateC */
        entryAction_main_region_StateC();
        stateVector[0] = State.MAIN_REGION_STATEC;
    }

    /* 'default' enter sequence for state StateO */
    private void enterSequence_main_region_StateO_default() {
        /* 'default' enter sequence for state StateO */
        entryAction_main_region_StateO();
        stateVector[0] = State.MAIN_REGION_STATEO;
    }

    /* 'default' enter sequence for state StateD */
    private void enterSequence_main_region_StateD_default() {
        /* 'default' enter sequence for state StateD */
        stateVector[0] = State.MAIN_REGION_STATED;
    }

    /* 'default' enter sequence for region main region */
    private void enterSequence_main_region_default() {
        /* 'default' enter sequence for region main region */
        react_main_region__entry_Default();
    }

    /* Default exit sequence for state StateA */
    private void exitSequence_main_region_StateA() {
        /* Default exit sequence for state StateA */
        stateVector[0] = State.$NULLSTATE$;
        exitAction_main_region_StateA();
    }

    /* Default exit sequence for state StateB */
    private void exitSequence_main_region_StateB() {
        /* Default exit sequence for state StateB */
        stateVector[0] = State.$NULLSTATE$;
        exitAction_main_region_StateB();
    }

    /* Default exit sequence for state StateC */
    private void exitSequence_main_region_StateC() {
        /* Default exit sequence for state StateC */
        stateVector[0] = State.$NULLSTATE$;
        exitAction_main_region_StateC();
    }

    /* Default exit sequence for state StateO */
    private void exitSequence_main_region_StateO() {
        /* Default exit sequence for state StateO */
        stateVector[0] = State.$NULLSTATE$;
        exitAction_main_region_StateO();
    }

    /* Default exit sequence for state StateD */
    private void exitSequence_main_region_StateD() {
        /* Default exit sequence for state StateD */
        stateVector[0] = State.$NULLSTATE$;
    }

    /* Default exit sequence for region main region */
    private void exitSequence_main_region() {
        /* Default exit sequence for region main region */
        switch(stateVector[0]) {
            case MAIN_REGION_STATEA:
                exitSequence_main_region_StateA();
                break;
            case MAIN_REGION_STATEB:
                exitSequence_main_region_StateB();
                break;
            case MAIN_REGION_STATEC:
                exitSequence_main_region_StateC();
                break;
            case MAIN_REGION_STATEO:
                exitSequence_main_region_StateO();
                break;
            case MAIN_REGION_STATED:
                exitSequence_main_region_StateD();
                break;
            default:
                break;
        }
    }

    /* Default react sequence for initial entry  */
    private void react_main_region__entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence_main_region_StateO_default();
    }

    private long react(long transitioned_before) {
        /* State machine reactions. */
        return transitioned_before;
    }

    private long main_region_StateA_react(long transitioned_before) {
        /* The reactions of state StateA. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (timeEvents[0]) {
                exitSequence_main_region_StateA();
                timeEvents[0] = false;
                enterSequence_main_region_StateB_default();
                react(0l);
                transitioned_after = 0l;
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            if (timeEvents[1]) {
                setT(getT() + 1l);
            }
            transitioned_after = react(transitioned_before);
        }
        return transitioned_after;
    }

    private long main_region_StateB_react(long transitioned_before) {
        /* The reactions of state StateB. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (timeEvents[2]) {
                exitSequence_main_region_StateB();
                timeEvents[2] = false;
                enterSequence_main_region_StateC_default();
                react(0l);
                transitioned_after = 0l;
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            if (timeEvents[3]) {
                setT(getT() + 1l);
            }
            transitioned_after = react(transitioned_before);
        }
        return transitioned_after;
    }

    private long main_region_StateC_react(long transitioned_before) {
        /* The reactions of state StateC. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (timeEvents[4]) {
                exitSequence_main_region_StateC();
                timeEvents[4] = false;
                enterSequence_main_region_StateD_default();
                react(0l);
                transitioned_after = 0l;
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            if (timeEvents[5]) {
                setT(getT() + 1l);
            }
            transitioned_after = react(transitioned_before);
        }
        return transitioned_after;
    }

    private long main_region_StateO_react(long transitioned_before) {
        /* The reactions of state StateO. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (timeEvents[6]) {
                exitSequence_main_region_StateO();
                timeEvents[6] = false;
                enterSequence_main_region_StateA_default();
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

    private long main_region_StateD_react(long transitioned_before) {
        /* The reactions of state StateD. */
        long transitioned_after = transitioned_before;
        /* Always execute local reactions. */
        transitioned_after = react(transitioned_before);
        return transitioned_after;
    }

    /* Can be used by the client code to trigger a run to completion step without raising an event. */
    public void triggerWithoutEvent() {
        runCycle();
    }
}
