package com.collection;
import java.util.PriorityQueue;
import java.util.Queue;

class Demo implements Comparable<Demo>{
	private int value;

	public Demo(int value) {
		super();
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public String toString() {
		return "your demo class value:"+value;
	}
	@Override
	public int compareTo(Demo ob) {
		// TODO Auto-generated method stub
		return Integer.compare(this.value, ob.value);
	}
}

public class CustmerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Demo> d=new PriorityQueue<Demo>();
		d.add(new Demo(2000));
		d.add(new Demo(44000));
		d.add(new Demo(200));
		d.add(new Demo(1000));
		d.add(new Demo(15000));
		d.add(new Demo(99999));
		System.out.println("         The value of Elements:");
		while(!d.isEmpty()) {
			System.out.println(d.poll());
		}

	}

}
