package com.test.miniproject;

import java.util.Scanner;

public class RegisterNewUser {

	
	public void Registrationuser() {
		
		
		System.out.println("Welocome user");
		
		System.out.println("Enter first name");
		Scanner scanner= new Scanner(System.in);
		String firstname=scanner.next();
		
		System.out.println("Enter last name");
		String lastname=scanner.next();
		
		System.out.println("Enter address");
		String address=scanner.next();
		
		System.out.println("Enter phonenumber");
		String phonenumber=scanner.next();
		
		
		System.out.println("Registration completed");
		
		
			
		
		
	}
	public static void main(String[] args) {
		
		
		RegisterNewUser rnw= new RegisterNewUser();
		rnw.Registrationuser();
		

		
		

	}

}
