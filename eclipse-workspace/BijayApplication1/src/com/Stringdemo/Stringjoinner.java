package com.Stringdemo;

import java.util.StringJoiner;

public class Stringjoinner {
	public static void main(String[] args) {
		StringJoiner s = new StringJoiner(",");
		
		s.add("Hello");
		s.add("World");
		
		System.out.println(s.toString());
		
		
	}

}
