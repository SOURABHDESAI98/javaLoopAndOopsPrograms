package javaLab.day7;

public class Item {

	int id;
	String name;
	int price;

	public void display() {

		System.out.println("Item Detils :");

		System.out.println("Item ID is " + id);
		System.out.println("Item Name is " + name);
		System.out.println("Item Price is " + price);

	}

	public static void main(String[] args) {

		Item car = new Item();
		car.id = 101;
		car.name = "BMW";
		car.price = 1000000;
		car.display();

		System.out.println();

		Item bike = new Item();
		bike.id = 102;
		bike.name = "Aprilia";
		bike.price = 12000;
		bike.display();

	}

}
