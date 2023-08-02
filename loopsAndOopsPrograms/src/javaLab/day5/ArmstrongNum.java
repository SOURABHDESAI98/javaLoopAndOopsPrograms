package javaLab.day5;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Provide a number");

		int num = sc.nextInt();
		int temp = num;
		int length = (int) (Math.log10(num) + 1);
		int digit;
		int calculation = 0;

		sc.close();

		while (num > 0) {

			digit = num % 10;
			calculation = calculation + (int) Math.pow(digit, length);
			num = num / 10;

		}

		if (calculation == temp) {
			System.out.println("This is a armstrong number !!");

		} else {
			System.out.println("This is a not a armstrong number !!");

		}

	}

}
