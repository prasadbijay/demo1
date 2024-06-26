package com.AbstractDemo;
//write a java program to create an abst class animal eat and sleep createsub classs lino triger deer that extends animal class and implement eat and sleep differnt base of there spicif beha
abstract class Animal{
	abstract String  eat();
	abstract String sleep();
}
class Lion extends Animal{

	@Override
	String eat() {
		// TODO Auto-generated method stub
		return "non-veg";
	}

	@Override
	String sleep() {
		// TODO Auto-generated method stub
		
		return "18 Hours";
	}
	
}
class Tiger extends Animal{

	@Override
	String eat() {
		// TODO Auto-generated method stub
		return "non-veg";
	}

	@Override
	String sleep() {
		// TODO Auto-generated method stub
		return "16 hours";
	}
	
}
class Dear extends Animal{

	@Override
	String eat() {
		// TODO Auto-generated method stub
		return "veg";
	}

	@Override
	String sleep() {
		// TODO Auto-generated method stub
		return "5-6 Hours";
	}
	
}
public class Par2AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Lion();
		System.out.println(a.eat()+"\t"+a.sleep());
		
		Animal a1 = new Tiger();
		System.out.println(a1.eat()+"\t"+a1.sleep());
		
		Animal a2 = new Dear();
		System.out.println(a2.eat()+"\t"+a2.sleep());
	}

}

// write a java program abstract class shape 3 d with abstract method cal volume and cal Suffer area after that create sub class spear and cube that extends shape 3D and implement repect method and sufter and its shape
