package com.AbstractDemo;
abstract class Shape{
	abstract void Draw();
}
class Traingle extends Shape{

	@Override
	void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Traingle");
	}
	
}
class Square extends Shape{

	@Override
	void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Square");
	}
	
}
class Cricle extends Shape{

	@Override
	void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Circle");
	}
	
}
public class praAbstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Traingle();
		s.Draw();
		Shape s1 = new Square();
		s1.Draw();
		Shape s2 = new Cricle();
		s2.Draw();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}

//Object class eg = hashcode()
//use = when we create object it return its own unie id


//write a java program to create an abst class animal eat and sleep createsub classs lino triger deer that extends animal class and implement eat and sleep differnt base of there spicif beha


