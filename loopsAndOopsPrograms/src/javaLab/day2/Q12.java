package javaLab.day2;

public class Q12 {

	// print numbers 1,8,27,64,125

	public static void main(String[] args) {

		System.out.println("first series");
		double number;

		for (int i = 1; i <= 5; i++) {

			number = Math.pow(i, 2);

			System.out.println(number - 1);

		}

	}

}
