package javaAfternoon.day1;

import java.util.Scanner;

// problem statement- display salary by experience

public class SalaryByExperience {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("provide experience:");

		String experience = input.next();

		switch (experience) {
		case "fresher":
			System.out.println("your salary will be 3lpa");
			break;
		case "intermediate":
			System.out.println("your salary will be 5lpa");
			break;
		case "experienced":
			System.out.println("your salary will be 8lpa");
			break;

		}

		input.close();

	}

}
