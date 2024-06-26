package practicejava;
import java.util.Scanner;

public class Demo1java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your value: ");
		int na=sc.nextInt();
		if(na>=40 && na<50) {
			System.out.println("He/She is pass and percent is: "+na);
		}
		else if(na>50 && na<=70) {
			System.out.println("He/She is pass with first division and percent is: "+na);
		
       }
		else if(na>70 && na<=100) {
			System.out.println("He/She is pass with STAR marks and percent is: "+na);
		
}		else if(na<40) {
	        System.out.println("He/She is fail better luck next time and percent is: "+na);
	
}
	}

}
