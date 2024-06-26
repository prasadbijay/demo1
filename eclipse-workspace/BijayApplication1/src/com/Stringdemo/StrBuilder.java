package com.Stringdemo;

public class StrBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("Hello");
		StringBuilder s1 = new StringBuilder("World");
		
		StringBuilder s2 = s.append(s1);
		System.out.println(s2.toString());

	}

}
