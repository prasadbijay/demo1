package practicejava;

public class DiamondPattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=a-1;i>=1;i--) {
			for(int j=1;j<=a-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
