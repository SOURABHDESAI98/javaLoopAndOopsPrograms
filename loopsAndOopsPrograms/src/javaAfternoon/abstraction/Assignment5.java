package javaAfternoon.abstraction;

abstract class Equipment {

	public void fill() {

		System.out.println("This is fill method");

	}

	public abstract void Mix();

}

class Cement_mixer extends Equipment {

	public void Mix() {
		System.out.println("This is mix method");
	}

	public void Pour() {
		System.out.println("This is pour method");
	}
}

public class Assignment5 {

	public static void main(String[] args) {

		Cement_mixer cMixer = new Cement_mixer();
		cMixer.fill();
		cMixer.Mix();
		cMixer.Pour();
		System.out.println();
		Equipment eq = new Cement_mixer();
		eq.fill();
		eq.Mix();

	}

}
