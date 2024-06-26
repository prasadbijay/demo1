package HomePractice;

public class Tatkal {
	private int ticket = 25;
	public int getTicket(int ticket) {
		return ticket;
	}
	public int buyTicket(int avail_ticket) {
		ticket = ticket-avail_ticket;
		return ticket;
	}

}
