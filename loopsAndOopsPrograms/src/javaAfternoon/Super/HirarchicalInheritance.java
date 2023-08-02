package javaAfternoon.Super;

class Gold {

	String type = "24 carrets";

	public void gold() {
		System.out.println("This comes under gold class");
	}

}

class Ornaments extends Gold {

	int price = 100000;

	public void ornaments() {
		System.out.println("This is ornaments subclass");
		super.gold();
		System.out.println("Type :" + super.type);

	}

}

class Bracelets extends Gold {

	int price = 10000;

	public void bracelets() {
		System.out.println("This is bracelets subclass");
		super.gold();
		System.out.println("Type :" + super.type);
	}

}

public class HirarchicalInheritance {

	public static void main(String[] args) {

		Ornaments o1 = new Ornaments();
		o1.ornaments();
		System.out.println();

		Bracelets b1 = new Bracelets();
		b1.bracelets();

	}

}
