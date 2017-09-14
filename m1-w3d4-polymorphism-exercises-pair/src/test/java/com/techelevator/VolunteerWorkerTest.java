package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VolunteerWorkerTest {
	VolunteerWorker sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new VolunteerWorker();
	}

	

	@Test
	public void testCalculatedWeeklyPay() {
		sut.calculateWeeklyPay(40);
		assertEquals(0, sut.calculateWeeklyPay(40), .001);
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
