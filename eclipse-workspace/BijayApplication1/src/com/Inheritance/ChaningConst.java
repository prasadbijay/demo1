package com.Inheritance;
class Parent{
	Parent(){
		System.out.println("This is Defual const.of Parent");
	}
	Parent(int a,int b){
		this("hi","hello");
		System.out.println("This is int const.of Parent");
	}
	Parent(String a1,String b2){
		this();
		System.out.println("This is String const.of Parent");
	}
}
class Child extends Parent{
	Child(){
		this(10);
		System.out.println("This is defult const of Child:");
	}
	Child(int a){
		this("hi"); 
		System.out.println("This is int const of Child:");
	}
	Child(String str){
		super(20,30);
		System.out.println("This is String const of Child:");
	}
}
public class ChaningConst {
	public static void main(String[] args) {
		Child ch = new Child();
	
		
	}
}
