package javaAfternoon.day7;

import java.util.Scanner;

public class Substring {

	String string;

	public String removeChar(int a) {

		string = string.substring(0, a) + string.substring(a + 1);
		return string;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input String :");

		String inputString = sc.next();

		System.out.println("Input start index :");

		int startInd = sc.nextInt();

		sc.close();

		Substring string1 = new Substring();

		string1.string = inputString;
		System.out.println(string1.removeChar(startInd));

	}

}
