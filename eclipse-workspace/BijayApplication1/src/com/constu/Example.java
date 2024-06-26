package com.constu;

public class Example {
	int id;
	String name,city;
	
	Example(int user_id,String user_name,String user_city){
		id = user_id;
		name = user_name;
		city = user_city;
		System.out.println(id);
		System.out.println(name);
		System.out.println(city);
	}
	Example(String user_name,int user_id,String user_city){
		System.out.println(user_id);
		System.out.println(user_name);
		System.out.println(user_city);
		id= user_id;
		name= user_name;
		city = user_city;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example example = new Example(2,"Bijay","Pune");
		System.out.println();
		Example example1 = new Example(2,"Ankush","Pune");

	}

}
