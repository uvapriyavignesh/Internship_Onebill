package com.te.learn.basic.exception;

public class ApplicationExceptionDemo {

	public static void m4() throws InterruptedException {
		// Checked exception
		Thread.sleep(10000);
	}

	public static void m3() throws InterruptedException {
		m4();
	}

	public static void m2() throws InterruptedException {
		m3();
	}

	public static void m1() throws InterruptedException {
		m2();
	}

	public static void main(String[] args) {
		System.out.println("main(...) starts!");
		try {
			int res = 10 / 0;
			m1();
		} catch (ArithmeticException e) {
			System.out.println("You are dividing the value by 0!");
		} catch (InterruptedException e) {
			System.out.println("You are using sleep method!");
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		} finally {
			System.out.println("Executed at the end!");
		}
		System.out.println("main(...) ends!");
	}
}
