package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankCustomerTest {
	BankCustomer sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new BankCustomer();
	}

	
	@Test
	public void testStuff() {
		sut.setAddress("682 Rural");
		sut.setName("Girl");
		sut.setPhoneNumber("1234567");
		assertEquals("682 Rural", sut.getAddress());
		assertEquals("Girl", sut.getName());
		assertEquals("1234567", sut.getPhoneNumber());
	}
	@Test
	public void testMethod() {
		BankAccount otherNewAccount = new BankAccount();
		sut.addAccount(otherNewAccount);
		assertEquals(1, sut.getAccounts().size());
	}
	@Test
	public void testIsVip() {
		CheckingAccount ck = new CheckingAccount();
		sut.addAccount(ck);
		
		SavingsAccount sk = new SavingsAccount();
		sut.addAccount(sk);
		assertEquals(false, sut.isVip());
	}
	@Test
	public void testIsVip2() {
		CheckingAccount ck = new CheckingAccount();
		ck.deposit(new DollarAmount (2600000));
		sut.addAccount(ck);
		
		SavingsAccount sk = new SavingsAccount();
		sut.addAccount(sk);
		assertEquals(true, sut.isVip());
	}

}