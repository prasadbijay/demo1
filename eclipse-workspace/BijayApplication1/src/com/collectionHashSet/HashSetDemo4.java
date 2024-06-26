package com.collectionHashSet;

import java.util.HashSet;

public class HashSetDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(2);
		hs.add(10);
		hs.add(90);
		hs.add(20);
		hs.add(1);
		for(Object s:hs)
		{
		System.out.println(s);
		}
	}

}
