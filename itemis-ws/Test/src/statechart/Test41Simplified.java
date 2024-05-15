/**
 * Generated by itemis CREATE code generator.
 */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import java.util.LinkedList;
import java.util.Queue;

public class Test41Simplified implements IEventDriven {

    public static class Panel {

        private Test41Simplified parent;

        public Panel(Test41Simplified parent) {
            this.parent = parent;
        }

        private boolean btn_pressed;

        public void raiseBtn_pressed() {
            parent.inEventQueue.add(() -> {
                btn_pressed = true;
            });
            parent.runCycle();
        }
    }

    private Panel panel;

    public enum State {

        MAIN_REGION_STATEA, MAIN_REGION_STATEB, MAIN_REGION_STATEB_REGION_1_STATEC, MAIN_REGION_STATEB_REGION_1_STATED, $NULLSTATE$
    }

    private final State[] stateVector = new State[1];

    private Queue<Runnable> internalEventQueue = new LinkedList<Runnable>();

    private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();

    private boolean vier;

    private long z;

    private long getZ() {
        return z;
    }

    private void setZ(long value) {
        this.z = value;
    }

    private long pau;

    private long getPau() {
        return pau;
    }

    private void setPau(long value) {
        this.pau = value;
    }

    private boolean isExecuting;

    private boolean getIsExecuting() {
        return isExecuting;
    }

    private void setIsExecuting(boolean value) {
        this.isExecuting = value;
    }

    public Test41Simplified() {
        panel = new Panel(this);
        for (int i = 0; i < 1; i++) {
            stateVector[i] = State.$NULLSTATE$;
        }
        clearInEvents();
        clearInternalEvents();
        /* Default init sequence for statechart test41 */
        setZ(0l);
        setPau(0l);
        isExecuting = false;
    }

    public void enter() {
        /* Activates the state machine. */
        if (getIsExecuting()) {
            return;
        }
        isExecuting = true;
        /* Default enter sequence for statechart test41 */
        enterSequence_main_region_default();
        isExecuting = false;
    }

    public void exit() {
        /* Deactivates the state machine. */
        if (getIsExecuting()) {
            return;
        }
        isExecuting = true;
        /* Default exit sequence for statechart test41 */
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
        panel.btn_pressed = false;
    }

    private void clearInternalEvents() {
        vier = false;
    }

    private void microStep() {
        switch(stateVector[0]) {
            case MAIN_REGION_STATEA:
                main_region_StateA_react(-1l);
                break;
            case MAIN_REGION_STATEB_REGION_1_STATEC:
                main_region_StateB_Region_1_StateC_react(-1l);
                break;
            case MAIN_REGION_STATEB_REGION_1_STATED:
                main_region_StateB_Region_1_StateD_react(-1l);
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
            clearInternalEvents();
        } while (nextEvent());
        isExecuting = false;
    }

