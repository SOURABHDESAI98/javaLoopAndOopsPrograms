package javaLab.day6;

public class CharPattern {

	public static void main(String[] args) {

		int num = 0;

		for (char i = 'A'; i <= 'D'; i++) {

			for (char j = i; j <= i + num; j++) {

				System.out.print(j);
			}

			num++;
			System.out.println();

		}

	}

}
