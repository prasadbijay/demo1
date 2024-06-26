package com.Stringdemo;
import java.util.Scanner;
public class StringIgnorCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String first_String=sc.next();
		System.out.println("Enter second String: ");
		String second_String=sc.next();
		
		boolean equal ;
		if(equal = first_String.equalsIgnoreCase(second_String)) {
			System.out.println(equal);
		}else {
			System.out.println(equal);
		}

	}

}
//	boolean isEqualIgnorCase = str1.equalsIgnoreCase(str2);