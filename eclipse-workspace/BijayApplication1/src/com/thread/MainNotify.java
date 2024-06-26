package com.thread;
class Notify1 extends Thread{
	public void run() {
		synchronized(this){
			System.out.println(" starting of: "+Thread.currentThread().getName());
			try {
				this.wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"..notifying: ");
		}
	}
}
class Notify2 extends Thread{
	Notify1 n1;
	Notify2(Notify1 n1){
		this.n1=n1;
	}
	public void run() {
		synchronized(this.n1) {
			System.out.println("statingof"+Thread.currentThread().getName());
			try {
				this.n1.wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"notified...:");
		}
	}
	
}
class Notify3 extends Thread{
	Notify1 n1;
	Notify3(Notify1 n1){
		this.n1=n1;
	}
	public void run() {
		synchronized(this.n1) {
			System.out.println(" starting"+Thread.currentThread().getName());
			this.n1.notifyAll();
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class MainNotify{

	public static void main(String[] args) 
	throws InterruptedException
	{
		// TODO Auto-generated method stub
		Notify1 n1=new Notify1();
		Notify2 n2=new Notify2 (n1);
		Notify3 n3=new Notify3 (n1);
		Thread th1=new Thread(n1,"Thread1 ");
		Thread th2=new Thread(n2,"Thread2 ");
		Thread th3=new Thread(n3,"Thread3 ");
		try {
			System.out.println("waiting for thread: ");
			th1.join();
			th2.join();
		}
		catch(Exception e) {
			System.out.println("thread 1 is alive"+th1.isAlive());
			System.out.println("thread 2 is alive"+th2.isAlive());
			System.out.println("thread 3 is alive"+th3.isAlive());
			
			System.out.println(" main thread existing ");
			th1.start();
			th2.start();
			Thread.sleep(100);
			th3.start();
			System.out.println("thread 2 is alive"+th2.isAlive());
			System.out.println("thread 3 is alive"+th3.isAlive());
//homework implents and extends in runnable thread

		}

	}

}
