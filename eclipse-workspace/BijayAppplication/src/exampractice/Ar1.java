package exampractice;
import java.util.*;

public class Ar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= {1,2,3,4};
	int arr1[]=new int[5];
//	System.out.println(arr1.length);
//	for(int i =0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//	}
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter sexxy number:");
	int search=sc.nextInt();
	for(int i =0;i<arr.length;i++) {
		if(search==arr[i]) {
			System.out.println("found"+i+" "+arr[i]);
		}
	}
	
	
	
	

	}

}
