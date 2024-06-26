package practicejava;
class Base33{
	void methodfun() {
		System.out.println("This is base class: ");
	

	}
}
class Base4 extends Base33{
	void met() {
		System.out.println("This is second base class: ");
	}
}

public class Base3 extends Base4 {
	void sam() {
		System.out.println("this is mine devired class: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base3 ne=new Base3();
		ne.methodfun();
		ne.met();
		ne.sam();

	}

}
