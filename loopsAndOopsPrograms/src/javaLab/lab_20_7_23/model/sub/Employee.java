package javaLab.lab_20_7_23.model.sub;

import javaLab.lab_20_7_23.model.Person1;

public class Employee extends Person1 {

	String designation;

	public Employee(int personId, String personName, int personAge, String designation) {
		super(personId, personName, personAge);
		this.designation = designation;

	}

	public void setDesignation(String designation) {

		this.designation = designation;

	}

	public String getDesignation() {

		return designation;

	}

	public String toString() {

		return designation;
	}

	public static void main(String[] args) {

	}

}
