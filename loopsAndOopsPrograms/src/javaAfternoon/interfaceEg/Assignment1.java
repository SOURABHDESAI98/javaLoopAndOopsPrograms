package javaAfternoon.interfaceEg;

interface Shape {

	void draw();

	void erase();
}

class Circle implements Shape {

	public void draw() {
		System.out.println("Circle is drawn");
	}

	public void erase() {
		System.out.println("Circle is erased");
	}
}

class Triangle implements Shape {

	public void draw() {
		System.out.println("Triangle is drawn");
	}

	public void erase() {
		System.out.println("Traingle is erased");
	}
}

class Square implements Shape {

	public void draw() {
		System.out.println("Square is drawn");
	}

	public void erase() {
		System.out.println("Square is erased");
	}
}

public class Assignment1 {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.draw();
		c.erase();
		System.out.println();
		Triangle t = new Triangle();
		t.draw();
		t.erase();
		System.out.println();
		Square sq = new Square();
		sq.draw();
		sq.erase();

	}

}
