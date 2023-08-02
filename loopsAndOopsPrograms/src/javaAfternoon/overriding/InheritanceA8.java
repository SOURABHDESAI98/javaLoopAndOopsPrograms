package javaAfternoon.overriding;

class Person2 {

	public void readScript() {
		System.out.println("A person reads a script");

	}
}

class Actor extends Person2 {

	public void readScript() {
		System.out.println("An actor reads a script");

	}
}

public class InheritanceA8 {

	public static void main(String[] args) {

		Person2 person = new Person2();
		person.readScript();
		System.out.println();
		Actor a = new Actor();
		a.readScript();

	}

}
