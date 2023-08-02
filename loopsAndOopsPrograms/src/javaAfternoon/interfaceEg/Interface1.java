package javaAfternoon.interfaceEg;

interface cal {

	public void show(int a);

	default void showData(int a, int b) { // default method, it' access modifier is public
		data();
		divide(a, b);
	}

	static void add(int a, int b) { // static method

		System.out.println(a + b);

	}

	private void data() { // private method

		System.out.println("Private method");
	}

	private static void divide(int a, int b) { // private static method

		System.out.println(a / b);
	}

}

class Basic implements cal {

	public void show(int a) {
		System.out.println(a);
	}

}

public class Interface1 {

	public static void main(String[] args) {

		cal.add(4, 5);
		cal c = new Basic();
		c.showData(5, 7);

	}

}
