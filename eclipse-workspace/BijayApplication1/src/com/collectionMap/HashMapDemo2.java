package com.collectionMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(30, "Ram");
		hm.put(40, "syam");
		hm.put(50, "lakhan");
		Set<Integer> s=hm.keySet();
		for(int i:s) {
			System.out.println("keys are: "+i);
			System.out.println("values are: "+hm.get(i));
		}

	}

}
