package javaAfternoon.day9;

class Pen {

	String brand;
	int price;
	String colour;

	public Pen(String brand, int price, String colour) {
		this.brand = brand;
		this.price = price;
		this.colour = colour;

	}

	public void display() {

		System.out.println("Pen details :");

		System.out.println(" brand :" + brand);

		System.out.println(" price :" + price);

		System.out.println(" colour:" + colour);

	}
}

public class BagContainment {

	String brand;
	int price;
	String colour;
	Pen p;

	public BagContainment(String brand, int price, String colour, Pen p) {

		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.p = p;

	}

	public void display() {
		System.out.println("Bag details :");

		System.out.println(" brand :" + brand);

		System.out.println(" price :" + price);

		System.out.println(" colour:" + colour);

		System.out.println("Bag contains pen :");
		p.display();

	}

	public static void main(String[] args) {

		Pen p1 = new Pen("Fountain", 500, "Blur");

		BagContainment bag = new BagContainment("Skybag", 1500, "Silver", p1);
		bag.display();

	}

}
