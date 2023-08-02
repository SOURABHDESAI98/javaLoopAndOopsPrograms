package javaAfternoon.day2;

import java.util.Scanner;

// find factorial of given number

public class Q11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("provide number :");

		int number = sc.nextInt();
		double factorial = number;

		for (int i = number - 1; i >= 1; i--) {

			factorial = factorial * i;

		}

		System.out.println(factorial);

		sc.close();

	}

}
