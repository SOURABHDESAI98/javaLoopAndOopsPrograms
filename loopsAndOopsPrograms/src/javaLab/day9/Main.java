package javaLab.day9;

class Bank {

	int ifscCode;
	String name;

	public Bank(int ifscCode, String name) {
		this.ifscCode = ifscCode;
		this.name = name;

	}

	public void display() {

		System.out.println("Bank name:" + name);
		System.out.println("Bank ifsc code :" + ifscCode);

	}
}

class Rbi extends Bank { // Single Inheritance

	public Rbi(int ifscCode, String name) {
		super(ifscCode, name);

	}

}

class Sbi extends Rbi { // Hirarchical Inheritance

	public Sbi(int ifscCode, String name) {
		super(ifscCode, name);

	}

}

class Icici extends Rbi {

	public Icici(int ifscCode, String name) {
		super(ifscCode, name);

	}

	public void hello() {
		System.out.println("Hello !!");

	}

}

public class Main {

	public static void main(String[] args) {

		Sbi sbi = new Sbi(1001, "State bank of India");
		sbi.display();
		System.out.println();

		Icici icici = new Icici(1002, "Icici bank");
		icici.display();

	}

}
