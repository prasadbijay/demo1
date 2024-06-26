package com.FileHandling;
import java.io.FileOutputStream;

public class FileOutPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream f2=new FileOutputStream("myfile.txt");
			 f2.write(65);
			 f2.close();
			 System.out.println(" done");
		
		}
		catch(Exception e) {
			System.out.println(e+" not done: ");
		}
	}

}
//write object for serialization