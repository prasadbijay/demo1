package com.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileInsertedText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your file name: ");
		String filename=sc.nextLine();
		System.out.println("enter your text: ");
		String texttoinsert=sc.nextLine();
		insertTextfile(filename,texttoinsert);
		sc.close();

	}
	private static void insertTextfile(String filename,String texttoinsert) {
		File file =new File(filename);
		try {
			BufferedReader read =new BufferedReader(new FileReader(file));
			StringBuilder stringbuilder =new StringBuilder();
			String line=read.readLine();
			while(line!=null) {
				stringbuilder.append(line).append(System.lineSeparator());
				line=read.readLine();
				System.out.println("text entered sucessfully");
			}
			read.close();
			stringbuilder.append(texttoinsert).append(System.lineSeparator());
			BufferedWriter writer=new BufferedWriter(new FileWriter(file));
			writer.write(stringbuilder.toString());
			writer.close();
		}
		catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
	}

}
