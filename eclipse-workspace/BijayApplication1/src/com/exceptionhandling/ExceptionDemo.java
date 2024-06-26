package com.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10/0;
			String s=null;
			System.out.println(s.length());
			
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Out of boud  error: ");}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic error: ");}
				catch(Exception e) {
					System.out.println("Exception error: ");
			
		}
		

	}

}
