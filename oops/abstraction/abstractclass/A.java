package com.te.learn.oops.abstraction.abstractclass;

public abstract class A {
	int a = 10;
	int b = 20;
	
	static {
		System.out.println("static multiline intializer of A abstract class got executed!");
	}
	
	{
		System.out.println("non-static multiline intializer of A abstract class got executed!");
	}
	
	A() {
		System.out.println("A() constructor got executed!");
	}
	
	A(int a, int b) {
		this();
		System.out.println("A(int a, int b) constructor got executed!");
	}
}
