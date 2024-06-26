package HomePractice;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "manash: ");
		hm.put(2, "sam: ");
		hm.put(3, "om: ");
		hm.put(4, "vishal: ");
		hm.put(5, "diya: ");
		hm.put(6, "sonam: ");
		hm.put(7, "karan: ");
		System.out.println(hm);
		String a=hm.get(4);
		System.out.println("your 4th position:"+a);

	}

}
