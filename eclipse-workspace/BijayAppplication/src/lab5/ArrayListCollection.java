package lab5;
import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>l=new ArrayList<Integer>();
		l.add(20);
		l.add(35);
		l.add(50);
		l.add(21);
		l.add(23);
		l.add(10);
		l.add(60); 
		
		l.forEach(a->{
			if (a%2==0) {
				System.out.println(" The Number is even: "+a);
			}
			else {
				System.out.println(" The number are Odd Number: "+a);
			}
		});

	}

}

