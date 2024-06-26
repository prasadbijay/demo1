
package com.FileHandling;
import java.io.*;

public class Copyfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourcefile ="myfile.txt";
		String destination ="test.txt";
		try 
			(FileInputStream input=new FileInputStream(sourcefile);

			FileOutputStream output=new FileOutputStream(destination)){
				byte[]buffer=new byte[1024];
				int length;
				while((length=input.read(buffer))>0) {
					output.write(buffer,0,length);
				}
				System.out.println(" file copied:  ");
			}
	catch(Exception e) {
		System.out.println("error: "+e);
	}
			
		
		

	}

}
