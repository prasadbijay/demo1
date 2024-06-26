package com.collectionQueue;
import java.util.ArrayDeque;
import java.util.Queue;
public class QueueDemoArrayQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1=new ArrayDeque<Integer>();
		q1.offer(20);
		q1.offer(22);
		q1.offer(12);
		q1.offer(2);
		q1.offer(10);
		q1.offer(30);
		q1.offer(60);
		System.out.println("Before any update: "+q1);
		int accessNumber = q1.peek();
		System.out.println(" your first queue is: "+accessNumber+"\n");
		int delete = q1.poll();
		System.out.println(" deleting one queue: "+delete+"\n");
		System.out.println(" After Updated Queue: "+q1);
	}

}
