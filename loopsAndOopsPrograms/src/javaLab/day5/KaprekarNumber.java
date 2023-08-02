package javaLab.day5;

import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, d = 0, a, s = 0, f, l;
		System.out.println("Enter an integer:");
		a = sc.nextInt();
		sc.close();
		for (i = a; i > 0; i = i / 10) {
			d++;
		}
		s = a * a;
		f = s / (int) Math.pow(10, d);
		l = s % (int) Math.pow(10, d);
		if (f + l == a)
			System.out.println("Kaprekar Number");
		else
			System.out.println("Not a Kaprekar Number");

	}

}
