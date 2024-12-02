package com.assignment;

public class Employee {
	public int employeeId;
	public String employeeName;
	public char gender;
	public int salary;
	public Employee next;

	public Employee(int employeeId, String employeeName, char gender, int salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.salary = salary;
		this.next = null;
	}
}
