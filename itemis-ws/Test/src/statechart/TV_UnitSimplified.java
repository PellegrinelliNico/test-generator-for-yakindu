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

public class TV_UnitSimplified implements ITimed, IEventDriven {

    public static class Device {

        private TV_UnitSimplified parent;

        public Device(TV_UnitSimplified parent) {
            this.parent = parent;
        }

        private boolean on;

        public void raiseOn() {
            parent.inEventQueue.add(() -> {
                on = true;
            });
            parent.runCycle();
        }

        private boolean off;

        public void raiseOff() {
            parent.inEventQueue.add(() -> {
                off = true;
            });
            parent.runCycle();
        }

        private boolean isOn;

        private boolean getIsOn() {
            return isOn;
        }

        private void setIsOn(boolean value) {
            this.isOn = value;
        }
    }

    public static class Input {

        private TV_UnitSimplified parent;

        public Input(TV_UnitSimplified parent) {
            this.parent = parent;
        }

        private boolean toggle;

        public void raiseToggle() {
            parent.inEventQueue.add(() -> {
                toggle = true;
            });
            parent.runCycle();
        }

        private boolean satellite;

        public void raiseSatellite() {
            parent.inEventQueue.add(() -> {
                satellite = true;
            });
            parent.runCycle();
        }

        private boolean cable;

        public void raiseCable() {
            parent.inEventQueue.add(() -> {
                cable = true;
            });
            parent.runCycle();
        }

        private boolean hdmi;

        public void raiseHdmi() {
            parent.inEventQueue.add(() -> {
                hdmi = true;
            });
            parent.runCycle();
        }

        private String source;

        private String getSource() {
            return source;
        }

        private void setSource(String value) {
            this.source = value;
        }
    }

    private Device device;

    private Input input;

    public enum State {

        _TV_UNIT___TV_ON_,
        _TV_UNIT___TV_ON___TV_WORKING__SATELLITETV,
        _TV_UNIT___TV_ON___TV_WORKING__SATELLITETV__CHANGING_CHANNEL__CHANGECHANNEL,
        _TV_UNIT___TV_ON___TV_WORKING__CABLE,
        _TV_UNIT___TV_ON___TV_WORKING__HDMI,
        _TV_UNIT___TV_ONSLEEP_,
        $NULLSTATE$
    }

    private final State[] stateVector = new State[1];

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

    public TV_UnitSimplified() {
        device = new Device(this);
        input = new Input(this);
        for (int i = 0; i < 1; i++) {
            stateVector[i] = State.$NULLSTATE$;
        }
        clearInEvents();
        /* Default init sequence for statechart TV_Unit */
        setChannel(0l);
        device.setIsOn(false);
        input.setSource("");
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
        /* Default enter sequence for statechart TV_Unit */
        enterSequence__TV_Unit__default();
        isExecuting = false;
    }

    public void exit() {
        /* Deactivates the state machine. */
        if (getIsExecuting()) {
            return;
        }
        isExecuting = true;
        /* Default exit sequence for statechart TV_Unit */
        exitSequence__TV_Unit_();
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
        change = false;
        device.on = false;
        device.off = false;
        input.toggle = false;
        input.satellite = false;
        input.cable = false;
        input.hdmi = false;
        timeEvents[0] = false;
    }

