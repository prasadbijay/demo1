package com.prac;

import java.util.Scanner;

public class Recarsion_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(" please!! enter your number for calculation: ");
		int n=sc.nextInt();
		for(int i=0;i<n; i++) {
		System.out.println(fib(i));
		}
	}
	public static int fib(int n) {
		
		if(n<=1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	

}
}
