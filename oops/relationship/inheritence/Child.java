package com.te.learn.oops.relationship.inheritence;

class Parent {

	private int a;

	public Parent() {

	}

	public Parent(int a) {
		this();
		this.a = a;
	}

}

public class Child extends Parent {

	private int b;

	public Child() {
		super(20);
	}

	public Child(int b) {
		this();
		this.b = b;
	}

}
