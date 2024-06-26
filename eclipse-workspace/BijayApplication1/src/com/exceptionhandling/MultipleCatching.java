package com.exceptionhandling;

public class MultipleCatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x[]=new int[5];
			int a=10/0;
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Error1");}
			catch(ArithmeticException a) {
				System.out.println("Error2");	}	
				catch(Exception a) {
					System.out.println("Error3");
					
		}

	}

}
