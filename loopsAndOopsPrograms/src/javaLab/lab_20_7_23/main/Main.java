package javaLab.lab_20_7_23.main;

import javaLab.lab_20_7_23.model.sub.Employee;
import javaLab.lab_20_7_23.service.EmployeeService;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sourabh", 25, "Software Engineer");

		EmployeeService es = new EmployeeService();
		System.out.println(es.isEligibleForRetirement(emp));

	}

}
