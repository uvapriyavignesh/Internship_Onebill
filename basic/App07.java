package com.te.learn.basic;

public class App07 {
	public static void main(String[] args) {
		System.out.println("Hello!");
		int a = 10;
		int b = 11;
		int c = 12;
		int d = 13;
		int e = 14;

		/* Logic for find greatest of 5 numbers using 
		 * ternary operator */
		int res = (a > b && a > c && a > d && a > e)
				? a : (b > c && b > d && b > e)
						? b : (c > d && c > e) 
								? c : (d > e)
										? d : e;
		
		System.out.println("Result: " + res);
	}
}
