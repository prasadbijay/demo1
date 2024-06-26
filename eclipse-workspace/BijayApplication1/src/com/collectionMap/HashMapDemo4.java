package com.collectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> s=new HashMap<Integer,String>();
		s.put(30, "Ram");
		s.put(40, "syam");
		s.put(50, "lakhan");
		Set<Integer> b=s.keySet();
		Iterator<Integer> it=b.iterator();
		while(it.hasNext()) {
			int a=it.next();
			System.out.println("keys are: "+a);
			System.out.println("values are: "+s.get(a));
		}

	}

}
