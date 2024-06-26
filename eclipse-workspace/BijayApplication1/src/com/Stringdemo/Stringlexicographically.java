package com.Stringdemo;
import java.util.Scanner;
public class Stringlexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String first_String=sc.nextLine();
		
		System.out.println("Enter secound String: ");
		String secound_String=sc.nextLine();
		
		int result = first_String.compareTo(secound_String);
		if(result==0) {
			System.out.println("First String \n"+first_String+"\n and second String \n"+ secound_String +"\n Both String are lexicographically equal:");
			
		}else if(result<0) {
			System.out.println("first String come before the secound String ");
		}else {
			System.out.println("Both Strin are not equal:");
		}
		

	}

}
