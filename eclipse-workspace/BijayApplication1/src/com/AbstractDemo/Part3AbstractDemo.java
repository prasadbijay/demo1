package com.AbstractDemo;
abstract class Shape3D{
	abstract float volum();

	abstract float surfaceArea();
}
class Sphere extends Shape3D{

	
	@Override
	float volum() {
		// TODO Auto-generated method stub
		float r = 5.4f;
		float a=3.14f;
		float v;
		return v=((4/3)*(a*r*r*r));
	}

	@Override
	float surfaceArea() {
		// TODO Auto-generated method stub
		float r = 2.1f;
		float b=3.14f;
		float a;
		return  a=(4*b*r*r);
	}

	
	
}
class Cube extends Shape3D{

	@Override
	float volum() {
		// TODO Auto-generated method stub
		float V,a=3.2f;
		
		return V=a*a*a;
	}

	@Override
	float surfaceArea() {
		// TODO Auto-generated method stub
		float A,a=2.3f;
		return A=6*a*a;
	}
	
}
public class Part3AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape3D s = new Sphere();
		System.out.println("volume  of sphere: \t"+s.volum()+"\tsurface of sphere: \t"+s.surfaceArea());
		Shape3D s1 = new Cube();
		System.out.println(" volume of Cube:   \t"+s1.volum()+"\tsurface of cube:  \t"+s1.surfaceArea());
	}

}
