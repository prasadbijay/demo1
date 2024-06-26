package com.exceptionhandling;

public class MultiCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s=null;
		System.out.println();
		int a=20/0;
		int arr[]=new int [5];
		arr[5]=20-0;
		}
		catch(ArithmeticException e){
			System.out.println("Arth Error");
		}
		catch(NullPointerException e){
			System.out.println("string Error");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Error");
		}
		
		

	}

}
