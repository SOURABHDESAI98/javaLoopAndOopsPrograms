package javaAfternoon.overriding;

class Fruit {

	public void show() {
		System.out.println("This is a Parent class method");
	}

}

class Apple extends Fruit {

	public void show() {
		System.out.println("This is a Apple child class method");
	}
}

class Orange extends Fruit {

	public void show() {
		System.out.println("This is a Orange child class method");
	}

	public void display() {
		System.out.println("h");
	}

}

public class DynamicDispatchingA8 {

	public static void main(String[] args) {

		Fruit ft;
		ft = new Fruit();
		ft.show();

		ft = new Apple();
		ft.show();

		ft = new Orange();
		ft.show();

	}

}
