package javaAfternoon.overriding;

class Student {

	String name;
	int rollN0;
	float percentage;

	Student(String name, int rollN0, float percentage) {
		this.name = name;
		this.rollN0 = rollN0;
		this.percentage = percentage;

	}

	public void show() {
		System.out.println("Student name :" + name);
		System.out.println("Roll no :" + rollN0);
		System.out.println("Percentage :" + percentage);

	}

}

public class MyRecordA1A4 extends Student {

	public MyRecordA1A4(String name, int rollN0, float percentage) {

		super(name, rollN0, percentage);

	}

	public static void main(String[] args) {

		MyRecordA1A4 r1 = new MyRecordA1A4("Sourabh", 62, 96.40F);
		r1.show();

	}

}
