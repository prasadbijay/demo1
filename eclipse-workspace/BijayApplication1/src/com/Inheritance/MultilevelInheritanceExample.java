package com.Inheritance;
class Shap{
	void isShap(){
		System.out.println("This is super class");
	}
}
class ColorShap extends Shap{
	String color;
	ColorShap(String color){
		this.color=color;
	}
	void displayColor() {
		System.out.println("Color "+color);
	}
}
class ThreeDiShap extends ColorShap{
	int depth;
	ThreeDiShap(String color,int depth) {
		super(color);
		// TODO Auto-generated constructor stub
		this.depth=depth;
	}
	void displayDi() {
		System.out.println("Depth "+depth);
	}
	
}
class Cube extends ThreeDiShap{
	Cube(String color,int depth){
		super(color,depth);
	}
	void displayCube() {
		System.out.println("Cube Information");
		isShap();
		displayColor();
		displayDi();
		
	}
}
public class MultilevelInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube = new Cube("Red",5);
		cube.displayCube();
	}

}
