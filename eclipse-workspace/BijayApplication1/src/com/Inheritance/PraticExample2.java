package com.Inheritance;
class BankAccount{
	private double balance;
	private String accountNumber;
	
	public BankAccount(String accountNumber,double balance) { 
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	public double getBalance() {
		return balance;
	}
class SavingAccount extends BankAccount{
	public SavingAccount(String accountNumber,double balance) {
		super(accountNumber,balance);
	}
	public void withdraw(double amount) {
		if(getBalance()-amount < 100) {
			System.out.println("Minimum balance of 100 required!");
		}else {
			super.withdraw(amount);
		}
	}
	
	
}
		
	} class PraticExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Create a Bank Account object (A/c No. BA1234 with initial balcnce of 500:");
		BankAccount BA1234 = new BankAccount("BA1234",1000);
		
		System.out.println("Deposit 1000 into account BA1234:");
		BA1234.deposit(1000);
		
		System.out.println("New Balance after depositing 1000: "+BA1234.getBalance());
		System.out.println("Withdraw 600 from account BA1234:");
		BA1234.withdraw(600);
	}

}
