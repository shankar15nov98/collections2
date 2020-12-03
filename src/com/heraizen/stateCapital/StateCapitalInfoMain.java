package com.heraizen.stateCapital;

import java.util.Scanner;

public class StateCapitalInfoMain {

	public static void main(String[] args) {
		StateCapitalInfo stateInfo = new StateCapitalInfo();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your Choice\n1.Add state And Captital  \t2.View State\t3.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter state ");
				String state = sc.next();
				System.out.println("Enter Capital");
				String capital = sc.next();
				stateInfo.add_state_capital(state, capital);
				break;
			case 2:
				System.out.println("Enter state ");
				String stateToSearch = sc.next();
				stateInfo.viewCapital(stateToSearch);
				break;
			case 3:
				System.exit(0);

			default:
				System.out.println("Please select Correct option");
				break;
			}

		} while (true);
	}

}
