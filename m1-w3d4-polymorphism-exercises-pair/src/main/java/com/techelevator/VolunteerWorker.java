package com.techelevator;

public class VolunteerWorker implements Worker {
	private double hourlyRate;
	private String firstName;
	private String lastName;

	public VolunteerWorker() {
		
	}

	public double calculateWeeklyPay(int hoursWorked) {
		return hoursWorked * 0;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

