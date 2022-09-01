package com.qa;

import com.qa.controller.EmployeeController;
import com.qa.utils.Utils;

public class SelfServicePortal {
	public void portal() {
		boolean stop = false;
		while (!stop) {
			Utils utils = new Utils();
			EmployeeController employeeController = new EmployeeController(utils);
			System.out.println("What would you like to do?");
			System.out.println("1 - Create a new Employee");
			System.out.println("0 - Logout");
			int option = utils.getInt();
			switch (option) {
				case 0:
					System.out.println("Successfully Logged out!");
					stop = true;
					break;
				case 1:
					employeeController.createEmployee();
					break;
				default:
					System.out.println("Please enter a valid number!");
			}
		}
	}
}