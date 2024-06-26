package com.constu;
class Base4{
	Base4(){
		
		System.out.println("Base class Const");
	}
}
public class ChainingConst extends Base4{
	ChainingConst(){
		super();
		System.out.println("Derv class const");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainingConst obj = new ChainingConst();

	}

}
