package com.collectionQueue;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.offer(12);
		q.offer(11);
		q.offer(10);
		q.offer(18);
		int num=q.peek();
		System.out.println("peek number:"+num);
		int removenum=q.poll();
		System.out.println("remove elments:"+removenum);
		System.out.println("update Queue:"+q);

	}

}
