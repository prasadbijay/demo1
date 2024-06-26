package p1;

public class AnonmoysInnerClass {
	interface Demo {
		void a1();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo a=new Demo() {

			@Override
			public void a1() {
				// TODO Auto-generated method stub
			System.out.println(" hello world: ");	
			}
			
		};
		a.a1();

	}

}
