package com.control;
import java.util.Scanner;
public class IfVol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your number ");
		int d = sc.nextInt();
		switch(d) {
		case 1:
			System.out.println("Enter String:");
			String str= sc.next();
			if(str=="A"||str=="E"||str=="I"||str=="O"||str=="U") {
				System.out.println("Upper case: "+str);
			}
			break;
		case 2:
			System.out.println("Enter String:");
			String str1= sc.next();
			if(str1=="a"||str1=="e"||str1=="i"||str1=="o"||str1=="u") {
				System.out.println("Lower case: "+str1);
			}
			default:
				System.out.println("Bhai tu kay kar raha hai!!!!!");
			
		}

	}

}
