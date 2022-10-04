package com.test.miniproject;

import java.util.Scanner;

public class Buy {

	String ans;

	public void buyproduct()  {
		
		
		do {	
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter productid");
		    int productid	=scanner.nextInt();
		    int totalprice;


		System.out.println("Enter product price");
		int productprice=scanner.nextInt();

		System.out.println("Enter Quantity");
		int Quantity=scanner.nextInt();


		System.out.println("Total price" +(productprice*Quantity));
System.out.println("Do you want to continue yes or no");		
	String ans= scanner.next();
	
		}while(ans.equalsIgnoreCase("no"));
	}
	
		
	
	public static void main(String[] args) {
		Buy buy= new Buy();
		buy.buyproduct();
		

	}

}
