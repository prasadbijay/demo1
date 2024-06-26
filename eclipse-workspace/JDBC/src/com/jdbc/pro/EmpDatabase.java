package com.jdbc.pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmpDatabase {
	public static Connection getConnection() {
		Connection c =null;
		try {
			String url="JDBC:mysql://localhost:3306/java";
			String name1="root";
			String password="bijay";
			c=DriverManager.getConnection(url,name1,password);
		}
		catch(SQLException e) {
			System.out.println(e);
			
		}
		return c;
	}

}
