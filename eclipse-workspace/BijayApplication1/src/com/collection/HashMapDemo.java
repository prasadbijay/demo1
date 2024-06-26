package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> comput =new ArrayList<String>();
		comput.add("watch:");
		comput.add("speaker:");
		comput.add("laptop:");
		
		ArrayList<String> elect=new ArrayList<String>();
		elect.add("smartphone:");
		elect.add("iphone:");
		elect.add("samsung");
		
		ArrayList<String> furni=new ArrayList<String>();
		furni.add("sofa:");
		furni.add("bed:");
		furni.add("chair");
		
		HashMap<String,ArrayList<String>> ch=new HashMap<String,ArrayList<String>>();
		ch.put("Furniture", furni);
		ch.put("Computer", comput);
		ch.put("Electronc", elect);
		
		HashMap<String,HashMap<String,ArrayList<String>>>trr=new HashMap<String,HashMap<String,ArrayList<String>>>();
		
		trr.put("E shop", ch);
		Set<String> s=trr.keySet();
		for(String str:s) {
			System.out.println(str);
			System.out.println(trr.get(str));
		}
		

	}

}
