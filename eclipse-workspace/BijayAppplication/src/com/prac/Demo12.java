package com.prac;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" please Enter Your Name:");
		String name=sc.nextLine();
		System.out.println(" please Enter your Age:");
		int age=sc.nextInt();
		System.out.println(" please Enter your salary:");
		float salary=sc.nextFloat();
		System.out.println(" here is your name, "+name +" your age, "+age+" and your salary "+salary);
		

	}

}
