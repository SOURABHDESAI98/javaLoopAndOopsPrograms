package javaLab.day4;

import java.util.Scanner;

public class Chocolates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("provide your money :");

		int money = sc.nextInt();
		sc.close();

		int wrapperToGive = money % 3;
		int WrapperGiven = money / 3; // extra chocolates

	}

}
