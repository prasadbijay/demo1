package exampractice;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAcc ta=new TestAcc();
		Thread th=new Thread(ta);
		th.setName("sam");
		th.start();

	}

}
