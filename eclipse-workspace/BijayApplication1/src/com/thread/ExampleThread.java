package com.thread;

import java.util.concurrent.Semaphore;

class SharedRecource {
	static Semaphore semaphore = new Semaphore(5);
	void useresource() {
		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName()+" is using the recourse: ");
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		finally {
			semaphore.release();
			System.out.println(Thread.currentThread().getName()+" relese the permit: ");
		}
	}
	

}
class Mythread extends Thread{
	private SharedRecource sema1;
	public Mythread(SharedRecource sema1) {
		this.sema1=sema1;
	}
	public void run() {
		sema1.useresource();
	}
}

public class ExampleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedRecource shar=new SharedRecource();
		for(int i=1;i<5;i++) {
			Thread t=new Mythread(shar);
			t.start();
		}

	}

}
