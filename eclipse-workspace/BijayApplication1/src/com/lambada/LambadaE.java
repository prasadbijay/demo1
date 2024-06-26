package com.lambada;
interface lamba{
	public void say(int a);
}
public class LambadaE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lamba l=(int a)->
			{
				
				System.out.println("This is function interface:"+a);
			};
		l.say(10);
	
		}

}
