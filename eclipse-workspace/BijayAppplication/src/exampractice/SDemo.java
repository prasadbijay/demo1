package exampractice;

import java.util.Scanner;

public class SDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch s1=new Switch();
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter your option : ");
		int a=sc.nextInt();
		switch(a){
		case 1:System.out.println( "enter your two values: ");
		int c=sc.nextInt();
		int d=sc.nextInt();
		int Add=s1.add(c,d);
		System.out.println(Add);
		break;
		
		case 2:System.out.println( "enter your two values: ");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int Sub=s1.sub(a1,b1);
		System.out.println(Sub);
		break;
		
		case 3:System.out.println( "enter your two values: ");
		int c1=sc.nextInt();
		int d1=sc.nextInt();
		int Multi=s1.multi(c1,d1);
	
		System.out.println(Multi);
		break;
		
		case 4:System.out.println( "enter your two values: ");
		int l=sc.nextInt();
		int m=sc.nextInt();
		int divid=s1.divid(l,m);
		System.out.println(divid);
		break;	
		}

	}

}
