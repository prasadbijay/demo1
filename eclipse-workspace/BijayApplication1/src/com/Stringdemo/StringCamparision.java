package com.Stringdemo;

public class StringCamparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "HELLO";
		String str2 ="hello";
		String str3="WORLD";
		
		
		
		System.out.println("str1 :"+str1.hashCode());
		System.out.println("Str2 :"+str2.hashCode());
		
		String str4 ="World";
		String str5 ="World";
		
		System.out.println("str4 new:"+str4.hashCode());
		System.out.println("Str5 new:"+str5.hashCode());
		
		boolean isEual = (str1==str2);
		System.out.println("== comparision: "+isEual);
		
		boolean isE = (str5==str4);
		System.out.println("== str new comparision:"+isE);
		
			
		boolean isEqual = str1.equals(str2);
		System.out.println("Case-sensitive comparsison: "+isEqual);
		
		//Case-Insensitive camparision
		boolean isEqualIgnorCase = str1.equalsIgnoreCase(str2);
		System.out.println("Case-Insensitive camparision: "+isEqualIgnorCase);
		
		//Compar to another String lexicorgraphically
		int camparisonResult = str3.compareTo(str1);
		System.out.println("Compar to another String lexicorgraphically: "+camparisonResult);
	}

}



