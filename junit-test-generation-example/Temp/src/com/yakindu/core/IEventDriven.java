/** Generated by itemis CREATE code generator. */
package com.yakindu.core;

/**
 * Interface for event-driven state machines.
 */
public interface IEventDriven extends IStatemachine {

	/**
	* Start a run-to-completion step without any event.
	*/
	public void triggerWithoutEvent();
}
