package com.lihaogn.BuilderPattern.impl.extend;

import com.lihaogn.BuilderPattern.impl.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
