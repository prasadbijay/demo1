package com.thread;

public class Acount {

		private int balance=5000;
		public int getbalance() {
			return balance;
		}
		public int withdraw(int amount) {
			balance=balance-amount;
			return balance;
		}
	}

	


