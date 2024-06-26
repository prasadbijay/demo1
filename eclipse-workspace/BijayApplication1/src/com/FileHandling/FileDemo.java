package com.FileHandling;
import java.io.FileInputStream;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream f1=new FileInputStream("myfile.txt");
		int i=f1.read();
		System.out.println((char)i);
		}
		catch(Exception e) {
			System.out.println(e+"not done");
		}
	}

}
