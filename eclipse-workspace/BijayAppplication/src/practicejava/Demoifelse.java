package practicejava;
import java.util.Scanner;
public class Demoifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		if(str.equals(null)) {
			System.out.println("please enter some string: ");
		}
		else if(str.equals("anju")|| str.equals("Anju")) {
				
			System.out.println(" your are cute: ");
		}
		else if(str.equals("ram")||str.equals("Ram")) {
			
			System.out.println("pravhu shree ram kee jai: ");
		}
		else {
			System.out.println("your value doesn't match:"+"\n"+"please try lettre on ");
		}
		

	}
}
