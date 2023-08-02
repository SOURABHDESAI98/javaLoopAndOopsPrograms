package javaAfternoon.overriding;

class Kid {

	String name;
	int a;

	public void readBook() { // overloading
		System.out.println("Reads book");

	}

	public void readBook(String name, int a) { // overloading
		System.out.println("Usually a" + name + " reads " + a + " books in 1 day");
	}

}

class Boy extends Kid {

	@Override
	public void readBook(String name, int a) {
		System.out.println(name + " reads " + a + " books in 1 day");

	}

}

public class OverloadingVsOverridingInhA1 {

	public static void main(String[] args) {
		Boy b1 = new Boy();
		b1.readBook("Sourabh", 2);

		Kid k1 = new Kid();
		k1.readBook();
		k1.readBook(" Kid", 1);

	}

}
