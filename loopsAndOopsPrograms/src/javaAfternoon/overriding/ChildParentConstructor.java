package javaAfternoon.overriding;

class Person {
	String name;
	int age;
	String email;

	Person(String name) {
		this.name = name;

	}

	public void show() {
		System.out.println(name);

	}

}

class Teacher extends Person {

	double salary;
	String degree;

	Teacher(String name, double salary, String degree) {
		super(name);
		this.salary = salary;
		this.degree = degree;

	}

	@Override
	public void show() {
		System.out.println(name);
		System.out.println(salary);
		System.out.println(degree);

	}

}

public class ChildParentConstructor {

	public static void main(String[] args) {

		Person ram = new Person("Ram");
		ram.show();
		System.out.println();

		Teacher shyam = new Teacher("Shyam", 1000000, "BE");
		shyam.show();

	}

}
