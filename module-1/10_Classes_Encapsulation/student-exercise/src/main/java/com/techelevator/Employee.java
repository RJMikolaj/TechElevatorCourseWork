package com.techelevator;

public class Employee {
	
	public int employeeId;
	public String firstName;
	public String lastName;
	public String fullName = firstName + lastName;
	public String department;
	public double annualSalary;
	double salary;
	
	public String getFullName(String firstName, String lastName) {
		return fullName;
	}
	
	public Employee(int employeeId, String firstName, String lastName,
			double salary) {
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.salary = salary;
	}

	public double raiseSalary(double percent) {
		return (annualSalary * percent);
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
	public String getFullname(String firstName, String lastName) {
		String fullname = firstName + lastName;
		return fullName;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	
	
	
	

}
