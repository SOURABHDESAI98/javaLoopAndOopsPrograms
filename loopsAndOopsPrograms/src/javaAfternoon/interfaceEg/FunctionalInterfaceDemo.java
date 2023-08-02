package javaAfternoon.interfaceEg;

import java.io.Serializable;

//single abstract method in interface 
//java 8
@FunctionalInterface
interface Washable {

	void wash();// abstract method

	default void m1() {

	}
}

@FunctionalInterface
interface A {
	void m1();
}

//marker interface
class B implements Serializable, Cloneable {

}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
