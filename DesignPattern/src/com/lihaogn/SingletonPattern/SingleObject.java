package com.lihaogn.SingletonPattern;

public class SingleObject {

	// 创建一个对象
	private static SingleObject instance=new SingleObject();
	
	// 私有构造函数，不会被实例化
	private SingleObject() {
		
	}
	// 获取唯一可用的对象
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("hello world.");
	}
}
