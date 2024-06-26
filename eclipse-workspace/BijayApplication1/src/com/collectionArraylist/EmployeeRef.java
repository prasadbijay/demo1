package com.collectionArraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;
 class EmployeeRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String > list= new ArrayList<String>();
		for(int i=0;i<=5;i++) {
			System.out.println("only five(5) number can enter: ");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your number: ");
		    String li=sc.next();
		}
		Iterator <String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
