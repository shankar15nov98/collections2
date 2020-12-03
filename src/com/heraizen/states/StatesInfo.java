package com.heraizen.states;

import java.util.HashSet;

import java.util.Set;

public class StatesInfo {

	private Set<String> states = new HashSet<String>();

	public void addState(String name) {
		if (states.stream().anyMatch(n -> n.equalsIgnoreCase(name))) {
			System.out.println("Entered State already present");

		} else {
			states.add(name);
		}
	}

	public void viewStates() {
		states.stream().sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);
	}

}
