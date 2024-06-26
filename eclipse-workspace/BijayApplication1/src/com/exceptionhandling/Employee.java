package com.exceptionhandling;

public class Employee {
	private int age;
	private int id;
	private String name;
	private static int nextid=1;
	public Employee(int age,String name ){
		this.name=name;
		this.age=age;
		this.id=nextid++;
	}
	public void show() {
		System.out.println("emp_name:= "+name+"emp_age:="+age+"emp_id:="+id);
	}
	public void showNextid() {
		System.out.println("employee next id will be: "+nextid); 
	}
	protected void finalize() {
		int nextid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(20,"ram");
		Employee e1=new Employee(30,"rahul");
		Employee e2=new Employee(17,"tom");
		Employee e3=new Employee(22,"sam");
		e.show();
		e1.show();
		e2.show();
		e3.show();
		e.showNextid();
		e1.showNextid();
		e2.showNextid();
		e3.showNextid();
		{
			Employee  x=new Employee(33,"arjun");
			Employee  y=new Employee(40,"kalki");
			x.show();
			y.show();
			x.showNextid();
			y.showNextid();
			x=y=null;
			System.gc();
			System.runFinalization();
		}
		e.showNextid();

	}

}
