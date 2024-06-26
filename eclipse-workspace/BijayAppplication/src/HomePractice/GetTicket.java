package HomePractice;

public class GetTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuyTicket bt=new BuyTicket();
		Thread t1=new Thread(bt);
		t1.setName("sohan");
		t1.start();

	}

}
