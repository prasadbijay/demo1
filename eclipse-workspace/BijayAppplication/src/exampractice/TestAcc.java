package exampractice;

public class TestAcc implements Runnable{
	AccDemo ac=new AccDemo();
	public void run() {
		for (int i=0;i<=1;i++) {
			method1(1);
			if(ac.getbal()>=0) {
				System.out.println(" insufficient balance: ");
			};
		}
	}
	public void method1(int amt) {
		if(ac.getbal()>=amt) {
		System.out.println(Thread.currentThread().getName()+" andnwi");	
		}
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		int rem=ac.revbal(amt);
		System.out.println(Thread.currentThread().getName()+" remain: ");
	}

}
