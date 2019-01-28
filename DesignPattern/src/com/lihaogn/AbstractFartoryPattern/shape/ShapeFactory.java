package com.lihaogn.AbstractFartoryPattern.shape;

import com.lihaogn.AbstractFartoryPattern.AbstractFactory;
import com.lihaogn.AbstractFartoryPattern.color.Color;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType==null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if (shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}else if (shapeType.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}

}