    private boolean nextEvent() {
        if (!internalEventQueue.isEmpty()) {
            internalEventQueue.poll().run();
            return true;
        }
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
                return stateVector[0].ordinal() >= State.MAIN_REGION_STATEB.ordinal() && stateVector[0].ordinal() <= State.MAIN_REGION_STATEB_REGION_1_STATED.ordinal();
            case MAIN_REGION_STATEB_REGION_1_STATEC:
                return stateVector[0] == State.MAIN_REGION_STATEB_REGION_1_STATEC;
            case MAIN_REGION_STATEB_REGION_1_STATED:
                return stateVector[0] == State.MAIN_REGION_STATEB_REGION_1_STATED;
            default:
                return false;
        }
    }

    public Panel panel() {
        return panel;
    }

    private void raiseVier() {
        internalEventQueue.add(() -> {
            vier = true;
        });
    }

    /* 'default' enter sequence for state StateA */
    private void enterSequence_main_region_StateA_default() {
        /* 'default' enter sequence for state StateA */
        stateVector[0] = State.MAIN_REGION_STATEA;
    }

    /* 'default' enter sequence for state StateB */
    private void enterSequence_main_region_StateB_default() {
        /* 'default' enter sequence for state StateB */
        enterSequence_main_region_StateB_Region_1_default();
    }

    /* 'default' enter sequence for state StateC */
    private void enterSequence_main_region_StateB_Region_1_StateC_default() {
        /* 'default' enter sequence for state StateC */
        stateVector[0] = State.MAIN_REGION_STATEB_REGION_1_STATEC;
    }

    /* 'default' enter sequence for state StateD */
    private void enterSequence_main_region_StateB_Region_1_StateD_default() {
        /* 'default' enter sequence for state StateD */
        stateVector[0] = State.MAIN_REGION_STATEB_REGION_1_STATED;
    }

    /* 'default' enter sequence for region main region */
    private void enterSequence_main_region_default() {
        /* 'default' enter sequence for region main region */
        react_main_region__entry_Default();
    }

    /* 'default' enter sequence for region Region 1 */
    private void enterSequence_main_region_StateB_Region_1_default() {
        /* 'default' enter sequence for region Region 1 */
        react_main_region_StateB_Region_1__entry_Default();
    }

    /* Default exit sequence for state StateA */
    private void exitSequence_main_region_StateA() {
        /* Default exit sequence for state StateA */
        stateVector[0] = State.$NULLSTATE$;
    }

    /* Default exit sequence for state StateB */
    private void exitSequence_main_region_StateB() {
        /* Default exit sequence for state StateB */
        exitSequence_main_region_StateB_Region_1();
    }

    /* Default exit sequence for state StateC */
    private void exitSequence_main_region_StateB_Region_1_StateC() {
        /* Default exit sequence for state StateC */
        stateVector[0] = State.$NULLSTATE$;
    }

    /* Default exit sequence for state StateD */
    private void exitSequence_main_region_StateB_Region_1_StateD() {
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
            case MAIN_REGION_STATEB_REGION_1_STATEC:
                exitSequence_main_region_StateB_Region_1_StateC();
                break;
            case MAIN_REGION_STATEB_REGION_1_STATED:
                exitSequence_main_region_StateB_Region_1_StateD();
                break;
            default:
                break;
        }
    }

    /* Default exit sequence for region Region 1 */
    private void exitSequence_main_region_StateB_Region_1() {
        /* Default exit sequence for region Region 1 */
        switch(stateVector[0]) {
            case MAIN_REGION_STATEB_REGION_1_STATEC:
                exitSequence_main_region_StateB_Region_1_StateC();
                break;
            case MAIN_REGION_STATEB_REGION_1_STATED:
                exitSequence_main_region_StateB_Region_1_StateD();
                break;
            default:
                break;
        }
    }

    /* Default react sequence for initial entry  */
    private void react_main_region__entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence_main_region_StateA_default();
    }

    /* Default react sequence for initial entry  */
    private void react_main_region_StateB_Region_1__entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence_main_region_StateB_Region_1_StateC_default();
    }

    private long react(long transitioned_before) {
        /* State machine reactions. */
        return transitioned_before;
    }

    private long main_region_StateA_react(long transitioned_before) {
        /* The reactions of state StateA. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (panel.btn_pressed) {
                exitSequence_main_region_StateA();
                enterSequence_main_region_StateB_default();
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

    private long main_region_StateB_react(long transitioned_before) {
        /* The reactions of state StateB. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (panel.btn_pressed) {
                exitSequence_main_region_StateB();
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

    private long main_region_StateB_Region_1_StateC_react(long transitioned_before) {
        /* The reactions of state StateC. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (vier) {
                exitSequence_main_region_StateB_Region_1_StateC();
                setPau(4l);
                setZ(2l);
                enterSequence_main_region_StateB_Region_1_StateD_default();
                main_region_StateB_react(0l);
                transitioned_after = 0l;
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            transitioned_after = main_region_StateB_react(transitioned_before);
        }
        return transitioned_after;
    }

    private long main_region_StateB_Region_1_StateD_react(long transitioned_before) {
        /* The reactions of state StateD. */
        long transitioned_after = transitioned_before;
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            transitioned_after = main_region_StateB_react(transitioned_before);
        }
        return transitioned_after;
    }

    /* Can be used by the client code to trigger a run to completion step without raising an event. */
    public void triggerWithoutEvent() {
        runCycle();
    }
}
