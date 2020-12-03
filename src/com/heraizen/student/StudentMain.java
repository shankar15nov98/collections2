package com.heraizen.student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\nEnter  Choice\n1.Add new Student \t2.View Student\t3.View Students\t4.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter name ");
				String name = sc.next();
				System.out.println("Enter E-mail");
				String email = sc.next();
				System.out.println("Enter the course");
				String course = sc.next();
				StudentMethod.addStudent(new Student(name, email, course));
				break;
			case 2:
				System.out.println("Enter id to view Student ");
				int idtoSearch = sc.nextInt();
				StudentMethod.viewStudent(idtoSearch);
				break;
			case 3:

				StudentMethod.viewStudents();
				break;

			case 4:
				System.exit(0);

			default:
				System.out.println("Please select Correct option");
				break;
			}

		} while (true);
	}
}
