package com.techelevator;

public class HourlyWorker implements Worker{
	private double hourlyRate;
	private String firstName;
	private String lastName;

	public HourlyWorker(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public double calculateWeeklyPay(int hoursWorked) {
		double calculateWeeklyPay = 0;
		if(hoursWorked <= 40) {
			calculateWeeklyPay = hoursWorked * hourlyRate;
		}else {
			calculateWeeklyPay = ( ((hoursWorked - 40) * (hourlyRate * 1.5)) + (40 * hourlyRate));
		}
		return calculateWeeklyPay;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}

