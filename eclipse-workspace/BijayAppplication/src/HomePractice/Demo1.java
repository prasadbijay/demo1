package HomePractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Demo> tm=new ArrayList<Demo>();
		tm.add(new Demo(1,250000,"abc",934545324));
		tm.add(new Demo(1,200000,"xyz",732403290));
		tm.add(new Demo(2,220000,"lmn",811240329));
		for(Object s: tm) {
			System.out.println(s);
		}
		Iterator<Demo> its=tm.iterator();
		while(its.hasNext()) {
			System.out.println(" second way to prnt: "+its.next());
		}
		System.out.println("Simple way to print: "+tm);

	}

}
