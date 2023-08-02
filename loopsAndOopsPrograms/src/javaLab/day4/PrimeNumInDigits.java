package javaLab.day4;

import java.util.Scanner;

public class PrimeNumInDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Provide a number :");

		int number = sc.nextInt();

		sc.close();
		int digit;
		boolean flag;

		System.out.println("Prime numbers are :");

		while (number > 0) {
			flag = true;

			digit = number % 10;

			if (digit == 1) {

				flag = false;

			}

			for (int i = 2; i < digit; i++) {

				if (digit % i == 0) {

					flag = false;

				}

			}

			if (flag) {
				System.out.print(digit + " ");

			}

			number = number / 10;

		}
	}

}
