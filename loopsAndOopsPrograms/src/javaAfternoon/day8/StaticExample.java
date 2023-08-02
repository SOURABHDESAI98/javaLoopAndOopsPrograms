package javaAfternoon.day8;

public class StaticExample {

	public static void mi() {

		System.out.println("hello");
	}

	public void m2() {
		mi();

	}

	public static void main(String[] args) {

		mi(); // no need to create instance for static method

		StaticExample s1 = new StaticExample();

		s1.m2(); // instance needs to be created for non static method

	}

}
