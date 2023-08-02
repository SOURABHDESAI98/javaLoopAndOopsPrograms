package javaAfternoon.interfaceEg;

interface flyable {
	void fly_object();

}

class SpaceCraft implements flyable {
	@Override
	public void fly_object() {

		System.out.println("Spacecraft is flying object");
	}
}

class Aeroplane implements flyable {
	@Override
	public void fly_object() {

		System.out.println("Aeroplane is flying object");
	}
}

class Helicopter implements flyable {
	@Override
	public void fly_object() {

		System.out.println("Helicopter is flying object");
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		SpaceCraft s = new SpaceCraft();
		s.fly_object();
		System.out.println();
		Aeroplane a = new Aeroplane();
		a.fly_object();
		System.out.println();
		Helicopter h = new Helicopter();
		h.fly_object();

	}

}
