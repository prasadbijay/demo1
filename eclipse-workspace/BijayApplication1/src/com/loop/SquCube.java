package com.loop;
import java.util.Scanner;
public class SquCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		int num1=0,ans = 0;
		for(int i=1;i<=num;i++) {
			ans=num*num*num;
			num1=num*num;
			
			
		}
		System.out.println("Cube of given number: "+ans);
		System.out.println("Squ of given number: "+num1);
		
				
	}

}
