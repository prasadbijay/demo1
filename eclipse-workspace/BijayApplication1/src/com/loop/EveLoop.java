package com.loop;
import java.util.Scanner;
public class EveLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number=sc.nextInt();
		while(number<=50)
		{
			if(number%2==0) {
				System.out.println(number+" the number even");
				
			}
			else {
				System.out.println(number+" the number is odd");
			}
			
			number++;
			
			
		}
	}

}
