package com.practice;

import java.util.Scanner;

public class StringRevarsal {
	public void revarsal() {
		String reverse = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String to reverse: ");
		String name=sc.next();
		String[] words=name.split("");
		for(int i=name.length()-1;i>=0;i--) {
			
			reverse += words[i];
			if (i!=0); //{
//				reverse += " ";
//			}
			
		}
		System.out.println(" after reverse your string will be: ");
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringRevarsal sr=new StringRevarsal();
		sr.revarsal();
		

	}

}
