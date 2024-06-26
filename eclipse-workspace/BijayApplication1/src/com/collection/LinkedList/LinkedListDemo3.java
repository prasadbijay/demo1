package com.collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> ll=new LinkedList<Integer>();
		ll.add(29);
		ll.add(21);
		ll.add(44);
		ll.add(83);
		ll.add(24);
		ll.addLast(30);
		ll.addFirst(0);
		int a=ll.get(3);
		System.out.println(" linked list: "+ll);
		System.out.println("your fourth position: "+a);
		Iterator<Integer> lli= ll.iterator();
		while(lli.hasNext()) {
			System.out.println("printing using iterator:"+lli.next());
		}

	}

}
