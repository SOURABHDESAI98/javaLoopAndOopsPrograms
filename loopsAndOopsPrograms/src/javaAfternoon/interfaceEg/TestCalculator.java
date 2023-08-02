package javaAfternoon.interfaceEg;

interface Calculator {

	public int add(int a, int b);

	public int sub(int a, int b);

	public int multiply(int a, int b);

	public int division(int a, int b);

	// java 9
	private void data() {
		System.out.println(" method in interface");
	}

	// java 9
	static void shareData() {
		System.out.println("static method in interface");
		share();
	}

	private static void share() {
		System.out.println("static method private");
	}

	default void display() {
		data();
		System.out.println("facebook");

	}

	default void m1() {
		// System.out.println(" method in interface");
		System.out.println("amazon");

	}

	default void m2() {
		// System.out.println(" method in interface");
		System.out.println("flipkart");

	}

	// java 8
	default void m3() {
		// System.out.println(" method in interface");
		System.out.println("instagram");
	}
}

class BasicCal implements Calculator {

	@Override
	public int add(int a, int b) {

		return a + b;
	}

	@Override
	public int sub(int a, int b) {

		return a - b;
	}

	@Override
	public int multiply(int a, int b) {

		return a * b;
	}

	@Override
	public int division(int a, int b) {

		return a / b;
	}

}

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicCal b = new BasicCal();
		System.out.println("add:" + b.add(12, 3));
		System.out.println("sub:" + b.sub(12, 3));
		System.out.println("multiply:" + b.multiply(12, 3));
		System.out.println("div:" + b.division(12, 3));
		b.display();

		Calculator.shareData();

	}

}
