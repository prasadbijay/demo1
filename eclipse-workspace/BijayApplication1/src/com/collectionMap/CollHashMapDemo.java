package com.collectionMap;

import java.util.HashMap;
import java.util.Map;

public class CollHashMapDemo {
	HashMap<Integer,String> addEmployee(){
		HashMap<Integer, String> hm =new 	HashMap<Integer, String>();
		hm.put(1, "rohan: ");
		hm.put(2, "sohan: ");
		hm.put(3, "mohan: ");
		hm.put(4, "velocity: ");
		return hm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollHashMapDemo chm =new CollHashMapDemo();
		System.out.println("first way: "+chm.addEmployee());
		HashMap<Integer,String> ht=chm.addEmployee();
		System.out.println("second way:"+ht);
		Map<Integer,String> mp=chm.addEmployee();
		System.out.println("third way: "+mp);
		

	}

}
