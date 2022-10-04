package com.test.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Fullproject {



public static void main(String[] args) {
	

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Select option Number: ");
		System.out.println("  1. New User ");
		System.out.println("  2. Product Table ");
		System.out.println("  3. Order ");
		System.out.println("  4. payment");
		System.out.println("  5. Order placed ");
		int op = sc.nextInt();
		System.out.println("You Select Optin "+ op);
	
		switch(op) {
		case 1:
				
			try {
				RegisterNewUser rnw= new RegisterNewUser();
				rnw.Registrationuser();
				
				Scanner scanner= new Scanner(System.in);
				// Step 1: Load driver class
				Class.forName("com.mysql.jdbc.Driver");
				
				// Step 2: Estsblish Connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "G3@gaurav");
				// Step 3: Prepare Statement
				PreparedStatement ps = con.prepareStatement(" INSERT INTO registration(firstname, lastname, address, phonenumber)values(?,?,?,?)");
				ps.setString(1, "akshay");
				
				ps.setString(2, "kharat");
				
				ps.setString(3, "pune");
				
				ps.setString(4, "7769421412");
				
				
				int x = ps.executeUpdate();
				
				System.out.println("Record inserted "+ x);
				// Step 4: close connection
				con.close();
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			
			
			break;
		case 2:
			try {
				//Step 1: load Driver Class
				Class.forName("com.mysql.jdbc.Driver");
				//step 2: Establish Connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","G3@gaurav");
				//Step 3:  Prepare Statement
				PreparedStatement ps=con.prepareStatement("SELECT * from productdetails");
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					System.out.println("ID:                " +rs.getInt(1));
					System.out.println("Productname:       " +rs.getString(2));
					System.out.println("Productdescription:" +rs.getString(3));
					System.out.println("Productprice:      " +rs.getInt(4));
					System.out.println("Productquantity:   " +rs.getInt(5));
					System.out.println("                                  ");
				}
				// Step 4: Close Resources
				con.close();
				ps.close();  
			}catch(Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			
			break;
		case 3:

				
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
String  answer = null;
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


Question question= new Question();
question.continuequestion();

Buy buy= new Buy();
buy.buyproduct();

Payment payment= new Payment();
payment.Payment();

	
		

ps.close();
con.close();
}while(answer.equalsIgnoreCase("no"));		} catch(Exception e) {
			
			e.printStackTrace();
		}
		Payment payment= new Payment();
		payment.Payment();

			
		break;	
		case 4:
			Payment payment1= new Payment();
			payment1.Payment();
			
			break;
		case 5:
			try {
				
				//Load driver class
				Class.forName("com.mysql.jdbc.Driver");
				
				//Establish connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "G3@gaurav");

				//Prepare statement
				PreparedStatement ps=con.prepareStatement(" INSERT INTO orderdetails(customerid, customername, address, phonenumber, productname, qty, price)values(?,?,?,?,?,?,?)");
				ps.setString(1, "101");
				ps.setString(2, "Gaurav khawale");
				ps.setString(3, "pune");
				ps.setString(4, "799652142");
				ps.setString(5, "headphones");
				ps.setString(6, "3");
				ps.setString(7, "4500");
				
				ps.executeUpdate();
				
				System.out.println("Order updated");
			}catch(Exception e) {
				
				e.printStackTrace();
			}

		}

	
		}
	
}


