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

public class Ultrasonic_SensorSimplified implements ITimed, IEventDriven {

    public static class Status {

        private Ultrasonic_SensorSimplified parent;

        public Status(Ultrasonic_SensorSimplified parent) {
            this.parent = parent;
        }

        private boolean activitySensed;

        public void raiseActivitySensed() {
            parent.inEventQueue.add(() -> {
                activitySensed = true;
            });
            parent.runCycle();
        }

        private boolean noActivitySensed;

        public void raiseNoActivitySensed() {
            parent.inEventQueue.add(() -> {
                noActivitySensed = true;
            });
            parent.runCycle();
        }

        private boolean activity;

        private boolean getActivity() {
            return activity;
        }

        private void setActivity(boolean value) {
            this.activity = value;
        }
    }

    public static class Transmitter {

        private boolean sending;

        private boolean getSending() {
            return sending;
        }

        private void setSending(boolean value) {
            this.sending = value;
        }

        private long value;

        private long getValue() {
            return value;
        }

        private void setValue(long value) {
            this.value = value;
        }
    }

    public static class Receiver {

        private boolean echo;

        private boolean getEcho() {
            return echo;
        }

        private void setEcho(boolean value) {
            this.echo = value;
        }

        private long value;

        private long getValue() {
            return value;
        }

        private void setValue(long value) {
            this.value = value;
        }
    }

    private Status status;

    private Transmitter transmitter;

    private Receiver receiver;

    public enum State {

        _ULTRASONIC_SENSOR___SENSOR_MONITORING_, _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICTRANSDUCER_TRANSMITTING, _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICRECEIVER_RECEIVING, _ULTRASONIC_SENSOR___OFF_, $NULLSTATE$
    }

    private State[] historyVector = new State[2];

    private final State[] stateVector = new State[2];

    private ITimerService timerService;

    private final boolean[] timeEvents = new boolean[3];

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

    public Ultrasonic_SensorSimplified() {
        status = new Status(this);
        transmitter = new Transmitter();
        receiver = new Receiver();
        for (int i = 0; i < 2; i++) {
            stateVector[i] = State.$NULLSTATE$;
        }
        for (int i = 0; i < 2; i++) {
            historyVector[i] = State.$NULLSTATE$;
        }
        clearInEvents();
        /* Default init sequence for statechart Ultrasonic_Sensor */
        setCounter(simulate_detection_timer);
        setSimulate_detection_timer(0l);
        setActivity(false);
        setReading(false);
        setActivity_sensed("");
        setSignalSentToController(false);
        setReceiverData(0l);
        setEnvironmentData(0l);
        status.setActivity(false);
        transmitter.setSending(true);
        transmitter.setValue(40l);
        receiver.setEcho(false);
        receiver.setValue(receiverData);
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
        /* Default enter sequence for statechart Ultrasonic_Sensor */
        enterSequence__Ultrasonic_Sensor__default();
        isExecuting = false;
    }

    public void exit() {
        /* Deactivates the state machine. */
        if (getIsExecuting()) {
            return;
        }
        isExecuting = true;
        /* Default exit sequence for statechart Ultrasonic_Sensor */
        exitSequence__Ultrasonic_Sensor_();
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
        on = false;
        off = false;
        status.activitySensed = false;
        status.noActivitySensed = false;
        timeEvents[0] = false;
        timeEvents[1] = false;
        timeEvents[2] = false;
    }

