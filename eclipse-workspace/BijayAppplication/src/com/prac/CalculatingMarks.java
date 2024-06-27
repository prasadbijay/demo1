package com.prac;

import java.util.Scanner;

public class CalculatingMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter marks of Hindi ");
		float hin=sc.nextFloat();
		System.out.println(" Enter marks of English: ");
		float eng=sc.nextFloat();
		System.out.println(" Enter marks of Maths: ");
		float math=sc.nextFloat();
		System.out.println(" Enter marks of Science: ");
		float sci=sc.nextFloat();
		System.out.println(" Enter marks of Social: ");
		float soc=sc.nextFloat();
		
		float sum=(hin+eng+math+sci+soc)/5;
		
		if(sum>=45 && sum<=59) {
			System.out.println(" Your grade is B: "+sum);
		}
		else if(sum>=60 && sum<=84) {
			System.out.println(" Your grade is A: "+sum);
		}

		else if(sum>=85 && sum<=100) {
			System.out.println(" Your grade is A+: "+sum);
		}

		else if(sum>=30 && sum<=44) {
			System.out.println(" Your grade is C: "+sum);
		}
		else {
			System.out.println(" Your are Fail: "+sum);
		}


	}

}
