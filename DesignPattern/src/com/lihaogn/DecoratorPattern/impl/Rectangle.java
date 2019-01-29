package com.lihaogn.DecoratorPattern.impl;

import com.lihaogn.DecoratorPattern.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {

		System.out.println("shape: rectangle");
	}

}
