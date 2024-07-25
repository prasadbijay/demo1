package com.lab4;

import java.util.Scanner;

abstract class Employee{
	abstract double calculateSalary();
	abstract void displayInfo();
}

class FullTimeEmployee extends Employee{
	
	private double baseSalary;
	private double benifits;
	
	public FullTimeEmployee ( double baseSalary,double benifits) {
		this.baseSalary=baseSalary;
		this.benifits=benifits;
	}
	

	@Override
	double calculateSalary() {
		
		// TODO Auto-generated method stub
		return baseSalary+benifits;
	}

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println(" \t\tFull-Time Employee: \n");
		System.out.println(" The Base Salary of employeez: "+baseSalary);
		System.out.println(" The Benifits: "+benifits);
		System.out.println(" Total Salary: "+calculateSalary()+"\n\n");
		
		
	}
	}
class PartTimeEmployee extends Employee{
	
	private double hourlyRate;
	private double hourWorked;
	
	public PartTimeEmployee(double hourlyRate,double hourWorked) {
		this.hourlyRate=hourlyRate;
		this.hourWorked=hourWorked;
	}
	@Override
	double calculateSalary() {
		
		// TODO Auto-generated method stub
		return hourlyRate*hourWorked;
	}

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println(" \t\tPart time Worker:\n ");
		System.out.println(" Hourly rate of employee: "+hourlyRate);
		System.out.println(" Hour Worked: "+hourWorked);
		System.out.println(" Total Salary for Part Time: "+calculateSalary());
		
	}
	
	
}

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter  Base salary: ");
		double baseSalary=sc.nextDouble();
		
		System.out.println(" Enter Benifits: ");
		double benifits=sc.nextDouble();
		sc.nextLine();
		
		System.out.println(" Enter Hourly Rate: ");
		double hourlyRate=sc.nextDouble();
		
		System.out.println(" Enter Hour Worked: ");
		double hourWorked=sc.nextDouble();
		sc.close();
		
		FullTimeEmployee fte=new FullTimeEmployee(baseSalary,benifits);
		fte.displayInfo();
		
		PartTimeEmployee pte=new PartTimeEmployee(hourlyRate,hourWorked);
		
		pte.displayInfo();

	}

}
