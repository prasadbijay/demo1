package com.prac;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Students please enter your Roll-No: ");
		int rno=sc.nextInt();
		String group=(rno%4==2)? " You are in Diamond Group ":(rno%4==1)?
				"You are in Peral Group: ":
			(rno%4==0)?" You are in Sapphire Group: ":"You are in Ruby Group:";
		
		System.out.println(group);

	}

}
