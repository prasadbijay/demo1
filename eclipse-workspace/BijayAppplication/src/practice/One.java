package practice;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i= 10/0;
			String str=null;
			System.out.println("String can not be null:"+str.length());
			System.out.println("error in your code: "+i);
			if(i<=10) {
				System.out.println("true: ");
			}
			else {
				System.out.println("false: ");
			}
			
		}
		catch(ArithmeticException e) {
			String str=null;
			System.out.println("arithmetic error ");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
