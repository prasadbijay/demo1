package com.FileHandling;
import java.io.File;

public class ListFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directoryName=" C:\\Users\\LENOVO\\eclipse-workspace\\BijayApplication1";
		
		File f1=new File(directoryName);
		File[] file=f1.listFiles();
		if (file!=null) {
			System.out.println("file in directory: ");
			for(File f2:file) {
				System.out.println(f2.getName());
				
				
			}
		}
		else {
			System.out.println(" directory does not exists or is not a directory: ");
		}

	}

}
