package com.serialization;

import java.io.Serializable;

public class StudentInfo implements Serializable{
	String name;
	transient int rid;
	static int acma;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
