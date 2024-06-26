package com.collection.LinkedList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> st=new LinkedList<String>();
		st.add("bijay:");
		st.add("ajay:");
		st.add("sanjay:");
		st.addLast("arjun:");
		st.add("ram:");
		st.add("lakan:");
		st.add("syam:");
		st.addFirst("all:");
		System.out.println(" linkedList String: "+st);
		String s= st.get(5);
		System.out.println("your 6 number value: ="+s);
		Iterator<String> its =st.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
	}

}
