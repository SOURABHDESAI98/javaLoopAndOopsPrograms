package javaAfternoon.day7;

import java.util.Scanner;

public class AtmMethodApproach {

	int balance = 10000;
	int deposit, withdraw;

	public void display() {

		Scanner input = new Scanner(System.in);
		System.out.println(" welcome to sbi atm !! please input your name:");

		String name = input.next();

		System.out.println("input your pin:");

		int pin = input.nextInt();

		if (pin == 4444) {

			System.out.println("Please select a respective number !!");
			System.out.println("1- Deposit");
			System.out.println("2- Withdraw");
			System.out.println("3- Balance");
			System.out.println("4- Exit");

			int choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println("enter amount you want to deposit :");
				deposit = input.nextInt();
				balance = balance + deposit;
				System.out.println(name + " your total amount after deposit is :" + balance);
				break;

			case 2:
				System.out.println("enter amount you want to withdraw :");
				withdraw = input.nextInt();
				balance = balance - withdraw;
				System.out.println(name + " your total amount after withdraw is :" + balance);
				break;

			case 3:

				System.out.println(name + " your balance is :" + balance);
				break;

			case 4:
				System.out.println("you have come out of system :");
				System.exit(0);
				break;

			}

			input.close();

		} else {
			System.out.println("invalid pin");
		}

	}

	public static void main(String[] args) {

		AtmMethodApproach atm = new AtmMethodApproach();

		atm.display();

	}

}
