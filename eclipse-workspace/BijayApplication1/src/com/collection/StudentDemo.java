package com.collection;

public class StudentDemo {
	int S_id;
	int S_fees;
	String S_name;
	public StudentDemo(int s_id, int s_fees, String s_name) {
		super();
	    this.S_id = s_id;
		this.S_fees = s_fees;
		this.S_name = s_name;
	}
	@Override
	public String toString() {
		return "StudentDemo [S_id=" + S_id + ", S_fees=" + S_fees + ", S_name=" + S_name + "]";
	}
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public int getS_fees() {
		return S_fees;
	}
	public int setS_fees(int s_fees) {
		return S_fees = s_fees;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}

}
