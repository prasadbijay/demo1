package com.demo;

public class Employee {
	
	String employeeName ;
	int employeeId ;
	
		void display( String name, int eid) {
		this.employeeName=name;
		this.employeeId=eid;
		System.out.println(employeeName+" "+employeeId);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee [] emp=new Employee[5];
		for(int i=0;i<emp.length;i++) {
			emp[i]= new Employee();
		}
	    
	    
	    emp[0].display("Bijay",101);
	    emp[1].display("Ankus",102);
	    emp[2].display("Ajay",103);
	    emp[3].display("Arjun",104);
	    emp[4].display("Sajay",104);

	}

}
