package com.demo;

import java.util.Scanner;

public class MathsUnit {
	int a=0,b=0;
	 static void multiply(int a,int b) {
		 
		 int c=a*b;
		 System.out.println("the multiplications of the two number: "+c);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your first number to multiple: ");
		int a=sc.nextInt();
		System.out.println(" Enter your second number to multiple: ");
		int b=sc.nextInt();
		MathsUnit.multiply(a,b);

	}

}
