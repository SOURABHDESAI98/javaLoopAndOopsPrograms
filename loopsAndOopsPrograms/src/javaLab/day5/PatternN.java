package javaLab.day5;

public class PatternN {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {

			for (int j = 1; j < 5; j++) {

				if (i == 1 || i == 4) {

					if (j == 1 || j == 4)

						System.out.print("*");

					else
						System.out.print(" ");

				} else if (i == 2) {

					if (j == 1 || j == 2 || j == 4)

						System.out.print("*");

					else
						System.out.print(" ");

				} else {

					if (j == 1 || j == 3 || j == 4)

						System.out.print("*");

					else
						System.out.print(" ");

				}

			}

			System.out.println();
		}

	}

}
