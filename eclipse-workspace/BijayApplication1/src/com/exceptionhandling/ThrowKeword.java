package com.exceptionhandling;

public class ThrowKeword {
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("not eligeble for vote: ");
		}
		else {
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(20);
		System.out.println("Rest: ");

	}

}
