/**
 * 
 */
package org.div.machines;


/**
 * @author Divyanshu Kakwani

 *
 */
public interface StateMachine {
	
	
	public Iterable<State> getStates();
	
	public Iterable<State> getInitialStates();
	
	public Iterable<State> getFinalStates();
	
	public boolean isAccepted(String word);
	
}
