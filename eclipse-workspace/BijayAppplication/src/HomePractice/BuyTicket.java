package HomePractice;

public class BuyTicket implements Runnable {
	Tatkal tc=new Tatkal();

	@Override
	public void run() {
		for(int i=0;i<25;i++) {
			makeTicket(1);
			if(tc.buyTicket(i)>=0) {
			System.out.println(" Ticket Ended: ");
			}
		};
		
	}
	private void makeTicket(int number) {
		if(tc.getTicket(number)>=number) {
			System.out.println(Thread.currentThread().getName() +" is going for a ticket: ");
		}
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		int remaining_tic=tc.buyTicket(number);
		System.out.println(Thread.currentThread().getName() +" completed: "+remaining_tic);
	}

}
