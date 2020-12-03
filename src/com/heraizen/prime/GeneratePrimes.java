package com.heraizen.prime;

import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

public class GeneratePrimes {

	public static void generatePrimes(int no) {
		Vector<Integer> vector = new Vector<>();

		while (vector.size() != no) {
			int num = ThreadLocalRandom.current().nextInt(1, 50);
			boolean flag = false;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				vector.add(num);
			}

		}

		showPrimes(vector);
	}

	public static void showPrimes(Vector<Integer> vector) {
		vector.stream().forEach(System.out::println);
	}

}
