package p1;
//print hello world in several different way ?

public class DemoA {
	public void m1() {
		System.out.println(" Hello  world //with the the help of Method: ");	
	}
	DemoA(){
		System.out.println(" Hello World // with the help of construction : ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Wellcome, Hello World // directly printed: ");
		
	DemoA a=new DemoA();
	a.m1();

	}

}
