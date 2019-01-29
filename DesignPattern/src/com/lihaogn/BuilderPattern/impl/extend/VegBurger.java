package com.lihaogn.BuilderPattern.impl.extend;

import com.lihaogn.BuilderPattern.impl.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "veg burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
