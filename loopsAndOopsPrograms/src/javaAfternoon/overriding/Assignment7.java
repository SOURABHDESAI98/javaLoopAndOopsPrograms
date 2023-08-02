package javaAfternoon.overriding;

class Bank {

	public void getInterest(int a) {
		System.out.println("Interest of bank is " + a + " %");

	}
}

class Sbi extends Bank {

	public void getInterest(int a) {
		System.out.println("Interest of sbi bank is " + a + " %");

	}
}

class Icici extends Bank {

	public void getInterest(int a) {
		System.out.println("Interest of icici bank is " + a + " %");

	}
}

class Axis extends Bank {

	public void getInterest(int a) {
		System.out.println("Interest of axis bank is " + a + " %");

	}
}

public class Assignment7 {

	public static void main(String[] args) {
		Sbi sbi = new Sbi();
		sbi.getInterest(5);
		System.out.println();
		Icici icici = new Icici();
		icici.getInterest(6);
		System.out.println();
		Axis axis = new Axis();
		axis.getInterest(7);

	}

}
