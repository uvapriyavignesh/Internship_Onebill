package com.te.learn.basic;

public class App14 {
	// non-static variable = non-static single line initializer
	int a = 10;
	int b = 10;

	// non-static multiline initializer
	{
		System.out.println("Non-static multiline intializer got executed!");
	}

	App14() {
		// 1. Non-static members will get loaded in the object!
		// (Loading variables with default values + method references)
		// 2. Non-static initializer will get executed!
		// 3. Programmer written instructions get executed!
		System.out.println("Programmer written instruction!");
	}

	public static void main(String[] args) {
		System.out.println("main(String[] args) method got executed!");
		App14 app14 = new App14();
	}
}
