package com.lihaogn.BuilderPattern;

import java.util.List;
import java.util.ArrayList;

public class Meal {

	private List<Item> items= new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost+=item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.out.print("item: "+item.name());
			System.out.print(", packing: "+item.packing().pack());
			System.out.println(", price: "+item.price());
		}
	}
}
