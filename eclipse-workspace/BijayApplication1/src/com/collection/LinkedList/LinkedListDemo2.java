package com.collection.LinkedList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String []args) {
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(20);
		ls.add(10);
		ls.add(30);
		ls.add(50);
		ls.add(60);
		ls.addFirst(0);
		ls.addLast(100);
		System.out.println("Adding value in LinkedList: "+ls);
		int a=ls.get(3);
		System.out.println("your 4th value is: "+a);
		System.out.println("this is my first way and simple way to display: "+ls);
		Iterator<Integer> its=ls.iterator();
		while(its.hasNext()) {
			System.out.println("my second way to display: "+its.next());
		}
		for(int i:ls) {
			System.out.println("this is third way: "+i);
		}
	}

}
