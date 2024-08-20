package com.abstract1;

import java.util.Scanner;

public class MenuCard {
	public void option() {
		System.out.println(" WellCome To Mc'Donoald: ");
		System.out.println("Today's Menu are: ");
		System.out.println("1.full-meal: ");
		System.out.println("2.Drink: ");
		System.out.println("3.burgar: ");
		System.out.println("4.exit: ");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuCard mc=new MenuCard ();
		mc.option();
		int fullMeal=250;
		int drink=80;
		int burgar=120;
		Scanner sc=new Scanner(System.in);
		System.out.println(" please enter your chooice: ");
		int c=sc.nextInt();
		switch (c) {
		case 1:
		if(c==1) {
			System.out.println(" In your meal come with 2-burgar,1-pizza: ");
			double price=(0.10*fullMeal)+fullMeal;
			System.out.println(" you have to pay of rs: "+price+" Including all charges: ");
		}
		break;
		case 2:
		if(c==2) {
			//System.out.println(" In your meal come with 2-burgar,1-pizza: ");
			double price=drink+(drink*0.05);
			System.out.println(" you have to pay of rs: "+price+" Including all charges: ");
		}
		break;
		case 3:
		if(c==3) {
			
			double price=burgar+(burgar*0.08);
			System.out.println(" you have to pay of rs: "+price+" Including all charges: ");
		}
		break;
		case 4:
		if(c==4) {
			System.err.println("Oops Invalid....");
		}
		break;
		}
		
		

	}

}
