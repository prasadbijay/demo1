package HomePractice;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.add(50);
		v.add("xyz");
		Object a= v.get(2);
		System.out.println("Your third (3th) Position value: "+a);
		System.out.println("First vector: "+v+"\n");
		Vector v1=new Vector();
		v1.add("23");
		v1.add(v);
		System.out.println("Seond Vector (with 1st vector): "+v1);

	}

}
