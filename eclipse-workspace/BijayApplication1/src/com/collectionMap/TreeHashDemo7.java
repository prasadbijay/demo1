package com.collectionMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeHashDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("10", "sam");
		tm.put("11", "ram");
		tm.put("12", "om");
		Set<String> s=tm.keySet();
		for(String i:s) {
			System.out.println(" keys"+i);
			System.out.println(" values: "+tm.get(i));
		}

	}

}
