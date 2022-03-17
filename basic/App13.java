package com.te.learn.basic;

public class App13 {

	// static variable = static single line intializer
	static int a = 10;

	// static multiline initializer
	static {
		System.out.println("static multiline initializer got executed!");
	}

	// non-static variable = non-static single line intializer
	int b = 10;

	// non-static multiline initializer
	{
		System.out.println("non-static multiline initializer got executed!");
	}

	// static method
	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod() got executed!");
	}

	// non-static method
	public static void demoNonStaticMethod() {
		System.out.println("demoNonStaticMethod() got executed!");
	}
	
	public static void main(String[] args) {
		System.out.println("main(String[] args) got executed!");
		System.out.println("Creating the object!");
		App13 app13 = new App13();
	}
}
