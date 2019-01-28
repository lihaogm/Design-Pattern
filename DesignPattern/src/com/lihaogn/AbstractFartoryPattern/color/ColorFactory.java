package com.lihaogn.AbstractFartoryPattern.color;

import com.lihaogn.AbstractFartoryPattern.AbstractFactory;
import com.lihaogn.AbstractFartoryPattern.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		
		if (color==null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		}else if (color.equalsIgnoreCase("blue")) {
			return new Blue();
		}else if (color.equalsIgnoreCase("green")) {
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
