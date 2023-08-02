package javaAfternoon.interfaceEg;

public class Code {

	public static void main(String[] args) {
		method(null);
	}

	public static void method(Object o) {
		System.out.println("Object method");
	}

	public static void method(String o) {
		System.out.println("String method");
	}

}
