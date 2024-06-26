package practice;
import java.util.Scanner;

public class SecondProcess implements Runnable{
	BalanceRecord ac=new  BalanceRecord ();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter your amount");
		 int a=sc.nextInt();
		for(int i=1;i<=1;i++) {
			second(a);
//			if(ac.getbalance()<=0) {
//				System.out.println(" insaficient balane: ");
//			}
			};
		
	}
	public void second(int amt) {
		if(ac.getbalance()>=amt) {
			System.out.println(Thread.currentThread().getName()+" you can withdraw money: ");
		}
		try {
			Thread.sleep(1);
		}
		catch(InterruptedException e) {
			
		}
		int bal=ac.withdrawMoney(amt);
		System.out.println(Thread.currentThread().getName()+" your remaining account balance: "+bal);
	}

}
