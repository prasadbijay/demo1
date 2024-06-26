package com.collectionHashSet;

import java.util.HashSet;

public class HashSetDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs1= new HashSet<Integer> ();
		hs1.add(20);
		hs1.add(10);
		hs1.add(15);
		for(int i:hs1) {
			System.out.println("object : "+i);
		}

	}

}
