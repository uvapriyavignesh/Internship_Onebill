package com.te.learn.basic.multithreading.usingthread;

public class MyIntegerThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 30; i++) {
			System.out.println("Integer: " + i);
		}
	}
}
