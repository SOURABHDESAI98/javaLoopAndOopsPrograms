package javaAfternoon.overriding;

class Bike {

	String type;
	String engine;

	public Bike(String type, String engine) {
		this.type = type;
		this.engine = engine;

	}

	public void bikeInfo() {

		System.out.println("Bike Class:");

		System.out.println("Bike Type :" + type);
		System.out.println("Bike Engine :" + engine);

	}

}

class Pulsar extends Bike {
	int price;

	public Pulsar(String type, String engine, int price) {
		super(type, engine);
		this.type = type;
		this.engine = engine;
		this.price = price;

	}

	@Override
	public void bikeInfo() {
		System.out.println("Pulsar Subclass:");
		System.out.println("Bike Type :" + type);
		System.out.println("Bike Engine :" + engine);
		System.out.println("Bike Price :" + price);

		System.out.println();

		super.bikeInfo();

	}

}

public class InheritanceA5 {

	public static void main(String[] args) {

		Pulsar xtreme = new Pulsar("4 stroke", "Twin Spark", 10000);
		xtreme.bikeInfo();

	}

}
