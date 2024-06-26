package com.binarytree;

public class Demo {
	int  myNum=10;
	float myFloatnum=9.9f;
	char myLetter='A';
	String mytext=" bijay";
	boolean myCheck= false;
	
	public void display() {
		System.out.println(this.myNum+"  "+ myFloatnum+"  "+myLetter+"  "+mytext+"  "+myCheck+"");
	}

	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.display();

	}

}
