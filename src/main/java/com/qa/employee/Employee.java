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
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [" +
				"employeeId: " + this.getEmployeeId() +
				", firstName: " + this.getFirstName() +
				", lastName: " + this.getLastName() +
				", age: " + this.getAge() +
				", salary: " + this.getSalary() +
				"]";
	}
}
