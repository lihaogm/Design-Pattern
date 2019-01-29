package com.lihaogn.BuilderPattern.impl;

import com.lihaogn.BuilderPattern.Item;
import com.lihaogn.BuilderPattern.Packing;

public abstract class Burger implements Item{


	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
