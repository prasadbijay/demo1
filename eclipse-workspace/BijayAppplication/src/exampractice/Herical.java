package exampractice;
class D2{
	public void meth() {
		System.out.println(" this is base class: ");
	}
}
class D3 extends D2{
	public void view() {
		System.out.println(" this is derived class 1: ");
	}
}
class D4 extends D2{
	public void app() {
		System.out.println(" this is derived  class 2: ");
	}
}
class D5 extends D3{
	public void t1() {
	System.out.println(" this is last derived class: ");
	}
}
public class Herical extends D5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D5 o=new D5();
		o.view();
		o.meth();
		o.t1();
		D4 ob=new D4();
		ob.app();

	}

}
