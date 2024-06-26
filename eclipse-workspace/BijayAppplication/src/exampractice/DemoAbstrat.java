package exampractice;
abstract class Bank{
	abstract float rateImtrest();
}
class DDI extends Bank{
		float rateImtrest() {
			return 2.3f;
		}
		}
class Icic extends Bank {
	float rateImtrest() {
		return 2.9f;
	}
}

public class DemoAbstrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b= new DDI();
		System.out.println(b.rateImtrest());
		
		Bank b1= new Icic();
		System.out.println(b1.rateImtrest());

	}

}
