package javaLab.day4;

import java.util.Scanner;

public class Max {

	// Find max digit of a number;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide a number :");
		int number = sc.nextInt();
		sc.close();
		int max = 0;
		int digit;
		int count = 1;

		while (number > 0) {

			if (count == 1) {

				digit = number % 10;

				max = digit;

				number = number / 10;

				count++;
			}

			digit = number % 10;
			if (digit > max) {

				max = digit;

			}
			number = number / 10;

		}
		System.out.println("Max digit is :" + max);

	}
}
