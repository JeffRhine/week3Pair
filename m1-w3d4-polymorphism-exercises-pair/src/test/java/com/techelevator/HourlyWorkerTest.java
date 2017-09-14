package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HourlyWorkerTest {

	HourlyWorker sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new HourlyWorker(12000);
	}

	@Test
	public void testConstructor() {
		sut.getHourlyRate();
		assertEquals(12000, sut.getHourlyRate(), .001);
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
	@Test
	public void testCalculatedWeeklyPay() {
		sut.calculateWeeklyPay(13);
		assertEquals(156000, sut.calculateWeeklyPay(13), .001);
	}
}
