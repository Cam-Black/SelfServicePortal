package com.qa.controller;

import com.qa.entity.Employee;
import com.qa.utils.Utils;

public class EmployeeController {
	
	private Utils utils;
	public EmployeeController(Utils utils) {
		super();
		this.utils = utils;
	}
	
	public Employee createEmployee() {
		Employee emp = new Employee();
		System.out.println("Enter employee id");
		emp.setEmployeeId(utils.getInt());
		
		System.out.println("Enter employee's first name");
		emp.setFirstName(utils.getString());
		
		System.out.println("Enter employee's last name");
		emp.setLastName(utils.getString());
		
		System.out.println("Enter employee's age");
		emp.setAge(utils.getInt());
		
		System.out.println("Change starting salary? y/n");
		String yOrN = utils.getString();
		
		if (yOrN.equals("y")) {
			System.out.println("Enter employee's salary");
			emp.setSalary(utils.getInt());
		}
		System.out.println(emp);
		return emp;
	}
}