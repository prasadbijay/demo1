package com.FileHandling;
import java.io.File;

public class CreateDirectories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directoryName =" newDirectory";
		File directory=new File(directoryName);
		if(!directory.exists()) {
			if(directory.mkdir()) {
				System.out.println("Directory is created: ");
				}
			else {
				System.out.println("filed is created: ");
			}
		}
		else {
			System.out.println("directory is already exsits: ");
		}

	}

}
