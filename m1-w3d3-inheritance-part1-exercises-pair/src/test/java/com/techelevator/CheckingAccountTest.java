package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {
	CheckingAccount sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new CheckingAccount();
	}


	@Test
	public void testOverdraftFee() {
		sut.withdraw(new DollarAmount(1000));
		assertEquals(new DollarAmount(-2000), sut.getBalance());
	}
	@Test
	public void testOverdrawn() {
		sut.withdraw(new DollarAmount(10100));
		assertEquals(new DollarAmount(0), sut.getBalance());
	}
}
