package com.Stringdemo;
import java.util.Scanner;
public class StringTestChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String word=sc.nextLine();
		
		System.out.println("Enter char :");
		String test = sc.next();
		
		boolean result;
		if(result=word.contains(test)) {
			System.out.println(result);
		}
		

	

	}}
