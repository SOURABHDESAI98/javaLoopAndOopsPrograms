package javaAfternoon.day5;

import java.util.Scanner;

public class DisplayPrimeInRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input how many prime numbers you want :");

		int input = sc.nextInt();

		sc.close();

		int iteration = 1;

		System.out.println("Prime numbers between 1 to 20 are :");

		for (int i = 2; i <= 20; i++) {

			int count = 1;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					count = 0;

				}
			}

			if (count == 1 && iteration <= input) {

				System.out.println(i);
				iteration++;
			}

		}

	}

}
