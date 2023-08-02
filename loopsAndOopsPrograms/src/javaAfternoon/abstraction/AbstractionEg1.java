package javaAfternoon.abstraction;

abstract class Animal {

	String name;
	String food;

	public Animal(String name, String food) {
		this.name = name;
		this.food = food;

	}

	abstract void makeSound();// abstract method doesn't have body in abstract class

	public void eat() {
		System.out.println(name + " eats " + food);

	}
}

class Dog extends Animal {
	public Dog(String name, String food) {
		super(name, food);
	}

	void makeSound() { // abstract method should be overridden in abstract class
		System.out.println("Dog makes sound");
	}

}

class Cat extends Animal {
	public Cat(String name, String food) {
		super(name, food);

	}

	void makeSound() {// abstract method should be overridden in abstract class
		System.out.println("Cat  makes sound");
	}
}

public class AbstractionEg1 {

	public static void main(String[] args) {

		Animal a1 = new Dog("Lab", "Pedigree"); // you can't make object of abstraction class but you can use it as a
												// reference for child class
		a1.eat();
		a1.makeSound();

		a1 = new Cat("Minchick", "milk");
		a1.eat();
		a1.makeSound();

	}

}
