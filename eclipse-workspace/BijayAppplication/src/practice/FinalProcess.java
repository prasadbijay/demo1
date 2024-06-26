package practice;

public class FinalProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondProcess s1=new SecondProcess();
		Thread th=new Thread(s1);
		//Thread th1=new Thread(s1);
		th.setName("bijay");
		th.start();

	}

}
