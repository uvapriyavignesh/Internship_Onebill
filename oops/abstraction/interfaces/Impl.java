package com.te.learn.oops.abstraction.interfaces;

public class Impl implements Left, Right {

	@Override
	public void m1() {
		Right.super.m1();
	}
	
	public static void test() {
		Right.m2();
	}
}
