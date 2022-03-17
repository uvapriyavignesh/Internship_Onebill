package com.te.learn.oops.abstraction.abstractclass;

public class B extends A {
	int c = 10;
	int d = 20;
	
	static {
		System.out.println("static multiline intializer of B class got executed!");
	}
	
	{
		System.out.println("non-static multiline intializer of B class got executed!");
	}
	
	B() {
		super(30, 40);
		System.out.println("B() constructor got executed!");
	}
	
	B(int a, int b) {
		this();
		System.out.println("B(int a, int b) constructor got executed!");
	}
}
