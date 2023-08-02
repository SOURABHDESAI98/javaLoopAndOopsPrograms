package javaAfternoon.day1;

import java.util.Scanner;
// problem statement- print whether number is divisible or not

public class Divisible {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("provide input");

		int number = input.nextInt();

		String result = (number % 5 == 0) ? "divisible" : "not divisible";

		System.out.println(result);

		input.close();

	}

}
