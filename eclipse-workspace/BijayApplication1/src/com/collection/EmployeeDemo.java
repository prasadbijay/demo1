package com.collection;
public class EmployeeDemo implements Comparable<EmployeeDemo>{
	int id;
	String name;
	int salary;
	public EmployeeDemo(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDemo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(EmployeeDemo oth) {
		// TODO Auto-generated method stub
		if(salary==oth.salary) {
			return 0;
		}
		else if(salary > oth.salary) {
		return 1;}
		else {
			return -1;
		}
	}

}
