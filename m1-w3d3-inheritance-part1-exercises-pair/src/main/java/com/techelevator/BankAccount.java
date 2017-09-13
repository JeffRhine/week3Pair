package com.techelevator;

public class BankAccount {

	private String accountNumber;
	private DollarAmount balance;
	
	public BankAccount() {
		this.balance = new DollarAmount(0);
	}
	
	public DollarAmount deposit(DollarAmount amountToDeposit) {
		return balance = balance.plus(amountToDeposit);
	}
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		return balance = balance.minus(amountToWithdraw);
	}
	public void transfer(BankAccount destinationAccount, DollarAmount transferAmount) {
		this.withdraw(transferAmount);
		destinationAccount.deposit(transferAmount);
	}	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public DollarAmount getBalance() {
		return balance;
	}

}
