package com.jdbc.pro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee {
	public static void updateEmployee(int id, String newname) {
		String sql =" update emp SET name =? where id =?";
		try {Connection c= EmpDatabase.getConnection();
			PreparedStatement ps=c.prepareStatement(sql);
			ps.setString(1,newname);
				ps.setInt(2, id);
				int rowsUpdate =ps.executeUpdate();
				if(rowsUpdate >0) {
					System.out.println("employee update successful: ");
				}
				else {
					System.out.println("employee not found:");
				}
		}
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		updateEmployee(2,"Rahul");

	}

}
