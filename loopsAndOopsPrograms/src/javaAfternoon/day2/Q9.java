package javaAfternoon.day2;

// iterate 1 to 20 and break loop when a number is divisible by 3 & 9

public class Q9 {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {

			if (i % 3 == 0 && i % 9 == 0) {
				System.out.println("loop is stopped");
				break;

			}

			System.out.println(i);

		}

	}

}
