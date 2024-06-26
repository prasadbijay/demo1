package com.sowcase;

import java.util.Scanner;

public class Demo1 {
	
	 int a;
	 int b;
	public int sam(int a, int b) {
		int c=a+b;
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=new Demo1();
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter your number to do sum: ");
		int a=sc.nextInt();
		System.out.println(" Enter your 2nd number to do sum");
		int b=sc.nextInt();
		System.out.println("Your Addition number are := "+d.sam(a,b));
		

	}

}
