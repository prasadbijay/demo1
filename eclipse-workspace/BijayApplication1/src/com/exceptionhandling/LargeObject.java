package com.exceptionhandling;

public class LargeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[]largeArray=new byte[10000];
		largeArray=null;
		System.gc();
		LargeObject l=new LargeObject();
		l.finalize();
		System.out.println("this is simple: ");

	}
	protected void finalize(){
		System.out.println("Large object garbage collector: ");
		
	}

}
