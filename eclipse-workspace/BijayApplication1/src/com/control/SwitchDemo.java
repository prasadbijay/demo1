package com.control;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		OperatingINSwitch op = new OperatingINSwitch();
		System.out.println("1.Add \t 2.Sub \t 3.Mul \t 4.Div \t .5 mod");
		System.out.println("Enter 2 number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter you choise: ");
		int choise =sc.nextInt() ;
		switch(choise) {
		case 1:
			System.out.println("Add: "+op.add(a,b));
			break;
			
		case 2:
			System.out.println("Sub: "+op.sub(a,b));
			break;
			
		case 3:
			System.out.println("Mul: "+op.mul(a,b));
			break;
			
		case 4:
			System.out.println("Div: "+op.div(a,b));
			break;
			
		case 5:
			System.out.println("Mod: "+op.mod(a,b));
		
		default:
			System.out.println("Enter vaild choise!!!");
	
			
		}
		sc.close();
	}

}
