package com.collection;
import java.util.ArrayList;
import java.util.Collections;

public class StudentDataInsert{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <StudentDemo> ll=new ArrayList<StudentDemo>();
		ll.add(new StudentDemo(1,2000000,"ram"));
		ll.add(new StudentDemo(2,3000000,"sam"));
		ll.add(new StudentDemo(3,2500000,"om"));
		ll.add(new StudentDemo(4,2600000,"addi"));
		Collections.sort(ll,new StudentTest());
		for(StudentDemo a:ll) {
			System.out.println(" display:"+a);
		}

	}

}
