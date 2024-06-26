package exampractice;
interface D{
	public int  show(int name);
}

public class Lamba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D l=(int name) -> {
			System.out.println("this is lambda funtion: "+name);
			return name;
		};
		l.show(39093);

	}

}
