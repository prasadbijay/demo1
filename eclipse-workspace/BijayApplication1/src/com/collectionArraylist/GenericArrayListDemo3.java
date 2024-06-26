package com.collectionArraylist;
import java.util.ArrayList;

public class GenericArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("23");
		al.add("40");
		al.add("2");
		al.add("2000");
		for(String s:al) {
			System.out.println(" my string: "+s);
		}

	}

}
