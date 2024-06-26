package com.collectionArraylist;
import java.util.ArrayList;


public class GenericArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al =new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		for(int i:al) {
			System.out.println(" "+i);
		}

	}

}
