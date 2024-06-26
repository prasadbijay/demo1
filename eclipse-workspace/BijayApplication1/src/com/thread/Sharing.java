package com.thread;
class RecourseSharing{
	private boolean isData=false;
	public synchronized void produce() {
		while(isData) {
		try {
			wait();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		}
		System.out.println("produced your data: ");
		isData=true;
		notify();
	}
	public synchronized void consume(){
		while(isData) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("your data is consuming  : ");
		isData=false;
		notify();
	}
	
}
class P1 extends Thread{
	private  RecourseSharing r1;
	public P1( RecourseSharing r1) {
	this. r1=r1;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			r1.produce();
		}
	}
	
}
class C1 extends Thread{
	private RecourseSharing r1;
	public C1(RecourseSharing r1) {
		this.r1=r1;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			r1.consume();
		}
}}

public class Sharing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecourseSharing r2=new RecourseSharing();
		P1 pro=new P1(r2);
		C1 cn=new C1(r2);
		//P1 pro=new P1(r2);
		pro.start();
		cn.start();

	}

}
