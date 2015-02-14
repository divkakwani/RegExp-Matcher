package org.div.machines;

import java.util.*;

public class DFA implements StateMachine {

	/**
	 * A DFA is defined as a 5-tuple (Q, E, D, I, F);
	 * Q = set of states
	 * E = alphabet
	 * D = Transition function
	 * I = Initial state
	 * F = set of final states
	 */

	@SuppressWarnings("unused")
	private List<Character> alphabet;
	
	private List<State> states;
	
	@SuppressWarnings("unused")
	private HashMap<State, Character> transitions;
	
	private State initialState;
	
	private List<State> finalStates;
	
	public Iterable<State> getStates() {
		return states;
	}

	
	public Iterable<State> getInitialStates() {
		List<State> initialStates = new ArrayList<State>();
		initialStates.add(initialState);
		return initialStates;
	}
	
	public Iterable<State> getFinalStates() {
		return finalStates;
	}
	
	public boolean isAccepted(String word) {
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Test");
	}

}
