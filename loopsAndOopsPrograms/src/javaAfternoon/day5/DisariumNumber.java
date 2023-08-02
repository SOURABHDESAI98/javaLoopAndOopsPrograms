package javaAfternoon.day5;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("input your number");

		int num = sc.nextInt();

		int temp = num;

		int sum = 0;

		int digit;

		int length = (int) (Math.log10(num) + 1);

		sc.close();

		while (num > 0) {

			digit = num % 10;

			sum = sum + (int) Math.pow(digit, length);

			num = num / 10;

			length--;

		}

		if (temp == sum) {

			System.out.println("This number is a Disarium number");

		} else {
			System.out.println("This number is not a Disarium number");
		}

	}

}
