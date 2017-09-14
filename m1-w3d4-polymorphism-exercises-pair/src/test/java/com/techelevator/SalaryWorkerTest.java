package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SalaryWorkerTest {
	
	SalaryWorker sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new SalaryWorker(10000);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructor() {
		sut.getAnnualSalary();
		assertEquals(10000, sut.getAnnualSalary(), .001);
	}
	@Test
	public void testAnnualSalary() {
		sut.getAnnualSalary();
		assertEquals(10000, sut.getAnnualSalary(), .001);
	}
	@Test
	public void testFirstName() {
		sut.setFirstName("Jeff");
		assertEquals("Jeff", sut.getFirstName());
	}
	@Test
	public void testLastName() {
		sut.setFirstName("Rhine");
		assertEquals("Rhine", sut.getFirstName());
	}
}
