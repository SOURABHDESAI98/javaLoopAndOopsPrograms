package javaAfternoon.overriding;

public class OverloadingMainMethod {

	public static void main(String[] args) {

		System.out.println("Hello !!");
		main(2);

	}

	public static void main(int a) {
		System.out.println("Hello Returns !!");

	}

}
