package com.prac;

import java.util.Scanner;

public class AnglesOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the three angles of the triangles: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a+b+c!=180) {
			System.out.println("a angle do not forms valid triangles: ");
		
		}
		else {
			if(a>90||b>90||c>90) {
				System.out.println(" is a obsute angle");
			}
			else if(a==90||b==90||c==90) {
				System.out.println(" is a right angle: ");
			}
			else {
		
		System.out.println(" is a acute angle: ");
			}
			}
	}

}
