package com.collection;

public class ShoppingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopingCard sc=new ShopingCard();
		Product1 laptop=new Product1("Laptop",321021);
		Product1 smartphone=new Product1("sumsung:",321021);
		Product1 iphone=new Product1("i_phone 14pro max:",110000);
		Product1 tablet=new Product1("tablet: ",30000);
		sc.additem(laptop);
		sc.additem(iphone);
		sc.additem(tablet);
		sc.additem(smartphone);
		sc.display();
		sc.removeitems(tablet);
		sc.display();

	}

}
