package com.inheritence;

import java.util.Scanner;

public class Car  extends Vechicle{
	String color;
	public void  honk(String brand,String model,int year,String color) {
		
		System.out.println(" Car color: "+color);
		System.out.println(" Brand Name: "+brand);
		System.out.println(" Model Name: "+model);
		System.out.println(" Year: "+year);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println(" Enter car BRAND: ");
		String brand=sc.nextLine();
		
		
		System.out.println(" Enter car Model: ");
		String model=sc.nextLine();
		
		
		System.out.println(" Enter car Year: ");
		int year=sc.nextInt();
		
		
		System.out.println(" Enter car Color: ");
		String color=sc.next();
		
		
		Car c= new Car();
		c.drive();
		c.honk(brand,model,year,color);

	}

}
