package com.InterfaceDemo;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new SBI();
		System.out.println(b.rateOfInterest());
		
		Bank b1 = new HDFC();
		System.out.println(b1.rateOfInterest());
		
	}

}
