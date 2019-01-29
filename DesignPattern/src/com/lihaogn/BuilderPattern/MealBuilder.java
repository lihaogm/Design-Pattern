package com.lihaogn.BuilderPattern;

import com.lihaogn.BuilderPattern.impl.extend.ChickenBurger;
import com.lihaogn.BuilderPattern.impl.extend.Coke;
import com.lihaogn.BuilderPattern.impl.extend.Pepsi;
import com.lihaogn.BuilderPattern.impl.extend.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
