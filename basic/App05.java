package com.te.learn.basic;

public class App05 {

	public static void main(String[] args) {
		System.out.println("Hello!");
		int a = 10;
		int b = 20;
				// 11 + 20 = 31
		int res = ++a + b++;
		System.out.println("Result: " + res);
		
		int aa = 10;
		int bb = 20;
				// 9 + 20 = 29
		int res_ = --aa + bb--;
		System.out.println("Result: " + res_);
		
		int aaa = 10;
		int bbb = 20;
			// 20 + 11 = 31
		res = bbb++ + ++aaa;
		System.out.println("Result: " + res);
	}

}
