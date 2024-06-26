package exampractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Exam_practiclal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> cloths=new LinkedList<String>();
		cloths.add("  Shirts: ");
		cloths.add(" pants:");
		cloths.add(" shoes: ");
		cloths.add(" hand cloves: ");
		cloths.add(" shorts: ");
		System.out.println("shopings cloths:   "+cloths);
		
		LinkedList<String> elctronic=new LinkedList<String>();
		elctronic.add("cell phone: ");
		elctronic.add("Box: ");
		elctronic.add("Leptop: ");
		elctronic.add("T.V: ");
		elctronic.add("Freeze: ");
		System.out.println("shoping electronic:    "+elctronic);
		
		LinkedList<String> groceri=new LinkedList<String>();
		groceri.add("Rice: ");
		groceri.add(" Sugar: ");
		groceri.add(" Salt: ");
		System.out.println("shoping Goceris:     "+groceri+"\n\n");
		
		HashMap<String,LinkedList<String>> shoping=new HashMap<String,LinkedList<String>>();
		shoping.put("Cloths: ", cloths);
		shoping.put("Electronic: ",elctronic);
		shoping.put("Groceris", groceri);
		
		HashMap<String,HashMap<String,LinkedList<String>>> ttr=new HashMap<String,HashMap<String,LinkedList<String>>>();
		ttr.put("Online Shoping:  ", shoping);
		Set<String> s=ttr.keySet();
		for(String str:s) {
			System.out.println(str+"\n");	
			System.out.println(ttr.get(str));
			
		}
		

	}

}
