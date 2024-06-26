package com.thread;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcountDetials ac=new AcountDetials();
		Thread th=new Thread(ac);
		Thread th2=new Thread(ac);
		th.setName("jevan ");
		th2.setName("sohan ");
		th.start();
		th2.start();
		

	}

}
