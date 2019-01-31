package com.lihaogn.ObserverPattern;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject=subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		System.out.println("binary string: "+Integer.toBinaryString(subject.getState()));
	}

}
