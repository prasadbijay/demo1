package com.exceptionhandling;
import java.lang.ref.WeakReference;

public class WeakRefrenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new String("hello");
		WeakReference<String> weakRef=new WeakReference<>(str);
		str=null;
		//str="ram";
		System.gc();
		if(weakRef.get()==null) {
			System.out.println("Objet has been collected: "+str);
		}
		else {
			System.out.println("Objec garbage has not collected: "+str);
		}

	}

}
