package com.opps;


public class Person {
	int age ;
	String name , gender;
	public Person(int a,String n,String g) {
		this.age=a;
		this.name=n;
		this.gender=g;
	}
	public void introduction() {
		System.out.println(" person name: "+name);
		System.out.println(" person age: "+age);
		System.out.println(" person gender: "+gender);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person(20,"rahul.","male.");
		p.introduction();

	}

}
