package com.collectionArraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListShortingDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> a1=new ArrayList<String>();
		a1.add("Ajay");
		a1.add("Umesh");
		a1.add("Arjun");
		a1.add("Bijay");
		a1.add("Sanjay");
		a1.add("Demo");
		a1.add("Java");
		System.out.println("Before sorting: \n"+a1+"\n\n");
		Collections.sort(a1);
		System.out.println("After sorting: \n"+a1);

	}

}
