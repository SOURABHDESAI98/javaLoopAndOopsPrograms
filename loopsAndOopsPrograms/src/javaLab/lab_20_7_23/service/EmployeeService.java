package javaLab.lab_20_7_23.service;

import javaLab.lab_20_7_23.model.sub.Employee;

public class EmployeeService {
	Employee emp;

	public boolean isEligibleForRetirement(Employee emp) {
		this.emp = emp;
		int age = emp.getPersonAge();
		if (age >= 60) {
			return true;
		} else {
			return false;
		}

	}

}