    private void microStep() {
        switch(stateVector[0]) {
            case _TV_UNIT___TV_ON___TV_WORKING__SATELLITETV__CHANGING_CHANNEL__CHANGECHANNEL:
                _TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__changeChannel_react(-1l);
                break;
            case _TV_UNIT___TV_ON___TV_WORKING__CABLE:
                _TV_Unit___TV_On___TV_Working__cable_react(-1l);
                break;
            case _TV_UNIT___TV_ON___TV_WORKING__HDMI:
                _TV_Unit___TV_On___TV_Working__hdmi_react(-1l);
                break;
            case _TV_UNIT___TV_ONSLEEP_:
                _TV_Unit___TV_onSleep__react(-1l);
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
            case _TV_UNIT___TV_ON_:
                return stateVector[0].ordinal() >= State._TV_UNIT___TV_ON_.ordinal() && stateVector[0].ordinal() <= State._TV_UNIT___TV_ON___TV_WORKING__HDMI.ordinal();
            case _TV_UNIT___TV_ON___TV_WORKING__SATELLITETV:
                return stateVector[0].ordinal() >= State._TV_UNIT___TV_ON___TV_WORKING__SATELLITETV.ordinal() && stateVector[0].ordinal() <= State._TV_UNIT___TV_ON___TV_WORKING__SATELLITETV__CHANGING_CHANNEL__CHANGECHANNEL.ordinal();
            case _TV_UNIT___TV_ON___TV_WORKING__SATELLITETV__CHANGING_CHANNEL__CHANGECHANNEL:
                return stateVector[0] == State._TV_UNIT___TV_ON___TV_WORKING__SATELLITETV__CHANGING_CHANNEL__CHANGECHANNEL;
            case _TV_UNIT___TV_ON___TV_WORKING__CABLE:
                return stateVector[0] == State._TV_UNIT___TV_ON___TV_WORKING__CABLE;
            case _TV_UNIT___TV_ON___TV_WORKING__HDMI:
                return stateVector[0] == State._TV_UNIT___TV_ON___TV_WORKING__HDMI;
            case _TV_UNIT___TV_ONSLEEP_:
                return stateVector[0] == State._TV_UNIT___TV_ONSLEEP_;
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

    public Device device() {
        return device;
    }

    public Input input() {
        return input;
    }

    private boolean change;

    public void raiseChange() {
        inEventQueue.add(() -> {
            change = true;
        });
        runCycle();
    }

    private long channel;

    private long getChannel() {
        return channel;
    }

    private void setChannel(long value) {
        this.channel = value;
    }

    /* Entry action for state '<TV_On>'. */
    private void entryAction__TV_Unit___TV_On_() {
        /* Entry action for state '<TV_On>'. */
        timerService.setTimer(this, 0, 500l, true);
        device.setIsOn(true);
    }

    /* Entry action for state 'satelliteTV'. */
    private void entryAction__TV_Unit___TV_On___TV_Working__satelliteTV() {
        /* Entry action for state 'satelliteTV'. */
        input.setSource("Satellite TV");
    }

    /* Entry action for state 'cable'. */
    private void entryAction__TV_Unit___TV_On___TV_Working__cable() {
        /* Entry action for state 'cable'. */
        input.setSource("Cable TV");
    }

    /* Entry action for state 'hdmi'. */
    private void entryAction__TV_Unit___TV_On___TV_Working__hdmi() {
        /* Entry action for state 'hdmi'. */
        input.setSource("HDMI");
    }

    /* Entry action for state '<TV_onSleep>'. */
    private void entryAction__TV_Unit___TV_onSleep_() {
        /* Entry action for state '<TV_onSleep>'. */
        device.setIsOn(false);
    }

    /* Exit action for state '<TV_On>'. */
    private void exitAction__TV_Unit___TV_On_() {
        /* Exit action for state '<TV_On>'. */
        timerService.unsetTimer(this, 0);
    }

    /* 'default' enter sequence for state <TV_On> */
    private void enterSequence__TV_Unit___TV_On__default() {
        /* 'default' enter sequence for state <TV_On> */
        entryAction__TV_Unit___TV_On_();
        enterSequence__TV_Unit___TV_On___TV_Working__default();
    }

    /* 'default' enter sequence for state satelliteTV */
    private void enterSequence__TV_Unit___TV_On___TV_Working__satelliteTV_default() {
        /* 'default' enter sequence for state satelliteTV */
        entryAction__TV_Unit___TV_On___TV_Working__satelliteTV();
        enterSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__default();
    }

    /* 'default' enter sequence for state changeChannel */
    private void enterSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__changeChannel_default() {
        /* 'default' enter sequence for state changeChannel */
        stateVector[0] = State._TV_UNIT___TV_ON___TV_WORKING__SATELLITETV__CHANGING_CHANNEL__CHANGECHANNEL;
    }

    /* 'default' enter sequence for state cable */
    private void enterSequence__TV_Unit___TV_On___TV_Working__cable_default() {
        /* 'default' enter sequence for state cable */
        entryAction__TV_Unit___TV_On___TV_Working__cable();
        stateVector[0] = State._TV_UNIT___TV_ON___TV_WORKING__CABLE;
    }

    /* 'default' enter sequence for state hdmi */
    private void enterSequence__TV_Unit___TV_On___TV_Working__hdmi_default() {
        /* 'default' enter sequence for state hdmi */
        entryAction__TV_Unit___TV_On___TV_Working__hdmi();
        stateVector[0] = State._TV_UNIT___TV_ON___TV_WORKING__HDMI;
    }

    /* 'default' enter sequence for state <TV_onSleep> */
    private void enterSequence__TV_Unit___TV_onSleep__default() {
        /* 'default' enter sequence for state <TV_onSleep> */
        entryAction__TV_Unit___TV_onSleep_();
        stateVector[0] = State._TV_UNIT___TV_ONSLEEP_;
    }

    /* 'default' enter sequence for region <TV_Unit> */
    private void enterSequence__TV_Unit__default() {
        /* 'default' enter sequence for region <TV_Unit> */
        react__TV_Unit___entry_Default();
    }

    /* 'default' enter sequence for region <TV_Working> */
    private void enterSequence__TV_Unit___TV_On___TV_Working__default() {
        /* 'default' enter sequence for region <TV_Working> */
        react__TV_Unit___TV_On___TV_Working___entry_Default();
    }

    /* 'default' enter sequence for region <Changing_Channel> */
    private void enterSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__default() {
        /* 'default' enter sequence for region <Changing_Channel> */
        react__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel___entry_Default();
    }

    /* Default exit sequence for state <TV_On> */
    private void exitSequence__TV_Unit___TV_On_() {
        /* Default exit sequence for state <TV_On> */
        exitSequence__TV_Unit___TV_On___TV_Working_();
        exitAction__TV_Unit___TV_On_();
    }

    /* Default exit sequence for state satelliteTV */
    private void exitSequence__TV_Unit___TV_On___TV_Working__satelliteTV() {
        /* Default exit sequence for state satelliteTV */
        exitSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel_();
    }

    /* Default exit sequence for state changeChannel */
    private void exitSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__changeChannel() {
        /* Default exit sequence for state changeChannel */
        stateVector[0] = State.$NULLSTATE$;
    }

    /* Default exit sequence for state cable */
    private void exitSequence__TV_Unit___TV_On___TV_Working__cable() {
        /* Default exit sequence for state cable */
        stateVector[0] = State.$NULLSTATE$;
    }

    /* Default exit sequence for state hdmi */
    private void exitSequence__TV_Unit___TV_On___TV_Working__hdmi() {
        /* Default exit sequence for state hdmi */
        stateVector[0] = State.$NULLSTATE$;
    }

    /* Default exit sequence for state <TV_onSleep> */
    private void exitSequence__TV_Unit___TV_onSleep_() {
        /* Default exit sequence for state <TV_onSleep> */
        stateVector[0] = State.$NULLSTATE$;
    }

    /* Default exit sequence for region <TV_Unit> */
    private void exitSequence__TV_Unit_() {
        /* Default exit sequence for region <TV_Unit> */
        switch(stateVector[0]) {
            case _TV_UNIT___TV_ON___TV_WORKING__SATELLITETV__CHANGING_CHANNEL__CHANGECHANNEL:
                exitSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__changeChannel();
                exitAction__TV_Unit___TV_On_();
                break;
            case _TV_UNIT___TV_ON___TV_WORKING__CABLE:
                exitSequence__TV_Unit___TV_On___TV_Working__cable();
                exitAction__TV_Unit___TV_On_();
                break;
            case _TV_UNIT___TV_ON___TV_WORKING__HDMI:
                exitSequence__TV_Unit___TV_On___TV_Working__hdmi();
                exitAction__TV_Unit___TV_On_();
                break;
            case _TV_UNIT___TV_ONSLEEP_:
                exitSequence__TV_Unit___TV_onSleep_();
                break;
            default:
                break;
        }
    }

    /* Default exit sequence for region <TV_Working> */
    private void exitSequence__TV_Unit___TV_On___TV_Working_() {
        /* Default exit sequence for region <TV_Working> */
        switch(stateVector[0]) {
            case _TV_UNIT___TV_ON___TV_WORKING__SATELLITETV__CHANGING_CHANNEL__CHANGECHANNEL:
                exitSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__changeChannel();
                break;
            case _TV_UNIT___TV_ON___TV_WORKING__CABLE:
                exitSequence__TV_Unit___TV_On___TV_Working__cable();
                break;
            case _TV_UNIT___TV_ON___TV_WORKING__HDMI:
                exitSequence__TV_Unit___TV_On___TV_Working__hdmi();
                break;
            default:
                break;
        }
    }

    /* Default exit sequence for region <Changing_Channel> */
    private void exitSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel_() {
        /* Default exit sequence for region <Changing_Channel> */
        switch(stateVector[0]) {
            case _TV_UNIT___TV_ON___TV_WORKING__SATELLITETV__CHANGING_CHANNEL__CHANGECHANNEL:
                exitSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__changeChannel();
                break;
            default:
                break;
        }
    }

    /* Default react sequence for initial entry  */
    private void react__TV_Unit___entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence__TV_Unit___TV_onSleep__default();
    }

    /* Default react sequence for initial entry  */
    private void react__TV_Unit___TV_On___TV_Working___entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence__TV_Unit___TV_On___TV_Working__satelliteTV_default();
    }

