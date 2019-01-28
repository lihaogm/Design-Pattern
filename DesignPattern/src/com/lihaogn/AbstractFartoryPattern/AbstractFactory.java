package com.lihaogn.AbstractFartoryPattern;

import com.lihaogn.AbstractFartoryPattern.color.Color;
import com.lihaogn.AbstractFartoryPattern.shape.Shape;

public abstract class AbstractFactory {
	
	public abstract Color getColor(String color);
	
	public abstract Shape getShape(String shape);

}
