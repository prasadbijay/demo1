package com.Stringdemo;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orignal = "  Trim the String  ";
		
		int length = orignal.length();
		System.out.println("Before the Triming: "+length);
		
		//Trim leading and trailing whiltesplaces
		String trimed = orignal.trim();
		System.out.println("Trimed the String: "+trimed);
		
		
		int length1 = trimed.length();
		System.out.println("After Triming: "+length1);
		
		//Converted to uppercase and lowercase
		
		String uppercase = orignal.toUpperCase();
		String lowercase = orignal.toLowerCase();
		System.out.println("Uppercase: "+uppercase);
		System.out.println("Lowercase: "+lowercase);
		
		//String replace Characters
		String replace = orignal.replace("Trim","Replace");
		System.out.println("Replace String: "+replace);
		
		//Splitting the String
		String str="splitting the String";
		String[] parts = str.split(" ");
		System.out.println("Split Strig: ");
		for(String part: parts) {
			System.out.println("\t");
			System.out.println(part);
		}
		
		

	}

}
