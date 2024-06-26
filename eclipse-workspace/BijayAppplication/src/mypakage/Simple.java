package mypakage;
import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Calculations of age: ");
		int y,m,d;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your Year of birth day: ");
		int year=sc.nextInt();
		System.out.println(" Enter your Month of birth day: ");
		int month=sc.nextInt();
		System.out.println(" Enter your Date of birth day: ");
		int date=sc.nextInt();
		
		System.out.println(" Enter Current year: ");
		int year1=sc.nextInt();
		System.out.println(" Enter Current Month: ");
		int month1=sc.nextInt();
		System.out.println(" Enter Current Date: ");
		int date1=sc.nextInt();
		
		
		y=year1-year;
		m=month1-month;
		d=date1-date;
		System.out.println(" Your Current age is: ");
		System.out.println(" Year:"+y+ "  Month: "+m+ "  day:"+d+" OLD");

	}

}
