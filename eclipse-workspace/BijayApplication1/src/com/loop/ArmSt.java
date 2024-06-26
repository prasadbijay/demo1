package com.loop;
import java.util.Scanner;
public class ArmSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int b=sc.nextInt();
		int number=b;
		int result = 0;
		int rem;
		while(number!=0) {
			rem = number%10;
			result+=Math.pow(rem, 3);
			number/=10;
		}
		if(result==b) {
			System.out.println("Armstrong");
		}
		else {
			
			System.out.println("Its Not a Armstrong");
		}
		

	}

}
