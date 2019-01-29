package com.lihaogn.SingletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// 获取唯一可用对象
		SingleObject instance = SingleObject.getInstance();
		
		instance.showMessage();
	}
}
