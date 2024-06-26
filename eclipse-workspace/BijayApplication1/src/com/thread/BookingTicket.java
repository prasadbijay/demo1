package com.thread;

public class BookingTicket {
	private int ticket=90;
	public int getticket(int ticket){
		return ticket;
	}
	public int buyTicket(int avail_ticket) {
		ticket=ticket-avail_ticket;
		return ticket;
	}


}
