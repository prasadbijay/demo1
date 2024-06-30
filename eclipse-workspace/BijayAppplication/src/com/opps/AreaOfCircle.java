package com.opps;

import java.util.Scanner;

public class AreaOfCircle {
	
	Scanner sc=new Scanner(System.in);
	
	float calculateArea() {
		float pi=3.14f;
		System.out.println(" Enter the radius of the circle: ");
		float r=sc.nextFloat();
		float area=pi*r*r;
		return area;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle ac=new AreaOfCircle();
		System.out.println(ac.calculateArea());

	}

}
