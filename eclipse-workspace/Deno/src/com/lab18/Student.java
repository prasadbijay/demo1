package com.lab18;

import java.util.Scanner;

class Person{
	static String school="daffodil english high school: ";
	String name;
	float age;
	public void speak() {
		System.out.println(" Students are speaking in English:");
	}
}

public class Student extends Person{
	String grade;
	public void study(String name,float age, String grade ) {
		System.out.println(" Student name:"+name.toUpperCase());
		System.out.println(" Student age: "+age);
		System.out.println(" Student grade: "+grade.toUpperCase());
		System.out.println(" Student School: "+school.toUpperCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("please enter name:");
		String name=sc.nextLine();
		
		System.out.println("please enter age: ");
		float age=sc.nextFloat();
		
		System.out.println("please enter grade: ");
		String grade=sc.next();
		
		Student st=new Student ();
		st.speak();
		st.study(name, age, grade);

	}

}
