package com.a;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int emploeeCount=1;
		Set <A1> emp=new TreeSet<>();
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Please enter "+emploeeCount+" Employee Name: ");
		String name=sc.nextLine();
		System.out.println(" Please enter "+emploeeCount+" Employee Email ID: ");
		String emailID=sc.next();
		System.out.println(" Please enter "+emploeeCount+" Employee Salary: ");
		long salary=sc.nextLong();
		System.out.println(" Please enter "+emploeeCount+" Employees Phone NUmber: ");
		long phoneNumber=sc.nextLong();
		sc.nextLine();
		
		A1 employee=new A1(name,emailID,salary,phoneNumber);
		emp.add(employee);
		emploeeCount++;
		
		System.out.println("\tDo you want to ADD more Employee?(YES/NO)");
		String respone=sc.next();
		if(!respone.toLowerCase().equalsIgnoreCase("yes")) {
			break;
			}
		}
		for(A1 dis:emp) {
			System.out.println(dis);
		}
		
	
	}

}
