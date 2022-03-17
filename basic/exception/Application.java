package com.te.learn.basic.exception;

public class Application {

	public static void m1() throws InterruptedException {
		Thread.sleep(10000);
	}

	public static void m2() throws InterruptedException {
		m1();
	}

	public static void main(String[] args) {
		try {
			m2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
