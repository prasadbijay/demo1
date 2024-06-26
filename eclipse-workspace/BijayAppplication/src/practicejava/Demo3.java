package practicejava;
import java.util.Scanner;
class Triangle{
	void sum() {
		int num=15;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your value: ");
		int are=sc.nextInt();
		are=are+num;
		System.out.println("Your value After Addition: "+are);
	}
}

public class Demo3 extends Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 s1=new Demo3();
		s1.sum();

	
	
		

	}

}
