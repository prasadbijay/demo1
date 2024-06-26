package com.jdbcarch;
import java.util.*;
public class PresentationLayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BussinessLogicLayer buss= new BussinessLogicLayer();
		System.out.println("Enter employee ID: ");
		int eid= sc.nextInt();
		String Ename =buss.getEmployeeNameById(eid);
		if (Ename != null) {
			System.out.println(" Employee Name: "+Ename);
			
		}
		else {
			System.out.println("Employee Not Match OR found");
		}
		

	}

}
