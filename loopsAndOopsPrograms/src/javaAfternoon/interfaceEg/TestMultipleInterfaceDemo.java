package javaAfternoon.interfaceEg;

interface intA {
	void m1();
}

interface intB {
	void m2();
}

class SimpleChild implements intA, intB {

	public void m1() {
		System.out.println("m1 method from intA");
	}

	public void m2() {
		System.out.println("m2 method from intB");
	}
}

public class TestMultipleInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleChild s = new SimpleChild();
		s.m1();
		s.m2();
	}

}
