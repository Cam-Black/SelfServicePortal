package com.qa;

import com.qa.controller.EmployeeController;
import com.qa.entity.Employee;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		EmployeeController employeeController = new EmployeeController();
		Scanner s = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1 - Create a new Employee");
		int input = s.nextInt();
		if (input == 1) {
			System.out.println(employeeController.createEmployee());
		}
	}
}
