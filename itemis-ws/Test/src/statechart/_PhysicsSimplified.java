/**
 * Generated by itemis CREATE code generator.
 */
package statechart;

import com.yakindu.core.IEventDriven;
import com.yakindu.core.IStatemachine;
import com.yakindu.core.ITimed;
import com.yakindu.core.ITimerService;
import com.yakindu.core.rx.Observable;
import java.util.LinkedList;
import java.util.Queue;

public class _PhysicsSimplified implements ITimed, IEventDriven {

    public enum State {

        PHYSICS_PHYSICS, PHYSICS_PHYSICS_R1_DEFAULT, PHYSICS_PHYSICS_R2_DEFAULT, $NULLSTATE$
    }

    private final State[] stateVector = new State[2];

    private ITimerService timerService;

    private final boolean[] timeEvents = new boolean[1];

    private Queue<Runnable> inEventQueue = new LinkedList<Runnable>();

    private boolean isExecuting;

    private boolean getIsExecuting() {
        return isExecuting;
    }

    private void setIsExecuting(boolean value) {
        this.isExecuting = value;
    }

    private long stateConfVectorPosition;

    private long getStateConfVectorPosition() {
        return stateConfVectorPosition;
    }

    private void setStateConfVectorPosition(long value) {
        this.stateConfVectorPosition = value;
    }

    public _PhysicsSimplified() {
        for (int i = 0; i < 2; i++) {
            stateVector[i] = State.$NULLSTATE$;
        }
        clearInEvents();
        /* Default init sequence for statechart _Physics */
        setA(0l);
        setV(0l);
        setX(50l);
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
        /* Default enter sequence for statechart _Physics */
        enterSequence_Physics_default();
        isExecuting = false;
    }

    public void exit() {
        /* Deactivates the state machine. */
        if (getIsExecuting()) {
            return;
        }
        isExecuting = true;
        /* Default exit sequence for statechart _Physics */
        exitSequence_Physics();
        isExecuting = false;
    }

    /**
     * @see IStatemachine#isActive()
     */
    public boolean isActive() {
        return stateVector[0] != State.$NULLSTATE$ || stateVector[1] != State.$NULLSTATE$;
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
        setAcceleration = false;
        timeEvents[0] = false;
    }

