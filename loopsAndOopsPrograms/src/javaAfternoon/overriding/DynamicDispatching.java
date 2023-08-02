package javaAfternoon.overriding;

// for dynamic dispatching inheritance should be there and only overriding method can be called by dynamic dispatching

class Phone {

	public void show() {
		System.out.println("This is Parent class Method");
	}

}

class Android extends Phone {

	public void show() {
		System.out.println("This is Android child class Method");
	}

}

class Ios extends Phone {

	public void show() {
		System.out.println("This is Ios child class Method");
	}

}

public class DynamicDispatching {

	public static void main(String[] args) {

		Phone phone = new Phone();
		phone.show();

		Phone phone2 = new Android(); // upcasting or dynamic dispatching
		phone2.show();

		phone2 = new Ios(); // only overriding method can be called by dynamic dispatching
		phone2.show();

	}

}
