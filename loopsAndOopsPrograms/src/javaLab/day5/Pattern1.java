package javaLab.day5;

public class Pattern1 {

	public static void main(String[] args) {

		boolean flag = true;

		for (int i = 1; i <= 5; i++) {

			if (flag) {

				for (int j = 1; j <= 5; j++) {

					System.out.print("* ");

				}

			} else {

				for (int j = 1; j < 2; j++) {

					System.out.print("* ");

				}

			}

			System.out.println();

			flag = !flag;

		}

	}

}
