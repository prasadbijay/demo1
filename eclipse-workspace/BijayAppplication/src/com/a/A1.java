package com.a;

public class A1 implements Comparable<A1>{
	
	private String name;
	private String emailID;
	private long salary;
	private long phoneNumber;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	public A1(String name, String emailID, long salary, long phoneNumber) {
		super();
		this.name = name;
		this.emailID = emailID;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int compareTo(A1 o) {
		// TODO Auto-generated method stub
		if(this.salary != o.salary) {
			return Long.compare(o.salary,this.salary);
		}
		return this.name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		System.out.println("\t\t\"Employee detials\"\n".toUpperCase());
		return " [Name=" + name.toUpperCase() + "\n EmailId=" + emailID + "\n Salary=" + salary + "\n PhoneNumber=" + phoneNumber
				+ "]\t";
	}
	

}
