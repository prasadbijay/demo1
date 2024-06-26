package com.operator;
import java.util.Scanner;
public class kuch {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		String na="tiger";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you good name: ");
		String name = sc.nextLine();
		if(na.equals(name)) {
			System.out.println("tiger is animal: "+name);
		}
		else {
			System.out.println("your name is: "+name);
			sc.close();
			
		}
		
	}

}
