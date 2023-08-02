package javaLab.day4;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("input your number");

		int number = sc.nextInt();

		int length = (int) (Math.log10(number) + 1);

		sc.close();

		int lastDigits;
		boolean flag = true;

		int square = (int) Math.pow(number, 2);
		boolean access = true;

		while (access) {

			lastDigits = square % (int) Math.pow(10, length);
			if (number == lastDigits) {
				flag = false;

				System.out.println("Given number is automorphic number");
				break;

			}

			break;

		}

		if (flag) {

			System.out.println("Given number is not automorphic number");

		}

	}

}
