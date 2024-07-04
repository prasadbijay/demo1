package com.demo;

public class Point {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	/* here i'm perform actual logic like adding constructor point to another 
	 * point and divided by 2 so we get the mid-point  */
	
	public  Point midpoint(Point o) {
		double midx=(this.x  + o.x)/2;
		double midy=(this.y  + o.y)/2;
		return new Point(midx,midy);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(1,2);
		Point p2=new Point(3,4);
		
		Point mid=p1.midpoint(p2);
		System.out.println("midpoint coordination: "+mid.getX());
		System.out.println("midpoint coordination: "+mid.getY());
		
		

	}

}
