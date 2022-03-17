package com.te.learn;

import java.util.Scanner;

public class Test {

	public static void main(String[] ar) {
		boolean ex = false;
		int a, b, c, res, te;
		Cal ca = new Cal();
		do {
			System.out.println("console calaculator");
			System.out.println("enter the 1 number");

			Scanner s = new Scanner(System.in);
			a = s.nextInt();
			System.out.println("enter the 2 number");
			b = s.nextInt();
			System.out.println("the given number is " + a + " " + b);
			System.out.println("choose options:");
			System.out.println("1.add");
			System.out.println("2.sub");
			System.out.println("3.mul");
			System.out.println("4.div");
			c = s.nextInt();
			switch (c) {
			case 1: {
				res = ca.add(a, b);
				System.out.println(res);
				break;
			}
			case 2: {
				res = ca.sub(a, b);
				System.out.println(res);
				break;
			}
			case 3: {
				res = ca.mul(a, b);
				System.out.println(res);
				break;
			}
			case 4: {
				res = ca.div(a, b);
				System.out.println(res);
       			break;
			}

			default: {
				System.out.println("enter the correct value");
				
				
			}
			}
			System.out.println("do you want to exit 1/0:");
			te = s.nextInt();
			ex = (te == 1) ? true : false;

		} while (!ex);
		System.out.println("Exit sucessfully");

	}

}

class Cal{
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	int div(int a,int b) {
		return a/b;
	}
}