package com.jdbc.pro;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="root";
		String password= "bijay";
		try {
			Connection c= DriverManager.getConnection
					("JDBC:mysql://localhost:3306/java",username,password);
			System.out.println(" conected to mysql database: ");
			c.close();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
