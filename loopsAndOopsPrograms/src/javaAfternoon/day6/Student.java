package javaAfternoon.day6;

public class Student {

	int id;
	String name;
	int marks;

	public void details(int a, String b, int c) {

		id = a;
		name = b;
		marks = c;

	}

	public void display() {
		System.out.println("Student Name:" + name);
		System.out.println("Student Id :" + id);
		System.out.println("Marks Obtained :" + marks);

	}

	public static void main(String[] args) {

		Student stud1 = new Student();
		stud1.details(101, "Neel", 80);
		stud1.display();
		System.out.println();

		Student stud2 = new Student();
		stud2.details(102, "Nitin", 75);
		stud2.display();
		System.out.println();

		Student stud3 = new Student();
		stud3.details(103, "Mukesh", 85);
		stud3.display();
		System.out.println();

	}

}
