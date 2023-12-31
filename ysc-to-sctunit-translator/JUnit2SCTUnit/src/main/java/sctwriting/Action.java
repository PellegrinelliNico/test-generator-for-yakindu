package sctwriting;

public class Action {
	String enter;
	String event;
	String state;
	String isActive;
	String isFinal;
	String not;
	String proceed;
	String triggerWithoutEvent;


	public Action(boolean enter, String event, String state, boolean isActive, boolean isFinal, boolean assertTrue, boolean proceed, boolean triggerWithoutEvent) {
		this.enter = enter ? "" : null;
		this.event = event;
		this.state = state;
		this.isActive = isActive ? "" : null;
		this.isFinal = isFinal ? "" : null;
		this.not = assertTrue ? null : "";
		this.proceed = proceed ? "" : null;
		this.triggerWithoutEvent = triggerWithoutEvent? "" : null;
	}
	
	public String getEnter() {
		return enter;
	}

	public String getEvent() {
		return event;
	}

	public String getState() {
		return state;
	}
	
	public String getIsActive() {
		return isActive;
	}
	
	public String getIsFinal() {
		return isFinal;
	}

	public String getNot() {
		return not;
	}

	public String getProceed() {
		return proceed;
	}
	
	public String getTriggerWithoutEvent() {
		return triggerWithoutEvent;
	}

}
