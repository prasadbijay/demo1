package com.loop;

public class FibboSer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=0;
		
		int no2=1;
		for(int i=0;i<=10;i++) {
			System.out.println(no1+" ");
			int next = no1 +no2;
			no1=no2;
			no2=next;
			
		}

	}

}
