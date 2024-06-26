package com.jdbc.pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoTable {
	private static final String url="JDBC:mysql://localhost:3306/java";
	private static final String name="root";
	private static final String password="bijay";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Connection c= DriverManager.getConnection(url,name,password);
		Statement s=c.createStatement();
		String query="create table busss("+ "sro int,"+"sclass varchar(20),"+"per FLOAT)";
		s.executeUpdate(query);
		System.out.println(" table create successfully: ");
		
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
		
		

}
}