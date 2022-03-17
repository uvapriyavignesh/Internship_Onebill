package com.te.learn.oops.polymorphism.runtime;

public class App21 {

	public static void main(String[] args) {
		Android android = new Miui();
		Miui miui = (Miui) android;
		miui.runOS();

//		OxygenOS os = new OxygenOS();
//		os.security();
//		os.runOS();
	}

}
