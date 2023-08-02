package javaAfternoon.interfaceEg;

interface Account {

	void deposite(int a);

	void withdraw(int b);

	static void aboutBank(String a) {

		System.out.println("This is " + a + "bank");

	}

	default void takeLoan(int b) {
		System.out.println("Loan of " + b + " Rs. is taken !!");

	}
}

class Saving implements Account {

	public void takeLoan(int b) { // default method of account is overridden
		Account.super.takeLoan(b); // default method of account is called
	}

	public void deposite(int a) {
		Account.aboutBank("Saving");
		System.out.println("Deposite of " + a + " Rs. is added in savings bank");

	}

	public void withdraw(int b) {
		System.out.println(b + " Rs. withdrawn from savings bank");

	}
}

class Current implements Account {

	public void deposite(int a) {
		Account.aboutBank("Current");
		System.out.println("Deposite of " + a + " Rs. is added in current bank");

	}

	public void withdraw(int b) {
		System.out.println(b + " Rs. withdrawn from current bank");

	}
}

public class IMPAssignment6 {

	public static void main(String[] args) {

		Saving s = new Saving();
		s.deposite(20000);
		s.withdraw(5000);
		s.takeLoan(500000);
		System.out.println();
		Current c = new Current();
		c.deposite(25000);
		c.withdraw(5000);

	}

}
