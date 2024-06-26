package practicejava;

public class Pattetn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
				for(int i=0;i<a;i++) {
			for(int j=0;j<a-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");}
			//same as mid triangle
			System.out.println();
		}
	}

}
