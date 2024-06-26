package com.Stringdemo;

public class StringBufferExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("java is my favouitr language");
		System.out.println(sb.capacity());

	}

}
