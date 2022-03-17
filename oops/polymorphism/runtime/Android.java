package com.te.learn.oops.polymorphism.runtime;

public class Android {
	public int runOS() {
		System.out.println("This method has basic implementation for running OS!");
		return 0;
	}
	
	public final int runOS(int a) {
		System.out.println("This method has basic implementation for running OS!");
		return 0;
	}
	
	public void security() {
		System.out.println("This method has basic implementation for security!");
	}
}
