package com.thread;
import java.util.Scanner;

public class AcountDetials implements Runnable {
	Acount account=new Acount();
	Scanner sc=new Scanner(System.in);

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			System.out.println(" Enter your amount to withdraw");
			int amt1=sc.nextInt();
			makeWithdrawal(amt1);
			if(account.getbalance()<=0)
				System.out.println("account is overdwarn: ");
			};
		}
		
	
	private void makeWithdrawal(int amt) {
//		System.out.println(" Enter your amount to withdraw");
//		int amt1=sc.nextInt();
		if(account.getbalance()>=amt) {
			System.out.println(Thread.currentThread().getName()+"is going to withdraw: ");
			
		}
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			
		}
		int bal=account.withdraw(amt);
			System.out.println(Thread.currentThread().getName()+"complete the withdraw: "+bal);
		
	}

	}

	


