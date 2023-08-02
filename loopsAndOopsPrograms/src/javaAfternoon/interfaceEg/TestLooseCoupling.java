package javaAfternoon.interfaceEg;

interface Veh {
	void move();
}

class Car implements Veh {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Traveling by car");
	}

}

class Bus1 implements Veh {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Traveling by bus");
	}

}

class Bike implements Veh {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Traveling by Bike");
	}

}

class Traveler {
	private Veh v;

	public Veh getV() {
		return v;
	}

	public void setV(Veh v) {
		this.v = v;
	}

	public void startJourney() {
		v.move();
	}
}

public class TestLooseCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traveler t1 = new Traveler();
		t1.setV(new Car());
		t1.startJourney();

		t1.setV(new Bike());
		t1.startJourney();
	}

}
