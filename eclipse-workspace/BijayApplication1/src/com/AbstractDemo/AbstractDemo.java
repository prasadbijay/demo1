package com.AbstractDemo;
abstract class Bank{
	 abstract float rateOfIntrest();
	
	
}
class SBI extends Bank{

	@Override
	float rateOfIntrest() {
		// TODO Auto-generated method stub
		return 12.8f;
	}
	
}
class IDBI extends Bank{ 

	@Override
	float rateOfIntrest() {
		// TODO Auto-generated method stub
		return 6.6f; 
		
	}
	
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new IDBI();
		System.out.println("The Intrest of Bank is: "+b.rateOfIntrest());
		
		Bank b1 = new SBI();
		System.out.println("The Intrest of Bank is: "+b1.rateOfIntrest());
	}

}
