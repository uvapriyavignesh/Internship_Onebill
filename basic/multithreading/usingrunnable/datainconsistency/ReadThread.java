package com.te.learn.basic.multithreading.usingrunnable.datainconsistency;

public class ReadThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < Story.story.length(); i++) {
			System.out.print(Story.story.charAt(i));
		}
	}

}
