package javaLab.day4;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" You have to guess lucky number :");

		int key = 4;

		boolean flag = true;

		while (flag) {

			System.out.println("Guess lucky number :");

			int num = sc.nextInt();

			if (num > key) {

				System.out.println("Number is greater than lucky number");
				continue;

			} else if (num < key) {
				System.out.println("Number is smaller than lucky number");
				continue;

			} else {
				System.out.println(
						"Congrats !!! you have guessed correct number, now pay me some money for doing this code");
				sc.close();
				break;

			}
		}

	}

}
