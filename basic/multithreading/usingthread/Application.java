package com.te.learn.basic.multithreading.usingthread;

public class Application {
	public static void main(String[] args) {
		System.out.println("main(...) starts!");
		MyCharThread charThread = new MyCharThread();
		MyIntegerThread integerThread = new MyIntegerThread();

		charThread.start();
		integerThread.start();

//		charThread.run();
//		integerThread.run();

		System.out.println("main(...) ends!");
	}
}
