package javaAfternoon.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("input your first number");

		int num1 = input.nextInt();

		System.out.println("input your second number");

		int num2 = input.nextInt();

		System.out.println("provide arithmatic operator:");

		String operator = input.next();

		switch (operator) {

		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("invalid");

		}

		input.close();

	}

}
