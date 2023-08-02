package javaAfternoon.day4;

public class Pattern2 {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i <= 4; i++) {

			count = count + 1;

			for (int j = 1; j <= i; j++) {

				System.out.print(count);

			}
			System.out.println();

		}

	}

}
