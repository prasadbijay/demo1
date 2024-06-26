package com.Inheritance;
class Base1{
	void baseFunction() {
		System.out.println("This is Base function");
	}
}
class DriveB extends Base1{
	void driveFunction() {
		System.out.println("This is first Drived");
	}
	
}
public class MultilevelInheritance extends DriveB{
	void drive2Function() {
		System.out.println("This is secound Drived");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritance obj = new MultilevelInheritance();
		obj.baseFunction();
		obj.driveFunction();
		obj.drive2Function();

	}

}
