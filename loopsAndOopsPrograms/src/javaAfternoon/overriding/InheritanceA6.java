package javaAfternoon.overriding;

class Programmer {

	public void workingHours(int a) {
		System.out.println("Working hours of average programmer is " + a);

	}
}

class Employee1 extends Programmer {
	public void workingHours(int a) {

		System.out.println("Working hours of this person is " + a);

	}

}

public class InheritanceA6 {

	public static void main(String[] args) {

		Employee1 emp = new Employee1();
		emp.workingHours(9);
		System.out.println();
		Programmer prog = new Programmer();
		prog.workingHours(8);

	}

}
