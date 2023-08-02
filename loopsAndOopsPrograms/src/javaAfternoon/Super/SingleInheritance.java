package javaAfternoon.Super;

class HumanBeings {

	String category;

	public HumanBeings(String a) {

		category = a;

	}

	public void category() {
		System.out.println("Category :" + category);

	}

}

class Man extends HumanBeings {

	int legs;

	public Man() {
		super("mammals");

	}

	public Man(int b) {

		this();
		legs = 2;
	}

	public void action() {

		System.out.println("Man walks on " + legs + " legs");
		super.category();

	}

}

public class SingleInheritance {

	public static void main(String[] args) {

		Man m1 = new Man(2);

		m1.action();

	}

}
