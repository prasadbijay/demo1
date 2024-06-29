package com.prac;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter Three angle of a triangle: ");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		
		
		if(a==b && b==c) {
			System.out.println("equilateral: ");
		}
		else if(a==b||a==c||b==c) {
			System.out.println(" isosceles: ");
		}
		else {
			System.out.println(" scalene: ");
		}
			
	}

}
