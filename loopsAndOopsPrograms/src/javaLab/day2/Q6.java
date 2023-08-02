package javaLab.day2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		// display table of given number

		Scanner sc = new Scanner(System.in);
		System.out.println("provide number: ");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(num * i);
		}

		sc.close();

	}

}
