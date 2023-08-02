package javaAfternoon.overriding;

class Contact {

	String contactPerson;
	long mobile;
	String email;

	Contact(String contactPerson, long mobile, String email) {

		this.contactPerson = contactPerson;
		this.mobile = mobile;
		this.email = email;

	}

}

class CompanyContact extends Contact {

	String cname;
	String country;
	int pin;

	public CompanyContact(String contactPerson, long mobile, String email, String cname, String country, int pin) {

		super(contactPerson, mobile, email);
		this.cname = cname;
		this.country = country;
		this.pin = pin;

	}

	public void showDetails() {

		System.out.println("Company name:" + cname);
		System.out.println("Country:" + country);
		System.out.println("Pin code:" + pin);

	}

}

class EmployeeContact extends Contact {

	String designation;
	String dateOfBirth;

	public EmployeeContact(String contactPerson, long mobile, String email, String designation, String dateOfBirth) {

		super(contactPerson, mobile, email);
		this.designation = designation;
		this.dateOfBirth = dateOfBirth;

	}

	public void showDetails() {

		System.out.println("Employee name :" + contactPerson);
		System.out.println("Designation :" + designation);
		System.out.println("DOB :" + dateOfBirth);

	}

}

public class Assignment2 {

	public static void main(String[] args) {

		CompanyContact company = new CompanyContact("SD", 8089373398L, "SD@123", "Nexsus", "India", 415010);
		company.showDetails();
		System.out.println();
		EmployeeContact emp = new EmployeeContact("Sourabh Desai", 8089373398L, "SD@123", "Software Engineer",
				"8 sept 1998");
		emp.showDetails();

	}

}
