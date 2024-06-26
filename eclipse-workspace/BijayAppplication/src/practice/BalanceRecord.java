package practice;

public class BalanceRecord {
	private int balance=10000;
	public int getbalance() {
		System.out.println(" before withdrawal your balance is :"+balance);
		return balance;
	}
	public int withdrawMoney(int amount) {
		balance=balance-amount;
		return balance;
	}
	


}
