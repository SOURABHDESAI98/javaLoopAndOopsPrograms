package javaAfternoon.interfaceEg;

class Superclass {
	public static void show() {
		System.out.println("Hello");
	}

	public void show2() {
		System.out.println("Hello");
	}
}

class Subclass extends Superclass {

	public void callingStatic() {
		show(); // you can call static method in child
		show2(); // you can call non static method in child
	}
}

public class Doubte {

	public static void main(String[] args) {

	}

}
