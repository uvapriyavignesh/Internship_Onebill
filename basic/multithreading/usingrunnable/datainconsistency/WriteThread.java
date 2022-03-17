package com.te.learn.basic.multithreading.usingrunnable.datainconsistency;

public class WriteThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < Story.story.length(); i++) {
			Story.story.replace(i, i + 1, i + "");
		}
	}

}
