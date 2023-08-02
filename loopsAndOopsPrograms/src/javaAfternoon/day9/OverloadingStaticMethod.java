package javaAfternoon.day9;

public class OverloadingStaticMethod {

	static int id;
	static String name;
	static String midname;
	static String Sname;

	public static void display(String a) {

		name = a;
		System.out.println(name);
	}

	public static void display(String b, String c) {

		Sname = c;
		midname = b;
		System.out.println(name + midname + Sname);

	}

	public static void display(int b) {

		id = b;
		System.out.println(name + " " + Sname + " " + id);

	}

	public static void main(String[] args) {

		display("Neel"); // static method can not be accessed by instances
		display("Nitin", "Mukesh");
		display(101);

	}

}
