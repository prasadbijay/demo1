package com.FileHandling;
import java.io.File;
public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="textfile.txt";
		File f1=new File(filename);
		if(f1.delete())
		{
			System.out.println("file is deleted: ");
		}
		else 
		{
			System.out.println("failed to delete, file does not exists: ");
		}

	}

}
