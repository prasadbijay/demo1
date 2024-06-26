package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.data.Employee;

public class DataAcess {
	private static final String url="";
	private static final String username="root";
	private static final String password="bijay";
	
	public void addEmp(String ename) {
		String query = "insert into emp(ename) values (?)";
		try( Connection c = DriverManager.getConnection(url,username,password);
				java.sql.PreparedStatement p=c.prepareStatement(query)){
			p.setString(1, ename);
			p.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

 void viewEmp() {
		Employee em=DataAcess.getEmployeeById();
		if (em != null) {
			System.out.println("Employee ID: "+em.getEmployeeId());
		}
		else {
			System.out.println(" Employee not Found: ");
		}
	}
	
	
	public static Employee getEmployeeById() {
		String q="select * from emp";
		Employee em1=null;
		try( Connection c = DriverManager.getConnection(url,username,password)){
		Statement st=c.createStatement();
		try(ResultSet rs= st.executeQuery(q)){
			while (rs.next()) {
				int eid = rs.getInt("eid");
				String ename = rs.getString("ename");
				System.out.println("ID"+eid+"ename: "+ename);
			}
		}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return em1;
		}
	
	
	
	public void updateEmp(int eid,String ename) {
		String q="update emp set name =? where id=?";
		try ( Connection c = DriverManager.getConnection(url,username,password);
				java.sql.PreparedStatement p=c.prepareStatement(q)){
			p.setString(1, ename);
			p.executeUpdate();
		}
		catch (SQLException e ) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmp(int eid) {
		String q="delete from emp where id=?";
		try ( Connection c = DriverManager.getConnection(url,username,password);
				java.sql.PreparedStatement p=c.prepareStatement(q)){
			p.setInt(1, eid);
			p.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}


















