package com.collectionQueue;

public class CompareEmployee implements Comparable< CompareEmployee>{
	int id;
	int salary;
	String Name;
	public CompareEmployee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.Name = name;
	}
	@Override
	public String toString() {
		return "CompareEmployee [id=" + id + ", salary=" + salary + ", Name=" + Name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public int compareTo(CompareEmployee o) {
		// TODO Auto-generated method stub
		if(o.salary==o.salary) {
			return 0;
		}
		else if(o.salary > o.salary) {
			return 1;
		}
		else {
		return -1;}
	}

}
