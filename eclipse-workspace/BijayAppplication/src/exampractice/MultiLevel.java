package exampractice;
class Base1{
	public int meth(int a,int b) {
		return a*b;
	}
}
class Derived1 extends Base1{
	public int ther(int a,int b) {
		return a%b;
	}
}
class Derived2 extends Derived1{
	public int am(int a,int b) {
		return a+b;
	}
}

public class MultiLevel extends Derived2{
	public int om(int a,int b) {
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultiLevel m1=new  MultiLevel();
		 System.out.println(" this is base class: "+m1.meth(334, 3490));
		 System.out.println(" this is am class: "+m1.am(334, 3490));
		 System.out.println(" this is om class: "+m1.om(334, 3490));
		 System.out.println(" this is ther class: "+m1.ther(334, 3490));

	}

}
