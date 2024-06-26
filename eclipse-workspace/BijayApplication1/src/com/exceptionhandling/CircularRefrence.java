package com.exceptionhandling;

public class CircularRefrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularRefrence c=new CircularRefrence();
		CircularRefrence c1=new CircularRefrence();
		c=c1;
		c1=c;
		c=c1=null;
		System.gc();

	}
	protected void finalize()throws Throwable{
		System.out.println("circular refrennce garbage collector: ");
	}

}
