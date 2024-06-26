package com.Stringdemo;
import java.util.Scanner;
public class CountSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//String str="something is good in this world";
		System.out.println("Enter Strings: ");
		String str = sc.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println("Total Space is: "+count);

	}

}
