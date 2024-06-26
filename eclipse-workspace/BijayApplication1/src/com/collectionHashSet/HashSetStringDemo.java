package com.collectionHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs1= new HashSet<String> ();
		hs1.add("bijay");
		hs1.add("ankush");
		hs1.add("trussar");
		Iterator<String> itr=hs1.iterator();
		while(itr.hasNext()) {
			System.out.println(" string object: "+itr.next());
		}
//		for(String i:hs1) {
//			System.out.println(" String object : "+i);
//		}

	}

}
