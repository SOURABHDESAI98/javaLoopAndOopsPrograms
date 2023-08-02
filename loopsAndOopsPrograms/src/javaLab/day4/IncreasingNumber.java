package javaLab.day4;

import java.util.Scanner;

public class IncreasingNumber {

	// TODO: Do the code by selecting last digit of number at each time while
	// comparing.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Provide a number :");

		int num = sc.nextInt();
		int length = (int) (Math.log10(num) + 1);
		int power1 = length - 1;
		int power2 = power1 - 1;

		sc.close();

		int digit1;

		int digit2;

		int index = 0;
		boolean flag = false;

		while (index < length) {

			digit1 = num / (int) Math.pow(10, power1);

			digit2 = num / (int) Math.pow(10, power2);

			System.out.println(digit1);
			System.out.println(digit2);

			if (digit1 > digit2) {

				power1 = power1 - 1;
				index++;

				continue;

			} else {
				flag = true;
				break;
			}

		}

		if (flag) {
			System.out.println("Number is not increasing number");
		} else {
			System.out.println("Number is increasing number");

		}

	}

}
