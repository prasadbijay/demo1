package multitheading;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your first number to be Calculate: ");
		float number1 =sc.nextFloat();
		System.out.println(" Enter your second number to calculate: ");
		float number2 =sc.nextFloat();
		
		
	    float result = number1*number2;
	    System.out.println(" Your calculations results is: "+result+" totals%");

	}

}
