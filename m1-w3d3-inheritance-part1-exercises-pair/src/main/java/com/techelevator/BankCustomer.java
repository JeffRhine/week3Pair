package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	private String name;
	private String address;
	private String phoneNumber;
	
	private List <BankAccount> accounts = new ArrayList<> ();
	
	public void addAccount(BankAccount newAccount) {
		accounts.add(newAccount);
	}
		
	public boolean isVip() {
		DollarAmount money = new DollarAmount(0);
		for(BankAccount account : accounts) {
			money = money.plus(account.getBalance());
		}
		return(money.isGreaterThan(new DollarAmount(2499900)));
			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}
}
