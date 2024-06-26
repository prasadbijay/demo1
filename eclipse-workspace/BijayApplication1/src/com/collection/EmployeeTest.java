package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeDemo> st=new ArrayList<EmployeeDemo>();
		st.add(new EmployeeDemo(2,"Rohit Sharma: ",12000000));
		st.add(new EmployeeDemo(1,"Hardik Pandiya: ",11000000));
		st.add(new EmployeeDemo(3,"Virat Kohli: ",13000000));
		Collections.sort(st);
		for(EmployeeDemo s:st) {
			System.out.println(s);
		}

	}

}
