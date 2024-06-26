package com.exceptionhandling;

public class MultiDemoOfException {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		int r[]=new int[4];
		int c[] ={1,4,2};
		try {
			try {
				r[3]=8;
				System.out.println("r=8: "+r);
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("arrr Error");
			}
			try {
				r[8]=25;
				System.out.println("array Error");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("out of Index Range: ");
			}
			
		}
		catch(Exception e) {
			System.out.println("Exception");
		}

	}

}
