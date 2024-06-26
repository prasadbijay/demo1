package com.data;

public class Employee {
	private int eid;
	private String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public int getEmployeeId() {
		return eid;
	}
	public void setEmployeeId(int eid) {
		this.eid = eid;
	}
	public String getEmployeeName() {
		return ename;
	}
	public void setEmployeeName(String ename) {
		this.ename = ename;
	}

}
