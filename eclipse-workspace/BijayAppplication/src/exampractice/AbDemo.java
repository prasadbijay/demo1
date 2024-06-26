package exampractice;
abstract class Demo{
	abstract float rate();
}
class IDFC extends Demo{
	float rate() {
		return 3.2f;
	}
}
class SBI extends Demo{
	float rate() {
		return 2.9f;
	}
}

public class AbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Demo obj = new SBI();
		System.out.println("rate of interest in sbi bank: "+obj.rate()+"%");
		Demo obj1 =new IDFC();
		System.out.println("rate of interest in idfc bank: "+obj1.rate()+"%");

	}

}
