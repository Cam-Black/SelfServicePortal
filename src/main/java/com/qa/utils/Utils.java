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
		return scan.nextInt();
	}
}
