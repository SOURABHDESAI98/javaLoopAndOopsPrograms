package javaAfternoon.interfaceEg;

interface Abx {
	void show();
}

class Xyz implements Abx {

	public void show() {
		System.out.println("Hello");
	}
}

class Wwe extends Xyz implements Abx {

}

public class HotInterfaceDemo {

	public static void main(String[] args) {

		Wwe wwe = new Wwe();
		wwe.show();

	}

}
