package com.point;

public class Student {
	private static String name;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Student.name = name;
	}

	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("name"+name);
	}
	
}
