package exampractice;

import java.io.File;

public class MakeDirec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dname=" thwenm.txt";
		File f=new File(dname);
		if(!f.exists()) { 
			if(f.mkdir()) {
			System.out.println(" sucessfull: ");
			}
			else {
				System.out.println(" falid to create: ");
			}
		}
		else {
			System.out.println(" alredy exists: ");
		}
		

	}

}
