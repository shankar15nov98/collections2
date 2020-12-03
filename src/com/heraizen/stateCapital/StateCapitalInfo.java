package com.heraizen.stateCapital;

import java.util.HashMap;
import java.util.Map;

public class StateCapitalInfo {
	private Map<String, String> state_capital = new HashMap<>();

	public void add_state_capital(String state, String capital) {
		state_capital.put(state, capital);
	}

	public void viewCapital(String name) {
		boolean stateFound = false;
		if (state_capital.isEmpty()) {
			System.out.println("Please add State and capital ");
		} else {
			for (Map.Entry<String, String> stateInfo : state_capital.entrySet()) {
				if (stateInfo.getKey().equals(name)) {
					System.out.println(stateInfo.getValue());
					stateFound = true;
				}

			}
			if (stateFound == false) {
				System.out.println("The State name is not existing");
			}

		}

	}

}
