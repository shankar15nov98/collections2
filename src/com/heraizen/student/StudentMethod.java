package com.heraizen.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentMethod {
	static Map<Integer, Student> studentDetails = new HashMap<>();

	public static void addStudent(Student s) {
		studentDetails.put(Student.getId(), s);
	}

	public static void viewStudents() {
		System.out.printf("%-8s %-14s %-20s %-16s", "Id", "NAME", "E-mail", "Course");
		System.out.println();
		System.out.println("---------------------------------------------------------");
		studentDetails.forEach((key, value) -> System.out.printf("\n%-8d %-14s %-20s %-16s", key, value.getName(),
				value.getEmail(), value.getCourse()));
		System.out.println();
		System.out.println("---------------------------------------------------------");

	}

	public static String viewStudent(Integer id) {
		boolean studentFound = false;
		if (studentDetails.isEmpty()) {
			System.out.println("student Details list is Empty");
		} else {
			for (Entry<Integer, Student> studentInfo : studentDetails.entrySet()) {
				if (studentInfo.getKey().equals(id)) {
					System.out.println(studentInfo.getValue());
					studentFound = true;
				}

			}

			if (!studentFound) {
				System.out.println("“The Student id is not existing”");
			}

		}

		return studentDetails.toString();

	}
}
