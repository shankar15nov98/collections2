package com.heraizen.states;

import java.util.Scanner;

public class StateInfoMain {
	public static void main(String[] args) {

		StatesInfo state = new StatesInfo();

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 5; i++) {
			System.out.println("Enter the   State " + i);
			state.addState(sc.nextLine());

		}

		state.viewStates();
		sc.close();

	}
}
