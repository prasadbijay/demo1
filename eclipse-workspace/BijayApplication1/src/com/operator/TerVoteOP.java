package com.operator;
import java.util.Scanner;
public class TerVoteOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		String mag = (age>18)?"You can vote ":"You can't vote";
		System.out.println(mag);
		sc.close();

	}

}
