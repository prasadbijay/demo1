package exampractice;

public class Inter1 implements Inter{
	private int w1;
	private int h1;
  Inter1(int w1,int h1){
		this.w1=w1;
		this.h1=h1;
	}
	@Override
	public void witdh(int witdh) {
		// TODO Auto-generated method stub
		this.w1=witdh;
		
	}
	@Override
	public void height(int height) {
		// TODO Auto-generated method stub
		this.h1=height;

	}
	void printsize() {
		System.out.println(" height "+h1 +" width "+w1);
	}
	

}
