package practicejava;
import java.util.Scanner;

public class PetrenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string: ");
		int str=sc.nextInt();
		for(int i=str;i>=1;i--) {
			for(int j=i;j<=str;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}

	}

}
