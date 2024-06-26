package com.loop;
import java.util.Scanner;
public class Pradom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int copy=num, rev = 0,r;
		while(num!=0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(rev==copy) {
			System.out.println("palindrom");
		}
		 {
			System.out.println("not palindrome");
		}
	}

}
