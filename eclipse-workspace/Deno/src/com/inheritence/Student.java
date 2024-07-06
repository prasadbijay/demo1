package com.inheritence;

import java.util.Scanner;

public class Student extends Person {
	String grade;
	public void study(String grade) {
		System.out.println(" Your grade: "+grade);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter your name: ");
		String name=sc.nextLine();
		
		System.out.println(" Enter your Age: ");
		double age=sc.nextDouble();
		
		System.out.println(" Enter your Grade: ");
		String grade=sc.next();
		
		Student st=new Student();
		st.speak(name,age);
		st.study(grade);
		
		

	}

}
