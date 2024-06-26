package com.serialization;
class A{
	int b=15;
}

public class ShadowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		A a2=new A();
		a1=a2;
		System.out.println("This is first object: "+a1.b);
		a2.b=100;
		//System.out.println("This is first object: "+a1.b);
		System.out.println("This is second object: "+a2.b);

	}

}
