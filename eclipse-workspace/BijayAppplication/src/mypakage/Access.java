package mypakage;
import java.util.Scanner;

public class Access {

	public static void main(String[] args) {
		System.out.println(" waiting To Enter Your Id: ");
		Scanner sc=new Scanner(System.in);
		System.out.println(" ENter Your Student Id To search: ");
		int sid=sc.nextInt();
		// TODO Auto-generated method stub
		Data d1 =new Data();
		d1.Student_Id(sid);
	    d1.Student_Name(sid);
		d1.Student_Class(sid);
		d1.Student_Fees(sid);

	}

}
