package com.Stringdemo;
import java.util.Scanner;
public class Demo1 {
	
	static String reverseString(String orignal) {
		char[] charArray = orignal.toCharArray();
		int length = charArray.length;
		
		for(int i=0;i<length/2;i++) {
			char temp=charArray[i];
			charArray[i]=charArray[i];
			charArray[length-1-1]=temp;
			
		}
		return new String(charArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String: ");
		String orignal=sc.nextLine();
		String reverse = reverseString(orignal);
		
		
		
		

	}

	

}
