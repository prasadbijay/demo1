package com.demo;

import java.util.Scanner;

public class Calculater {
	int add(int x,int y) {
		int sum=x+y;
	return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the first number to add:");
		int x=sc.nextInt();
		System.out.println(" Enter the Second number to add:");
		int y=sc.nextInt();
		Calculater cl=new Calculater();
		System.out.println(cl.add(x, y));
		
		

	}

}
