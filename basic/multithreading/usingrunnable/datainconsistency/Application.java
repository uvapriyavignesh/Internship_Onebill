package com.te.learn.basic.multithreading.usingrunnable.datainconsistency;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main(...) starts!");

		Thread thread01 = new Thread(new ReadThread());
		Thread thread02 = new Thread(new WriteThread());

		thread01.start();
		thread02.start();

		System.out.println("main(...) ends!");
	}
}
