package com.Stringdemo;

public class Unicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String variable = "this is unicode";
		System.out.println("Orignal String: "+variable);
		
		int val1 = variable.codePointAt(1);
		int val2=variable.codePointAt(4);
		System.out.println("character (unicode point)= "+val1);
		System.out.println("Character (unicode point)= "+val2);
		
		

	}

}
