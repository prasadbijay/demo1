package com.jdbc.pro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDemo1 {
	public static void getEmp(int id ) {
		String sql = "select * from emp where id =?";
		try (Connection c= EmpDatabase.getConnection();
				PreparedStatement ps=c.prepareStatement(sql)){
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				String branch= rs.getString("branch");
				String name = rs.getString("name");
				System.out.println(" branch:"+branch+" id "+name);
			}
			else {
				System.out.println(" employee not found: ");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getEmp(1);

	}

}
