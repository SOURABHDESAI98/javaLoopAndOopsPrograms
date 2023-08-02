package javaAfternoon.overriding;

// overriding of static method can not be done because it causes method hiding

class Flower {

	public static void show() {
		System.out.println("This is a Parent class method");
	}

}

class Rose extends Flower {

	public static void show() {
		System.out.println("This is a Apple child class method");
	}
}

public class OverridingStaticMethod {

	public static void main(String[] args) {

		Apple ap = new Apple();
		ap.show();

		Fruit ft = new Apple(); // this is method hiding
								// hence overriding of static method can not be done because it causes method
								// hiding
		ft.show();

	}

}
