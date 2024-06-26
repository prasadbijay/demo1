package com.thread;

public class ThreadMultiDemo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThreadMultiDemo d=new  ThreadMultiDemo();
		 System.out.println(d.getId());
		 System.out.println(d.getName());
		 System.out.println(d.getPriority());
		 System.out.println(d.getState());

	}

}
