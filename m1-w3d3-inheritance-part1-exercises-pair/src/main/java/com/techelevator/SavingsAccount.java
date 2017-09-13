package com.techelevator;

public class SavingsAccount extends BankAccount{

	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		if(getBalance().minus(amountToWithdraw).isLessThan(new DollarAmount(0))) {
			return getBalance();
		}
		super.withdraw(amountToWithdraw);
		
		if(getBalance().isLessThan(new DollarAmount(15000))) {
			super.withdraw(new DollarAmount(200));
			}
		return getBalance();
	}

}
