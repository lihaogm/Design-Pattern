package com.lihaogn.AbstractFartoryPattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		// 获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		
		Shape shape = shapeFactory.getShape("circle");
		
		shape.draw();
		
		// 获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		Color color = colorFactory.getColor("red");
		
		color.fill();
		
	}

}
