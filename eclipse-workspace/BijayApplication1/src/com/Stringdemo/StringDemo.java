package com.Stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var=new String("hi");
		
		String str="hi";
		String str1="hi";
		String str3=str.concat("Wellcome to String");
		System.out.println(str.concat("String"));
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(var.hashCode());
		

	}

}
