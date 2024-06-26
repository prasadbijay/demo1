package com.collectionMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> s=new HashMap<String,String>();
		s.put("20", "ram");
		s.put("2", "sam");
		s.put("1", "om");
		s.forEach((k,v) ->System.out.println("key: "+k+"  values: "+v));
		

	}

}
