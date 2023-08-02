package javaAfternoon.interfaceEg;

interface Test {

	void square(int a);
}

class Arithmetic implements Test {

	public void square(int a) {
		System.out.println(a * a);
	}

}

public class Assignment2 {

	public static void main(String[] args) {

		Arithmetic a = new Arithmetic();
		a.square(5);

	}

}
