package javaAfternoon.day1;

import java.util.Scanner;
// problem statement- tell whether number is positive, negative or zero

public class GuessNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("provide input");

		int number = input.nextInt();

		String result = (number > 0) ? "positive" : (number < 0) ? "negative" : " invalid";

		System.out.println(result);

		input.close();
	}

}
