package com.collectionArraylist;

public class Employee {
	private int id;
	private String ename;
	private String esalary;

	public Employee(int id, String ename, String esalary) {
		super();
		this.id = id;
		this.ename = ename;
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsalary() {
		return esalary;
	}

	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}

}
