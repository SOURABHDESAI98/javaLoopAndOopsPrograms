package javaAfternoon.day1;

import java.util.Scanner;

// problem statement- get day names by inputing day numbers

public class GetDayNames {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("input day number:");

		int num = input.nextInt();

		switch (num) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		}

		input.close();

	}

}
