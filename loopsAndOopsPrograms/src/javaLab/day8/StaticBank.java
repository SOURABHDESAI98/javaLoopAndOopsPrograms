package javaLab.day8;

import java.util.Scanner;

public class StaticBank {

	String name;
	static int balance;

	public StaticBank(String name, int deposite) {

		this.name = name;
		balance = balance + deposite;
	}

	public void display() {
		System.out.println(name + " Has deposited money !!");
		System.out.println("Balance is :" + balance + " Rs.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input Amount To Be Deposited :");
		int money1 = sc.nextInt();
		StaticBank user1 = new StaticBank("Neel", money1);
		user1.display();

		System.out.println("Input Amount To Be Deposited :");
		int money2 = sc.nextInt();
		StaticBank user2 = new StaticBank("Nitin", money2);
		user2.display();

		System.out.println("Input Amount To Be Deposited :");
		int money3 = sc.nextInt();
		StaticBank user3 = new StaticBank("Mukesh", money3);
		user3.display();
		sc.close();

	}

}
