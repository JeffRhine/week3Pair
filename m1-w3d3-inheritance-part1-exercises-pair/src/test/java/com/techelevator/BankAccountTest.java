package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	BankAccount sut;
	
	@Before
	public void setUp() throws Exception {
		
		sut = new BankAccount();
	}

	
	@Test
	public void testDeposit() {
		sut.deposit(new DollarAmount(1000));
		assertEquals(new DollarAmount(1000), sut.getBalance());
	}
	@Test
	public void testWithdraw() {
		sut.withdraw(new DollarAmount(1000));
		assertEquals(new DollarAmount(-1000), sut.getBalance());
	}
	@Test
	public void testConstructor() {
		assertEquals(new DollarAmount(0), sut.getBalance());
	}
	@Test
	public void testTransfer() {
		BankAccount otherAccount = new BankAccount();
		sut.transfer(otherAccount, new DollarAmount(4000));
		
		assertEquals(new DollarAmount(-4000), sut.getBalance());
		
		
	}

}
