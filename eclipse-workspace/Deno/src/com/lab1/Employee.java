package com.lab1;

import java.util.Scanner;

public class Employee {
	String name="";
	double salary;
	double anulsalary;
	public void annualIncome(String n,double s) {
		this.name=n;
		this.salary=s;
		anulsalary=12*salary;
		if(anulsalary<=250000) {
			System.out.println(" No tax required: "+name+anulsalary);
		}
		else if(anulsalary>250000 && anulsalary<=500000) {
			double result;
			result=(anulsalary-salary)*0.10;
			System.out.println(" your Tax: "+name+result);
		}
		else if(anulsalary>500001 && anulsalary<=1000000) {
			double result;
			result=(250000*0.10)+((anulsalary-500000)*0.20);
			System.out.println(" your Tax:  "+name+result);
		}
		else if(anulsalary>1000000) {
			double result;
			result=(250000*0.10)+(500000*0.20)+((anulsalary-1000000)*0.30);
			System.out.println(" your Tax:  "+name+result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name: ");
		String name=sc.nextLine();
		System.out.println(" enter your income: ");
		double salary=sc.nextDouble();
		Employee em=new Employee();
		em.annualIncome(name,salary);

	}

}
