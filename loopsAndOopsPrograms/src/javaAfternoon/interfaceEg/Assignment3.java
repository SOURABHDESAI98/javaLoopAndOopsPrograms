package javaAfternoon.interfaceEg;

interface Bike1 {

	void offer();

	default void details(int a) {
		System.out.println("Disount of bike is :" + a + " %");
	}

}

interface Scooty {

	void offer();

	default void details(int a) {
		System.out.println("Disount of scooty is :" + a + " %");
	}

}

class BuySomething implements Bike1, Scooty {

	public void details(int a) {
		Bike1.super.details(a);
		Scooty.super.details(a);

	}

	public void offer() {
		System.out.println("5% off on sbi credit card");
	}

}

public class Assignment3 {

	public static void main(String[] args) {

		BuySomething b = new BuySomething();
		b.details(8);

	}

}
