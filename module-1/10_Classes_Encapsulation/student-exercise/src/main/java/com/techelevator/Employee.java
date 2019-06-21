package com.techelevator;

public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;


	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
	}

	public void raiseSalary(double percent) {
		// how can it want a void but also want a double??????
		double raiseAmount = (annualSalary * percent);
		annualSalary += raiseAmount;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFullName() {
		// ok so first name + last name isn't working as is or as a cocatinated statement, so in the test it also wants the
		// employee id and salary and that still doesn't work????
		
		return lastName + ", " + firstName;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

}
