package javaAfternoon.day8;

public class CopyConstructorEg {

	String name;
	int id;

	CopyConstructorEg(CopyConstructorEg eg2) {
		name = eg2.name;
		id = eg2.id;

	}

	CopyConstructorEg() {

	}

	public void display() {
		System.out.println(name + id);
	}

	public static void main(String[] args) {

		CopyConstructorEg eg1 = new CopyConstructorEg();

		eg1.name = "sourabh";
		eg1.id = 101;

		CopyConstructorEg eg2 = new CopyConstructorEg(eg1);
		eg2.display();

	}

}
