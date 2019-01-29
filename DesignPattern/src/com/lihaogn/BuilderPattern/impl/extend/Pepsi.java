package com.lihaogn.BuilderPattern.impl.extend;

import com.lihaogn.BuilderPattern.impl.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "pepsi";
	}

	@Override
	public float price() {
		return 15.0f;
	}

}
