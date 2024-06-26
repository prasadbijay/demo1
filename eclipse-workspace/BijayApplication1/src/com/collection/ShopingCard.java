package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class ShopingCard {

		private Set<Product1> items;
		public ShopingCard(){
			super();
			items=new LinkedHashSet<>();
		}
		public void additem(Product1 pro) {
			items.add(pro);
		}
		public void display() {
			System.out.println("shopping card: ");
			for(Product1 i: items) {
				System.out.println(i);
			}
		}
		public void removeitems(Product1 pro) {
			items.remove(pro);
		}

	}


