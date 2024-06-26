package com.thread;

public class LastTicket implements Runnable {
	BookingTicket tc=new BookingTicket();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=15;i++) {
			maketicAvailabe(1);
				if(tc.getticket(i)<=0) {
					System.out.println("ticket end: ");
				}
			};
		
	}
	private void maketicAvailabe(int tick) {
		if(tc.getticket(tick)>=tick) {
			System.out.println(Thread.currentThread().getName()+"going for a ticket: ");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				
			}
			int bal=tc.buyTicket(tick);
				System.out.println(Thread.currentThread().getName()+"complete the withdraw: "+bal);
			
		}
	}
	}


