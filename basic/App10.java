package com.te.learn.basic;

import java.util.Scanner;

public class App10 {

	public static void main(String[] args) {
		boolean exit = false;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("==== Calculator ====");
			System.out.println("Select the option to calculate: ");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. EXIT");
			System.out.println("Enter option number: ");
			int option = scanner.nextInt();

			switch (option) {
			case 1: {
				System.out.println("Enter first number: ");
				int a = scanner.nextInt();
				System.out.println("Enter second number: ");
				int b = scanner.nextInt();
				int res = Calculator.add(a, b);
				System.out.println("Result: " + res);
			}
				break;

			case 2: {
				System.out.println("Enter first number: ");
				int a = scanner.nextInt();
				System.out.println("Enter second number: ");
				int b = scanner.nextInt();
				int res = Calculator.sub(a, b);
				System.out.println("Result: " + res);
			}
				break;

			case 3: {
				System.out.println("Enter first number: ");
				int a = scanner.nextInt();
				System.out.println("Enter second number: ");
				int b = scanner.nextInt();
				int res = Calculator.mult(a, b);
				System.out.println("Result: " + res);
			}
				break;

			case 4: {
				System.out.println("Enter first number: ");
				int a = scanner.nextInt();
				System.out.println("Enter second number: ");
				int b = scanner.nextInt();
				int res = Calculator.div(a, b);
				System.out.println("Result: " + res);
			}
				break;

			case 5: {
				exit = true;
			}
				break;

			default:
				break;
			}
		} while (!exit);
	}

}
