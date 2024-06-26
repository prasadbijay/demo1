package com.exceptionhandling;

public class ExceptionDemoHanding {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//			int ar[]=new int[5];
//			 ar[10]=30;
//			
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("finally Block");
//		}
//		System.out.println("rest of the code");
//
//	}
//}

try {
	int ar[]=new int[5];
	 ar[1]=30/0;
	
}
catch(Exception e) {
	System.out.println(e);
}
finally {
	System.out.println("finally Block");
}
System.out.println("rest of the code");

}

}