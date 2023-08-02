package javaAfternoon.day5;

import java.util.Scanner;

public class Trimorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("input your number");

		int number = sc.nextInt();

		int length = (int) (Math.log10(number) + 1);

		sc.close();

		int lastDigits;
		boolean flag = true;

		int cube = (int) Math.pow(number, 3);
		boolean access = true;

		while (access) {

			lastDigits = cube % (int) Math.pow(10, length);
			if (number == lastDigits) {
				flag = false;

				System.out.println("Given number is trimorphic number");
				break;

			}

			break;

		}

		if (flag) {

			System.out.println("Given number is not trimorphic number");

		}

	}

}
