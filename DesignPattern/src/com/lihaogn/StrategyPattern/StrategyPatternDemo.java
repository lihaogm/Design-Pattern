package com.lihaogn.StrategyPattern;

import com.lihaogn.StrategyPattern.impl.OperationAdd;
import com.lihaogn.StrategyPattern.impl.OperationMultipy;

public class StrategyPatternDemo {

	public static void main(String[] args) {

		Context context = new Context(new OperationAdd());
		System.out.println("10+5= "+context.executeStrategy(10, 5));
		
		Context context2 = new Context(new OperationMultipy());
		System.out.println("10*5= "+context.executeStrategy(10, 5));
		
	}

}
