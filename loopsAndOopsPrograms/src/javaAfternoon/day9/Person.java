package javaAfternoon.day9;

class Address {
	int pincode;
	String city;

	public Address(int pincode, String city) {
		this.pincode = pincode;
		this.city = city;
	}

	public void showAddress() {
		System.out.println(pincode + " " + city);
	}

	public String toString() { // you don't need to call this method just print instance
		return pincode + " " + city;
	}
}

public class Person {

	int pid;
	String pname;
	Address adr;

	public Person(int pid, String pname, Address adr) {
		this.pid = pid;
		this.pname = pname;
		this.adr = adr;
	}

	public void showPerson() {
		System.out.print(pid + " " + pname + " ");
		adr.showAddress();
	}

	public String toString() { // you don't need to call this method just print instance
		return pid + " " + pname + " " + adr;
	}

	public static void main(String[] args) {
//		Address adr=new Address(1223,"pune");
//		Person p=new Person(101,"amit",adr);

		Person p = new Person(101, "Neha", new Address(111, "pune"));

		System.out.println(p); // here toString() method will be called
		// p.showPerson();

	}

}
