package com.lihaogn.BuilderPattern.impl;

import com.lihaogn.BuilderPattern.Item;
import com.lihaogn.BuilderPattern.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract float price();

}
