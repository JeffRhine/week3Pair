package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {
	
	SavingsAccount sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new SavingsAccount();
	}

	@Test
	public void testBalanceOneFifty() {
		sut.deposit(new DollarAmount(20000));
		
		sut.withdraw(new DollarAmount(5100));
		assertEquals(new DollarAmount(14700), sut.getBalance());
	}
	@Test
	public void testOverdrawn() {
		sut.withdraw(new DollarAmount(100));
		assertEquals(new DollarAmount(0), sut.getBalance());
	}
}
