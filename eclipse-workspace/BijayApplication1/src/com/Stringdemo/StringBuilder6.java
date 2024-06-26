package com.Stringdemo;

public class StringBuilder6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("java is my favouitr language");
		System.out.println(sb.capacity());

	}

}
//Write a java program to get the character Unicode code point at the index within the String
// n java a character char is san unsinged 16 bit value ie 0 to ffff