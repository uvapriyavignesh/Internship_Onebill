package com.te.learn.basic.multithreading.usingrunnable;

public class Application {
	public static void main(String[] args) {
		System.out.println("main(...) starts!");
		Thread thread01 = new Thread(new MyCharThread());
		Thread thread02 = new Thread(new MyIntegerThread());
		
		thread01.start();
		thread02.start();
		
		System.out.println("main(...) ends!");
	}
}
