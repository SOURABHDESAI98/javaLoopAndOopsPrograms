package javaAfternoon.overriding;

import java.util.Scanner;

class Base {
	int a;
	int b;

	public Base(int a, int b) {
		this.a = a;
		this.b = b;

	}

}

class Derived extends Base {

	int output;

	public Derived(int a, int b) {
		super(a, b);

	}

	public void findMax() {

		output = a > b ? a : b;

		System.out.println(output + " is greater");

	}

	public void findMin() {
		output = a > b ? b : a;

		System.out.println(output + " is smaller");

	}

}

public class Assignment5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide first value :");
		int a = sc.nextInt();
		System.out.println("Provide second value :");
		int b = sc.nextInt();
		sc.close();

		Derived d = new Derived(a, b);
		d.findMax();
		d.findMin();

	}

}
