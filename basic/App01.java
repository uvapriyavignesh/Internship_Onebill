package com.te.learn.basic;

/*
 * This is a normal demo java class
 * */
public class App01 {

	/* This is a main method */
	public static void main(String[] args) {
		
		// Type casting
		// Narrowing (Explicit type casting)
		double d = 1288.12345678D; // Larger container
		byte b = (byte) d;
		System.out.println("Data: " + b);
		
		// Widening
		byte bb = 10;
		long ll = bb;
		System.out.println("Data: " + ll);
		
		
	}
	
	
}
