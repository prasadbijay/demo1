package multitheading;
class A1{
	private boolean isdata=false;
	public synchronized void produce() {
		while(isdata) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
		System.out.println("your data produced: ");
		isdata=true;
		notify();
	}
	public synchronized void consume() {
		while(isdata) {
			try {
				wait();
			}
			catch(InterruptedException e){
				System.out.println(e);
				e.printStackTrace();
			}
			System.out.println("your in consume: ");
			isdata=false;
			notify();
		}
	}
}
class P1 extends Thread{
	private A1 a1;
	public P1(A1 a1) {
		this.a1=a1;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			a1.produce();
		}
	}
}
class C1 extends Thread{
	private A1 a1;
	public C1(A1 a1) {
		this.a1= a1;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			a1.consume();
		}
	}
}
public class MultiThreadingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1=new A1();
		P2 p1=new P2();
		C1 c1=new C1(a1);
	
		c1.start();

	}

}
