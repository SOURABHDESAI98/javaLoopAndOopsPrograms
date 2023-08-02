package javaLab.lab_20_7_23.model;

public class Person1 {

	private int personId;
	private String personName;
	private int personAge;

	public Person1(int personId) {
		this.personId = personId;

	}

	public Person1(int personId, String personName) {
		this.personId = personId;
		this.personName = personName;

	}

	public Person1(int personId, String personName, int personAge) {
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}

	public void setPersonId(int personId) {
		this.personId = personId;

	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonName() {
		return personName;
	}

	public String toString() {

		return personId + " " + personName + " " + personAge;
	}
}
