package com.test.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OrderPlaced {

	public static void main(String[] args) {
		
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
