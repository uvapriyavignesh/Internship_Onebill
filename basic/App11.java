package com.te.learn.basic;

public class App11 {

	// static multiline initializer
	static {
		// 1st
		System.out.println("static multiline intializer got executed!");
		App11 app11 = new App11();
		int a = app11.returnMeInt(); // This method will get executed before main(...) method!
		System.out.println("Value recieved is " + a);
	}

	// static variable = static single line initializer
	static int a = 10; // 2nd

	// static method
	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod() method got executed!");
	}

	public int returnMeInt() {
		return 10;
	}

	public void demoNonStaticMethod() {
		System.out.println("demoNonStaticMethod() method got executed!");
	}

	public static void main(String[] args) {
		System.out.println("main(String[] args) method got executed!");
		demoStaticMethod();

		App11 app11 = new App11();
		app11.demoNonStaticMethod();
	}

}
