package com.te.learn.basic;

public class App15 {
	// non-static variable = non-static single line initializer
	int a = 10;
	int b = 10;

	// non-static multiline initializer
	{
		System.out.println("Non-static multiline intializer got executed!");
	}

	// Constructor chaining!
	public App15() {
		System.out.println("Programmer written instruction in App15() contructor!");
	}

	public App15(int aaa) {
		this();
		this.a = aaa;
		System.out.println("Programmer written instruction in App15(int a) contructor!");
	}

	public App15(int a, int b) {
		this(a);
		this.b = b;
		System.out.println("Programmer written instruction in App15(int a, int b) contructor!");
	}

	public static void main(String[] args) {
		System.out.println("main(String[] args) method got executed!");
		// App15 app15 = new App15(20);
		App15 app15_ = new App15(20, 40);
		System.out.println(app15_.a);
		System.out.println(app15_.b);
	}
}
