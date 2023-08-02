package javaAfternoon.overriding;

class Parent {
	String name = "Neel";
	String relation;
	String sirName = "Mukesh";

	public Parent() {

	}

	public Parent(String relation) {

		this.relation = relation;

	}

	public void parentDetails() {

		System.out.println("Parent's name is " + name);

	}

	public void parentRelation() {

		System.out.println(name + " is a " + relation);

	}

}

class Child extends Parent {

	String name;
	String relation;

	public Child() {

		super("Father");

	}

	public Child(String name, String relation) {
		this();
		this.name = name;
		this.relation = relation;

	}

	public void childDetails() {

		System.out.println("child's name is " + name);
		super.parentDetails();
		System.out.println(this.name + " is " + relation + " of " + super.name);
		System.out.println("Child's full name is " + this.name + " " + super.name + " " + sirName);

	}

	public void parentRelation() {

		System.out.println(super.name + " is a " + super.relation);

	}

}

public class ThisSuperDemo {

	public static void main(String[] args) {

		Child nitin = new Child("Nitin", "Child");
		nitin.childDetails();
		nitin.parentRelation();

	}

}
