package com.loop;
import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Your  Number");
		int fact=1;
		int b=sc.nextInt();
		for(int i=1;i<=b;i++){
			fact=fact*i;
			System.out.println(fact);
		}

	}

}
