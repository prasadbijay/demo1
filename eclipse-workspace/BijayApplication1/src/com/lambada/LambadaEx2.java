package com.lambada;
interface lambada2{
	public String say(String name);
}
public class LambadaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lambada2 l=(name)->{
			return "Hello  "+ name;
			
		};
		System.out.println(l.say("world"));
		

	}

}
