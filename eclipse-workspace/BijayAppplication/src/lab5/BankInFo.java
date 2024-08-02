package lab5;
import java.util.Scanner;

class InsufficientFundsexception extends Exception{
	InsufficientFundsexception(String message){
	super(message);
	}
}
class NegativeAmountException extends Exception{
	NegativeAmountException(String message){
		super(message);
	}
}

class BankAccount {
	private int balance=20000;
	
	public BankAccount(int realBalance) {
		super();
		this.balance =realBalance;
	}
	public int getThebalance() {
		return balance;
		
	}

	public void deposit(int amount) throws NegativeAmountException{
	 
		if(balance < 0) {
			throw new 	
			NegativeAmountException(" Bank do not take take less than 1 rupee: ".toUpperCase());
		}
		balance+=amount;
		System.out.println(balance);
	}
	
	public void withdraw(int withdrawAmount) throws InsufficientFundsexception, NegativeAmountException {
		if(balance <0) {
			throw new 
			NegativeAmountException("bank donot allow you to take all money: ".toUpperCase());
		}
		else if(withdrawAmount>balance) {
			throw new 	InsufficientFundsexception(" insufficient amount: ");
		}
		balance-=withdrawAmount;
		System.out.println(balance);
	}

}

public class BankInFo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			BankAccount ac =new BankAccount(10000);
			System.out.println("the amoun have: "+ac.getThebalance());
			ac.deposit(3000);
			System.out.println(" the amount deposit after that: "+ac.getThebalance());
			
			ac.withdraw(30);
			System.out.println(" after withdraw "+ac.getThebalance());
			
			ac.deposit(-100);
		}
			catch(InsufficientFundsexception | NegativeAmountException e) {
				System.err.println("Error: "+e.getMessage());
				
			}


	}

}

