package javaLab.day6;

import java.util.Scanner;

public class MilkOil {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int milkQ;
		int oilQ;

		do {

			System.out.println("Provide Quantity of Milk In Litres");
			milkQ = sc.nextInt();

			System.out.println("Provide Quantity of Oil In Litres");
			oilQ = sc.nextInt();

			int milkPrice = milkQ * 40;
			int oilPrice = oilQ * 50;

			sum = sum + milkPrice + oilPrice;

		} while (sum <= 500);

		sc.close();

		System.out.println("Quantity of milk :" + milkQ);
		System.out.println("Quantity of oil :" + oilQ);

	}

}
