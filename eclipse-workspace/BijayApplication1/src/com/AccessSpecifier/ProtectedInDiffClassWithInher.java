package com.AccessSpecifier;
class TestProtectedMem{
	protected int num = 10;
	protected void display() {
		System.out.println("Protected extend wala: "+num);
	}
}
class TestProteced{
	protected int num = 5;
	protected void display() {
		System.out.println("Protected non extend wala: "+num);
	}
}
public class ProtectedInDiffClassWithInher extends TestProtectedMem{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedInDiffClassWithInher obj = new ProtectedInDiffClassWithInher();
		obj.display();
		TestProteced test = new TestProteced();
		test.display();

	}

}
