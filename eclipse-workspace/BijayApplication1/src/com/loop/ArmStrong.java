package com.loop;
import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		
		while(b>0) {
			int digit = b%10;
			System.out.println(digit);
		}

	}

}