    /* Default react sequence for initial entry  */
    private void react__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel___entry_Default() {
        /* Default react sequence for initial entry  */
        enterSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__changeChannel_default();
    }

    private long react(long transitioned_before) {
        /* State machine reactions. */
        return transitioned_before;
    }

    private long _TV_Unit___TV_On__react(long transitioned_before) {
        /* The reactions of state <TV_On>. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (((timeEvents[0]) && (!(device.getIsOn())))) {
                exitSequence__TV_Unit___TV_On_();
                timeEvents[0] = false;
                enterSequence__TV_Unit___TV_onSleep__default();
                react(0l);
                transitioned_after = 0l;
            } else {
                if (device.off) {
                    exitSequence__TV_Unit___TV_On_();
                    enterSequence__TV_Unit___TV_onSleep__default();
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

    private long _TV_Unit___TV_On___TV_Working__satelliteTV_react(long transitioned_before) {
        /* The reactions of state satelliteTV. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (input.cable) {
                exitSequence__TV_Unit___TV_On___TV_Working__satelliteTV();
                enterSequence__TV_Unit___TV_On___TV_Working__cable_default();
                _TV_Unit___TV_On__react(0l);
                transitioned_after = 0l;
            } else {
                if (input.hdmi) {
                    exitSequence__TV_Unit___TV_On___TV_Working__satelliteTV();
                    enterSequence__TV_Unit___TV_On___TV_Working__hdmi_default();
                    _TV_Unit___TV_On__react(0l);
                    transitioned_after = 0l;
                }
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            transitioned_after = _TV_Unit___TV_On__react(transitioned_before);
        }
        return transitioned_after;
    }

    private long _TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__changeChannel_react(long transitioned_before) {
        /* The reactions of state changeChannel. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (change) {
                exitSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__changeChannel();
                channel++;
                enterSequence__TV_Unit___TV_On___TV_Working__satelliteTV__Changing_Channel__changeChannel_default();
                _TV_Unit___TV_On___TV_Working__satelliteTV_react(0l);
                transitioned_after = 0l;
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            transitioned_after = _TV_Unit___TV_On___TV_Working__satelliteTV_react(transitioned_before);
        }
        return transitioned_after;
    }

    private long _TV_Unit___TV_On___TV_Working__cable_react(long transitioned_before) {
        /* The reactions of state cable. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (input.hdmi) {
                exitSequence__TV_Unit___TV_On___TV_Working__cable();
                enterSequence__TV_Unit___TV_On___TV_Working__hdmi_default();
                _TV_Unit___TV_On__react(0l);
                transitioned_after = 0l;
            } else {
                if ((input.satellite || input.toggle)) {
                    exitSequence__TV_Unit___TV_On___TV_Working__cable();
                    enterSequence__TV_Unit___TV_On___TV_Working__satelliteTV_default();
                    _TV_Unit___TV_On__react(0l);
                    transitioned_after = 0l;
                }
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            transitioned_after = _TV_Unit___TV_On__react(transitioned_before);
        }
        return transitioned_after;
    }

    private long _TV_Unit___TV_On___TV_Working__hdmi_react(long transitioned_before) {
        /* The reactions of state hdmi. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if ((input.cable || input.toggle)) {
                exitSequence__TV_Unit___TV_On___TV_Working__hdmi();
                enterSequence__TV_Unit___TV_On___TV_Working__cable_default();
                _TV_Unit___TV_On__react(0l);
                transitioned_after = 0l;
            } else {
                if ((input.satellite || input.toggle)) {
                    exitSequence__TV_Unit___TV_On___TV_Working__hdmi();
                    enterSequence__TV_Unit___TV_On___TV_Working__satelliteTV_default();
                    _TV_Unit___TV_On__react(0l);
                    transitioned_after = 0l;
                }
            }
        }
        /* If no transition was taken */
        if (transitioned_after == transitioned_before) {
            /* then execute local reactions. */
            transitioned_after = _TV_Unit___TV_On__react(transitioned_before);
        }
        return transitioned_after;
    }

    private long _TV_Unit___TV_onSleep__react(long transitioned_before) {
        /* The reactions of state <TV_onSleep>. */
        long transitioned_after = transitioned_before;
        if (transitioned_after < 0l) {
            if (device.on) {
                exitSequence__TV_Unit___TV_onSleep_();
                enterSequence__TV_Unit___TV_On__default();
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