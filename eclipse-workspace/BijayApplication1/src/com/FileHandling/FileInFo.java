package com.FileHandling;

import java.io.File;
import java.io.FileWriter;

public class FileInFo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File of=new File("test.txt");
		System.out.println("file is created: ");
		try {
			FileWriter f1=new FileWriter(" newfile file.txt ");
			f1.write("xyz: ");
			System.out.println(" file is created: ");
			f1.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
