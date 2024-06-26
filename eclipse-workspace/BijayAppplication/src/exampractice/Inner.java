package exampractice;
class Outer{
	private int a=10;
	class In{
		public void display() {
			System.out.println(" this is inner class with outer value: "+a);
		}
	}
}

public class Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer ob=new Outer();
		Outer.In obj=ob.new In();
		obj.display();

	}

}
