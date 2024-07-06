package com.inheritence;

public class Person {
	String name;
	double age;
	static String school_name= " Daffodil English School ";
	public void speak(String name,double age) {
		System.out.println(" your name is: "+name );
		System.out.println(" your age is: "+age);
		System.out.println(" School name: "+school_name.toUpperCase());
	}

}
