package practicejava;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String: ");
		String name=sc.nextLine();
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='o'||ch=='e'||ch=='a'||ch=='u'||ch=='i'||ch=='o'||ch=='e'||ch=='a'||ch=='u'||ch=='i') {

				System.out.println("Vowel From your given String are:= "+ch);
			}
		
		
		}
		
		
		

	}

}
