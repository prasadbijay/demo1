package exampractice;

public class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println(" meow---meow: ");
	}

	@Override
	public void food() {
		System.out.println(" milk,fish and somethings more: ");		
	}
	public static void main(String[]args) {
		System.out.println("           DOG:");
		Dog d=new Dog();
		d.sound();
		d.food();
		System.out.println("\n\n           CAT: ");
		Cat c=new Cat();
		c.sound();
		c.food();
	}

}
