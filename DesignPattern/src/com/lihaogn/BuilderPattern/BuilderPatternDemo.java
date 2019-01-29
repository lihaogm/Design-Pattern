package com.lihaogn.BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("veg meal");
		vegMeal.showItems();
		System.out.println("total cost: "+vegMeal.getCost());
		
		
	}
	

}
