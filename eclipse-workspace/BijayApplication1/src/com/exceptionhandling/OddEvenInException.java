package com.exceptionhandling;
class OddNumber extends Exception{
	public OddNumber (String mess) {
		super (mess);
	}
	
}
class EvenNumber extends OddNumber{
	public EvenNumber(String mess) {
		super (mess);
	}
}

public class OddEvenInException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num=25;
			if(num%2==0) {
				throw new EvenNumber("oddnumner :Never Should be odd: /n");
			}
			else {
				throw new OddNumber("oddnumner :Never Should be odd: ");

				
			}
		}
		catch(Exception e) {
			System.out.println(" error"+e);
		}
		
	

	}

}
