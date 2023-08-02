package javaLab.day4;

public class LuckyNum {

	public static void main(String[] args) {
		int registrationNum = 78595925;

		int luckyNum = 5;

		int count = 0;

		int digit;

		while (registrationNum > 0) {

			digit = registrationNum % 10;

			if (luckyNum == digit) {
				count++;
			}

			registrationNum = registrationNum / 10;

		}

		System.out.println("lucky number has appeared " + count + " times");

	}

}
