package javaLab.day8;

// This is constructor chaining

public class PipeThisEg {

	String brand;
	static String color;
	int id;
	int price;

	PipeThisEg() {
		this("Finolex", "white");

	}

	PipeThisEg(String a, String b) {
		this(101, 11000);
		brand = a;
		color = b;

	}

	PipeThisEg(int c, int d) {
		id = c;
		price = d;

	}

	public void display() {

		System.out.println("Pipe Name :" + brand);
		System.out.println("Pipe Color :" + color);
		System.out.println("Pipe Id :" + id);
		System.out.println("Pipe Price :" + price);

	}

	public static void main(String[] args) {

		PipeThisEg e1 = new PipeThisEg();
		e1.display();
		System.out.println(e1.brand); // non static instance variable
		System.out.println(color); // static instance variable

	}

}
