package com.prac;

import java.util.Scanner;

public class FobinanciNumber {
	static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		int f=1;
		int pf=1;
		for(int i=2;i<=n;i++) {
			int tem=f;
			f+=pf;
			pf=tem;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter your number to calculate fibonacci number: ");
		int n=sc.nextInt();
		for(int i=0;i<=n; i++) {
			System.out.println(fibonacci(i)+" ");
		}
		

	}

}
