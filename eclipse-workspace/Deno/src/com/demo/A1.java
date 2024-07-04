package com.demo;
/* a program called book with properties title and author 
 * providing default constructor */

import java.util.Scanner;

public class A1 {
	String title="";
	String author="";
	
	A1(String title,String authorName){
		this.title=title;
		this.author = authorName;
		System.out.println(" the detials of the book");
		
		System.out.println(" Title: "+title.toUpperCase());
		System.out.println(" author: "+author.toUpperCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your title: ");
		String title=sc.nextLine();
		System.out.println(" Enter your Name: ");
		String author=sc.nextLine();
		A1 a=new A1(title,author);
		
		

	}

}
