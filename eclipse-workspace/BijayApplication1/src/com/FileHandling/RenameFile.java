package com.FileHandling;
import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldfilename="test.txt";
		String newfilename="yourfile.txt";
		File file=new File(newfilename);
		if(file.exists()) {
			File newfile=new File(newfilename);
			if(file.renameTo(newfile)) {
				System.out.println("file renam secussully: ");
			}
			else {
				System.out.println(" failed to rename file: ");
			}
		}
		else {
			System.out.println("file does not exists: ");
		}

	}

}
