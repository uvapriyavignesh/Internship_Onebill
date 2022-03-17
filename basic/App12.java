package com.te.learn.basic;

public class App12 {

	// Non-static multiline intializer
	{
		// 1st
		System.out.println("Non-static multiline intializer got executed!");
	}

	// Non-static variable = Non-static single line initializer
	int a = 10; // 2nd

	// Non-static method
	public void demoNonStaticMethod() {
		System.out.println("demoNonStaticMethod() non-static method got executed");
	}

	public static void main(String[] args) {
		System.out.println("main(String[] args) method got executed!");
		System.out.println("Now I'm creating an object--");
		App12 app12 = new App12();
		System.out.println("End!");
	}
}
