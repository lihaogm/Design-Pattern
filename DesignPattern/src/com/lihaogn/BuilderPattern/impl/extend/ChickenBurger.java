package com.lihaogn.BuilderPattern.impl.extend;

import com.lihaogn.BuilderPattern.impl.Burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "chicken burger";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
