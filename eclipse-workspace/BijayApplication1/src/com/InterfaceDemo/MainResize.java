package com.InterfaceDemo;

public class MainResize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle(100,200);
		
		obj.printSize();
		
		obj.resizWidth(600);
		obj.resizHight(200);
		
		obj.printSize();
	}

}
