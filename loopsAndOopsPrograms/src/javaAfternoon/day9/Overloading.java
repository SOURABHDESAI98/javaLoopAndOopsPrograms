package javaAfternoon.day9;

public class Overloading {

	public double calculateArea(int a) {

		return 3.14 * Math.pow(a, 2);
	}

	public int calculateArea(int a, int b) {

		return a * b;

	}

	public double calculateArea(float a, float b) {

		return 0.5 * a * b;
	}

	public float calculateArea(float b) {
		return b * b;

	}

	public static void main(String[] args) {

		Overloading circle = new Overloading();
		System.out.println("Area of circle :" + circle.calculateArea(5));

		Overloading rectangle = new Overloading();
		System.out.println("Area of rectangle :" + rectangle.calculateArea(5, 4));

		Overloading triangle = new Overloading();
		System.out.println("Area of triangle :" + triangle.calculateArea(5f, 4f));

		Overloading square = new Overloading();
		System.out.println("Area of square :" + square.calculateArea(5f));

	}

}
