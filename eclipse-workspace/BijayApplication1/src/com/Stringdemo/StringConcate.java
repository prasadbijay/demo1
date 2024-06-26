package com.Stringdemo;
import java.util.Scanner;
public class StringConcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String first_String=sc.next();
		
		
		System.out.println("Enter second String");
		String second_String=sc.next();
		System.out.println("Your First String: "+first_String);
		System.out.println("Your Second String: "+second_String);
		String str=first_String+second_String;
		System.out.println("After Concantination: "+str);
		
		
		
		
	}

}
