package com.Inheritance;

class Person{
	private String first_name;
	private String last_name;
	public Person(String last_name,String first_name) {
		this.first_name=first_name;
		this.last_name=last_name;
	}
	String getFirstname() {
		return first_name;
	}
	String getLastName() {
		return last_name;
	}
}
class Employee extends Person{
	private int id;
	private String jobtitle;
	public Employee(String first_name,String last_name,int id, String jobtitle) {
		super(first_name,last_name);
		this.id=id;
		this.jobtitle=jobtitle;
	}
	public int id() {
		return id;
	}
	public String getLastName() {
		return super.getLastName()+", "+jobtitle;
	}
	
}
public class PraExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Bijay","prasad",1,"Developer");
		System.out.println(emp1.getFirstname()+" "+emp1.getLastName()+" ("+emp1.id()+")");
		
		Employee emp2 = new Employee("Ankush","Mishra",2,"Developer");
		System.out.println(emp2.getFirstname()+" "+emp2.getLastName()+" ("+emp2.id()+")");
		
		
		
	}

}
