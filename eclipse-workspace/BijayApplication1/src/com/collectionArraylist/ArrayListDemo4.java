package com.collectionArraylist;
import java.util.ArrayList;


public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("pune");
		al.add("mumbai");
		al.add("delhi");
		al.add("40");
		al.add("banglore");
		al.add(20);
		System.out.println(al.get(1));
		System.out.println(al);
		System.out.println(al.remove("delhi"));
		System.out.println(al.contains("40"));//for checking whether is there or not
		System.out.println(al);


		

	}

}
