package com.control;

public class ExpNesIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 90;
		
		if(a>=70 && a<=80) {
			System.out.println("C grade Pass: ");
		}
		else if(a>=80 && a<=90) {
			System.out.println("Congratulation B grade: "); 
			
		}
		else if(a>90 && a<=100) {
			System.out.println("Congratulation A grade: ");
		}
		
		else  {
			System.out.println("You are fail ");
		}
		

	}

}
