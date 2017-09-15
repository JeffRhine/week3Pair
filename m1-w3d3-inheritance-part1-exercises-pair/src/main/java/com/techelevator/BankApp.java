package com.techelevator;

public class BankApp {

	public static void main(String[] args) {
		BankCustomer bc = new BankCustomer();
		CheckingAccount ck = new CheckingAccount();
		ck.deposit(new DollarAmount(5000));
		SavingsAccount sk = new SavingsAccount();
		sk.deposit(new DollarAmount(7000));
		bc.addAccount(sk);
		bc.addAccount(ck);
	}

}
