package com.prac;

public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c;
		System.out.println(" before "+a +"and"+b+"after");
		c=a;
		a=b;
		b=c;
		System.out.println(" after"+ a+" and"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a=  "+a + "and b=  "+b);
		
		

	}

}
