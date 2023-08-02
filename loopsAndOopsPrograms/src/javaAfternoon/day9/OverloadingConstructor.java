package javaAfternoon.day9;

public class OverloadingConstructor {

	public OverloadingConstructor(int a, int b) {

		System.out.println(a + b);

	}

	public OverloadingConstructor(char a) {
		System.out.println(a);

	}

	public static void main(String[] args) {

		OverloadingConstructor c1 = new OverloadingConstructor(4, 5);
		OverloadingConstructor c2 = new OverloadingConstructor('A');

	}

}
