package com.collection;

public class Product1 {
	private String name;
	private int price;
	@Override
	public String toString() {
		return "Product1 [name=" + name + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product1(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

}
