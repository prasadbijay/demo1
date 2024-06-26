package com.FileHandling;
import java.io.File;
import java.text.SimpleDateFormat;

public class FileInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="myfile.txt";
		File f=new File(filename);
		if(f.exists()) {
			System.out.println("file name: "+f.getName());
			System.out.println("file path: "+f.getAbsolutePath());
			System.out.println("file size: "+f.length()+"byte");
			SimpleDateFormat sdf=new 	SimpleDateFormat("mm/dd/yyyy HH:mm:ss");
			System.out.println("file last modify : "+sdf.format(f.lastModified()));
			System.out.println("file read_able: "+f.canRead());
			System.out.println("file write_able: "+f.canWrite());
			System.out.println("file execut_able: "+f.canExecute());
		}
		else {
			System.out.println("file does not exists: ");
		}

	}

}
