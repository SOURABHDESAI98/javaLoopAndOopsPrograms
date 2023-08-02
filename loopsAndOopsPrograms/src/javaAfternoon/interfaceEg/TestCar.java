package javaAfternoon.interfaceEg;

interface Cng_Car {
	void drive();

	void cng_car_kit();
}

interface Petrol_Car {
	void drive();

	void petrol_car_kit();
}

class HybridCar implements Cng_Car, Petrol_Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("driving a hybrid car");
	}

	@Override
	public void petrol_car_kit() {
		// TODO Auto-generated method stub
		System.out.println("petrol kit");
	}

	@Override
	public void cng_car_kit() {
		// TODO Auto-generated method stub
		System.out.println("cng kit");
	}

}

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridCar h = new HybridCar();
		h.drive();
		h.petrol_car_kit();
		h.cng_car_kit();
	}

}
