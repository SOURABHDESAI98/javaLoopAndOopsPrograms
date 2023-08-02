package javaAfternoon.Super;

class Vehicle {

	String engine = "4 stroke";

}

class Car extends Vehicle {

	String type = "passenger";

}

class Mercedes extends Car {

	String price = "10 millions";

}

public class MultilevelInheritance {

	public static void main(String[] args) {

		Mercedes m1 = new Mercedes();
		String price = m1.price;
		String type = m1.type;
		String engine = m1.engine;
		System.out.println(price);
		System.out.println(type);
		System.out.println(engine);

	}

}
