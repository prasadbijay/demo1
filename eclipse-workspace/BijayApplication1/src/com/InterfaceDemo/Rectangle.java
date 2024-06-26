package com.InterfaceDemo;

public class Rectangle implements Resizable{

	
	private int hight;
	private int widht;
	
	 Rectangle(int width,int hight) {
		 this.hight=hight;
		 this.widht=width;
		
	}
	 

	

	@Override
	public void resizWidth(int width) {
		// TODO Auto-generated method stub
		this.widht=width;
	}

	@Override
	public void resizHight(int hight) {
		// TODO Auto-generated method stub
		this.hight=hight;
	}
	
	public void printSize() {
		System.out.println("width: "+widht+", Hight"+hight);
	}

}
