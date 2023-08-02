package javaLab.day2;

// print numbers from 1 to 10 and show replace numbers which are divisible by 3 by "1X", divisible by 5 by "TEL" and divisible by both "1XTEL"
//                                    

public class Q4 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("1X");
				continue;

			}
			if (i % 5 == 0 && i % 3 != 0) {
				System.out.println("TEL");
				continue;

			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("1XTEL");
				continue;

			}

			System.out.println(i);

		}

	}

}
