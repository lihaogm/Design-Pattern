package com.lihaogn.DecoratorPattern.impl;

import com.lihaogn.DecoratorPattern.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {

		System.out.println("shape: circle");
	}

}
