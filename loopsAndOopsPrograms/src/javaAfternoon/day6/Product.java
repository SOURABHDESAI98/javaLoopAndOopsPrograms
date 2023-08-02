package javaAfternoon.day6;

import java.util.Scanner;

public class Product {

	int id;
	String name;
	int price;
	int quantity;
	int bill = 0;

	public void details(int a, String b, int c, int d) {

		id = a;
		name = b;
		price = c;
		quantity = d;

	}

	public void calculate() {

		if (quantity > 0) {

			bill = price * quantity;
			display(); // in methods other than main method,other methods can be called without
						// creating instance

		} else {

			System.out.println("Please provide product quantity more than 0. ");

		}

	}

	public void display() {

		System.out.println("Product Details :");
		System.out.println("ID :" + id);
		System.out.println("Name :" + name);
		System.out.println("Quantity:" + quantity);
		System.out.println("Net Bill of " + quantity + " products is " + bill + " Rs.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Provide Name of Product :");
		String prodName = sc.next();

		System.out.println("Provide Quantity Of Products You Want To Order :");
		int qty = sc.nextInt();
		sc.close();

		Product prod1 = new Product();

		prod1.details(101, prodName, 500, qty);
		prod1.calculate();

	}

}
