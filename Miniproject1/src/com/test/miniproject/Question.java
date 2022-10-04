package com.test.miniproject;

import java.util.Scanner;

public class Question {
	
	
	
	public void continuequestion() {
		String answer;
		do {
			Scanner scanner= new Scanner(System.in);
			
			
			System.out.println("Do you want to continue yes or no");
			answer= scanner.next();
		}  while(answer.equalsIgnoreCase("no"));
	}

	public static void main(String[] args) {
		
		Question question= new Question();
		question.continuequestion();
		
	

	}

}
