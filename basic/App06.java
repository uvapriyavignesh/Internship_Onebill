package com.te.learn.basic;

public class App06 {
	public static void main(String[] args) {
		System.out.println("Hello!");

		int a = 10;

		boolean res = (a >= 10) ? true : false;
		if (res) {
			System.out.println(a + " is greater/equal to 10");
		} else {
			System.out.println(a + " is less than 10");
		}
	}
}
