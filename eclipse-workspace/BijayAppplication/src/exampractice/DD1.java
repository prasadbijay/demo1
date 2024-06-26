package exampractice;
class D1{
	public void Meth() {
		System.out.println(" this is simple deived class: ");
	}
}

public class DD1 extends D1{
	public int calculation (int a,int b) {
		int c=a*b;
		int d=c/20;
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DD1 ob=  new DD1();{
			ob.Meth();
			//ob.calculation(200,500);
			int c=ob.calculation(200,500);
			System.out.println(" after calculate: "+c);
		}

	}

}
