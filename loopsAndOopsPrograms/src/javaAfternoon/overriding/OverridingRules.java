package javaAfternoon.overriding;

//Overriding
//Rule 1: same method name with same parameters
//Rule 2 :access modifier of overriding method should be always same or higher than
//Rule 3: overridden method and overriding method return type should be same, non primitive return type should be same or co-variant

class Vehicle {

	String name = "Car";

	public Vehicle() {

	}

	String name() {
		System.out.println("Vehicle type :" + name);
		return "This is overridden method";

	}

}

class Car extends Vehicle {

	public Car(String name) {
		super();
		super.name = name;
	}

	@Override
	public String name() {

		System.out.println("Car name :" + name);
		return "This is overriding method";
	}

}

public class OverridingRules {

	public static void main(String[] args) {

		Car bmw = new Car("BMW");
		String name1 = bmw.name();
		System.out.println(name1);

		System.out.println();

		Vehicle v1 = new Vehicle();
		String name2 = v1.name();
		System.out.println(name2);

	}

}
