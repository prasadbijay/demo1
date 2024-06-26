package com.thread;

public class FinalTicke extends LastTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalTicke tc1=new FinalTicke();
		Thread thread =new Thread(tc1);
		Thread thread1 =new Thread(tc1);
		thread.setName("jevan ");
		thread1.setName("sohan ");
		thread.start();
		thread1.start();


	}

}
