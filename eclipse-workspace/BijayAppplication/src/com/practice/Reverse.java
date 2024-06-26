package com.practice;

public class Reverse {
	public static void main(String[] args) {
		String str="bijay";
		String revrse = "";
		for(int i=str.length()-1;i>=0;i--) {
			revrse+=str.charAt(i);
			
		}
		System.out.println(revrse); 
	}

}
