package com.collectionArraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(21);
		al.add(32);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(1);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(2);
		al2.add(3);
		al2.add(15);
		al2.add(44);
		al2.add(90);
		al2.add(100);
		al2.addAll(al);
		System.out.println("copy arraylist  is: "+al);
		Iterator<Integer> its =al.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}

	}

}
