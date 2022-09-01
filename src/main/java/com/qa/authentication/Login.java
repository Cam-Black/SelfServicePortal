package com.qa.authentication;

import com.qa.SelfServicePortal;
import com.qa.entity.User;
import com.qa.utils.Utils;

public class Login {
	private Utils utils;
	private User user;
	
	public Login() {
		super();
	}
	
	public Login(Utils utils, User user) {
		super();
		this.utils = utils;
		this.user = user;
	}
	
	public void authenticate() {
		boolean stop = false;
		while (!stop) {
			System.out.println("To exit, simply type Exit!");
			System.out.println("Enter username");
			String uname = utils.getString();
			if (uname.equalsIgnoreCase("exit")) {
				System.out.println("Goodbye!");
				stop = true;
				continue;
			}
			System.out.println("Enter password");
			String pword = utils.getString();
			SelfServicePortal ssp = new SelfServicePortal();
			
			if (uname.equals(this.user.getUsername()) && pword.equals(this.user.getPassword())) {
				System.out.println("Welcome " + this.user.getUsername());
				ssp.portal();
			} else {
				System.out.println("Invalid username or password, please try again!");
			}
		}
	}
}