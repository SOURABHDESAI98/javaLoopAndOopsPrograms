package javaAfternoon.overriding;

class Mobile {

	Long speed;

	String start() {

		return "Mobile is started";

	}

	String stop() {
		return "Mobile is stopped";
	}

	String accelerate(Long speed) {
		this.speed = speed;
		String output = "Mobile is accelerated by " + speed + " mph";

		return output;
	}

}

class Motorcycle extends Mobile {

	@Override
	String accelerate(Long a) {

		return "Motorcycle is accelerated by " + a + " mph";
	}

}

public class InheritanceA3 {

	public static void main(String[] args) {

		Mobile mob = new Mobile();
		System.out.println(mob.accelerate(40L));

		Motorcycle mcycle = new Motorcycle();
		System.out.println(mcycle.accelerate(60L));

	}

}
