package com.lab1;

import java.util.Scanner;

public class Electricity {
	int unit;
	int result;
	public void kwh(int a) {
		this.unit=a;
		if(unit>=1 && unit<=100) {
			unit*=10;
			System.out.println(" your electricity bill: "+unit+"Rs ");
		}
	}
	public void kwh1(int a) {
		this.unit=a;
		if(unit>100 && unit<=200) {
			unit*=15;
			System.out.println(" your electricity bill: "+unit+"Rs");
		}
	}
	public void kwh2(int a) {
		this.unit=a;
		if(unit>200 && unit<=300) {
			unit*=20;
			System.out.println(" your electricity bill: "+unit+"Rs");
		}
	}
	public void kwh3(int a) {
		this.unit=a;
		if(unit>300) {
			unit*=25;
			System.out.println(" your electricity bill: "+unit+"Rs");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter your unit: ");
		int a=sc.nextInt();
		Electricity el=new Electricity();
		el.kwh(a);
		el.kwh1(a);
		el.kwh2(a);
		el.kwh3(a);
		

	}

}
