package com.lihaogn.StrategyPattern.impl;

import com.lihaogn.StrategyPattern.Strategy;

public class OperationAdd implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		
		return num1+num2;
	}

}
