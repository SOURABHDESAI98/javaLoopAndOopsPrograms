package javaAfternoon.abstraction;

abstract class Device {

	public abstract void name();

}

abstract class Android extends Device { // Abstract method can be child of abstract method

	public abstract void name();
}

class Iphone extends Device {

	public void name() {

		System.out.println("This is Iphone");

	}
}

public class AbstractEg2 {

	public static void main(String[] args) {

		Device d = new Iphone();
		d.name();

	}

}
