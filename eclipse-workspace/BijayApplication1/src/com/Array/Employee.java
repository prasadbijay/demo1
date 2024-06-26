package com.Array;

public class Employee {
	Employee(String emp_name,int emp_salary,int emp_id,int emp_cno){
		String name=emp_name;
		int salary=emp_salary;
		int id=emp_id;
		long phone=emp_cno;
		System.out.println("Employee Name: "+name);
		System.out.println("Employee salary: "+salary);
		System.out.println("Employee id: "+id);
		System.out.println("Employee phone: "+phone);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=new Employee("Arjun",12000,4,848932941);
		System.out.println();
		Employee em1=new Employee("Ajay",20000,1,848932941);
		System.out.println();
		Employee em2=new Employee("Umesh",18000,2,848932941);
		System.out.println();
		Employee em3=new Employee("Sanjay",10000,5,848932941);
		System.out.println();
		Employee em4=new Employee("Vivek",14000,3,848932941);
		System.out.println();
		Employee em5=new Employee("Suraj",16000,6,848932941);


	}

}
