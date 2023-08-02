package javaLab.day8;

import java.util.Scanner;

public class CalculatorMethodApproach {

	int num1;
	int num2;

	public int add(int a, int b) {

		num1 = a;
		num2 = b;
		return num1 + num2;

	}

	public int subtract(int a, int b) {

		num1 = a;
		num2 = b;
		return num1 - num2;

	}

	public int multiply(int a, int b) {

		num1 = a;
		num2 = b;
		return num1 * num2;

	}

	public int divide(int a, int b) {

		num1 = a;
		num2 = b;
		return num1 / num2;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("input your first number");

		int num1 = input.nextInt();

		System.out.println("input your second number");

		int num2 = input.nextInt();

		System.out.println("provide arithmatic operator:");

		String operator = input.next();

		CalculatorMethodApproach c = new CalculatorMethodApproach();

		switch (operator) {

		case "+":
			System.out.println(c.add(num1, num2));
			break;
		case "-":
			System.out.println(c.subtract(num1, num2));
			break;
		case "*":
			System.out.println(c.multiply(num1, num2));
			break;
		case "/":
			System.out.println(c.divide(num1, num2));
			break;
		default:
			System.out.println("invalid");

		}

		input.close();

	}

}
