package com.AbstractDemo;
class C1{
	private int a=15;
	class C2{
	public void cd() {
		System.out.println(" the value of the outer class:"+a);
	}
	}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c=new C1();
		C1.C2 obj=c.new C2();
		obj.cd();

	}

}
