package javaAfternoon.overriding;

class Company {

	String buildingName;
	int pin;

	protected Object address() {

		return pin + " " + buildingName;
	}

}

class Ebay extends Company {

	public Ebay(String buildingName, int pin) {

		this.buildingName = buildingName;
		this.pin = pin;

	}

	protected String address() {

		return pin + " " + buildingName;
	}

}

public class InheritanceA2 {

	public static void main(String[] args) {

		Company c1 = new Company();
		c1.buildingName = "ABC";
		c1.pin = 411011;
		System.out.println("Company address " + c1.address());

		Ebay ebay = new Ebay("Ebay", 416101);
		System.out.println("Ebay address " + ebay.address());

	}

}
