package com.FileHandling;
import java.io.*;

public class FileCreatingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("file.txt");
		System.out.println(f+" file created: ");
		try {
			FileWriter f1=new FileWriter("file.txt");
			f1.write(" i am in samboisis: ");
			f1.close();
		}
		catch(Exception e) {
			System.out.println("file is not created: ");
		}

	}

}
