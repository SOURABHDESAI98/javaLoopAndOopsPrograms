package javaLab.day4;

import java.util.Scanner;

public class SumOfEvenDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Provide a number :");

		int number = sc.nextInt();

		sc.close();

		int sum = 0;

		int digit;

		while (number > 0) {
			digit = number % 10;

			if (digit % 2 == 0) {

				sum = sum + digit;

			}

			number = number / 10;

		}

		System.out.println("Sum of even digits of a number is : " + sum);

	}

}
