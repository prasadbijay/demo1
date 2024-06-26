package com.collection;

import java.util.Comparator;

public class StudentTest implements Comparator<StudentDemo> {

	@Override
	public int compare(StudentDemo o, StudentDemo oo) {
		// TODO Auto-generated method stub
		return Integer.compare(o.S_fees, oo.S_fees);
		
	}

}
