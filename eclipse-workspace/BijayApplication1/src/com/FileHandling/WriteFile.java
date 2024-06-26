package com.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="west.txt";
		String content="helllo world";
		try {
			BufferedWriter write=new BufferedWriter(new FileWriter(filename));
			write.write(content);
			System.out.println(" file rename sucessfully: ");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
