package com.Inheritance;
class Base{
	int squre(int no) {
		int sq=no*no;
		return sq;
	}
}
public class SingleDemoOfInheritance extends Base{
	void derivedFunction() {
		System.out.println("Derived function: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDemoOfInheritance obj = new SingleDemoOfInheritance();
		int sq =obj.squre(5);
		System.out.println("Sq of number: "+sq);
		obj.derivedFunction();
	}

}
