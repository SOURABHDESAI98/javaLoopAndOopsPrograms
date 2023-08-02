package javaLab.day1;

import java.util.Scanner;

public class GetCoins {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("provide age:");
		int age = input.nextInt();

		int goldCoins = (int) Math.pow(age, 3);

		System.out.println("no. of coins: " + goldCoins);
		input.close();
	}

}
