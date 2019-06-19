package com.techelevator;

public class Employee {

	public int employeeId;
	public String firstName;
	public String lastName;
	public String fullName = firstName + lastName;
	public String department;
	public double annualSalary;
	public double salary;
	public double percent;
	public double raiseAmount = (annualSalary * 0.055);

	public String getFullName(String firstName, String lastName) {
		return fullName;
	}

	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.salary = salary;
	}

	public double raiseSalary(double percent) {
		// how can it want a void but also want a double??????
		
		return (annualSalary + raiseAmount);
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
		
		return employeeId + firstName + lastName + salary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

}
