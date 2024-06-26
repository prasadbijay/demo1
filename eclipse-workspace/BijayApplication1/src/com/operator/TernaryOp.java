package com.operator;
import java.util.Scanner;
public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two value: ");
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int num2=(num>num1)?num:num1;
		System.out.println(num2);
		
		

	}

}
