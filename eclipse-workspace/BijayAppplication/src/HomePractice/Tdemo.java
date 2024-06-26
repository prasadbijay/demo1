package HomePractice;

public class Tdemo extends Thread {
	public void run() {
			System.out.println("inside the thread: ");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tdemo th1= new Tdemo();
		Tdemo th2= new Tdemo();
		Tdemo th3= new Tdemo();
		System.out.println(" set priority th1: "+th1.getPriority());
		System.out.println(" set priority th2: "+th2.getPriority());
		System.out.println(" set priority th3: "+th3.getPriority());
		th1.setPriority(5);
		th1.setPriority(8);
		th1.setPriority(7);
		System.out.println(" set priority : "+th1.getPriority());
		System.out.println(" set priority : "+th2.getPriority());
		System.out.println(" set priority : "+th3.getPriority());
		System.out.println(" thread: "+Thread.currentThread().getName());
		System.out.println("Thread current: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(5);
	}

}
