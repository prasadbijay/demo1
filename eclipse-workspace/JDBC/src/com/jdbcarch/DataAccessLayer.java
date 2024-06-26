package com.jdbcarch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataAccessLayer {
	private static final String url="JDBC.mysql://localhost:3306/java";
	private static final String Name= "root";
	private static final String password="bijay";
	public String getEmployeeNameById(int eid) {
		String query =" select ename from emp where eid= ?";
		String ename =null;
		try(Connection c= DriverManager.getConnection(url,Name,password);
			PreparedStatement ps= c.prepareStatement(query)){
			ps.setInt(1, eid);
			try(ResultSet r =ps.executeQuery(query)){
				if (r.next()) {
					ename=r.getString("ename");
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return query;
	}
	
	

}
//pojo=play old java object;