    private void microStep() {
        long transitioned = -1l;
        stateConfVectorPosition = 0l;
        switch(stateVector[0]) {
            case _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICTRANSDUCER_TRANSMITTING:
                transitioned = _Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting_react(transitioned);
                break;
            case _ULTRASONIC_SENSOR___OFF_:
                transitioned = _Ultrasonic_Sensor___off__react(transitioned);
                break;
            default:
                break;
        }
        if (getStateConfVectorPosition() < 1l) {
            switch(stateVector[1]) {
                case _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICRECEIVER_RECEIVING:
                    _Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving_react(transitioned);
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
            case _ULTRASONIC_SENSOR___SENSOR_MONITORING_:
                return stateVector[0].ordinal() >= State._ULTRASONIC_SENSOR___SENSOR_MONITORING_.ordinal() && stateVector[0].ordinal() <= State._ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICRECEIVER_RECEIVING.ordinal();
            case _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICTRANSDUCER_TRANSMITTING:
                return stateVector[0] == State._ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICTRANSDUCER_TRANSMITTING;
            case _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICRECEIVER_RECEIVING:
                return stateVector[1] == State._ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICRECEIVER_RECEIVING;
            case _ULTRASONIC_SENSOR___OFF_:
                return stateVector[0] == State._ULTRASONIC_SENSOR___OFF_;
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

    public Status status() {
        return status;
    }

    public Transmitter transmitter() {
        return transmitter;
    }

    public Receiver receiver() {
        return receiver;
    }

    private boolean on;

    public void raiseOn() {
        inEventQueue.add(() -> {
            on = true;
        });
        runCycle();
    }

    private boolean off;

    public void raiseOff() {
        inEventQueue.add(() -> {
            off = true;
        });
        runCycle();
    }

    private long counter;

    private long getCounter() {
        return counter;
    }

    private void setCounter(long value) {
        this.counter = value;
    }

    private long simulate_detection_timer;

    private long getSimulate_detection_timer() {
        return simulate_detection_timer;
    }

    private void setSimulate_detection_timer(long value) {
        this.simulate_detection_timer = value;
    }

    private boolean activity;

    private boolean getActivity() {
        return activity;
    }

    private void setActivity(boolean value) {
        this.activity = value;
    }

    private boolean reading;

    private boolean getReading() {
        return reading;
    }

    private void setReading(boolean value) {
        this.reading = value;
    }

    private String activity_sensed;

    private String getActivity_sensed() {
        return activity_sensed;
    }

    private void setActivity_sensed(String value) {
        this.activity_sensed = value;
    }

    private boolean signalSentToController;

    private boolean getSignalSentToController() {
        return signalSentToController;
    }

    private void setSignalSentToController(boolean value) {
        this.signalSentToController = value;
    }

    private long receiverData;

    private long getReceiverData() {
        return receiverData;
    }

    private void setReceiverData(long value) {
        this.receiverData = value;
    }

    private long environmentData;

    private long getEnvironmentData() {
        return environmentData;
    }

    private void setEnvironmentData(long value) {
        this.environmentData = value;
    }

    /* Entry action for state '<Sensor_Monitoring>'. */
    private void entryAction__Ultrasonic_Sensor___Sensor_Monitoring_() {
        /* Entry action for state '<Sensor_Monitoring>'. */
        timerService.setTimer(this, 0, (1l * 1000l), true);
        setReading(true);
    }

    /* Entry action for state 'Transmitting'. */
    private void entryAction__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting() {
        /* Entry action for state 'Transmitting'. */
        timerService.setTimer(this, 1, (1l * 1000l), false);
        transmitter.setSending(true);
    }

    /* Entry action for state 'Receiving'. */
    private void entryAction__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving() {
        /* Entry action for state 'Receiving'. */
        timerService.setTimer(this, 2, (1l * 1000l), false);
        receiver.setEcho(true);
        receiver.setValue((receiverData + transmitter.value));
    }

    /* Entry action for state '<off>'. */
    private void entryAction__Ultrasonic_Sensor___off_() {
        /* Entry action for state '<off>'. */
        setReading(false);
    }

    /* Exit action for state '<Sensor_Monitoring>'. */
    private void exitAction__Ultrasonic_Sensor___Sensor_Monitoring_() {
        /* Exit action for state '<Sensor_Monitoring>'. */
        timerService.unsetTimer(this, 0);
    }

    /* Exit action for state 'Transmitting'. */
    private void exitAction__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting() {
        /* Exit action for state 'Transmitting'. */
        timerService.unsetTimer(this, 1);
    }

    /* Exit action for state 'Receiving'. */
    private void exitAction__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving() {
        /* Exit action for state 'Receiving'. */
        timerService.unsetTimer(this, 2);
    }

    /* 'default' enter sequence for state <Sensor_Monitoring> */
    private void enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__default() {
        /* 'default' enter sequence for state <Sensor_Monitoring> */
        entryAction__Ultrasonic_Sensor___Sensor_Monitoring_();
        enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_default();
        enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_default();
    }

    /* 'default' enter sequence for state Transmitting */
    private void enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting_default() {
        /* 'default' enter sequence for state Transmitting */
        entryAction__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting();
        stateVector[0] = State._ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICTRANSDUCER_TRANSMITTING;
        stateConfVectorPosition = 0;
        historyVector[0] = stateVector[0];
    }

    /* 'default' enter sequence for state Receiving */
    private void enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving_default() {
        /* 'default' enter sequence for state Receiving */
        entryAction__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving();
        stateVector[1] = State._ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICRECEIVER_RECEIVING;
        stateConfVectorPosition = 1;
        historyVector[1] = stateVector[1];
    }

    /* 'default' enter sequence for state <off> */
    private void enterSequence__Ultrasonic_Sensor___off__default() {
        /* 'default' enter sequence for state <off> */
        entryAction__Ultrasonic_Sensor___off_();
        stateVector[0] = State._ULTRASONIC_SENSOR___OFF_;
        stateConfVectorPosition = 0;
    }

    /* 'default' enter sequence for region <Ultrasonic_Sensor> */
    private void enterSequence__Ultrasonic_Sensor__default() {
        /* 'default' enter sequence for region <Ultrasonic_Sensor> */
        react__Ultrasonic_Sensor___entry_Default();
    }

    /* 'default' enter sequence for region UltrasonicTransducer */
    private void enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_default() {
        /* 'default' enter sequence for region UltrasonicTransducer */
        react__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer__entry_Default();
    }

    /* shallow enterSequence with history in child UltrasonicTransducer */
    private void shallowEnterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer() {
        /* shallow enterSequence with history in child UltrasonicTransducer */
        switch(historyVector[0]) {
            case _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICTRANSDUCER_TRANSMITTING:
                enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting_default();
                break;
            default:
                break;
        }
    }

    /* 'default' enter sequence for region UltrasonicReceiver */
    private void enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_default() {
        /* 'default' enter sequence for region UltrasonicReceiver */
        react__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver__entry_Default();
    }

    /* shallow enterSequence with history in child UltrasonicReceiver */
    private void shallowEnterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver() {
        /* shallow enterSequence with history in child UltrasonicReceiver */
        switch(historyVector[1]) {
            case _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICRECEIVER_RECEIVING:
                enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving_default();
                break;
            default:
                break;
        }
    }

    /* Default exit sequence for state <Sensor_Monitoring> */
    private void exitSequence__Ultrasonic_Sensor___Sensor_Monitoring_() {
        /* Default exit sequence for state <Sensor_Monitoring> */
        exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer();
        exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver();
        exitAction__Ultrasonic_Sensor___Sensor_Monitoring_();
    }

    /* Default exit sequence for state Transmitting */
    private void exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting() {
        /* Default exit sequence for state Transmitting */
        stateVector[0] = State.$NULLSTATE$;
        stateConfVectorPosition = 0;
        exitAction__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting();
    }

    /* Default exit sequence for state Receiving */
    private void exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving() {
        /* Default exit sequence for state Receiving */
        stateVector[1] = State.$NULLSTATE$;
        stateConfVectorPosition = 1;
        exitAction__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving();
    }

    /* Default exit sequence for state <off> */
    private void exitSequence__Ultrasonic_Sensor___off_() {
        /* Default exit sequence for state <off> */
        stateVector[0] = State.$NULLSTATE$;
        stateConfVectorPosition = 0;
    }

    /* Default exit sequence for region <Ultrasonic_Sensor> */
    private void exitSequence__Ultrasonic_Sensor_() {
        /* Default exit sequence for region <Ultrasonic_Sensor> */
        switch(stateVector[0]) {
            case _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICTRANSDUCER_TRANSMITTING:
                exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting();
                break;
            case _ULTRASONIC_SENSOR___OFF_:
                exitSequence__Ultrasonic_Sensor___off_();
                break;
            default:
                break;
        }
        switch(stateVector[1]) {
            case _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICRECEIVER_RECEIVING:
                exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving();
                exitAction__Ultrasonic_Sensor___Sensor_Monitoring_();
                break;
            default:
                break;
        }
    }

    /* Default exit sequence for region UltrasonicTransducer */
    private void exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer() {
        /* Default exit sequence for region UltrasonicTransducer */
        switch(stateVector[0]) {
            case _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICTRANSDUCER_TRANSMITTING:
                exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting();
                break;
            default:
                break;
        }
    }

    /* Default exit sequence for region UltrasonicReceiver */
    private void exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver() {
        /* Default exit sequence for region UltrasonicReceiver */
        switch(stateVector[1]) {
            case _ULTRASONIC_SENSOR___SENSOR_MONITORING__ULTRASONICRECEIVER_RECEIVING:
                exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving();
                break;
            default:
                break;
        }
    }

    /* Default react sequence for initial entry  */
    private void react__Ultrasonic_Sensor___entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__default();
    }

    /* Default react sequence for shallow history entry  */
    private void react__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer__entry_Default() {
        /* Default react sequence for shallow history entry  */
        /* Enter the region with shallow history */
        if (historyVector[0] != State.$NULLSTATE$) {
            shallowEnterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer();
        } else {
            enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting_default();
        }
    }

    /* Default react sequence for shallow history entry  */
    private void react__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver__entry_Default() {
        /* Default react sequence for shallow history entry  */
        /* Enter the region with shallow history */
        if (historyVector[1] != State.$NULLSTATE$) {
            shallowEnterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver();
        } else {
            enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving_default();
        }
    }

    private long react(long transitioned_before) {
        /* State machine reactions. */
        return transitioned_before;
    }

    private long _Ultrasonic_Sensor___Sensor_Monitoring__react(long transitioned_before) {
        /* The reactions of state <Sensor_Monitoring>. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (off) {
                exitSequence__Ultrasonic_Sensor___Sensor_Monitoring_();
                enterSequence__Ultrasonic_Sensor___off__default();
                react(0l);
                transitioned_after = 1l;
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            if (timeEvents[0]) {
                setReceiverData(environmentData);
            }
            transitioned_after = react(transitioned_before);
        }
        return transitioned_after;
    }

    private long _Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting_react(long transitioned_before) {
        /* The reactions of state Transmitting. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (timeEvents[1]) {
                exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting();
                timeEvents[1] = false;
                enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicTransducer_Transmitting_default();
                transitioned_after = 0l;
            }
        }
        return transitioned_after;
    }

    private long _Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving_react(long transitioned_before) {
        /* The reactions of state Receiving. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 1l) {
            if (timeEvents[2]) {
                exitSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving();
                timeEvents[2] = false;
                enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__UltrasonicReceiver_Receiving_default();
                _Ultrasonic_Sensor___Sensor_Monitoring__react(0l);
                transitioned_after = 1l;
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            transitioned_after = _Ultrasonic_Sensor___Sensor_Monitoring__react(transitioned_before);
        }
        return transitioned_after;
    }

    private long _Ultrasonic_Sensor___off__react(long transitioned_before) {
        /* The reactions of state <off>. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (on) {
                exitSequence__Ultrasonic_Sensor___off_();
                enterSequence__Ultrasonic_Sensor___Sensor_Monitoring__default();
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
