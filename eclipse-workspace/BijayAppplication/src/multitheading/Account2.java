package multitheading;

import java.util.Scanner;

public class Account2 implements Runnable {
	
	Account1 ac=new  Account1();
	Scanner sc=new Scanner(System.in);

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++) {
			System.out.println("Enter your Withdrawal amounts: ");
			float amount=sc.nextFloat();
			makeMyWithdraw(amount);
			if(ac.getbalance() <=0)
				System.out.println(" account is overdrown");
		};
		
	}
	public  void makeMyWithdraw (float amount) {
		if(ac.getbalance()>=amount) {
			System.out.println(Thread.currentThread().getName()+ "  is going to withdraw: ");
		}
	try {
		Thread.sleep(100);
	  }
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	float bal=ac.withdraw(amount);
	System.out.println(" processing.... please wait: "+ "\n  compeleted.  Remaining balance is:  "+bal);
	
		
		
	}

}
