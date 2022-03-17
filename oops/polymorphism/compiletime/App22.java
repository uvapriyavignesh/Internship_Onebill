package com.te.learn.oops.polymorphism.compiletime;

class Parent_ {
	int a = 10;

	public static void test() {
		System.out.println("Parent_ test() method!");
	}
}

class Child_ extends Parent_ {
	int a = 20;

	public static void test() {
		System.out.println("Child_ test() method!");
	}
}

public class App22 {
	/*
	 * In compile time polymorphism type of reference has highest priority for
	 * binding 
	 */
	public static void main(String[] args) {
		Parent_ parent_ = new Child_();
		parent_.test(); // Parent_ class static test() method is called!
		Child_ child = (Child_) parent_;
		child.test(); // Child_ class static test() method is called!
	}
}
