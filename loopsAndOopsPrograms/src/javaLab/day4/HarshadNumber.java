package javaLab.day4;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Provide a number :");

		int number = sc.nextInt();

		int temp = number;
		sc.close();
		int digit;
		int sum = 0;

		while (number > 0) {

			digit = number % 10;
			sum = sum + digit;
			number = number / 10;

		}

		if (temp % sum == 0) {
			System.out.println("The number you have provided is a harshed number.");
		} else {
			System.out.println("The number you have provided is not a harshed number.");

		}

	}

}
