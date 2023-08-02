package javaAfternoon.overriding;

class Shape {

	String name;

	public void draw(String name) {
		this.name = name;
		System.out.println(name + " is drawn");
	}

}

class Circle extends Shape {
	@Override
	public void draw(String name) {
		this.name = name;
		System.out.println(name + " is drawn");
	}

}

class Square extends Shape {
	@Override
	public void draw(String name) {
		this.name = name;
		System.out.println(name + " is drawn");
	}

}

class Rectangle extends Shape {
	@Override
	public void draw(String name) {
		this.name = name;
		System.out.println(name + " is drawn");
	}

}

public class InheritanceA4 {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.draw("Shape");

		Circle circle = new Circle();
		circle.draw("Circle");

		Rectangle rect = new Rectangle();
		rect.draw("Rectangle");

		Square sq = new Square();
		sq.draw("Square");

	}

}
