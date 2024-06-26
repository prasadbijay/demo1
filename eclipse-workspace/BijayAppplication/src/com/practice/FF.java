package com.practice;

import java.util.Scanner;

//write a program that print the number from 1 to 100, but for multiple of three print
//fizz insted of the number and multiple of five print buzz for number that are  multiple
//of both three and five, print  fizz and buzz ?


public class FF {

	public void multifizz() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your number");
		int a=100;
		for(int i=0; i<=a;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println( "fizz, buzz" +i);
			}else if(i%3==0) {
				System.out.println(" fizz: "+i);
			}
			else if( i%5==0) {
				System.out.println(" buzz: "+i);
			} else {
				System.out.println(" not valid: "+i);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FF ff =new FF();
		ff.multifizz();

	}

}
