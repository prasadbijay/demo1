package com.collectionArraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmployeeList {
	public List <EmployeeRef> getemp(){
		List<EmployeeRef> li=new ArrayList<EmployeeRef>();
		li.addAll((Collection<? extends EmployeeRef>) new Employee( 20,"ram","desmukh"));
		li.addAll((Collection<? extends EmployeeRef>) new Employee( 21,"sam","desmukh"));
		return li;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
