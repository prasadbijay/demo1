package com.Inheritance;

public  class FunctionClass implements FunctionDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionClass fc = new FunctionClass();
		fc.display();
		FunctionDemo ob = new FunctionClass();
		ob.display();
		

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is functioh Interface: ");
	}

}
