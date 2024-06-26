package multitheading;

public class Account3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 acc=new Account2();
		Thread th=new Thread(acc);
		th.setName("Bijay");
		th.start();

	}

}
