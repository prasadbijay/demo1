package com.operator;
import java.util.Scanner;
public class ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two number: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		int mod=num1%num2;
          System.out.println("Calculation\n Add="+sum+"\n -is="+sub+"\n *is="+mul+"\n /is="+div+"\n %is="+mod);
	}

}
