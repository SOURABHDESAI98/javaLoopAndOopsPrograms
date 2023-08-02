package javaLab.day6;

public class Pattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			for (int j = 2; j >= 1; j--) { // space

				if (i == 2 && j == 2 || i == 3 && j == 1 || i == 3 && j == 2) {

					continue;

				} else {
					System.out.print("_");

				}

			}

			for (int j = 1; j <= i; j++) { // pattern 1

				System.out.print(j);

			}

			for (int j = i; j >= 1; j--) { // pattern 1

				System.out.print(j);

			}

			System.out.println();

		}

	}

}

/*
 *
 * 
 * 
 * 
 */
