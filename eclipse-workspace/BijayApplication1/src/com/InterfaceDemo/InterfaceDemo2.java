package com.InterfaceDemo;
class Demo implements InterfaceDemo1{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("WELLCOME TO THE WORLD WHERE EVERY SINGLE PEOPLE WHERE BUSY:");
	}
	
}
public class InterfaceDemo2 implements InterfaceDemo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InterfaceDemo1 i= new InterfaceDemo2();
		i.test();
		InterfaceDemo1 i1 = new Demo();
		i1.test();
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("HI,");
		
	}

}
