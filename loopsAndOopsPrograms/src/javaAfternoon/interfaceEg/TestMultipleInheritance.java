package javaAfternoon.interfaceEg;

class Phone {
	void call() {
		System.out.println("making call using this method");
	}

	void msg() {
		System.out.println("making msg using msg method");
	}
}

interface Camera {
	void click();

	void recordVideo();
}

interface Player {
	void play();

	void pause();

	void stop();
}

class SmartPhone extends Phone implements Camera, Player {

	@Override
	public void play() {

		System.out.println("play music");
	}

	@Override
	public void pause() {

		System.out.println("pause music");
	}

	@Override
	public void stop() {

		System.out.println("stop music");
	}

	@Override
	public void click() {

		System.out.println("clicking photos");
	}

	@Override
	public void recordVideo() {
		System.out.println("recording videos");

	}

}

public class TestMultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sobj = new SmartPhone();
		sobj.call();
		sobj.msg();
		sobj.click();
		sobj.recordVideo();
		sobj.play();
		sobj.pause();
		sobj.stop();
	}

}
