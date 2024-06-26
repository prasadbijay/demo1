package com.Stringdemo;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = new String("World");
		
		//Concatenation
		String result = str1+" "+str2;
		System.out.println("After Concatenation Strin: "+result);
		
//		Length of a string
		int length=result.length();
		System.out.println("The lenght of String: "+length);
		
		//Substring
		String substring = result.substring(6,11);
		System.out.println("Substing: "+substring);
		
		//Character of a Specific index
		char charAt = result.charAt(3);
		System.out.println("Character at index 3: "+charAt);
		
		int index = result.indexOf("ello");
		System.out.println("Index: "+index);
		
		

	}

}
