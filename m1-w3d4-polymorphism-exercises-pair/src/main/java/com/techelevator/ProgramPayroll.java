package com.techelevator;

public class ProgramPayroll {
	public static void main(String[] args) {
		
		SalaryWorker sally = new SalaryWorker(800000);
		sally.setFirstName("Sally");
		sally.setLastName("McDonald");
		
		HourlyWorker josh = new HourlyWorker(800000);
		josh.setFirstName("Josh");
		josh.setLastName("McD");
		
		VolunteerWorker annie = new VolunteerWorker();
		annie.setFirstName("Annie");
		annie.setLastName("McFad");
		
	Worker[] workers = new Worker[] { josh, sally, annie};
		
		System.out.println(String.format("%s %24s\t%5s", "Employee",  "Hours Worked", "Pay"));
		int totalHours = 0;
		double totalPay = 0.00;
		for(Worker employee : workers) {
			int hoursWorked = (int) (Math.random() * 100);
			totalHours += hoursWorked;
			totalPay += employee.calculateWeeklyPay(hoursWorked);
			
			System.out.println(String.format("%s, %s\t%7d\t%19s%.2f", employee.getLastName(), employee.getFirstName(), hoursWorked, "$", employee.calculateWeeklyPay(hoursWorked)));
		}
		System.out.println("Total Hours: " + totalHours);
		System.out.println(String.format("%s %s%.2f","Total Pay: ", "$", totalPay));
		
	}
	
	
}
