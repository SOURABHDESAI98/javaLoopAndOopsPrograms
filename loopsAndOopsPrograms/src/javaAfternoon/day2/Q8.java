package javaAfternoon.day2;

import java.util.ArrayList;
import java.util.Scanner;

// find factors of given number

public class Q8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("provide number :");

		int number = sc.nextInt();
		sc.close();

		int i;
		ArrayList<Integer> list = new ArrayList<>(); // arrayList is used to initiate array with undefined size

		for (i = number; i >= 1; i--) {
			if (number % i == 0) {

				list.add(i);
			}

		}

		System.out.println("factors of number that you have provided is :" + list);

	}

}
