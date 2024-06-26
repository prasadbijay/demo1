import java.io.Serializable;

public class AAIntensiat implements Serializable {
	protected Object AAIntensiat() {
		return null;
	}
	private static AAIntensiat obj=new AAIntensiat();
	private AAIntensiat() {}
	public static AAIntensiat getA() {
		if(obj==null) {
			synchronized(JDBCSingleton.class) {
				if(obj==null) {
					obj=new AAIntensiat();
				}
			}		}
		return obj;
	}
	public void doSomethings() {
		
	}

}
