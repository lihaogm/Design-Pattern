package com.lihaogn.CommandPattern;

public class Stock {

	private String name = "abc";
	private int quantity = 10;

	public void buy() {
		System.out.println("stock [name: " + name + ", quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("stock [name: " + name + ", quantity: " + quantity + " ] sold");
	}
}
