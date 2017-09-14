package com.techelevator;

public class SalaryWorker implements Worker{
	private double annualSalary;
	private String firstName;
	private String lastName;
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public SalaryWorker(double annualSalary) {
		this.annualSalary = annualSalary;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
//	@Override
//	 public double calculateWeeklyPay(int hoursWorked) {
//		return (lastName + ", " + firstName + hoursWorked + "$" + (annualSalary / 52) + ".00");
//		
//	}
	
	 public double calculateWeeklyPay(int hoursWorked) {
		return (annualSalary / 52);
		
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
