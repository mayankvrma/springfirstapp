package com.springboot.videolearn.project.myfirstspringbootproject;

import java.util.Scanner;

public class userInput {
	
	@SuppressWarnings("resource")
	public static int User() {
	System.out.print("Please select any number between 0-9 and enter it here as a token of your participation! ");
	Scanner sc = new Scanner(System.in);
	int token = sc.nextInt();
	return token;
	}
}
