package javaAfternoon.day3;

public class BarrelPrice {

	public static void main(String[] args) {

		int perBarrel = 89;

		for (int i = 1; i <= 20; i++) {

			if (i <= 10) {
				System.out.println("total price if you buy " + i + " barrels is :" + perBarrel * i);
			} else {
				System.out.println("total price if you buy " + i + " barrels is :" + i * (perBarrel - i));
			}

		}

	}

}
