package mypakage;
import java.util.Scanner;
public class Switching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" First options is for Multiple: ");
		System.out.println(" Second options is for devide");
		System.out.println(" Third and Last Options is for Module: ");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your choice  to be Search: ");
		int str = sc.nextInt();
		switch(str){
		case 1:
			System.out.println(" Enter your first number to multiple: ");
			float num=sc.nextFloat();
			System.out.println(" Enter your second number to multiple: ");
			float num2=sc.nextFloat();
			float num3=num*num2;
			System.out.println(" Your answer is: "+num3);
			break;
			
			
		case 2:
			System.out.println(" Enter your first number to devide: ");
			float no=sc.nextFloat();
			System.out.println(" Enter your second number to devide: ");
			float n02=sc.nextFloat();
			float n03=no/n02;
			System.out.println(" Your answer is: "+n03);
			break;
			
			
		case 3:
			System.out.println(" Enter your first number to module: ");
			float n1=sc.nextFloat();
			System.out.println(" Enter your second number to module: ");
			float n2=sc.nextFloat();
			float n3=n1%n2;
			System.out.println(" Your answer is: "+n3);
			sc.close();
			break;
		}

	}

}
