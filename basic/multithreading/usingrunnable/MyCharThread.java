package com.te.learn.basic.multithreading.usingrunnable;

public class MyCharThread implements Runnable {
	public void run() {
		synchronized (this) {
			for (char c = 'a'; c <= 'z'; c++) {
				System.out.println("Char: " + c);
			}
		}

	}

}
