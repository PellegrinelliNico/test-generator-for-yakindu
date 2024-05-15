/**
 * Generated by itemis CREATE code generator.
 */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import java.util.LinkedList;
import java.util.Queue;

public class Test_remove_duplicate_transitions_expectedSimplified implements IEventDriven {

    public static class User {

        private Test_remove_duplicate_transitions_expectedSimplified parent;

        public User(Test_remove_duplicate_transitions_expectedSimplified parent) {
            this.parent = parent;
        }

        private boolean operate;

        public void raiseOperate() {
            parent.inEventQueue.add(() -> {
                operate = true;
            });
            parent.runCycle();
        }
    }

    private User user;

    public enum State {

        MAIN_REGION_OFF, MAIN_REGION_ON, $NULLSTATE$
    }

    private final State[] stateVector = new State[1];

    private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();

    private boolean isExecuting;

    private boolean getIsExecuting() {
        return isExecuting;
    }

    private void setIsExecuting(boolean value) {
        this.isExecuting = value;
    }

    public Test_remove_duplicate_transitions_expectedSimplified() {
        user = new User(this);
        for (int i = 0; i < 1; i++) {
            stateVector[i] = State.$NULLSTATE$;
        }
        clearInEvents();
        isExecuting = false;
    }

    public void enter() {
        /* Activates the state machine. */
        if (getIsExecuting()) {
            return;
        }
        isExecuting = true;
        /* Default enter sequence for statechart test_remove_duplicate_transitions_expected */
        enterSequence_main_region_default();
        isExecuting = false;
    }

    public void exit() {
        /* Deactivates the state machine. */
        if (getIsExecuting()) {
            return;
        }
        isExecuting = true;
        /* Default exit sequence for statechart test_remove_duplicate_transitions_expected */
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
        user.operate = false;
    }

    private void microStep() {
        switch(stateVector[0]) {
            case MAIN_REGION_OFF:
                main_region_Off_react(-1l);
                break;
            case MAIN_REGION_ON:
                main_region_On_react(-1l);
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
            case MAIN_REGION_OFF:
                return stateVector[0] == State.MAIN_REGION_OFF;
            case MAIN_REGION_ON:
                return stateVector[0] == State.MAIN_REGION_ON;
            default:
                return false;
        }
    }

    public User user() {
        return user;
    }

    /* 'default' enter sequence for state Off */
    private void enterSequence_main_region_Off_default() {
        /* 'default' enter sequence for state Off */
        stateVector[0] = State.MAIN_REGION_OFF;
    }

    /* 'default' enter sequence for state On */
    private void enterSequence_main_region_On_default() {
        /* 'default' enter sequence for state On */
        stateVector[0] = State.MAIN_REGION_ON;
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

    /* Default exit sequence for region main region */
    private void exitSequence_main_region() {
        /* Default exit sequence for region main region */
        switch(stateVector[0]) {
            case MAIN_REGION_OFF:
                exitSequence_main_region_Off();
                break;
            case MAIN_REGION_ON:
                exitSequence_main_region_On();
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
        if (transitioned_after < 0l) {
            if (user.operate) {
                exitSequence_main_region_Off();
                enterSequence_main_region_On_default();
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

    private long main_region_On_react(long transitioned_before) {
        /* The reactions of state On. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (user.operate) {
                exitSequence_main_region_On();
                enterSequence_main_region_Off_default();
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

    /* Can be used by the client code to trigger a run to completion step without raising an event. */
    public void triggerWithoutEvent() {
        runCycle();
    }
}
