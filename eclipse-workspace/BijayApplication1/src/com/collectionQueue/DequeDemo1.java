package com.collectionQueue;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> dq=new LinkedList<Integer>();
		dq.offer(2);
		dq.offer(3);
		dq.offer(21);
		dq.offer(30);
		dq.offerLast(13);
		dq.offerFirst(10);
		System.out.println("before any Operation:"+dq);
		int n1=dq.peekLast();
		System.out.println("last queue:"+n1);
		int n2=dq.pollFirst();
		System.out.println("deleted first que:"+n2);
		int n3=dq.pollLast();
		System.out.println("deleted Last que:"+n3);
		System.out.println("afterUpdate:"+dq);

	}

}
