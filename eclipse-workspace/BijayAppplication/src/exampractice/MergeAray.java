package exampractice;

public class MergeAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int a[]= {2,3,4};
		int b[]= {1,5,6};
		int c[]= new int[6];
		for(i=0,j=0;i<6;i+=2,j++) {
			c[i]=a[j];
			c[i+1]=b[j];
		}
		for(int d:c) {
			System.out.println(" merge "+d);
		}

	}

}
