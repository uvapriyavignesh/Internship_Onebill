package com.te.learn.basic.exception;

import java.util.Scanner;

public class ApplicationAgeCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = scanner.nextInt();
		if (age < 0) {
			throw new AgeNotCorrectException("Age entered is not correct!");
		}
		System.out.println("Age is " + age);
	}
}
