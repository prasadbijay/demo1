package com.prac;

import java.util.Scanner;

public class AreaToFind {
	Scanner sc=new Scanner(System.in);
	float area=0;
	
	
	public float square() {
		System.out.println(" enter length of the square:");
		float s=sc.nextFloat();
		return area=s*2;
		
	}
	public float rectangle() {
		System.out.println(" enter length and width");
		float l=sc.nextFloat();
		float w=sc.nextFloat();
		return area =l*w;
	}
	
	public float triangle() {
		System.out.println(" enter base and hieght");
		float b=sc.nextFloat();
		float h=sc.nextFloat();
		return area =(b*h)/2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaToFind ar=new AreaToFind();
		System.out.println(ar.square());
		System.out.println(ar.rectangle());
		System.out.println(ar.triangle());
		

	}

}
