package com.qa.controller;

import com.qa.entity.Employee;

public class EmployeeController {
	public EmployeeController() {
		super();
	}
	
	public Employee createEmployee() {
		return new Employee();
	}
}