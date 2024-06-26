package com.loop;
import java.util.Scanner;
public class PirmeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int flag=0;
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				flag=1;
				break;}
		}
		if(flag==0) {
			System.out.println("It's a prime number"+num);
		}
		else {
			System.out.println("It's not a prime number"+num);
		}

	}

}
