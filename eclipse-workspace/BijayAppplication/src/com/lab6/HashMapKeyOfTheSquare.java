package com.lab6;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyOfTheSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> value=new HashMap<Integer,Integer>();
		for(int i=1;i<=15;i++) {
			value.put(i, i*i);
			//here i just multiple for loop(i) to get square of keys
		}
		value.forEach((k,v)->System.out.println("key: "+k+"\tvalue: "+v));
		//and here i printed
	}

}
