package practice;
class D1{
	public D1() {
		this(2,5);
		System.out.println("your are on default 1 parent method: ");
	}
//	public D1(int a) {
//		System.out.println("you are on single integer type consturctor: ");
//	}
	public D1(int a,int b) {
		this("mxsx","ccc");
		System.out.println("you are on Double integer 2 parent consturctor: ");
	}
//	public D1(int c, float b) {
//		System.out.println("you are on single integer type consturctor: ");
//	}
//	public D1(float a,float b) {
//		this();
//		System.out.println("you are on single integer 6 type consturctor: ");
//	}
	public D1(String a,String b) {
//		this();
		System.out.println("you are on double String 3  parent  consturctor: ");
	}
}
class B1 extends D1{
	public B1() {
		System.out.println("your are on default 1 child method: ");
	}
	public B1(int a) {
		this("hi");
		System.out.println("you are on single integer 2 child type consturctor: ");
	}
	public B1(String a) {
		this(3.5f);
		System.out.println("you are on single String 3 child type consturctor: ");
	}
	public B1( float b) {
		this();
		System.out.println("you are on single Float 4 child type consturctor: ");
	}
//	public B1(float a,float b) {
//		this(20,30);
//		System.out.println("you are on single integer type consturctor: ");
//	}
//	public B1(String a,String b) {
//		this();
//		
//		System.out.println("you are on single integer type consturctor: ");
//	}
	
}

public class Demo {
	public static void main(String[]args) {
		B1 ne=new B1(20);
		
	}

}
