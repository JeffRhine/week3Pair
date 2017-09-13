package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DollarAmountTest {
	DollarAmount sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new DollarAmount(100, 23);
	}

	@Test
	public void testConstructor() {
		assertEquals(100, sut.getDollars());
		assertEquals(23, sut.getCents());
	}
	@Test
	public void testAdd() {
		DollarAmount result = sut.plus(new DollarAmount (10, 50));
		assertEquals(110, result.getDollars());
		assertEquals(73, result.getCents());
	}
	@Test
	public void testMinus() {
		DollarAmount result = sut.minus(new DollarAmount (10, 13));
		assertEquals(90, result.getDollars());
		assertEquals(10, result.getCents());
	}
	@Test
	public void test() {
		
	}
}
