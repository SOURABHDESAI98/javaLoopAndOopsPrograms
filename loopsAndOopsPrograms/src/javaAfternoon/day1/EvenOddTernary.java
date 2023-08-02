package javaAfternoon.day1;

import java.util.Scanner;
// problem statement- tell whether number is even or odd

public class EvenOddTernary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("provide input");

		int number = input.nextInt();

		String result = (number % 2 == 0) ? "even" : "odd";

		System.out.println(result);

		input.close();

	}

}
