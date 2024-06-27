package com.practice;

import java.util.Scanner;

public class DemoVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter the height and radius: ");
		float h=sc.nextFloat();
		int r=sc.nextInt();
		double volume=3.14*r*r*h;
		System.out.println(" volume:"+volume);

	}

}
