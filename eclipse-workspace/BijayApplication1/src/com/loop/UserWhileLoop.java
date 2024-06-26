package com.loop;
import java.util.Scanner;
public class UserWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(number+"*"+i+"="+(number*i));
			i++;
		}
	}

}
