package javaLab.day8;

import java.util.Scanner;

public class BankGetSet {

	public void performOp() { // TODO: create instance if you want to access
								// static/non static methods in non static method of another class
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide amount to be deposited :");
		int amount = sc.nextInt();
		sc.close();

		BankEncapsulation bank = new BankEncapsulation();
		bank.setWithdraw(amount);
		System.out.println("Your Balance is :" + bank.getBalance());

	}

	public static void main(String[] args) {

		BankGetSet user1 = new BankGetSet();
		user1.performOp();

	}

}
