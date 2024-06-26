package com.collectionArraylist;
import java.util.*;

public class ArrayListDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee emp=new Employee(20,"ram","250000");
		al.add(emp);
		al.add(new Employee(21,"dsjsd","wesc"));
		Iterator<Employee> its=al.iterator();
		while(its.hasNext()) {
			System.out.println("employee list:"+its.next());
		}
		for(Employee e:al) {
			System.out.println(e);
			
		}

	}

}
