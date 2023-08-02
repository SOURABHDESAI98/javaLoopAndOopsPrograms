package javaAfternoon.interfaceEg;

interface X {

	void show();

}

class Y implements X {
	int a;

	Y(int a) {
		this.a = a;

	}

	public void show() {
		System.out.println("Hello");
	}
}

public class ChildClassConstructor {

	public static void main(String[] args) {

		Y y = new Y(5);
		y.show();

	}

}
