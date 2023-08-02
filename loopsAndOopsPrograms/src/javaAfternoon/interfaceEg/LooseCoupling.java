package javaAfternoon.interfaceEg;

interface Vehicle {
	void show();
}

class Bus implements Vehicle {
	public void show() {
		System.out.println("Tavelled by Bus");
	}

}

class Train implements Vehicle {
	public void show() {
		System.out.println("Tavelled by Train");
	}

}

class Traveller {
	private Vehicle v;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

}

public class LooseCoupling {

	public static void main(String[] args) {

		Traveller t = new Traveller();
		t.setV(new Bus());
		Vehicle v = t.getV();
		v.show();

	}

}
