package com.exceptionhandling;

public class GarbageCallector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCallector obj= new GarbageCallector();
		GarbageCallector obj1= new GarbageCallector();
		
		obj=obj1=null;
		System.gc();

	}
	protected void finalize() throws Throwable {
		System.out.println("garbage collector");
	}

}
