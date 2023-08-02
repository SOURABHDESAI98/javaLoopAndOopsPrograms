package javaAfternoon.abstraction;

class Company {
	String name;
	int id;
	int workHours;

	public Company(String name, int id, int workHours) {

		this.name = name;
		this.id = id;
		this.workHours = workHours;

	}

	public void calculateSalary(double a) {

		System.out.println("Gross salary :" + a * workHours + " Rs.");

	}

}

class PartTimeEmp extends Company {
	double salary = 200;

	public PartTimeEmp(String name, int id, int workHours) {

		super(name, id, workHours);
		System.out.println("This is a part time employee");

	}

}

class FullTimeEmp extends Company {
	double salary = 500;

	public FullTimeEmp(String name, int id, int workHours) {

		super(name, id, workHours);
		System.out.println("This is a full time employee");
	}

}

public class Assignment6 {

	public static void main(String[] args) {

		PartTimeEmp ptEmp = new PartTimeEmp("Neel", 101, 8);
		double a = ptEmp.salary;
		ptEmp.calculateSalary(a);
		System.out.println();
		FullTimeEmp ftEmp = new FullTimeEmp("Nitin", 102, 8);
		double b = ftEmp.salary;
		ptEmp.calculateSalary(b);

	}

}
