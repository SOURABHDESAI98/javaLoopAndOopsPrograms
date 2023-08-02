package javaAfternoon.interfaceEg;

//extended interface
interface Mobile {
	void call();
}

interface Basicc extends Mobile {
	void msg();
}

class Nokia implements Basicc {

	public void msg() {
		System.out.println("nokia phone msg method");
	}

	public void call() {
		System.out.println("nokia phone call method");
	}
}

public class TestExtendedInterfaceDemo3 {

	public static void main(String[] args) {
		Nokia n = new Nokia();
		n.call();
		n.msg();
	}
}
