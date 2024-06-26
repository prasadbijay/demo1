package com.collectionHashSet;

import java.util.HashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;

public class HashSetDemoIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet lhs=new HashSet();
		lhs.add("velocity");
		lhs.add(25);
		lhs.add(15);
		lhs.add(20);
		lhs.add("pune");
		System.out.println(lhs.remove("pune"));
		System.out.println("likedhashset: "+lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.contains("pune"));
		HashSet h=new HashSet();
		h.add(2);
		h.add(12);
		h.add(23);
		h.add(32);
		lhs.addAll(h);
		System.out.println(lhs);
		Iterator its=lhs.iterator();
		while(its.hasNext()) {
			System.out.println("iterator: "+its.next());
		}

	}

}
