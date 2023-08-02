package javaLab.day8;

public class BankEncapsulation {

	private int balance = 20000;

	public void setWithdraw(int withdraw) {

		balance = balance - withdraw;

	}

	public int getBalance() {

		return balance;

	}

}
