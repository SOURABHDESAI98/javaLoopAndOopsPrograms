package javaLab.day2;

// problem statement- print numbers from 1 to 20 and skip numbers which are divisible by 3 & 5
public class Q10 {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("number skipped");
				continue;

			}

			System.out.println(i);

		}

	}

}
