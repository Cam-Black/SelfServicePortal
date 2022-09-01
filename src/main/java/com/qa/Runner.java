package com.qa;

import com.qa.authentication.Login;
import com.qa.entity.User;
import com.qa.utils.Utils;

public class Runner {
	public static void main(String[] args) {
		Utils utils = new Utils();
		User user = new User("acek", "passwd");
		Login login = new Login(utils, user);
		login.authenticate();
	}
}
