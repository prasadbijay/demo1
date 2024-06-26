package com.Inheritance;
class Base2{
	void base1Function() {
		System.out.println("This is base 1 class");
	}
}

class Drived1 extends Base2{
	void dri1Function() {
		System.out.println("This is deived 1 class");
	}
}

class Drived2 extends Base2{
	void dri2Function() {
		System.out.println("This is deived 2 class");
	}
}

class Drived3 extends Drived1{
	void dri3Function() {
		System.out.println("This is deived 3 class");
	}
}
public class HieraInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drived3 obj = new Drived3();
		obj.dri3Function();
		obj.dri1Function();
		obj.base1Function();
		Drived2 obj1=new Drived2();
		obj1.dri2Function();
//		obj1.base1Function();

	}

}
