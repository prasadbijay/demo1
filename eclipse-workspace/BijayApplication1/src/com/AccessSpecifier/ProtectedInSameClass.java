package com.AccessSpecifier;

public class ProtectedInSameClass {
	protected int a=10;
	protected void show() {
		System.out.println("Protected member in same class "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProtectedInSameClass obj=new ProtectedInSameClass();
		obj.show();
		

	}

}
