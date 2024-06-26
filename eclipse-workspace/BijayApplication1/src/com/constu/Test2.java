package com.constu;

public class Test2 {
	int id;
	String name,city;
	
	Test2(int user_id,String user_name,String user_city){
		id = user_id;
		name = user_name;
		city = user_city;
		System.out.println("id>>"+id);
		System.out.println("user_name>>"+name);
		System.out.println("user_city"+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test2 = new Test2(2,"Arjun","Pune");

	}

}
