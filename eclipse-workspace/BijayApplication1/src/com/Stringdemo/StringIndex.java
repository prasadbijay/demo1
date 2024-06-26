package com.Stringdemo;

import java.util.Scanner;
public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String name=sc.next();
		
		System.out.println("Enter index value: ");
		int index_value=sc.nextInt();
		
		if(index_value>=0 && index_value<name.length()) {
			char charAtIndex = name.charAt(index_value);
			System.out.println("index "+"charname\t"+"index value");
			System.out.println("\t:"+charAtIndex+" \t "+index_value);
			
		}else {
			System.out.println("invalid index value");
		}
		
		

}}
