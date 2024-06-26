package com.AccessSpecifier;
class A{
	protected int a=10;
	protected void print() {
		System.out.println("Protected Function outside class: "+a);
	}
}
public class ProtectedInDiffClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.print();
		System.out.println("Protected Function inside class: "+obj.a);
	}

}
