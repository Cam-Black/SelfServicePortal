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
		return emp;
	}
}