package com.FileHandling;
import java.io.File;

public class CheckFileExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="ankush.txt";
		File f1=new File(filename);
		if(f1.exists()){
		System.out.println("file exists: ");
	}
		else {
			System.out.println(" not exists:  ");
		}
	}

}
