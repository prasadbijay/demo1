package mypakage;
import java.util.Scanner;
public class PrimeNumber {
	public static boolean prime(int n) {
		System.out.println(" 		checking: ");
		if (n<=1) {
			return false;
		}
		if(n<=3) {
			return true;
		}
		if (n %2==0 || n %3==0) {
			return false;
		}
		int i=5;
		while(i*i<=0) {
			if(n%i==0 || n%(i+2)==0) {
				return false;
			}
			i+=6;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your Number to check whether number is prime or not: ");
		int data=sc.nextInt();
		if (prime (data)) {
			System.out.println(" Your Prime Numbers are: "+data);
		}
		else {
			System.out.println(" This are not Prime Numbers: "+data);
		}

	}

}
