package com.te.learn.oops.polymorphism.runtime;

public class Miui extends Android {
	
	@Override
	public int runOS() {
		System.out.println("This method has advance implementation for running OS!");
		return 0;
	}
	
	public void newMethod() {
		System.out.println("newMethod() called!");
	}
	
}
