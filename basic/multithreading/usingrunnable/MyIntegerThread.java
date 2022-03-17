package com.te.learn.basic.multithreading.usingrunnable;

public class MyIntegerThread implements Runnable {
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 30; i++) {
				System.out.println("Integer: " + i);
			}
		}
	}
}
