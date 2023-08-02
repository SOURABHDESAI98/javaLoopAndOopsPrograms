package javaAfternoon.interfaceEg;

interface Play {

	void play();

}

class Football implements Play {

	public void play() {
		System.out.println("Football is played");
	}

}

class Volleyball implements Play {

	public void play() {
		System.out.println("Volleyball is played");
	}

}

class Basketball implements Play {

	public void play() {
		System.out.println("Basketball is played");
	}

}

public class Assignment4 {

	public static void main(String[] args) {

		Football ft = new Football();
		ft.play();
		System.out.println();
		Volleyball v = new Volleyball();
		v.play();
		System.out.println();
		Basketball bs = new Basketball();
		bs.play();

	}

}
