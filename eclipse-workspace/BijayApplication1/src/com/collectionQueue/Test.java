package com.collectionQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<CompareEmployee> cm=new ArrayDeque<CompareEmployee>();
		cm.offer(new CompareEmployee(1,293323,"demo:"));
		cm.offer(new CompareEmployee(32,13323,"xyz:"));
		cm.offer(new CompareEmployee(10,93323,"ankush:"));
		cm.offer(new CompareEmployee(13,653323,"isha:"));
		
		Deque<CompareEmployee> cm1=new ArrayDeque<CompareEmployee>();
		cm1.offer(new CompareEmployee(1,21193323,"demo1:"));
		System.out.println(cm1+" "+cm);
//		for(CompareEmployee a:cm) {
//			System.out.println(" your employee Detials: "+a);
//		}

	}

}
