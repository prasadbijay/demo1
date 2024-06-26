package com.InterfaceDemo;

public class MultipleInter implements Interface1,Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInter ob=new MultipleInter();
		
		System.out.println("My Name is: "+ob.func2()+"\n and My Friend: "+ob.func());
	
		

	}

	@Override
	public String func2() {
		// TODO Auto-generated method stub
		return "Ankush";
	}

	@Override
	public String func() {
		// TODO Auto-generated method stub
		return "Bijay";
	}

}
//write a java program to create a interface playable with method play()
// that takes no arrgument and returns void.
