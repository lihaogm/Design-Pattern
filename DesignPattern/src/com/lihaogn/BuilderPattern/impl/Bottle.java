package com.lihaogn.BuilderPattern.impl;

import com.lihaogn.BuilderPattern.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "bottle";
	}

}
