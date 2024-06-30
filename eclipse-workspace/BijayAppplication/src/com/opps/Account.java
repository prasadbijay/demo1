package com.opps;

import java.util.Scanner;

public class Account {
	Scanner sc= new Scanner (System.in);
	int accountNumber = 1034592432;
	float balance = 40000;
	
	
	void deposit() {
		System.out.println(" Enter your Account Number: ");
		int ac=sc.nextInt();
		if (ac!=accountNumber) {
			System.out.println(" wrong Account Number: ");
		}
		else if( ac==accountNumber) {
		System.out.println(" Enter the balance to be Enter: ");
		float bal=sc.nextFloat();
		float balance1=balance+bal;
		System.out.println("Your Current Balance"+balance1);
		}
		
		
		else {
			System.out.println("ops...");
		}
		

		
	}
	
	void withdraw() {
		System.out.println(" Enter amount to withdraw: ");
		float wd=sc.nextFloat();
		if(wd<=balance) {
		float availbalance=balance-wd;
		System.out.println(" "+availbalance);
		}
		else {
			System.out.println(" please enter valid Amount");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bc= new Scanner (System.in);
		Account ac=new Account();
		System.out.println("NO 1= DEPOSITE and No 2=WITHDRAW ");
		System.out.println(" Enter you want: ");
		int a=bc.nextInt();
		switch(a) {
		case 1:
			ac.deposit();
			break;
		case 2:
			ac.withdraw();
			break;
		}
		bc.close();

	}
	

}
