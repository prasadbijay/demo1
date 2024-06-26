package com.thread;

public class TreadDemo22 extends Thread{
	public void run(){
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreadDemo22 ob=new  TreadDemo22();
		 TreadDemo22 ob2=new  TreadDemo22();
		 ob.start();
		 ob2.start();

	}

}
