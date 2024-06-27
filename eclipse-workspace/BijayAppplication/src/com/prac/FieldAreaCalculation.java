package com.prac;

import java.util.Scanner;

public class FieldAreaCalculation {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" please enter the length of the field in feet: ");
		float l = sc.nextFloat();
		System.out.println(" please enter the width of the field in feet: ");
		float w= sc.nextFloat();
		
		float area=l*w;
		System.out.println(" before conveting in acer: "+area);
		
		float areaAcer=area/43560;
		System.out.println(" The area of the flied after convert in acer: "+areaAcer+"acers");
		

	}

}
