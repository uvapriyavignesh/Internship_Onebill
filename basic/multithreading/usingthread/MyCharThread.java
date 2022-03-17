package com.te.learn.basic.multithreading.usingthread;

public class MyCharThread extends Thread {

	@Override
	public void run() {
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println("Char: " + c);
		}
	}
}
