package multitheading;

public class Account1 {
	private float balance = 10000000;
	public Float getbalance () {
		return balance;
	}
	public float withdraw (float amount) {
		balance=balance-amount;
		return balance;
				
	}

}
