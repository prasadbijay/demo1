package com.forLoob;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number= {20,24,25,55,10,40};
		int max=number[0];
		int add = 0;
		for(int num:number) {
			if(num>max) {
				max=num;
				
			}
			add+=num;
		}
			System.out.println(max);
		System.out.println(add);
		



	}

}
