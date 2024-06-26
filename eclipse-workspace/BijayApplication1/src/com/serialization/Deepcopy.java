package com.serialization;
class Abc{
	int a =20;
	
}

public class Deepcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj=new Abc();
		Abc obj2 = new Abc();
		obj2.a=40;
		System.out.println("object in obj=:"+obj.a);
		System.out.println("object in obj2:= "+obj2.a);

	}

}
