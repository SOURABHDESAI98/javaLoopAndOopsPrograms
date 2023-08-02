package javaAfternoon.day6;

public class Car {

	int modelNo;
	String name;
	int price;

	public void details(int a, String b, int c) {

		modelNo = a;
		name = b;
		price = c;

	}

	public void display() {
		System.out.println("Car Name:" + name);
		System.out.println("Model No :" + modelNo);
		System.out.println("Car Price :" + price);

	}

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.details(101, "Tesla F5", 8000000);
		car1.display();
		System.out.println();

		Car car2 = new Car();
		car2.details(102, "BMW X4", 300000);
		car2.display();
		System.out.println();

		Car car3 = new Car();
		car3.details(103, "Mercedes M7", 4000000);
		car3.display();
		System.out.println();

	}

}
