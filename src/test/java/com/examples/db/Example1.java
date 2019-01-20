package com.examples.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example1 {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
				
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helthcare", "root", "root");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from patient");
			
			
			
			while (rs.next()) {
				
				int id = rs.getInt(1);
				String date  = rs.getString(2);
				String name = rs.getString(3);
				double phone= rs.getDouble("phone");
				System.out.println(id + "    " + date + "       " + name + "    " + phone);
			}
		
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
