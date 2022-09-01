package com.qa.utils;

import java.util.Scanner;

public class Utils {
	private final Scanner scan;
	
	public Utils(){
		scan = new Scanner(System.in);
	}
	
	public String getString() {
		return scan.nextLine();
	}
	
	public int getInt() {
		String input = null;
		Integer intInput = null;
		
		do {
			try {
				input = this.getString();
				intInput = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.err.println("Please enter a number!");
			}
		} while (intInput == null);
		
		return intInput;
	}
}
