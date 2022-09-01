package com.qa.employee;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private int age;
	private double salary = 20000;
	
	public Employee() {
		super();
	}
	
	public Employee(int employeeId, String firstName, String lastName, int age, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
}
