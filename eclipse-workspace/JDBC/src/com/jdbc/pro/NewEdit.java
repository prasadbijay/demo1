package com.jdbc.pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewEdit {
	public static void insertData(String sname, int sid,int fees) {
	String sql="insert into students (sname,sid,fees) values (?,?,?)";
	try(
			Connection c=EmpDatabase.getConnection();
		PreparedStatement ps=c.prepareStatement(sql))
	{
		ps.setString(1,sname);
		ps.setInt(2, sid);
		ps.setInt(3, fees);
		ps.executeUpdate();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertData("arnab",3,7000);

	}

}
