package javaAfternoon.overriding;

class Rect {

	int length;
	int breadth;

	public Rect(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;

	}

}

class Box extends Rect {
	int depth;

	public Box(int length, int breadth, int depth) {
		super(length, breadth);
		this.depth = depth;

	}

	public void area() {

		System.out.println("Surface area of box is :" + 2 * (length * breadth + breadth * depth + depth * length));

	}

}

public class Assignment6 {

	public static void main(String[] args) {

		Box bx = new Box(15, 20, 25);
		bx.area();

	}

}
