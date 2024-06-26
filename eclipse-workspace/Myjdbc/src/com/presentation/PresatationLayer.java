package com.presentation;
import java.util.*;

import com.bussiness.BussinessLogicLayer;
public class PresatationLayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BussinessLogicLayer b=new BussinessLogicLayer();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Add Employee: ");
			System.out.println("2.Delail Employee: ");
			System.out.println("3.Delete Employee: ");
			System.out.println("4.Exit: ");
		System.out.println("Enter your choose");
		int choose=sc.nextInt();
		
	
		
		switch(choose) {
		case 1:
			System.out.println("Enter employee name: ");
			String employeeName=sc.nextLine();
			b.addEmp( employeeName);
			break;
			
		case 2:
			System.out.println("Employee Detail: ");
			b.viewEmp();
			break;
		
		case 3:
			System.out.println("Enter Employee Id");
			int delete=sc.nextInt();
			b.deleteEmp(delete);
			
		}
		}
	}

}
//presentation layer is for input output pass in busslayer
//crude 