package javaAfternoon.day4;

public class Pattern5 {

	public static void main(String[] args) {

		int j;

		for (int i = 1; i <= 4; i++) {

			j = 1;

			do {

				if (j % 2 == 0) {
					System.out.print(0);

				} else {

					System.out.print(1);
				}

				j++;

			} while (j <= i);

			System.out.println();

		}

	}

}
