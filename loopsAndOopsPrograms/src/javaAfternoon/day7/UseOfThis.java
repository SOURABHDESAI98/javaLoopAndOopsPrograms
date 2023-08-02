package javaAfternoon.day7;

public class UseOfThis {

	String name;

	public UseOfThis() {

		this("Sourabh"); // use 0f this
		System.out.println("Hello " + name);

	}

	public UseOfThis(String name) {

		this.name = name; // use 0f this

	}

	public void method1() {

		this.method2(); // use 0f this

	}

	public void method2() {

		System.out.println("This is method2");
	}

	public static void main(String[] args) {

		UseOfThis instance = new UseOfThis();
		instance.method1();

	}

}