    private void microStep() {
        long transitioned = -1l;
        stateConfVectorPosition = 0l;
        switch(stateVector[0]) {
            case PHYSICS_PHYSICS_R1_DEFAULT:
                transitioned = physics_Physics_r1_Default_react(transitioned);
                break;
            default:
                break;
        }
        if (getStateConfVectorPosition() < 1l) {
            switch(stateVector[1]) {
                case PHYSICS_PHYSICS_R2_DEFAULT:
                    physics_Physics_r2_Default_react(transitioned);
                    break;
                default:
                    break;
            }
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
            case PHYSICS_PHYSICS:
                return stateVector[0].ordinal() >= State.PHYSICS_PHYSICS.ordinal() && stateVector[0].ordinal() <= State.PHYSICS_PHYSICS_R2_DEFAULT.ordinal();
            case PHYSICS_PHYSICS_R1_DEFAULT:
                return stateVector[0] == State.PHYSICS_PHYSICS_R1_DEFAULT;
            case PHYSICS_PHYSICS_R2_DEFAULT:
                return stateVector[1] == State.PHYSICS_PHYSICS_R2_DEFAULT;
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

    private boolean setAcceleration;

    private double setAccelerationValue;

    public void raiseSetAcceleration(final double value) {
        inEventQueue.add(() -> {
            setAccelerationValue = value;
            setAcceleration = true;
        });
        runCycle();
    }

    private double getSetAccelerationValue() {
        if (!setAcceleration)
            throw new IllegalStateException("Illegal event value access. Event SetAcceleration is not raised!");
        return setAccelerationValue;
    }

    private boolean update;

    private void raiseUpdate() {
        update = true;
        updateObservable.next(null);
    }

    private Observable<Void> updateObservable = new Observable<Void>();

    private Observable<Void> getUpdate() {
        return updateObservable;
    }

    private double a;

    private double getA() {
        return a;
    }

    private void setA(double value) {
        this.a = value;
    }

    private double v;

    private double getV() {
        return v;
    }

    private void setV(double value) {
        this.v = value;
    }

    private double x;

    private double getX() {
        return x;
    }

    private void setX(double value) {
        this.x = value;
    }

    /* Entry action for state 'Default'. */
    private void entryAction_Physics_Physics_r2_Default() {
        /* Entry action for state 'Default'. */
        timerService.setTimer(this, 0, 10l, false);
    }

    /* Exit action for state 'Default'. */
    private void exitAction_Physics_Physics_r2_Default() {
        /* Exit action for state 'Default'. */
        timerService.unsetTimer(this, 0);
    }

    /* 'default' enter sequence for state Physics */
    private void enterSequence_Physics_Physics_default() {
        /* 'default' enter sequence for state Physics */
        enterSequence_Physics_Physics_r1_default();
        enterSequence_Physics_Physics_r2_default();
    }

    /* 'default' enter sequence for state Default */
    private void enterSequence_Physics_Physics_r1_Default_default() {
        /* 'default' enter sequence for state Default */
        stateVector[0] = State.PHYSICS_PHYSICS_R1_DEFAULT;
        stateConfVectorPosition = 0;
    }

    /* 'default' enter sequence for state Default */
    private void enterSequence_Physics_Physics_r2_Default_default() {
        /* 'default' enter sequence for state Default */
        entryAction_Physics_Physics_r2_Default();
        stateVector[1] = State.PHYSICS_PHYSICS_R2_DEFAULT;
        stateConfVectorPosition = 1;
    }

    /* 'default' enter sequence for region Physics */
    private void enterSequence_Physics_default() {
        /* 'default' enter sequence for region Physics */
        react_Physics__entry_Default();
    }

    /* 'default' enter sequence for region r1 */
    private void enterSequence_Physics_Physics_r1_default() {
        /* 'default' enter sequence for region r1 */
        react_Physics_Physics_r1__entry_Default();
    }

    /* 'default' enter sequence for region r2 */
    private void enterSequence_Physics_Physics_r2_default() {
        /* 'default' enter sequence for region r2 */
        react_Physics_Physics_r2__entry_Default();
    }

    /* Default exit sequence for state Default */
    private void exitSequence_Physics_Physics_r1_Default() {
        /* Default exit sequence for state Default */
        stateVector[0] = State.$NULLSTATE$;
        stateConfVectorPosition = 0;
    }

    /* Default exit sequence for state Default */
    private void exitSequence_Physics_Physics_r2_Default() {
        /* Default exit sequence for state Default */
        stateVector[1] = State.$NULLSTATE$;
        stateConfVectorPosition = 1;
        exitAction_Physics_Physics_r2_Default();
    }

    /* Default exit sequence for region Physics */
    private void exitSequence_Physics() {
        /* Default exit sequence for region Physics */
        switch(stateVector[0]) {
            case PHYSICS_PHYSICS_R1_DEFAULT:
                exitSequence_Physics_Physics_r1_Default();
                break;
            default:
                break;
        }
        switch(stateVector[1]) {
            case PHYSICS_PHYSICS_R2_DEFAULT:
                exitSequence_Physics_Physics_r2_Default();
                break;
            default:
                break;
        }
    }

    /* Default react sequence for initial entry  */
    private void react_Physics_Physics_r1__entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence_Physics_Physics_r1_Default_default();
    }

    /* Default react sequence for initial entry  */
    private void react_Physics_Physics_r2__entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence_Physics_Physics_r2_Default_default();
    }

    /* Default react sequence for initial entry  */
    private void react_Physics__entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence_Physics_Physics_default();
    }

    private long react(long transitioned_before) {
        /* State machine reactions. */
        return transitioned_before;
    }

    private long physics_Physics_react(long transitioned_before) {
        /* The reactions of state Physics. */
        long transitioned_after = transitioned_before;
        /* Always execute local reactions. */
        transitioned_after = react(transitioned_before);
        return transitioned_after;
    }

    private long physics_Physics_r1_Default_react(long transitioned_before) {
        /* The reactions of state Default. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (setAcceleration) {
                exitSequence_Physics_Physics_r1_Default();
                setA(getSetAccelerationValue());
                enterSequence_Physics_Physics_r1_Default_default();
                transitioned_after = 0l;
            }
        }
        return transitioned_after;
    }

    private long physics_Physics_r2_Default_react(long transitioned_before) {
        /* The reactions of state Default. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 1l) {
            if (timeEvents[0]) {
                exitSequence_Physics_Physics_r2_Default();
                setV(getV() + ((a / 100l)));
                setV(v < 0l ? 0l : v);
                setX(getX() + ((v / 100l)));
                raiseUpdate();
                timeEvents[0] = false;
                enterSequence_Physics_Physics_r2_Default_default();
                physics_Physics_react(0l);
                transitioned_after = 1l;
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            transitioned_after = physics_Physics_react(transitioned_before);
        }
        return transitioned_after;
    }

    /* Can be used by the client code to trigger a run to completion step without raising an event. */
    public void triggerWithoutEvent() {
        runCycle();
    }
}
