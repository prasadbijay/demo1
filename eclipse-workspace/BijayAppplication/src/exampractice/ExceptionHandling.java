package exampractice;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a =10/0;
			int arr[]=new int[5];
			arr[14]= 39;
			String name="adna";
			System.out.println(name.length());
		}
		catch(ArithmeticException e) {
			System.out.println(" this arithmetic error: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" this is array error: "+e);
			
		}
		catch(NullPointerException e) {
			System.out.println("this is String Error:"+e);
		}
		catch(Exception e) {
			System.out.println("error"+e);
		}

	}

}
