package com.collectionMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapdemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		hm.put(25, "bijay");
		hm.put(4, "ankush");
		hm.put(3, " truss");
		Set<Integer> s=hm.keySet();
		Iterator<Integer> its=s.iterator();
		while(its.hasNext()) {
			int a=its.next();
			System.out.println("keys are: "+a);
			System.out.println("values are:"+hm.get(a));
		}

	}

}
