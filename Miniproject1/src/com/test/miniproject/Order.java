package com.test.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Order {
	
	

	public static void main(String[] args) {
		
		
		try {


			
		//Load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//Establish connection
	Connection con	=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "G3@gaurav");
	
	//Prepare statement
PreparedStatement ps	=con.prepareStatement("select * from productdetails;");

ResultSet rs=ps.executeQuery();


while(rs.next()) {
	

	System.out.println("productid>>" +rs.getString(1));
System.out.println("ProductName>>" +rs.getString(2));
System.out.println("product description" +rs.getString(3));

System.out.println("Productprice>>" +rs.getInt(4));
}
Scanner scanner= new Scanner(System.in);

System.out.println("Enter productid");
int productid	=scanner.nextInt();
int totalprice;


System.out.println("Enter product price");
int productprice=scanner.nextInt();

System.out.println("Enter Quantity");
int Quantity=scanner.nextInt();


System.out.println("Total price" +(productprice*Quantity));


Question question= new Question();
question.continuequestion();

Buy buy= new Buy();
buy.buyproduct();

	
		

ps.close();
con.close();

		} catch(Exception e) {
			
			e.printStackTrace();
		}
			
		
		
	}
}
		

