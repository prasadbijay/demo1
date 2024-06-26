package com.constu;
class Base5{
	Base5(){
		this("zyx");
		System.out.println("Base class Const");
	}
	Base5(String str){
		System.out.println("String of base "+str);
	}
}

public class chainingThis extends Base5{
	chainingThis(){
		super();
		System.out.println("Derv class const");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chainingThis obj = new chainingThis();

	}

}
