package javaAfternoon.day10;

public final class Final { // final class can not be inherited

	final int a;

	public Final() {
		a = 10;

	}

	public Final(String b) {
		// a = 100; final value can not be changed
		a = 10; // but you have to initialize final value in every constructor

	}

	public final void show() { // final method can not be overridden
		System.out.println(a);

	}

	public static void main(String[] args) {

		Final fn = new Final();
		fn.show(); // output : 10

		Final fn2 = new Final("SD");
		fn.show(); // output : 10

	}

}
