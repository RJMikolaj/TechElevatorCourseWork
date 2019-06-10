package com.techelevator.FIleSplitter.userinput;

import java.util.Scanner;

public class Menu {
	
	private Scanner in = new Scanner (System.in);
	
	public String getFileNamefromUser() {
		System.out.println("Path to file to split >>>");
		return in.nextLine();
	}
	
	public void displayMessageToUser(String message) {
		System.out.println(message);
		System.out.flush();
	}

}
