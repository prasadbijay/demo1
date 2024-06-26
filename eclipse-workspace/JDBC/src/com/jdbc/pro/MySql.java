package com.jdbc.pro;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class MySql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="root";
		String password="bijay";
		String JDBCurl="JDBC:mysql://localhost:3306/java";
		try {
			Connection  c= DriverManager.getConnection(JDBCurl,name,password);
			String in=" INSERT INTO emp(id,name) values (?,?)";
			PreparedStatement ps= c.prepareStatement(in);
			ps.setString(1,"1");
			ps.setString(2,"anil");
			int rowin= ps.executeUpdate();
			if(rowin >0) {
				System.out.println("data insert sussesfully: ");
			}
			ps.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		

	}

}
