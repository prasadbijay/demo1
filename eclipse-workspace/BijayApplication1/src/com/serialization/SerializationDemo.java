package com.serialization;
import java.io.*;
class SerializationDemo implements Serializable{
	private String name;
	private int sid;
	private int contact;
	public SerializationDemo(String sname,int id,int scon) {
		this.name=sname;
		this.sid=id;
		this.contact=scon;
	}
//}

//public class SerializationDemo {


	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		SerializationDemo s=new SerializationDemo("bijay",21,3532);
			String filename="myfile.txt";
	
			try {
				FileOutputStream file=new FileOutputStream(filename);
				ObjectOutputStream out=new ObjectOutputStream(file);
				out.writeObject(s);
				out.close();
				file.close();
				System.out.println("object has been serialized");
				
			}
			catch(IOException e) {
				FileInputStream file=new FileInputStream(filename);
				ObjectInputStream in=new ObjectInputStream(file);
				s=(SerializationDemo)in.readObject();
			}

	}

}
