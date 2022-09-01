package com.qa;

import com.qa.controller.EmployeeController;
import com.qa.entity.Employee;
import com.qa.utils.Utils;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Utils utils = new Utils();
		EmployeeController employeeController = new EmployeeController(utils);
		System.out.println("What would you like to do?");
		System.out.println("1 - Create a new Employee");
		int option = utils.getInt();
		if (option == 1) {
			System.out.println(employeeController.createEmployee());
		}
	}
}
