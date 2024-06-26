package practicejava;
import java.util.Scanner;
class IfCall{
	float num(float a) {
		float pi=3.14f;
		float sq=a*a*pi;
		return sq;
	}
}

public class IfElsePractice extends IfCall {
	void rsm() {
		System.out.println(" this is so called: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElsePractice obj=new IfElsePractice();
		float sq= obj.num(4.2f);
		System.out.println(sq);

	}

}
