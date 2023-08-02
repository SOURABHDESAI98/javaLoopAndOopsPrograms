package javaAfternoon.getSetContainment;

class Engine {

	private String type;
	private int cc;

	public void setType(String type) {
		this.type = type;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getType() {
		return type;
	}

	public int getCc() {
		return cc;
	}

}

public class Car {

	private int modelNum;
	private String name;
	private int price;
	Engine e1;

	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setEngine(Engine e1) {

		this.e1 = e1; // object is created

	}

	public Engine getEngine() { // return type is class

		return e1; // object is returned

	}

	public int getModelname() {
		return modelNum;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void getCarDetails() {

		System.out.println("Car Details :");
		System.out.println("* Model Name :" + getModelname());
		System.out.println("* Name :" + getName());
		System.out.println("* Price :" + getPrice());
		Engine e1 = getEngine();
		e1.setCc(5000);
		e1.setType("4 stroke Twin Spark");
		System.out.println("Engine Details :");
		System.out.println("* CC :" + e1.getCc());
		System.out.println("* Type :" + e1.getType());

	}

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.setModelNum(101);
		c1.setName("Buggati");
		c1.setPrice(100000);
		c1.setEngine(new Engine());
		c1.getCarDetails();

	}

}
