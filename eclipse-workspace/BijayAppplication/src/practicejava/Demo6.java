package practicejava;
import java.util.Scanner;
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        System.out.println("enter your string: ");
        String nline=sc.nextLine();
		System.out.println("your given String are:= "+nline+"\n");
		for(int i=0;i<nline.length();i=i+2) {
			char ch=nline.charAt(i);
			System.out.print(ch+"\t");
		}

	}

}
