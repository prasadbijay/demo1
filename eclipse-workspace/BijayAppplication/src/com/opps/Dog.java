package com.opps;

import java.util.Scanner;

public class Dog {
	String name;
	String breed;
	int age;
	
	Dog(String n, String b ){
		
		System.out.println(this.name=n);
		System.out.println(this.breed=b);
	}
   Dog(String x, String y ,int z){
		
		System.out.println(this.name=x);
		System.out.println(this.breed=y);
		System.out.println(this.age=z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dog name: ");
		String name=sc.next();
		System.out.println(" Enter dog breed: ");
		String breed=sc.next();
		System.out.println(" enter dog age: ");
		int age=sc.nextInt();
		Dog d=new Dog(name,breed);
		
		Dog d1=new Dog(name,breed,age);

	}

}
