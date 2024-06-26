
public class Arrayequal {
	int a[]= {1,2,3,4,5};
	int b[]= {1,2,3,4,5};
	boolean isequal() {
		for (int i=0;i<5;i++) {
			if(a[i]!=b[i]) {
				return false;
			}
			break;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayequal a=new Arrayequal();
		if(a.isequal()==false) {
			System.out.println(" arrary is not equal: ");
		}
		else {
			System.out.println(" array is equal: ");
		}

	}

}
