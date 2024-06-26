package com.thread;

public class ThreadDemoSetPriority extends Thread {
	public void run() {
		System.out.println("inside run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemoSetPriority th1=new ThreadDemoSetPriority();
		ThreadDemoSetPriority th2=new ThreadDemoSetPriority();
		ThreadDemoSetPriority th3=new ThreadDemoSetPriority();
		System.out.println("thread priority 1: "+th1.getPriority());
		System.out.println("thread priority 2: "+th2.getPriority());
		System.out.println("thread priority 3: "+th3.getPriority());
				th1.setPriority(5);
				th2.setPriority(6);
				th3.setPriority(7);
		System.out.println("thread priority"+th1.getPriority());
		System.out.println("thread priority"+th2.getPriority());
		System.out.println("thread priority"+th3.getPriority());
		System.out.println("currenty executing thread: "+Thread.currentThread().getName());
		System.out.println("main thread priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);

	}

}
